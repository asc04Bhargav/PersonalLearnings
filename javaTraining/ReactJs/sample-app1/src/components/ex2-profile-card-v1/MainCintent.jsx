import { useState } from "react"

export default function MainContent({name, title, email, phone, image}) {

    const [showContact,setShowContact] =useState(false)

    function toggleContact(){
        setShowContact(prevShowContact => !prevShowContact)
    }
    return (
        <main className="main-content">
            <div className="card">
                <img src={image} alt={name} />
                <h2>{name}</h2>
                <p>{title}</p>
                {
                    showContact && <div className="contact-info">
                        <p>Email:{email}</p>
                        <p>Phone:{phone}</p>
                        </div>
                }

                <div className="toggle-btn" onClick={toggleContact}>
                    {showContact ? 'Hide Contact ': 'Show Contact'}
                </div>
            </div>
        </main>
    )
}