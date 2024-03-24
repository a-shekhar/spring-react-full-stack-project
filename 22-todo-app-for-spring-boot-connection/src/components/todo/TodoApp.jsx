
import './TodoApp.css'
import { BrowserRouter, Navigate, Route, Routes} from 'react-router-dom'
import LogoutComponent from './LogoutComponent'
import HeaderComponent from './HeaderComponent'
import ListTodosComponent from './ListTodoComponent'
import ErrorComponent from './ErrorComponent'
import WelcomeComponent from './WelcomeComponent'
import LoginComponent from './LoginComponent'
import AuthProvider, { useAuth } from './security/AuthContext'

function AuthenticatedRoute({children}){
    const authContext = useAuth()
    if(authContext.isAuthenticated){
        return children
    }
    return <Navigate to = "/" />
}

export default function TodoApp(){
    return(
        <div className="TodoApp">
            <AuthProvider>
                <BrowserRouter>
                    <HeaderComponent />
                    <Routes>
                        <Route path = '/' element ={<LoginComponent/>}></Route>
                        <Route path = '/login' element ={<LoginComponent/>}></Route>
                        <Route path = '/welcome/:username' element ={
                        <AuthenticatedRoute>
                            <WelcomeComponent/>
                        </AuthenticatedRoute>
                        }></Route>
                        <Route path = '/todos' element ={
                        <AuthenticatedRoute>
                            <ListTodosComponent/>
                        </AuthenticatedRoute>}/>
                        <Route path = '/logout' element ={
                        <AuthenticatedRoute>
                        <LogoutComponent/>
                        </AuthenticatedRoute>}/>
                        <Route path = '/*' element ={<ErrorComponent/>}></Route>
                    </Routes>
                </BrowserRouter>
            </AuthProvider>
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