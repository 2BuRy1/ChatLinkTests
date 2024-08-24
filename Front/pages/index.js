import Link from 'next/link'
import A from '../props/A';
import {MyRequest} from "/api/request";
const Index = () => {
    return (
        <div>
            <div>
                <A href={"/"} text={"Home"}/>
                <A href={"/auth/login"} text={"Login"}/>
            </div>
            <h1>Index Page</h1>
            <button onClick={()=>MyRequest({username: "test", password: "test"})}>TEST</button>
        </div>
    );

};

export default Index;
