import {
  Megaphone,
  CalendarDays,
  ArrowRight
} from "lucide-react";

const announcements = [
  {
    date: "01",
    month: "JUN",
    title: "New Academic Year",
    text: "Welcome students and parents to another year of learning and growth."
  },
  {
    date: "15",
    month: "JUN",
    title: "Parent Meeting",
    text: "Parents can connect with teachers and discuss student progress."
  },
  {
    date: "05",
    month: "JUL",
    title: "Student Activities",
    text: "Students will participate in academic and co-curricular activities."
  }
];

function Announcements() {
  return (
    <section className="announcements-section" id="announcements">
      <div className="container">

        <div className="section-heading">
          <span className="section-tag">LATEST UPDATES</span>

          <h2>
            School
            <span> Announcements.</span>
          </h2>

          <p>
            Important information and upcoming activities for students and
            parents.
          </p>
        </div>

        <div className="announcement-grid">
          {announcements.map((item) => (
            <article className="announcement-card" key={item.title}>

              <div className="announcement-date">
                <strong>{item.date}</strong>
                <span>{item.month}</span>
              </div>

              <div className="announcement-content">

                <div className="announcement-type">
                  <Megaphone size={16} />
                  School Update
                </div>

                <h3>{item.title}</h3>

                <p>{item.text}</p>

                <div className="announcement-footer">
                  <span>
                    <CalendarDays size={15} />
                    School Notice
                  </span>

                  <ArrowRight size={17} />
                </div>

              </div>

            </article>
          ))}
        </div>

      </div>
    </section>
  );
}

export default Announcements;
