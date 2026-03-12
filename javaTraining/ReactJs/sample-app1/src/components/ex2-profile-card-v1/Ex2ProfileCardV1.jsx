import Footer from './Footer'
import Header from './Header'
import MainContent from './MainCintent'
import profileImage from '/src/assets/person.jpeg'
import './ex2-profile-card-v1.css'

export default function Ex2ProfileCardV1(){
    const cardDetails={
        name:'Scott',
        titel:'Solution Architect',
        email:'scott.urman@scott.com',
        phone:'+9199999912345',
        Image:profileImage
    }

    return (
        <div className='app-container'>
            <Header name="Alice"></Header>
            <MainContent {...cardDetails}></MainContent>
            <Footer message="Hello, good evening..."></Footer>

        </div>
    )
}