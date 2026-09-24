import {
  GraduationCap,
  Facebook,
  Instagram,
  Youtube,
  ArrowUp
} from "lucide-react";

function Footer() {
  return (
    <footer className="footer">

      <div className="container">

        <div className="footer-main">

          <div className="footer-brand">

            <div className="footer-logo">
              <GraduationCap size={27} />
            </div>

            <div>
              <h3>GNANODAYA</h3>
              <span>HIGH SCHOOL</span>
            </div>

            <p>
              Inspiring young minds through knowledge, character and
              excellence.
            </p>

          </div>

          <div className="footer-links">
            <h4>Quick Links</h4>

            <a href="#home">Home</a>
            <a href="#about">About</a>
            <a href="#academics">Academics</a>
            <a href="#admissions">Admissions</a>
          </div>

          <div className="footer-links">
            <h4>Explore</h4>

            <a href="#student-life">Student Life</a>
            <a href="#gallery">Gallery</a>
            <a href="#announcements">Announcements</a>
            <a href="#contact">Contact</a>
          </div>

          <div className="footer-social">
            <h4>Connect With Us</h4>

            <div className="social-links">
              <a href="#facebook" aria-label="Facebook">
                <Facebook size={19} />
              </a>

              <a href="#instagram" aria-label="Instagram">
                <Instagram size={19} />
              </a>

              <a href="#youtube" aria-label="YouTube">
                <Youtube size={19} />
              </a>
            </div>
          </div>

        </div>

        <div className="footer-bottom">

          <span>
            © 2026 Gnanodaya High School. All rights reserved.
          </span>

          <a href="#home" className="back-to-top">
            Back to top
            <ArrowUp size={16} />
          </a>

        </div>

      </div>

    </footer>
  );
}

export default Footer;
