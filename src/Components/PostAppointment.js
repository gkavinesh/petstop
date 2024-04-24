import React, { useState } from 'react';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';

const PostAppointment = () => {
    const [formData, setFormData] = useState({
        petType: "",
        petName: "",
        description: "",
        contactEmail: ""
    });

    const [showPopup, setShowPopup] = useState(false);

    const handleInputChange = (event) => {
        const { name, value } = event.target;
        setFormData({
            ...formData,
            [name]: value,
        });
    };

    const handleSubmit = async(e) => {
        e.preventDefault();

        try {
            const response = await fetch("http://localhost:8080/api/appointment", {
                method: "POST",
                headers: {"Content-Type": "application/json"},
                body: JSON.stringify(formData)
            });

            if (response.ok) {
                setShowPopup(true);
                setFormData({
                    petType: "",
                    petName: "",
                    description: "",
                    contactEmail: ""
                });
                setTimeout(() => {
                    setShowPopup(false);
                }, 5000); // Set the timeout for 5 seconds (5000 milliseconds)
            } else {
                console.log("Failed to submit appointment");
            }
        } catch (error) {
            console.log("Error creating the appointment:", error.message);
        }
    };

    return (
        <>
            <div className="center-form">
                <Form onSubmit={handleSubmit}>
                    <Form.Group controlId="formBasicName">
                        <Form.Control
                            type="text"
                            name="petName"
                            placeholder="Enter Pet Name"
                            value={formData.petName}
                            onChange={handleInputChange}
                        />
                    </Form.Group>
                    <Form.Group controlId="formBasicType">
                        <Form.Control
                            type="text"
                            name="petType"
                            placeholder="Enter Pet Type"
                            value={formData.petType}
                            onChange={handleInputChange}
                        />
                    </Form.Group>
                    <Form.Group controlId="formBasicDescription">
                        <Form.Control
                            as="textarea"
                            rows={4} // Adjust the number of rows as needed
                            name="description"
                            placeholder="Enter details"
                            value={formData.description}
                            onChange={handleInputChange}
                        />
                    </Form.Group>
                    <Form.Group controlId="formBasicEmail">
                        <Form.Control
                            type="email"
                            name="contactEmail"
                            placeholder="Enter email"
                            value={formData.contactEmail}
                            onChange={handleInputChange}
                        />
                    </Form.Group>
                    <Button variant="primary" type="submit" className="w-100">Request Appointment</Button>
                </Form>
            </div>
            {showPopup && (
                <div className="popup">
                    <p>Appointment Successfully requested! Check your inbox.</p>
                </div>
            )}
        </>
    );
};

export default PostAppointment;




