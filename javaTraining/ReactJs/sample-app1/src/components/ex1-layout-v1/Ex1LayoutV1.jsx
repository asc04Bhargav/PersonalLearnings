import Footer from "./Footer";
import Header from "./Header";
import MainContent from "./MainContent";
import Sidebar from "./Sidebar";
import './ex1-layout-v1.css'

export default function Ex1LayoutV1() {
    const menuItems =['Home', 'About','Services','Contact']
    const contentData={
        title:'Hi, This is the modified main content',
        paragraph:'Good evening, react is component based'
    }

    return (
        <div className="layout">
            <Header title="Hello, Welcome to my Website."></Header>
            <div className="main-area">
                <Sidebar items={menuItems}></Sidebar>
                <MainContent 
                    title={contentData.title} 
                    paragraph ={contentData.paragraph}>
                </MainContent>
            </div>
            <Footer text="Thank you for visiting our website"></Footer>
        </div>
    )
}