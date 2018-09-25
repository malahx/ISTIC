let gen = require('./playerGenerator.js');
let playerUtils = require('./playerUtils.js');

let player1 = new gen.PlayerGenerator("Jean", 30, 5);
let player2 = new gen.PlayerGenerator("Pierre", 15, 10);
player1.displayMyPlayerInfo();
player2.displayMyPlayerInfo();

console.log(playerUtils.getMyPlayerRatio(player1, player2.defense));