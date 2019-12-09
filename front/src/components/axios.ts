import axios from "axios"

const API = axios.create({
  baseURL: "/api",
})
API.interceptors.response.use(
  response => {
    return response
  },
  error => {

    switch (error.response.data.message) {
      case "asd": {
        throw error
      }
      default: {
        throw error
      }
    }
  },
)

export { API }
