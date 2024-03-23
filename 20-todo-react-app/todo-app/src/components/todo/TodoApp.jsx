import { useState } from 'react'
import './TodoApp.css'
import { BrowserRouter, Route, Routes, useNavigate, useParams} from 'react-router-dom'

export default function TodoApp(){
    return(
        <div className="TodoApp">
            <BrowserRouter>
                <Routes>
                    <Route path = '/' element ={<LoginComponent/>}></Route>
                    <Route path = '/login' element ={<LoginComponent/>}></Route>
                    <Route path = '/welcome/:username' element ={<WelcomeComponent/>}></Route>
                    <Route path = '/*' element ={<ErrorComponent/>}></Route>
                </Routes>
            </BrowserRouter>
        </div>
    )
}

function LoginComponent(){

    const [username, setUsername] =useState('aditya')

    const [password, setPassword] =useState('')

    const [showSuccessMessage, setShowSuccessMessage] =useState(false)

    const [showErrorMessage, setShowErrorMessage] =useState(false)

    const navigate = useNavigate()

    function handleUsernameChange(event){
        //console.log(event.target.value)
        setUsername(event.target.value)
    }


    function handlePasswordChange(event){
        //console.log(event.target.value)
        setPassword(event.target.value)
    }

  


    function handleSubmit(){
       // console.log(username);
       // console.log(password)
       if(username === "aditya" && password == "dummy"){
            console.log('Success')
            setShowSuccessMessage(true)
            setShowErrorMessage(false)
            navigate(`/welcome/${username}`)
       }else{
            console.log('Failed')
            setShowSuccessMessage(false)
            setShowErrorMessage(true)
       }
    }

   

    return(
        <div className="Login">
             <h1>Time to Login</h1>
            {showSuccessMessage && <div className='successMessage'>Authentication successful</div>}
            {showErrorMessage && <div className='errorMessage'>Authentication failed. Please check your credentials</div>}

            <div className="LoginForm">
                <div>
                    <label>User Name</label>
                    <input type="text" name = "username" value = {username} onChange={handleUsernameChange}/>
                </div>
                <div>
                    <label>Password</label>
                    <input type="password" name = "password" value = {password} onChange={handlePasswordChange}/>
                </div>
                <div>
                    <button type="button" name = "login" onClick={handleSubmit}> Login </button>
                </div>
            </div>
        </div>
    )
}


function WelcomeComponent(){
    const {username} = useParams()
   // console.log(params.username)
   console.log(username)
    return(
    <div>
        <h1> Weclome to {username}'s world!</h1>
        <div className="Welcome">
            Welcome Component
        </div>

        </div>
    )
}


function ErrorComponent(){
    return(
        <div className="ErrorComponent">
           <h1> We are working really hard!</h1>
           <div>
             Apologies for 404. Reach out to our team.
           </div>
        </div>
    )
}





// function SuccessMessageComponent(){
//     if(showSuccessMessage){
//         return(<div className='successMessage'>Authentication successful</div>)
//     }
//     return null;
// }

// function ErrorMessageComponent(){
//     if(showErrorMessage){
//         return(<div className='errorMessage'>Authentication failed. Please check your credentials</div>)
//     }
//     return null;
// }