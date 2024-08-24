import Input from "../../props/Input";
import {MyRequest} from "../../api/request";
const Login = () => {
    const handleSubmit = async (event) => {
        event.preventDefault();
        MyRequest({username: "test", password: "test"});
    }
    return (
        <div>
            <h1>Login Page</h1>
            <form action="" onSubmit={handleSubmit}
                  style={{display: "flex", flexDirection: "column"}}>
                <Input type="text" placeholder="Username"/>
                <Input type="password" placeholder="Password"/>
                <button type="submit">Login</button>
            </form>
        </div>
    );
}

export default Login
