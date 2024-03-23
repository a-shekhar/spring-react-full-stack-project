import { useState } from 'react'
import './TodoApp.css'

export default function TodoApp(){
    return(
        <div className="TodoApp">
            Todo Management Application
            <LoginComponent/>
            {/* <WelcomeComponent/> */}
        </div>
    )
}

function LoginComponent(){

    const [username, setUsername] =useState('aditya')

    const [password, setPassword] =useState('')

    const [showSuccessMessage, setShowSuccessMessage] =useState(false)

    const [showErrorMessage, setShowErrorMessage] =useState(false)

    function handleUsernameChange(event){
        //console.log(event.target.value)
        setUsername(event.target.value)
    }


    function handlePasswordChange(event){
        //console.log(event.target.value)
        setPassword(event.target.value)
    }

    function SuccessMessageComponent(){
        if(showSuccessMessage){
            return(<div className='successMessage'>Authentication successful</div>)
        }
        return null;
    }

    function ErrorMessageComponent(){
        if(showErrorMessage){
            return(<div className='errorMessage'>Authentication failed. Please check your credentials</div>)
        }
        return null;
    }


    function handleSubmit(){
       // console.log(username);
       // console.log(password)
       if(username === "aditya" && password == "dummy"){
            console.log('Success')
            setShowSuccessMessage(true)
            setShowErrorMessage(false)
       }else{
            console.log('Failed')
            setShowSuccessMessage(false)
            setShowErrorMessage(true)
       }
    }

   

    return(
        <div className="Login">
            <SuccessMessageComponent/>
            <ErrorMessageComponent/>

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
    return(
        <div className="Welcome">
            Welcome Component
        </div>
    )
}