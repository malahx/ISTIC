let request = require('request-promise');

function displayMyPlayerInfo() {
    console.log(`My name is ${this.name}, I have ${this.attack} attack, ${this.defense} defense and ${this.hp} health points, ${this.factor} luck points`);
}

function getMyPlayerRatio(player, n) {
    return (player.factor * (player.attack - n));
}

function fight(enemy) {
    let player = this;
    randomFactor().then(value => {
            player.factor = value;
            randomFactor().then(value => {
                    enemy.factor = value;
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
                        console.log(`The two players are dead.`);
                    } else {
                        winner.hp = Math.round(getMyPlayerRatio(looser, winner.defense) * winner.hp / getMyPlayerRatio(winner, looser.defense));
                        looser.hp = 0;
                        console.log(`The winner is ${winner.name}.`);
                    }
                    winner.displayMyPlayerInfo();
                    looser.displayMyPlayerInfo()
                }
            );
        }
    );
}

function randomFactor() {
    return new Promise(resolve => {
        random({randoms: [], i: 0})
            .then(r => random(r))
            .then(r => random(r))
            .then(r => random(r))
            .then(r => random(r))
            .then(r => random(r))
            .then(r => random(r))
            .then(r => random(r))
            .then(r => random(r))
            .then(r => random(r))
            .then(r => random(r))
            .then(r => {
                resolve(r.randoms.filter(v => v > 10).map((v, i) => v === i ? v * 2 : v).reduce((t, v) => t += v) / 100);
            });
    });
}

const url = (max) => `https://www.random.org/integers/?num=1&min=1&max=${max}&col=1&base=10&format=plain&rnd=new`;

function random(data) {
    return new Promise((resolve) => {
        data.i = ++data.i;
        const last = data.randoms[data.randoms.length - 1];
        if (last === 1) {
            data.randoms.push(1);
            resolve({randoms: data.randoms, i: data.i});
            return;
        }
        const u = url(data.randoms !== undefined && data.randoms.length > 0 ? Math.round(1.2 * last) : 100);
        request(u).then(r => {
            data.randoms.push(parseInt(r.trim()));
            console.log(data);
            resolve(data)
        });
    });
}

module.exports = {
    displayMyPlayerInfo,
    getMyPlayerRatio,
    fight
};