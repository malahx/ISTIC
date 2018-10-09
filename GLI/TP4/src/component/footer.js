import React, {Component} from "react";

export default class Footer extends Component {

    render() {
        const {costs} = this.props;
        return (
            <div className="footer">
                <span>TOTAL EXPENSES</span>
                {costs && costs.length > 0 && <span>{costs.map(c => c.amount).reduce((t, c) => t = Number(t) + Number(c))} €</span>}
            </div>
        )
    }
}