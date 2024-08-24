import axios from 'axios';

const api =axios.create({
    withCredentials: true,
    baseURL: 'http://localhost:8081',
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }
});

export const MyRequest = (data) => {
    return api.get('http://localhost:8081/auth/login', {
        params: {
            username: data.username,
            password: data.password,
        }
    })
        .then(res => console.log(res.data))
        .catch(err => console.log(err));
}
