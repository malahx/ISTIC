import {getCostsParse, remCostParse, saveCostParse} from "../storage/parse";
import {store} from '../index';

export const REM_COST = 'REM_COST';
export const REM_COST_SUCCESS = 'REM_COST_SUCCESS';
export const ADD_COST = 'ADD_COST';
export const ADD_COST_SUCCESS = 'ADD_COST_SUCCESS';
export const GET_COSTS = 'GET_COSTS';
export const GET_COSTS_SUCCESS = 'GET_COSTS_SUCCESS';

export const addCost = (paidBy, title, amount) => {
    return {type: ADD_COST, cost: saveCostParse(paidBy, title, amount, ADD_COST_SUCCESS)}
};

export const parseAction = (type, result) => {
    return {type, result}
};

export const storeParseAction = (type, result) => {
    store.dispatch(parseAction(type, result));
};

export const getCosts = () => {
    getCostsParse(GET_COSTS_SUCCESS);
    return {type: GET_COSTS}
};

export const getStoreCosts = () => {
    store.dispatch(getCosts());
};

export const remCost = (id) => {
    remCostParse(id, REM_COST_SUCCESS);
    return {type: REM_COST, id};
};