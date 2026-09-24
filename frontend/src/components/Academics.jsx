import {
  BookOpen,
  FlaskConical,
  Calculator,
  Languages,
  Monitor,
  GraduationCap
} from "lucide-react";

const programs = [
  {
    icon: BookOpen,
    title: "Primary Education",
    text: "Building strong foundations through curiosity, activity and joyful learning."
  },
  {
    icon: GraduationCap,
    title: "Secondary Education",
    text: "Preparing students with academic knowledge, discipline and confidence."
  },
  {
    icon: FlaskConical,
    title: "Science & Exploration",
    text: "Encouraging students to question, experiment and understand the world."
  },
  {
    icon: Calculator,
    title: "Mathematics",
    text: "Developing logical thinking, problem solving and analytical skills."
  },
  {
    icon: Languages,
    title: "Languages",
    text: "Strengthening communication, vocabulary, reading and expression."
  },
  {
    icon: Monitor,
    title: "Digital Learning",
    text: "Introducing students to technology and modern learning resources."
  }
];

function Academics() {
  return (
    <section className="academics-section" id="academics">
      <div className="container">

        <div className="section-heading">
          <span className="section-tag">ACADEMICS</span>

          <h2>
            Learning That Builds
            <span> Strong Foundations.</span>
          </h2>

          <p>
            Our academic approach focuses on understanding concepts,
            developing curiosity and helping students become confident
            learners.
          </p>
        </div>

        <div className="academic-grid">
          {programs.map((program) => {
            const Icon = program.icon;

            return (
              <div className="academic-card" key={program.title}>
                <div className="academic-icon">
                  <Icon size={25} />
                </div>

                <h3>{program.title}</h3>

                <p>{program.text}</p>
              </div>
            );
          })}
        </div>

      </div>
    </section>
  );
}

export default Academics;
