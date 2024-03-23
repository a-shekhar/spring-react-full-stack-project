import { createContext, useState } from "react";

// create a context

export const AuthContext = createContext()

// share the created context with other components 
export default function AuthProvider({children}){
    // put some state in the context
    const [number, setNumber] = useState(0)
    return (
        <AuthContext.Provider value={{number}}>
            {children}
        </AuthContext.Provider>
    )
}
