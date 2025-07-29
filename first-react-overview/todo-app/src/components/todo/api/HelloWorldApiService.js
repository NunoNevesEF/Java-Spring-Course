import axios from 'axios'
import { apiClient } from './ApiClient'

export const retreiveHelloWorldBean = () => apiClient.get("/hello-world")


export const retreiveHelloWorldBeanPathVariable = (username) => apiClient.get(`/hello-world/path-variable/${username}`)



