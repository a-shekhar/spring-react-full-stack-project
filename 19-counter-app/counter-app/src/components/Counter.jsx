import { useState } from 'react'
import './Counter.css'
import {PropTypes} from 'prop-types'


export default function Counter({by}){

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
        setCount(count + by)
        //console.log(state[0])
        //console.log(state[1])
        //console.log('increment clicked')
        console.log(count)
    }

    function decrementCounterFunction(){
        setCount(count - by)
        console.log(count)
    }

    return (
        <div className="counter">
            <span className= "count">{count}</span>
            <div>

                <button className="counterButton" onClick={incrementCounterFunction}>+{by}</button>
                <button className="counterButton" onClick={decrementCounterFunction}>-{by}</button>
            </div>
        </div>
    )
}

Counter.propTypes = {
    by: PropTypes.number 
}

Counter.defaultProps ={
    by: 1
}