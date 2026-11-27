#!/bin/bash
set -euo pipefail

create_database() {
    local database="$1"
    local username="$2"
    local password_file="$3"

    local password
    password="$(cat "$password_file")"

    echo "Creating database: ${database}"

    psql -v ON_ERROR_STOP=1 \
        --username "$POSTGRES_USER" \
        --dbname "$POSTGRES_DB" \
        --set=db_name="$database" \
        --set=db_user="$username" \
        --set=db_password="$password" <<'SQL'
SELECT format(
    'CREATE ROLE %I LOGIN PASSWORD %L',
    :'db_user',
    :'db_password'
)
WHERE NOT EXISTS (
    SELECT FROM pg_roles WHERE rolname = :'db_user'
)
\gexec

SELECT format(
    'CREATE DATABASE %I OWNER %I',
    :'db_name',
    :'db_user'
)
WHERE NOT EXISTS (
    SELECT FROM pg_database WHERE datname = :'db_name'
)
\gexec
SQL
}

create_database auth_db auth_user /run/db-secrets/AUTH_DB_PASSWORD
create_database student_db student_user /run/db-secrets/STUDENT_DB_PASSWORD
create_database teacher_db teacher_user /run/db-secrets/TEACHER_DB_PASSWORD
create_database attendance_db attendance_user /run/db-secrets/ATTENDANCE_DB_PASSWORD
create_database fee_db fee_user /run/db-secrets/FEE_DB_PASSWORD
create_database exam_db exam_user /run/db-secrets/EXAM_DB_PASSWORD
create_database homework_db homework_user /run/db-secrets/HOMEWORK_DB_PASSWORD
create_database announcement_db announcement_user /run/db-secrets/ANNOUNCEMENT_DB_PASSWORD
create_database gallery_db gallery_user /run/db-secrets/GALLERY_DB_PASSWORD
create_database notification_db notification_user /run/db-secrets/NOTIFICATION_DB_PASSWORD

echo "All GHS databases initialized successfully."
