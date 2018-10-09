import React, {Component} from "react";
import MyRow from './row';
import Add from "./add";
import Footer from "./footer";

export default class MyList extends Component {

    render() {
        const {users, costs, addCost} = this.props;
        return (
            <div className="full">
                <ul className="full scroll">
                    <MyRow costs={costs}/>
                </ul>
                <Add users={users} addCost={addCost}/>
                <Footer costs={costs}/>
            </div>
        );
    }
}