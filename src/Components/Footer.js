import React from "react";
import Logo from "../Assets/Logo.png";

const Footer = () => {
  return (
    <div className="footer-wrapper">
      <div className="footer-section-one">
        <div className="footer-logo-container">
          <img src={Logo} alt="" />
        </div>
      </div>
      <div className="footer-section-two">
        <div className="footer-section-columns">
          <span>Location</span>
          <span>Products</span>
          <span>Home</span>
        </div>
        <div className="footer-section-columns">
          <span>076-440-9972</span>
          <span>hello@petstop.lk</span>
        </div>
        <div className="footer-section-columns">
          <span>Terms & Conditions</span>
          <span>Privacy Policy</span>
        </div>
      </div>
    </div>
  );
};

export default Footer;
