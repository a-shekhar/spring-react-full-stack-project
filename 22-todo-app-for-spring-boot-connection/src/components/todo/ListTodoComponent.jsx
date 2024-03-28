import { useEffect, useState } from "react"
import { retrieveAllTodosForUsernameApi, deleteTodoApi } from "./api/TodoApiService"
import { useAuth } from "./security/AuthContext"
import { useNavigate } from "react-router-dom"

export default function ListTodosComponent(){
    const today = new Date()
    const targetDate = new Date(today.getFullYear() + 12, today.getMonth(), today.getDay())

    const [todos, setTodos] = useState([])
    
    const [message, setMessage] = useState(null)

    useEffect(() => refreshTodos(), [])

    const authContext = useAuth()

    const username = authContext.username

    const navigate = useNavigate()


    function refreshTodos(){
        retrieveAllTodosForUsernameApi(username)
        .then(response => {
            //console.log(response)
            setTodos(response.data)
        }
        
        )
        .catch(error => console.log(error))
    }

    function deleteTodo(id){
        console.log("clicked " + id)
        deleteTodoApi(username, id).then
        (
            () => {
                setMessage(`Delete of todo with id = ${id} successful`)
                refreshTodos()
            } 
        ).catch(error => console.log(error))
    }


    function updateTodo(id){
        console.log("clicked " + id)
        navigate(`/todo/${id}`)
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
                        <th>Update</th>
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
                                <td> <button className="btn btn-success" onClick={() => updateTodo(todo.id)}>Update</button></td>
                                <td> <button className="btn btn-warning" onClick={() => deleteTodo(todo.id)}>Delete</button></td>
                            </tr>)
                        )
                    }
                </tbody>
             </table>
           </div>
        </div>
    )
}