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

    function incrementCounterFunction(){
        console.log('increment clicked')
    }

    return (
        <div className="counter">
            <span className= "count">0</span>
            <div>
                <button className="counterButton" onClick={incrementCounterFunction}
                // style= {buttonstyle}           
                >+1</button>
            </div>
        </div>
    )
}