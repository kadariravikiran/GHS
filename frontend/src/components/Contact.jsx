import {
  MapPin,
  Phone,
  Mail,
  Clock,
  Send
} from "lucide-react";

function Contact() {
  return (
    <section className="contact-section" id="contact">
      <div className="container">

        <div className="section-heading">
          <span className="section-tag">CONTACT US</span>

          <h2>
            Let's Stay
            <span> Connected.</span>
          </h2>

          <p>
            Have a question about admissions, academics or school activities?
            Get in touch with us.
          </p>
        </div>

        <div className="contact-content">

          <div className="contact-info">

            <div className="contact-item">
              <div className="contact-icon">
                <MapPin size={22} />
              </div>

              <div>
                <h3>Visit Us</h3>
                <p>Gnanodaya High School, Muchkur, Telangana</p>
              </div>
            </div>

            <div className="contact-item">
              <div className="contact-icon">
                <Phone size={22} />
              </div>

              <div>
                <h3>Call Us</h3>
                <p>School Office: +91 XXXXX XXXXX</p>
              </div>
            </div>

            <div className="contact-item">
              <div className="contact-icon">
                <Mail size={22} />
              </div>

              <div>
                <h3>Email</h3>
                <p>info@gnanodayahighschool.in</p>
              </div>
            </div>

            <div className="contact-item">
              <div className="contact-icon">
                <Clock size={22} />
              </div>

              <div>
                <h3>School Hours</h3>
                <p>Monday – Saturday • 9:00 AM – 4:00 PM</p>
              </div>
            </div>

          </div>

          <form className="contact-form">

            <div className="form-row">

              <div className="form-group">
                <label htmlFor="name">Parent / Student Name</label>
                <input
                  id="name"
                  type="text"
                  placeholder="Enter your name"
                />
              </div>

              <div className="form-group">
                <label htmlFor="phone">Phone Number</label>
                <input
                  id="phone"
                  type="tel"
                  placeholder="Enter phone number"
                />
              </div>

            </div>

            <div className="form-group">
              <label htmlFor="email">Email Address</label>
              <input
                id="email"
                type="email"
                placeholder="Enter email address"
              />
            </div>

            <div className="form-group">
              <label htmlFor="message">Message</label>
              <textarea
                id="message"
                rows="5"
                placeholder="How can we help you?"
              />
            </div>

            <button type="button" className="primary-button">
              Send Message
              <Send size={18} />
            </button>

          </form>

        </div>

      </div>
    </section>
  );
}

export default Contact;
