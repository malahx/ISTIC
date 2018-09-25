function PlayerGenerator(name, attack, defense) {
    function displayMyPlayerInfo() {
        console.log(`My name is ${this.name}, I have ${this.attack} attack, ${this.defense} defense and ${this.hp} health points.`);
    }
    return {
        name,
        attack,
        defense,
        hp: 100,
        displayMyPlayerInfo
    }
}

function getMyPlayerRatio(player, n) {
    return player.attack - n;
}

let player1 = new PlayerGenerator("Jean", 30, 5);
let player2 = new PlayerGenerator("Pierre", 15, 10);
player1.displayMyPlayerInfo();
player2.displayMyPlayerInfo();

console.log(getMyPlayerRatio(player1, player2.defense));