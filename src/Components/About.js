import React from "react";
import AboutBackground from "../Assets/about-background.png";
import AboutBackgroundImage from "../Assets/dog.png";

const About = () => {
  return (
    <div className="about-section-container">
      <div className="about-background-image-container">
        <img src={AboutBackground} alt="" />
      </div>
      <div className="about-section-image-container">
        <img src={AboutBackgroundImage} alt="" />
      </div>
      <div className="about-section-text-container">
        <p className="primary-subheading">About</p>
        <h1 className="primary-heading">
        Our Story
        </h1>
        <p className="primary-text">
        Pet Stop was founded by a team of animal enthusiasts who shared a common vision: to create a haven where pets are cherished, pampered, and prioritized.
        </p>
        <p className="primary-text">
        With years of experience in pet care and a deep understanding of the bond between pets and their humans, we set out to establish a place where every wag of a tail and every purr of contentment matters.
        </p>
        <div className="about-buttons-container">
          <button className="secondary-button">Pet Essentials</button>
        </div>
      </div>
    </div>
  );
};

export default About;
