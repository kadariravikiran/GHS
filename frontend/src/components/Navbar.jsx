import { useState } from "react";
import { Menu, X, GraduationCap } from "lucide-react";

function Navbar() {
  const [menuOpen, setMenuOpen] = useState(false);

  const closeMenu = () => {
    setMenuOpen(false);
  };

  return (
    <header className="navbar">
      <div className="container navbar-inner">

        <a href="#home" className="brand" onClick={closeMenu}>
          <span className="brand-icon">
            <GraduationCap size={28} />
          </span>

          <span className="brand-text">
            <strong>GNANODAYA</strong>
            <small>HIGH SCHOOL</small>
          </span>
        </a>

        <nav className={`nav-links ${menuOpen ? "open" : ""}`}>
          <a href="#home" onClick={closeMenu}>Home</a>
          <a href="#about" onClick={closeMenu}>About</a>
          <a href="#academics" onClick={closeMenu}>Academics</a>
          <a href="#student-life" onClick={closeMenu}>Student Life</a>
          <a href="#admissions" onClick={closeMenu}>Admissions</a>
          <a href="#contact" onClick={closeMenu}>Contact</a>

          <a
            href="#login"
            className="nav-login"
            onClick={closeMenu}
          >
            Parent / Student Login
          </a>
        </nav>

        <button
          className="mobile-menu-button"
          onClick={() => setMenuOpen(!menuOpen)}
          aria-label="Toggle navigation menu"
        >
          {menuOpen ? <X size={28} /> : <Menu size={28} />}
        </button>

      </div>
    </header>
  );
}

export default Navbar;
