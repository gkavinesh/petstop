import React from "react";
import BannerBackground from "../Assets/home-banner-background.png";
import BannerImage from "../Assets/pawfade.png";
import BannerImage2 from "../Assets/girlanddog.png";
import Navbar from "./Navbar";
import { FiArrowRight } from "react-icons/fi";

const Home = () => {
  return (
    <div className="home-container">
      <Navbar />
      <div className="home-banner-container">
        <div className="home-bannerImage-container">
          <img src={BannerBackground} alt="" />
        </div>
        <div className="home-text-section">
          <h1 className="primary-heading">
            Your Favourite Place for Pet Care!
          </h1>
          <br></br>
          <br></br>
          <button className="secondary-button">
            Book an appointment! <FiArrowRight />{" "}
          </button>
        </div>
        <div className="home-image-section">
          <img src={BannerImage} alt="" />
        </div>
        <div className="home-image-section">
          <img src={BannerImage2} alt="" />
        </div>
      </div>
    </div>
  );
};

export default Home;
