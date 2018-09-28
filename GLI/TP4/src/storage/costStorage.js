import {fakeCosts} from "../fake/data";

export default function getCosts() {
    let costs = null;
    const storage = localStorage.getItem("costs");
    if (storage == null) {
        costs = fakeCosts;
    } else {
        costs = JSON.parse(storage);
    }
    return costs;
}
