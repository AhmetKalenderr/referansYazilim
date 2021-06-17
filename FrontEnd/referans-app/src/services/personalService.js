import axios from "axios"

export default class PersonalService{
 
    getPersonals() {
        return axios.get("http://localhost:8080/api/personals/getall")
    }
}