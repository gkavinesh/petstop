import React, { useState } from 'react';

function PetCareAppointments() {
    const [formData, setFormData] = useState({
        appointmentType: '',
        petName: '',
        appointmentDate: '',
        appointmentTime: '',
        contactEmail: '',
        additionalNotes: ''
    });
    const [confirmationMessage, setConfirmationMessage] = useState('');

    const handleChange = (e) => {
        const { name, value } = e.target;
        setFormData({ ...formData, [name]: value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        // Add your logic here to handle form submission (e.g., sending data to backend)
        // For now, just display the confirmation message
        setConfirmationMessage('Appointment booked successfully!');
        setFormData({
            appointmentType: '',
            petName: '',
            appointmentDate: '',
            appointmentTime: '',
            contactEmail: '',
            additionalNotes: ''
        });
    };

    return (
        <div className="form-container">
            <h2>Pet Care Appointments</h2>
            <form onSubmit={handleSubmit}>
                <label htmlFor="appointmentType">Appointment Type:</label>
                <select
                    id="appointmentType"
                    name="appointmentType"
                    value={formData.appointmentType}
                    onChange={handleChange}
                    required
                >
                    <option value="">Select Appointment Type</option>
                    <option value="grooming">Grooming</option>
                    <option value="veterinary-visit">Veterinary Visit</option>
                    <option value="training">Training Session</option>
                    {/* Add more options if needed */}
                </select>

                <label htmlFor="petName">Pet's Name:</label>
                <input
                    type="text"
                    id="petName"
                    name="petName"
                    value={formData.petName}
                    onChange={handleChange}
                    required
                />

                {/* Add more fields for pet information */}

                <label htmlFor="appointmentDate">Preferred Date:</label>
                <input
                    type="date"
                    id="appointmentDate"
                    name="appointmentDate"
                    value={formData.appointmentDate}
                    onChange={handleChange}
                    required
                />

                <label htmlFor="appointmentTime">Preferred Time:</label>
                <input
                    type="time"
                    id="appointmentTime"
                    name="appointmentTime"
                    value={formData.appointmentTime}
                    onChange={handleChange}
                    required
                />

                <label htmlFor="contactEmail">Your Email:</label>
                <input
                    type="email"
                    id="contactEmail"
                    name="contactEmail"
                    value={formData.contactEmail}
                    onChange={handleChange}
                    required
                />

                {/* Add more fields for contact information */}

                <label htmlFor="additionalNotes">Additional Notes:</label>
                <textarea
                    id="additionalNotes"
                    name="additionalNotes"
                    value={formData.additionalNotes}
                    onChange={handleChange}
                    rows="4"
                ></textarea>

                <input type="submit" value="Book Appointment" />

                {confirmationMessage && (
                    <div className="confirmation-message">{confirmationMessage}</div>
                )}
            </form>
        </div>
    );
}

export default PetCareAppointments;
