import React, { Component } from "react";
import "./Home.css";
class HomeFoodComponent extends Component{
   
    constructor(props) {
        super(props)

        
        this.admin = this.admin.bind(this);
        this.user = this.user.bind(this);
        this.register=this.user.bind(this);
    }


    admin(){
        this.props.history.push('/admin');
    }

    user(){
        this.props.history.push('/user');
    }

    register(){
        this.props.history.push('/register');
    }

    render(){
        return(
            <div className>
            <header>
                <h1><i>Food Box</i></h1>
            </header>
            <div className=  "bg-image">
                <div className="wlcm">
                   <h3> Welcome to Foodbox !</h3>
                  
                   
                   

                    <h4>Please login or register</h4>
            
                  <button  style={{marginLeft: "10px"}}className="btn btn-primary" onClick={this.admin}> Admin login</button>
                  <button  style={{marginLeft: "10px"}}className="btn btn-primary" onClick={this.user}> User login</button>
                  
                  <button  style={{marginLeft: "10px"}} className="btn btn-primary"> Register</button>
                </div>
           </div>
        </div>
        )
    }

    
}

export default HomeFoodComponent