import config from "./config";
import Parse from "parse";

Parse.initialize(config.applicationId, config.javaScriptKey);
Parse.serverURL = config.serverURL;

const Cost = Parse.Object.extend("MLHCost");

let cost = new Cost();
cost.set("title", "test");
cost.set("paidBy", "test1");
cost.save().then(r => {
    console.log("SAVE: " + JSON.stringify(r));
    new Parse.Query(Cost).find()
        .then((results) => {
            console.log("RESULTS: " + JSON.stringify(results));
            results.forEach(r => {
                console.log("RESULT: " + JSON.stringify(r));
                r.destroy();
            });
        });
});

