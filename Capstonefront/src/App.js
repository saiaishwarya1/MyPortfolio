import logo from './logo.svg';
import './App.css';
import { ReactDOM } from 'react';
import {BrowserRouter as Routes,Route,Switch} from 'react-router-dom';
import HomeFoodComponent from './components/HomeFoodComponent';
import ListFoodComponent from './components/ListFoodComponent';
import CreateFoodComponent from './components/CreateFoodComponent';
import UpdateFoodComponent from './components/UpdateFoodComponent';
import DeleteFoodComponent from './components/DeleteFoodComponent';
import UserFoodComponent from './components/UserFoodComponent';
import NewUserComponent from './components/NewUserComponent';
import { useState } from 'react/cjs/react.development';


const App = () => {

  
 
  return (
    
      <div>
         <Routes>
              
                <div className="container">
                          <Switch>
                          <Route exact path = "/"  component = {HomeFoodComponent}></Route>
                          <Route path = "/admin" component = {ListFoodComponent}></Route>
                          <Route path = "/create" component = {CreateFoodComponent}></Route>
                          <Route path ="/update" component= {UpdateFoodComponent}></Route>
                          <Route path ="/delete" component= {DeleteFoodComponent}></Route>
                          <Route path="/user"    component={NewUserComponent}></Route>
                          
                          </Switch>
                    
                </div>
              
        </Routes>
         
        
         
    </div>
    
  );
}

export default App;
