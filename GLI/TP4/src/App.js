import React, {Component} from 'react';
import {connect} from "react-redux";
import './App.css';
import Header from './component/header';
import {fakeUsers} from './fake/data';
import MyList from "./component/list";
import {addCost} from "./reduce/storeAction";

class App extends Component {

    static mapStateToProps(state) {
        return ({costs: state.costs})
    }

    static mapDispatchToProps(dispatch) {
        return {
            handleAddCost: (paidBy, title, amount) => {
                dispatch(addCost(paidBy, title, amount))
            }
        }
    }

    constructor(props) {
        super(props);
        this.state = {user: ""};
        this.users = fakeUsers;
    }

    setFilter = (user) => {
        this.setState({user});
    };

    render() {
        const filteredCosts = this.props.costs.filter(c => this.state.user === "" || c.paidBy === this.state.user);
        return (
            <div className="App">
                <Header className="App-header" users={this.users} setFilter={this.setFilter}/>
                <div className="hidden-header"/>
                <MyList addCost={this.props.handleAddCost} users={this.users} costs={filteredCosts}/>
            </div>
        );
    }
}

export default connect(App.mapStateToProps, App.mapDispatchToProps)(App);
