import { useEffect, useState } from "react";

function StudentPortal() {
  const [studentName, setStudentName] = useState("");
  const [students, setStudents] = useState([]);
  const [message, setMessage] = useState("");
  const [loading, setLoading] = useState(false);

  const token = localStorage.getItem("token");

  const loadStudents = async () => {
    if (!token) {
      return;
    }

    try {
      const response = await fetch("/api/students", {
        method: "GET",
        headers: {
          Authorization: `Bearer ${token}`
        }
      });

      if (!response.ok) {
        throw new Error("Unable to load students");
      }

      const data = await response.json();
      setStudents(data);
    } catch (error) {
      setMessage(error.message);
    }
  };

  useEffect(() => {
    loadStudents();
  }, []);

  const handleAddStudent = async (event) => {
    event.preventDefault();

    if (!studentName.trim()) {
      setMessage("Please enter a student name.");
      return;
    }

    if (!token) {
      setMessage("Please login first.");
      return;
    }

    setLoading(true);
    setMessage("");

    try {
      const response = await fetch("/api/students", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
          Authorization: `Bearer ${token}`
        },
        body: JSON.stringify({
          name: studentName.trim()
        })
      });

      if (!response.ok) {
        const errorText = await response.text();
        throw new Error(errorText || "Unable to create student");
      }

      const student = await response.json();

      setMessage(`Student "${student.name}" created successfully.`);
      setStudentName("");

      await loadStudents();
    } catch (error) {
      setMessage(error.message);
    } finally {
      setLoading(false);
    }
  };

  return (
    <section id="student-portal">
      <div className="container">

        <h2>Student Portal</h2>

        <p>
          Add and view students through the Student Service.
        </p>

        {!token && (
          <p>
            Please login first to access student information.
          </p>
        )}

        {token && (
          <>
            <form onSubmit={handleAddStudent}>

              <label htmlFor="student-name">
                Student Name
              </label>

              <input
                id="student-name"
                type="text"
                value={studentName}
                placeholder="Enter student name"
                onChange={(event) => setStudentName(event.target.value)}
              />

              <button type="submit" disabled={loading}>
                {loading ? "Saving..." : "Add Student"}
              </button>

            </form>

            {message && (
              <p>{message}</p>
            )}

            <div>
              <h3>Students</h3>

              {students.length === 0 ? (
                <p>No students found.</p>
              ) : (
                <ul>
                  {students.map((student) => (
                    <li key={student.id}>
                      {student.id} - {student.name}
                    </li>
                  ))}
                </ul>
              )}
            </div>
          </>
        )}

      </div>
    </section>
  );
}

export default StudentPortal;
