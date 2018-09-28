import React, {Component} from 'react';
import './App.css';
import Header from './component/header';
import {fakeUsers} from './fake/data';
import MyList from "./component/list";
import getCosts from "./storage/costStorage";

class App extends Component {

    constructor(props) {
        super(props);
        this.state = {user: "", costs: getCosts()};
        this.users = fakeUsers;
    }

    setFilter = (user) => {
        this.setState({user});
    };

    addCost = (cost) => {
        this.setState(state => {
            state.costs.push(cost);
            localStorage.setItem("costs", JSON.stringify(state.costs));
            return state;
        });
    };

    render() {
        const filteredCosts = this.state.costs.filter(c => this.state.user === "" || c.paidBy === this.state.user);
        return (
            <div className="App">
                <Header className="App-header" users={this.users} setFilter={this.setFilter}/>
                <div className="hidden-header"/>
                <MyList addCost={this.addCost} users={this.users} costs={filteredCosts}/>
            </div>
        );
    }
}

export default App;
