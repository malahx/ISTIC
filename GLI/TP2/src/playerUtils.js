function displayMyPlayerInfo() {
    console.log(`My name is ${this.name}, I have ${this.attack} attack, ${this.defense} defense and ${this.hp} health points.`);
}
function getMyPlayerRatio(player, n) {
    return player.attack - n;
}
module.exports = {
    displayMyPlayerInfo,
    getMyPlayerRatio
};