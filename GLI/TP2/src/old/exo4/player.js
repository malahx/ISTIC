let playerUtils = require('./playerUtils.js');

function Player(name, attack, defense) {
    this.name = name;
    this.attack = attack;
    this.defense = defense;
    this.hp = 100;
}

Player.prototype.fight = playerUtils.fight;
Player.prototype.displayMyPlayerInfo = playerUtils.displayMyPlayerInfo;

function PayToWinPlayer(name, attack, defense) {
    this.name = name;
    this.attack = 1.4 * attack;
    this.defense = defense;
    this.hp = 100;
}
PayToWinPlayer.prototype = Object.create(Player.prototype);

module.exports = {
    Player,
    PayToWinPlayer
};