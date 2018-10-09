import React, {Component} from "react";
import {connect} from "react-redux";
import {remCost} from "../reduce/storeAction";

class Rows extends Component {

    static mapDispatchToProps(dispatch) {
        return {
            handleRemCost: (id) => {
                dispatch(remCost(id))
            }
        }
    }

    render() {
        const {costs, handleRemCost} = this.props;
        return costs.map(c => (
                <li key={c.id} className="container">
                    <span className="left bold">{c.title}</span>
                    <span className="center grow">Paid by {c.paidBy}</span>
                    <span className="right bold">{c.amount} €</span>
                    <span className="icon-trash" onClick={() => handleRemCost(c.id)}/>
                </li>
            )
        );
    }
}

export default connect(null, Rows.mapDispatchToProps)(Rows);