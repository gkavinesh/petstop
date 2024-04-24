import React from 'react';
import PostAppointment from './PostAppointment';
import Image from '..//Assets/sidedog.png';

const Appointment = () => {
  return (
    <div className="work-section-wrapper">
      <div className="about-background-image-container">
        <img src={Image} alt="" width="1000px" height="1000px"/>
      </div>
      <div className="work-section-top">
        <p className="primary-subheading">Appointments</p>
        <h1 className="primary-heading">Give in your details</h1>
        <p className="primary-text">
          We provide the best pet care and medical services in the town !
        </p>
      </div>
      <PostAppointment />
    </div>
  );
};

export default Appointment;

