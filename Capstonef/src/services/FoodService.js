import axios from 'axios';

const API_BASE_URL = "http://localhost:8080/pro";

class FoodService {

    getFood(){
        return axios.get(API_BASE_URL);
    }

    createFood(food){
        return axios.post(API_BASE_URL,food);
    }

    getFoodById(id){
        return axios.get(API_BASE_URL + '/' + id);
    }

    updateFood(food, id){
        return axios.put(API_BASE_URL + '/' + id, food);
    }

    deleteFood(id){
        return axios.delete(API_BASE_URL + '/' + id);
    }
}

export default new FoodService()