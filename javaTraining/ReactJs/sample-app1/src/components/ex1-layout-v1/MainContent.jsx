export default function MainContent({title,paragraph}) {
    return (
        <main className="content">
            <h2>{title}</h2>
            <p>{paragraph}</p>
        </main>
    )
}