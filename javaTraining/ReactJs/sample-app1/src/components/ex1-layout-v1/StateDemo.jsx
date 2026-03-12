import { useState } from "react"

export default function StateDemo() {

    // let name ="Guest"
    const [name,setName] = useState('Guest')

    function handleClick(event){
        setName('Scott')
        console.log(`Name changed to  ${name}`)
    }

    return (
        <div>
            <p>Name: {name}</p>
            <button onClick={handleClick}>Change name</button>

        </div>
    )
}