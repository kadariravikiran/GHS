import { useState } from "react";
import {
  GraduationCap,
  Lock,
  Mail,
  ArrowRight
} from "lucide-react";

function Login() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [message, setMessage] = useState("");
  const [loading, setLoading] = useState(false);

  const handleLogin = async (event) => {
    event.preventDefault();

    setMessage("");
    setLoading(true);

    try {
      const response = await fetch("/api/auth/login", {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify({
          username,
          password
        })
      });

      const data = await response.json();

      if (!response.ok) {
        throw new Error(data.message || "Login failed");
      }

      localStorage.setItem("token", data.token);
      localStorage.setItem("username", data.username);
      localStorage.setItem("role", data.role);

      setMessage("Login successful.");
    } catch (error) {
      setMessage(error.message || "Unable to login.");
    } finally {
      setLoading(false);
    }
  };

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

            <form onSubmit={handleLogin}>

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
                    value={username}
                    onChange={(event) => setUsername(event.target.value)}
                    required
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
                    value={password}
                    onChange={(event) => setPassword(event.target.value)}
                    required
                  />
                </div>
              </div>

              <button
                type="submit"
                className="primary-button login-button"
                disabled={loading}
              >
                {loading ? "Signing In..." : "Sign In"}
                <ArrowRight size={18} />
              </button>

            </form>

            {message && (
              <p className="login-note">
                {message}
              </p>
            )}

          </div>

        </div>

      </div>
    </section>
  );
}

export default Login;
