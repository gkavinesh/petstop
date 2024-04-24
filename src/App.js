
import "./App.css";
import Home from "./Components/Home";
import About from "./Components/About";
import Work from "./Components/Work";
import Testimonial from "./Components/Testimonial";
import Contact from "./Components/Contact";
import Footer from "./Components/Footer";
import Appointment from "./Components/Appointment";
import Navbar from "./Components/Navbar";
import Admin from "./Admin";

function App() {
  return (
    <div className="App">
      <Navbar />
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

export default App;
