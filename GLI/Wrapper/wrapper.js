function wrapper(fct, ...params) {
    return function(...params) {
        return fct(...params).catch(e => console.error(e));
    }
}
express('/api/players', wrapper(asyncFunction));