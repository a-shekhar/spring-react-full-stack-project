import {useParams, Link} from 'react-router-dom'

export default function WelcomeComponent(){
    const {username} = useParams()
   // console.log(params.username)
  // console.log(username)
    return(
    <div>
        <h1> Welcome to {username}'s world!</h1>
        <div className="Welcome">
            Manage Your todos. <Link to="/todos">Go here</Link>
        </div>

        <div>
            <button className='btn btn-success'>Call Hello World REST API</button>
        </div>

        </div>
    )
}
