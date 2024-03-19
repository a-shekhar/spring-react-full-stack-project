import { useState } from 'react'
import './Counter.css'


export default function Counter(){

    // const buttonstyle = {
    //     fontSize:"30px",
    //     backgroundColor: "#00a5ab",
    //     width : "100px",
    //     margin : "10px",
    //     color : "white",
    //     padding : "15px",
    //     borderRadius : "30px"
    // }

    // it returns an array  [0, ƒ] where o is initial value and f is function
    //const state = useState(0);

    const [count, setCount] = useState(0)

    function incrementCounterFunction(){
        //state[1](state[0] + 1)
        setCount(count + 1)
        //console.log(state[0])
        //console.log(state[1])
        //console.log('increment clicked')
        console.log(count)
    }

    function decrementCounterFunction(){
        setCount(count - 1)
        console.log(count)
    }

    return (
        <div className="counter">
            <span className= "count">{count}</span>
            <div>
                <button className="counterButton" onClick={incrementCounterFunction}>+1</button>
                <button className="counterButton" onClick={decrementCounterFunction}>-1</button>
            </div>
        </div>
    )
}