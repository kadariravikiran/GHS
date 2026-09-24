const galleryImages = [
  {
    image:
      "https://images.unsplash.com/photo-1509062522246-3755977927d7?auto=format&fit=crop&w=900&q=85",
    title: "Classroom Learning"
  },
  {
    image:
      "https://images.unsplash.com/photo-1529390079861-591de354faf5?auto=format&fit=crop&w=900&q=85",
    title: "Students Together"
  },
  {
    image:
      "https://images.unsplash.com/photo-1577896851231-70ef18881754?auto=format&fit=crop&w=900&q=85",
    title: "Learning Activities"
  },
  {
    image:
      "https://images.unsplash.com/photo-1544717305-2782549b5136?auto=format&fit=crop&w=900&q=85",
    title: "Student Development"
  },
  {
    image:
      "https://images.unsplash.com/photo-1523050854058-8df90110c9f1?auto=format&fit=crop&w=900&q=85",
    title: "School Life"
  },
  {
    image:
      "https://images.unsplash.com/photo-1564981797816-1043664bf78d?auto=format&fit=crop&w=900&q=85",
    title: "Campus Moments"
  }
];

function Gallery() {
  return (
    <section className="gallery-section" id="gallery">
      <div className="container">

        <div className="section-heading">
          <span className="section-tag">SCHOOL GALLERY</span>

          <h2>
            Moments That Make
            <span> School Special.</span>
          </h2>

          <p>
            A glimpse into learning, participation, friendship and everyday
            school life.
          </p>
        </div>

        <div className="gallery-grid">
          {galleryImages.map((item) => (
            <div className="gallery-card" key={item.title}>

              <img src={item.image} alt={item.title} />

              <div className="gallery-overlay">
                <span>{item.title}</span>
              </div>

            </div>
          ))}
        </div>

      </div>
    </section>
  );
}

export default Gallery;
