import {useParams, Link} from 'react-router-dom'
import { useState } from 'react'
import { retreiveHelloWorldBean,retreiveHelloWorldBeanPathVariable } from './api/HelloWorldApiService'

export default function WelcomeComponent(){
    const {username} = useParams()

    const [message,setMessage] = useState(null)

    function callHelloWorldRestApi() {
      // retreiveHelloWorldBean()
      //     .then((response) => setMessage(response.data))
      //     .catch( (error) => console.log(error))

      retreiveHelloWorldBeanPathVariable(username) 
          .then((response) => setMessage(response.data.message))
          .catch( (error) => console.log(error))
    }

    return (
      <div className="Welcome">
          <h1>Welcome {username}</h1>
          <div>
              Manage your todos, <Link to="/todos">Go here</Link>
          </div>
          <div>
              <button className="btn btn-success" onClick={callHelloWorldRestApi}>Call Hello World</button>
          </div>
          <div className="text-info">{message}</div>
      </div>
    )
}