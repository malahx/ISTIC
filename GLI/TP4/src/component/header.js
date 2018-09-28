import React, {Component} from "react";

export default class Header extends Component {

    handleSelect = (e) => {
        this.props.setFilter(e.target.value)
    };

    render() {
        const {users} = this.props;
        return (
            <header className="header">
                <h3 className="title">Integration Week End</h3>
                <span>Filter: </span>
                <select onChange={this.handleSelect}>
                    <option value="">Everyone</option>
                    {users.map(u => (<option key={u} value={u}>{u}</option>))}
                </select>
            </header>
        );
    }
}