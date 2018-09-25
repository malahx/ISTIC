let playerUtils = require('./playerUtils.js');

function PlayerGenerator(name, attack, defense) {
    return {
        name,
        attack,
        defense,
        hp: 100,
        displayMyPlayerInfo: playerUtils.displayMyPlayerInfo,
        fight: playerUtils.fight
    }
}

module.exports = {
    PlayerGenerator
};