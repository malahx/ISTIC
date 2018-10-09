import React from 'react';
import ReactDOM from 'react-dom';
import {Provider} from "react-redux";
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import configureStore from "./reduce/configureStore";
import initialize from "./storage/parse";

initialize();

export const store = configureStore();

const template = (
    <Provider store={store}>
        <App/>
    </Provider>
);

ReactDOM.render(template, document.getElementById('root'));
registerServiceWorker();

