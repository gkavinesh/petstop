
import "./Admin.css";
import Home from "./Components/Home";
import About from "./Components/About";
import Work from "./Components/Work";
import Testimonial from "./Components/Testimonial";
import Contact from "./Components/Contact";
import Footer from "./Components/Footer";
import Appointment from "./Components/Appointment";

function Admin() {
  return (
    <div className="App">
      <Home />
      <About />
      <Work />
      <Testimonial />
      <Appointment/>
      <Contact />
      <Footer />
    </div>
  );
}

export default Admin;