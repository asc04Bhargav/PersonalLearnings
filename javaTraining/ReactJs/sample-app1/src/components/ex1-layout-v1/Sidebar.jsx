export default function Sidebar({items}) {
    return (
        <aside className="sidebar">
            <ul>
                { items.map( (item,index) => <li key={index}>{item}</li>)}
            </ul>
        </aside>
    )
}