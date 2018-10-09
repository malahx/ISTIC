import React, {Component} from 'react';
import {connect} from "react-redux";
import './App.css';
import Header from './component/header';
import {fakeUsers} from './fake/data';
import List from "./component/list";
import {getStoreCosts} from "./reduce/storeAction";

class App extends Component {

    static mapStateToProps(state) {
        return ({costs: state.costs})
    }

    constructor(props) {
        super(props);
        this.state = {user: ""};
        this.users = fakeUsers;
    }

    componentDidMount() {
        getStoreCosts();
    }

    setFilter = (user) => {
        this.setState((state) => {
            return {...state, user}
        });
    };

    render() {
        const {user} = this.state;
        const filteredCosts = this.props.costs.filter(c => user === "" || c.paidBy === user);
        return (
            <div className="App">
                <Header className="App-header" users={this.users} setFilter={this.setFilter}/>
                <div className="hidden-header"/>
                <List users={this.users} costs={filteredCosts}/>
            </div>
        );
    }
}

export default connect(App.mapStateToProps, null)(App);
