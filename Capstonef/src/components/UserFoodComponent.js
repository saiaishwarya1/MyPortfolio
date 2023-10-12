import React, { Component } from "react";
import product_cart from "../Data/product_data";
import "./UserCom.css";
import { Link } from "react-router-dom";
import { useState } from "react";

 
  const UserFoodComponent=()=>{
      console.log(product_cart);
    

     const listItems= product_cart.map((item) =>
       

        <div className="product">
      <img src={item.thumb} alt={item.name} />

      <div className="product__info">
        <p className="info__name">{item.name}</p>

        
        <p className="info__description">{item.type}</p>
        <p className="info__description">{item.category}</p>

        <p className="info__price">₹{item.price}</p>

        <Link to={`/products/111{id}`} className="info__button">
          View
        </Link>
      </div>
    </div>
      )
      
      return(
        <div>
        <header>
          <h1><i>Food Box</i></h1>
          
          
        </header>
       <div className='main_content'>
         {listItems}
       </div>
       </div>
      )
  } 
  
 
      
      export default UserFoodComponent;


   