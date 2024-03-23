
import './TodoApp.css'
import { BrowserRouter, Route, Routes} from 'react-router-dom'
import LogoutComponent from './LogoutComponent'
import HeaderComponent from './HeaderComponent'
import ListTodosComponent from './ListTodoComponent'
import ErrorComponent from './ErrorComponent'
import WelcomeComponent from './WelcomeComponent'
import LoginComponent from './LoginComponent'

export default function TodoApp(){
    return(
        <div className="TodoApp">
            <BrowserRouter>
            <HeaderComponent />

                <Routes>
                    <Route path = '/' element ={<LoginComponent/>}></Route>
                    <Route path = '/login' element ={<LoginComponent/>}></Route>
                    <Route path = '/welcome/:username' element ={<WelcomeComponent/>}></Route>
                    <Route path = '/todos' element ={<ListTodosComponent/>}/>
                    <Route path = '/logout' element ={<LogoutComponent/>}/>
                    <Route path = '/*' element ={<ErrorComponent/>}></Route>
                </Routes>
            </BrowserRouter>

           
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