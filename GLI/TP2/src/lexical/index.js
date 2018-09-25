function Player(name, attack, defense, hp) {
    this.name = name;
    this.attack = attack;
    this.defense = defense;
    this.hp = hp;
}
Player.prototype.displayMyPlayerInfo = function() {
    console.log(`My name is ${this.name}, I have ${this.attack} attack, ${this.defense} defense and ${this.hp} health points.`);
};
let player1 = new Player("Jean", 30, 10, 100);
player1.displayMyPlayerInfo();