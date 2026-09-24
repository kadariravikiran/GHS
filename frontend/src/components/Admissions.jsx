import {
  ClipboardList,
  FileText,
  MessageCircle,
  CheckCircle,
  ArrowRight
} from "lucide-react";

const steps = [
  {
    icon: MessageCircle,
    number: "01",
    title: "Enquire",
    text: "Contact the school and understand the admission process."
  },
  {
    icon: FileText,
    number: "02",
    title: "Application",
    text: "Complete the required student admission application."
  },
  {
    icon: ClipboardList,
    number: "03",
    title: "Interaction",
    text: "Meet with the school team and discuss the student's requirements."
  },
  {
    icon: CheckCircle,
    number: "04",
    title: "Confirmation",
    text: "Complete the required formalities and begin the school journey."
  }
];

function Admissions() {
  return (
    <section className="admissions-section" id="admissions">
      <div className="container">

        <div className="admissions-header">

          <div>
            <span className="section-tag">ADMISSIONS</span>

            <h2>
              Begin Your Child's
              <span> Learning Journey.</span>
            </h2>

            <p>
              We welcome parents who are looking for a supportive learning
              environment where children can grow academically and personally.
            </p>
          </div>

          <a href="#contact" className="primary-button">
            Contact School
            <ArrowRight size={19} />
          </a>

        </div>

        <div className="admission-steps">
          {steps.map((step) => {
            const Icon = step.icon;

            return (
              <div className="admission-step" key={step.number}>

                <div className="admission-number">
                  {step.number}
                </div>

                <div className="admission-icon">
                  <Icon size={23} />
                </div>

                <h3>{step.title}</h3>

                <p>{step.text}</p>

              </div>
            );
          })}
        </div>

      </div>
    </section>
  );
}

export default Admissions;
