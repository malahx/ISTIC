import {ADD_COST_SUCCESS, GET_COSTS_SUCCESS, REM_COST_SUCCESS} from "./storeAction";

function costs(costs = [], action) {
    switch (action.type) {
        case ADD_COST_SUCCESS:
            return [...costs, action.result];
        case GET_COSTS_SUCCESS:
            return [...action.result];
        case REM_COST_SUCCESS:
            return costs.filter(c => c.id !== action.result.id);
        default:
            return costs;
    }
}

export default function rootReducer(state = {}, action) {
    return {
        costs: costs(state.costs, action)
    }
}