import { createContext, useState , useContext} from "react";

// create a context

export const AuthContext = createContext()


// create hook
export const useAuth = () => useContext(AuthContext)



// share the created context with other components 
export default function AuthProvider({children}){

    // put some state in the context
    const [number, setNumber] = useState(10)

    const[isAuthenticated, setAuthenticated] = useState(false)

    const[username, setUsername] = useState(null)

    function login(username, password){
        if(username === "aditya" && password == "dummy"){
            setAuthenticated(true)
            setUsername(username)
            return true
       }else{
            setAuthenticated(false)
            setUsername(null)
            return false
       }
    }


    function logout(){
       setAuthenticated(false)
    }


    return (
        <AuthContext.Provider value={{number, isAuthenticated, login, logout, username}}>
            {children}
        </AuthContext.Provider>
    )
}
