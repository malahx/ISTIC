import {applyMiddleware, createStore} from 'redux'
import {createLogger} from 'redux-logger' // This will log into our console information about redux actions & store
import thunk from 'redux-thunk' // This middleware allows us to use Promises in our actions (async in action)
import rootReducer from './rootReducer' // We will implement this later on, create a file exporting and empty object for now

const middlewares = applyMiddleware(thunk, createLogger());

export default function configureStore(preloadedState = {}) { // preloadedState is useful for SSR, which we don't use
    return createStore(rootReducer, preloadedState, middlewares)
}