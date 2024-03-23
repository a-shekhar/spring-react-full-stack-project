import {PropTypes} from 'prop-types'
//import { useState } from 'react'

export default function CounterButton({by, incrementMethod, decrementMethod}){

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

    // const [count, setCount] = useState(0)

    // function incrementCounterFunction(){
    //     //state[1](state[0] + 1)
    //     //setCount(count + by)
    //     //console.log(state[0])
    //     //console.log(state[1])
    //     //console.log('increment clicked')
    //     incrementMethod(by)
    //     //console.log(count)
    // }

    // function decrementCounterFunction(){
    //     //setCount(count - by)
    //     decrementMethod(by)
    //     // console.log(count)
    // }

    return (
        <div className="counter">
            {/* <span className= "count">{count}</span>  */}   
            <div>

                <button className="counterButton" onClick={() => incrementMethod(by)}>+{by}</button>
                <button className="counterButton" onClick={() => decrementMethod(by)}>-{by}</button>
            </div>
        </div>
    )
}

CounterButton.propTypes = {
    by: PropTypes.number 
}

CounterButton.defaultProps ={
    by: 1
}