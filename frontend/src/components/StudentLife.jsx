import {
  Trophy,
  Music,
  Palette,
  Users,
  Dumbbell,
  Mic2
} from "lucide-react";

const activities = [
  {
    icon: Trophy,
    title: "Sports",
    text: "Encouraging teamwork, discipline and healthy competition."
  },
  {
    icon: Music,
    title: "Music",
    text: "Giving students opportunities to explore rhythm, music and performance."
  },
  {
    icon: Palette,
    title: "Arts & Creativity",
    text: "Helping students express ideas through art and creative activities."
  },
  {
    icon: Users,
    title: "Leadership",
    text: "Building communication, responsibility and leadership skills."
  },
  {
    icon: Dumbbell,
    title: "Physical Education",
    text: "Supporting active lifestyles and physical development."
  },
  {
    icon: Mic2,
    title: "Public Speaking",
    text: "Developing confidence through speaking, presentations and participation."
  }
];

function StudentLife() {
  return (
    <section className="student-life-section" id="student-life">
      <div className="container">

        <div className="section-heading">
          <span className="section-tag">STUDENT LIFE</span>

          <h2>
            Learning Happens
            <span> Everywhere.</span>
          </h2>

          <p>
            School life is more than classrooms and textbooks. We encourage
            students to participate, collaborate, create and discover their
            strengths.
          </p>
        </div>

        <div className="activity-grid">
          {activities.map((activity) => {
            const Icon = activity.icon;

            return (
              <div className="activity-card" key={activity.title}>
                <div className="activity-icon">
                  <Icon size={24} />
                </div>

                <h3>{activity.title}</h3>

                <p>{activity.text}</p>
              </div>
            );
          })}
        </div>

      </div>
    </section>
  );
}

export default StudentLife;
