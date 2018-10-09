import React, {Component} from "react";
import Rows from './rows';
import Add from "./add";
import Footer from "./footer";

export default class List extends Component {

    render() {
        const {users, costs} = this.props;
        return (
            <div className="full">
                <ul className="full scroll">
                    <Rows costs={costs}/>
                </ul>
                <Add users={users}/>
                <Footer costs={costs}/>
            </div>
        );
    }
}