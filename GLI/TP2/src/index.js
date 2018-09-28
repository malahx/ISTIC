const p = require('./player.js');
const randUtils = require('./randUtils.js');

let player1 = new p.Player("Jean", 30, 10);
let player2 = new p.Player("Pierre", 25, 10);
player1.displayMyPlayerInfo();
player2.displayMyPlayerInfo();

randUtils.randWrapper((rand1, rand2) => {
    player1.factor = rand1;
    player2.factor = rand2;
    player1.fight(player2);
});