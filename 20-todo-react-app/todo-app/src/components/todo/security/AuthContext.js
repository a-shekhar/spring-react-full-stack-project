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

    // setInterval(
    //     () => setNumber(number+1), 10000
    // )

    //const valueToBeShared = {number, isAuthenticated, setAuthenticated}

    return (
        <AuthContext.Provider value={{number, isAuthenticated, setAuthenticated}}>
            {children}
        </AuthContext.Provider>
    )
}
