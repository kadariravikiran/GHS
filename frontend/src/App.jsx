import Navbar from "./components/Navbar";
import Hero from "./components/Hero";
import About from "./components/About";
import Academics from "./components/Academics";
import StudentLife from "./components/StudentLife";
import Admissions from "./components/Admissions";
import Gallery from "./components/Gallery";
import Announcements from "./components/Announcements";
import Contact from "./components/Contact";
import Footer from "./components/Footer";
import Login from "./components/Login";

function App() {
  return (
    <>
      <Navbar />

      <main>
        <Hero />
        <About />
        <Academics />
        <StudentLife />
        <Admissions />
        <Gallery />
        <Announcements />
        <Contact />
        <Login />
      </main>

      <Footer />
    </>
  );
}

export default App;
