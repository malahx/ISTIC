import config from "../config";
import Parse from "parse";
import {storeParseAction} from "../reduce/storeAction";

const COST_NAME = config.prefix + "Cost";
const COST_PAID_BY = "paidBy";
const COST_TITLE = "title";
const COST_AMOUNT = "amount";

const Cost = Parse.Object.extend(COST_NAME);

function createCost(paidBy, title, amount) {
    const cost = new Cost();
    cost.set(COST_PAID_BY, paidBy);
    cost.set(COST_TITLE, title);
    cost.set(COST_AMOUNT, amount);
    return cost;
}

function mapCost(costParse) {
    return {
        id: costParse.id,
        paidBy: costParse.get(COST_PAID_BY),
        title: costParse.get(COST_TITLE),
        amount: costParse.get(COST_AMOUNT)
    };
}

export default function initialize() {
    Parse.initialize(config.applicationId, config.javaScriptKey);
    Parse.serverURL = config.serverURL;
    clean(Cost, COST_NAME);
}

function clean(type, typeName) {
    if (config.clean) {
        console.log("Clean: " + typeName);
        new Parse.Query(type).find().then(costs => {
            costs.forEach(c => {
                c.destroy().then(d => console.log("Destroyed: " + d));
            })
        });
    }
}

export function saveCostParse(paidBy, title, amount, actionType) {
    const cost = createCost(paidBy, title, amount);
    cost.save().then(result => {
        storeParseAction(actionType, mapCost(result));
    });
    return cost;
}

export function getCostsParse(actionType) {
    new Parse.Query(Cost).find()
        .then((results) => {
            const costs = [];
            results.forEach(r => {
                costs.push(
                    {
                        paidBy: r.get(COST_PAID_BY),
                        title: r.get(COST_TITLE),
                        amount: r.get(COST_AMOUNT),
                        id: r.id
                    }
                )
            });
            storeParseAction(actionType, costs)
        });
}

export function remCostParse(id, actionType) {
    new Parse.Query(Cost)
        .get(id)
        .then(r => {
            r.destroy();
            storeParseAction(actionType, mapCost(r));
        })
}