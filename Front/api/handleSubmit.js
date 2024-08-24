import {MyRequest} from "./request";

export const handleSubmit = async (event, data) =>{
    event.preventDefault();
    MyRequest(data);
}