import { ArrowRight, Sparkles } from "lucide-react";

function Hero() {
  return (
    <section className="hero" id="home">
      <div className="container hero-inner">

        <div className="hero-content">
          <div className="hero-eyebrow">
            <Sparkles size={17} />
            <span>GNANODAYA HIGH SCHOOL • MUCHKUR</span>
          </div>

          <h1>
            Inspiring Young Minds,
            <span> Building Tomorrow.</span>
          </h1>

          <p className="hero-description">
            A place where curiosity becomes confidence, learning becomes
            character, and every child gets the opportunity to discover
            their potential.
          </p>

          <div className="hero-actions">
            <a href="#about" className="primary-button">
              Explore Our School
              <ArrowRight size={19} />
            </a>

            <a href="#admissions" className="secondary-button">
              Admissions
            </a>
          </div>

          <div className="hero-stats">
            <div>
              <strong>30+</strong>
              <span>Years of Learning</span>
            </div>

            <div>
              <strong>1000+</strong>
              <span>Students Inspired</span>
            </div>

            <div>
              <strong>25+</strong>
              <span>Dedicated Teachers</span>
            </div>
          </div>
        </div>

        <div className="hero-visual">
          <div className="hero-image-wrapper">
            <img
              src="https://images.unsplash.com/photo-1580582932707-520aed937b7b?auto=format&fit=crop&w=1200&q=85"
              alt="School building and campus"
            />

            <div className="hero-floating-card">
              <div className="floating-icon">
                <Sparkles size={20} />
              </div>

              <div>
                <strong>Learning with Purpose</strong>
                <span>Knowledge • Character • Excellence</span>
              </div>
            </div>
          </div>
        </div>

      </div>
    </section>
  );
}

export default Hero;
