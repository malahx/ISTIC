let playerUtils = require('./playerUtils.js');

function PlayerGenerator(name, attack, defense) {
    return {
        name,
        attack,
        defense,
        hp: 100,
        displayMyPlayerInfo: playerUtils.displayMyPlayerInfo
    }
}

module.exports = {
    PlayerGenerator
};