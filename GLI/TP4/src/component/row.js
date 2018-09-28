import React from "react";

export default (props) => {
    const {costs} = props;
    return costs.map(c => (
            <li key={c.id} className="container">
                <span className="left bold">{c.title}</span>
                <span className="center grow">Paid by {c.paidBy}</span>
                <span className="right bold">{c.amount} €</span>
            </li>
        )
    )
}