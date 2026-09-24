import {
  BookOpen,
  Heart,
  Trophy,
  Users
} from "lucide-react";

function About() {
  return (
    <section className="about-section" id="about">
      <div className="container">

        <div className="section-heading">
          <span className="section-tag">ABOUT OUR SCHOOL</span>

          <h2>
            Growing With Knowledge,
            <span> Character & Confidence.</span>
          </h2>

          <p>
            Gnanodaya High School is committed to creating a learning
            environment where students are encouraged to learn, explore,
            participate and grow into responsible individuals.
          </p>
        </div>

        <div className="about-content">

          <div className="about-image">
            <img
              src="https://images.unsplash.com/photo-1509062522246-3755977927d7?auto=format&fit=crop&w=1000&q=85"
              alt="Students learning in a classroom"
            />

            <div className="about-experience-card">
              <strong>30+</strong>
              <span>Years of Educational Journey</span>
            </div>
          </div>

          <div className="about-info">

            <h3>
              Education Beyond the Classroom
            </h3>

            <p>
              We believe education is not only about academic knowledge.
              It is also about developing discipline, confidence,
              creativity, leadership and respect for others.
            </p>

            <p>
              Our goal is to provide every student with opportunities to
              discover their strengths and develop the skills needed for
              their future.
            </p>

            <div className="about-values">

              <div className="value-card">
                <div className="value-icon">
                  <BookOpen size={22} />
                </div>

                <div>
                  <h4>Knowledge</h4>
                  <p>
                    Building strong academic foundations.
                  </p>
                </div>
              </div>

              <div className="value-card">
                <div className="value-icon">
                  <Heart size={22} />
                </div>

                <div>
                  <h4>Character</h4>
                  <p>
                    Developing values, discipline and responsibility.
                  </p>
                </div>
              </div>

              <div className="value-card">
                <div className="value-icon">
                  <Trophy size={22} />
                </div>

                <div>
                  <h4>Excellence</h4>
                  <p>
                    Encouraging students to achieve their potential.
                  </p>
                </div>
              </div>

              <div className="value-card">
                <div className="value-icon">
                  <Users size={22} />
                </div>

                <div>
                  <h4>Community</h4>
                  <p>
                    Growing together with parents and society.
                  </p>
                </div>
              </div>

            </div>

          </div>

        </div>

      </div>
    </section>
  );
}

export default About;
