import { useEffect, useState } from "react"
import { retrieveAllTodosForUsernameApi, deleteTodoApi } from "./api/TodoApiService"

export default function ListTodosComponent(){
    const today = new Date()
    const targetDate = new Date(today.getFullYear() + 12, today.getMonth(), today.getDay())

    const [todos, setTodos] = useState([])
    
    const [message, setMessage] = useState(null)

    useEffect(() => refreshTodos(), [])


    function refreshTodos(){
        retrieveAllTodosForUsernameApi('in28minutes')
        .then(response => {
            //console.log(response)
            setTodos(response.data)
        }
        
        )
        .catch(error => console.log(error))
    }

    function deleteTodo(id){
        console.log("clicked " + id)
        deleteTodoApi('in28minutes', id).then
        (
            () => {
                setMessage(`Delete of todo with id = ${id} successful`)
                refreshTodos()
            } 
        ).catch(error => console.log(error))
    }

    return(
        <div className="container">
           <h1>Things you want to do!</h1>
           {message &&  <div className="alert alert-warning">{message}</div>}
           <div>
             <table className='table'>
                <thead>
                    <tr>
                        <th>Description</th>
                        <th>Is Done?</th>
                        <th>Target date</th>
                        <th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        todos.map(
                            todo => (<tr key={todo.id}>
                                <td>{todo.description}</td>
                                <td>{todo.done.toString()}</td>
                                {/* <td>{todo.targetDate.toDateString()}</td> */}
                                <td>{todo.targetDate.toString()}</td>
                                <td> <button className="btn btn-warning" onClick={() => deleteTodo(todo.id)}>DELETE</button></td>
                            </tr>)
                        )
                    }
                </tbody>
             </table>
           </div>
        </div>
    )
}