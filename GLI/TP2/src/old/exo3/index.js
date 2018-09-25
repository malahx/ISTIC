let gen = require('./playerGenerator.js');

let player1 = new gen.PlayerGenerator("Jean", 30, 10);
let player2 = new gen.PlayerGenerator("Pierre", 20, 5);
player1.displayMyPlayerInfo();
player2.displayMyPlayerInfo();

player1.fight(player2);