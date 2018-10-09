export const ADD_COST = 'ADD_COST';
export const ADD_USER = 'ADD_USER';
export const addCost = (cost) => {
    cost.id = Math.round(Math.random() * 1000000);
    return {type: ADD_COST, cost}
};
export const addUser = (name) => {
    return {type: ADD_USER, name}
};