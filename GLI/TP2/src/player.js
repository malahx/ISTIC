let playerUtils = require('./playerUtils.js');

class Player {
    constructor(name, attack, defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hp = 100;
    }

    fight(enemy) {
        playerUtils.fight.call(this, enemy);
    }

    displayMyPlayerInfo() {
        playerUtils.displayMyPlayerInfo.call(this);
    }
}

class PayToWinPlayer extends Player {
    constructor(name, attack, defense) {
        super(name, 1.4 * attack, defense);
    }

}

module.exports = {
    Player,
    PayToWinPlayer
};