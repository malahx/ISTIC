function displayMyPlayerInfo() {
    console.log(`My name is ${this.name}, I have ${this.attack} attack, ${this.defense} defense and ${this.hp} health points.`);
}
function getMyPlayerRatio(player, n) {
    return player.attack - n;
}
function fight(enemy) {
    let player1ratio = getMyPlayerRatio(this, enemy.defense);
    let player2ratio = getMyPlayerRatio(enemy, this.defense);
    let winner, looser;
    if (player1ratio > player2ratio) {
        winner = this;
        looser = enemy;
    } else if (player1ratio < player2ratio) {
        winner = enemy;
        looser = this;
    }
    if (winner === undefined) {
        this.hp = 0;
        enemy.hp = 0;
        console.log(`The two player are dead.`);
    } else {
        winner.hp = getMyPlayerRatio(looser, winner.defense) * winner.hp / getMyPlayerRatio(winner, looser.defense);
        looser.hp = 0;
        console.log(`The winner is ${winner.name}.`);
        winner.displayMyPlayerInfo();
    }
}
module.exports = {
    displayMyPlayerInfo,
    getMyPlayerRatio,
    fight
};