import {ADD_COST} from "./storeAction";
import getCosts from "../storage/costStorage";

function costs(state = getCosts(), action) {
    switch (action.type) {
        case ADD_COST:
            const costs = [...state, action.cost];
            localStorage.setItem("costs", JSON.stringify(costs));
            return costs;
        default:
            return state;
    }
}

export default function rootReducer(state = {}, action) {
    return {
        costs: costs(state.costs, action)
    }
}