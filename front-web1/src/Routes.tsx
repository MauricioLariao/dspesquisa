import React from 'react';

//instala a extensao react-router-dom pelo npm install react-router-dom para tratar as rotas do app
//e instala as dependencias do typescript instalando npm install @types/react-router-dom --dev
import { BrowserRouter, Switch, Route } from "react-router-dom";  //importar o switch e router para casar as rotas daaplicaca
import Header from './components/header';
import Home from './pages/Home';
import Records from './pages/Records';
import Charts from './pages/Charts'

//quando digitar / no browser ja cai direto na pagina home
const Routes = () => (
    <BrowserRouter>
        <Header />
        <Switch>
            <Route path='/' exact> 
                <Home />
            </Route>
            <Route path='/records'> 
                <Records />
            </Route>
            <Route path='/charts'> 
                <Charts />
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routes;

