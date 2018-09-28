import React, {Component} from "react";

export default class Add extends Component {

    constructor(props) {
        super(props);

        this.state = {
            paidBy: "",
            title: "",
            amount: ""
        }
    }

    handleClick = () => {
        const {paidBy, title, amount} = this.state;
        this.props.addCost({paidBy, title, amount});
    };

    handleChangeTitle = (e) => {
        this.setState({title: e.target.value});
    };

    handleChangePaidBy = (e) => {
        this.setState({paidBy: e.target.value});
    };

    handleChangeAmount = (e) => {
        this.setState({amount: e.target.value});
    };

    render() {
        const {users} = this.props;
        return (
            <div className="add">
                <input value={this.state.title} onChange={this.handleChangeTitle} type="text" placeholder="Cost title"/>
                <select value={this.state.paidBy} onChange={this.handleChangePaidBy} className="margin-left">
                    <option value="" disabled>Paid By</option>
                    {users.map(u => (<option key={u} value={u}>{u}</option>))}
                </select>
                <input value={this.state.amount} onChange={this.handleChangeAmount} className="margin-left num"
                       type="number" placeholder="$$$"/>
                <button onClick={this.handleClick}>+</button>
            </div>
        );
    }
}