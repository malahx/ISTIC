let p = require('./player.js');

let player1 = new p.Player("Jean", 30, 10);
let player2 = new p.PayToWinPlayer("Pierre", 25, 10);
player1.displayMyPlayerInfo();
player2.displayMyPlayerInfo();

player1.fight(player2);