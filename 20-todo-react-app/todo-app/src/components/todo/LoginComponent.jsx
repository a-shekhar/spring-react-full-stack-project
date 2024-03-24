import { useState } from 'react'
import {useNavigate} from 'react-router-dom'
import { useAuth } from './security/AuthContext'

export default function LoginComponent(){

    const [username, setUsername] =useState('aditya')

    const [password, setPassword] =useState('')

    const [showSuccessMessage, setShowSuccessMessage] =useState(false)

    const [showErrorMessage, setShowErrorMessage] =useState(false)

    const navigate = useNavigate()

    const authContext = useAuth()

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
            authContext.setAuthenticated(true)
            console.log('Success')
            setShowSuccessMessage(true)
            setShowErrorMessage(false)
            navigate(`/welcome/${username}`)
       }else{
            authContext.setAuthenticated(false)
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
