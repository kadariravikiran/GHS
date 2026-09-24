import {
  GraduationCap,
  Lock,
  Mail,
  ArrowRight
} from "lucide-react";

function Login() {
  return (
    <section className="login-section" id="login">
      <div className="container">

        <div className="login-wrapper">

          <div className="login-intro">

            <div className="login-logo">
              <GraduationCap size={30} />
            </div>

            <span className="section-tag">
              PARENT & STUDENT PORTAL
            </span>

            <h2>
              Stay Connected With
              <span> Your School.</span>
            </h2>

            <p>
              Access attendance, announcements, homework, examinations,
              fees and other school information from one place.
            </p>

          </div>

          <div className="login-card">

            <h3>Portal Login</h3>

            <p className="login-subtitle">
              Sign in to continue to your account.
            </p>

            <form>

              <div className="form-group">
                <label htmlFor="login-email">
                  Email / Student ID
                </label>

                <div className="input-with-icon">
                  <Mail size={18} />

                  <input
                    id="login-email"
                    type="text"
                    placeholder="Enter your ID or email"
                  />
                </div>
              </div>

              <div className="form-group">
                <label htmlFor="login-password">
                  Password
                </label>

                <div className="input-with-icon">
                  <Lock size={18} />

                  <input
                    id="login-password"
                    type="password"
                    placeholder="Enter your password"
                  />
                </div>
              </div>

              <button type="button" className="primary-button login-button">
                Sign In
                <ArrowRight size={18} />
              </button>

            </form>

            <p className="login-note">
              Portal authentication will be connected to the
              <strong> auth-service</strong> later.
            </p>

          </div>

        </div>

      </div>
    </section>
  );
}

export default Login;
