const request = require('request-promise');

const url = (max) => `https://www.random.org/integers/?num=1&min=1&max=${max}&col=1&base=10&format=plain&rnd=new`;

function randWrapper(callback) {
    randomFactor().then(v1 => {
        randomFactor().then(v2 => {
            callback(v1, v2);
        });
    });
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

function random(data) {
    return new Promise((resolve) => {
        data.i = ++data.i;
        const last = data.randoms[data.randoms.length - 1];
        if (last === 1) {
            data.randoms.push(1);
            console.log(data);
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
    randWrapper
};