import React, { Component } from 'react'
import FoodService from '../services/FoodService';


class ListFoodComponent extends Component {
    constructor(props) {
        super(props)

        
        this.addFood = this.addFood.bind(this);
        this.updateFood=this.updateFood.bind(this);
        this.deleteFood=this.deleteFood.bind(this);
    }
    
    
    url="http://localhost:8080/pro/all";
    state={students:[]}


    componentDidMount(){
        fetch(this.url)
        .then(response => response.json())
        .then(response=>this.setState({students:response}));
    }

    

    addFood(){
        this.props.history.push('/create');
    }
    
    updateFood(){
        this.props.history.push('/update');
    }

    deleteFood(){
        this.props.history.push('/delete');
    }

    render() {
        return (
            <div>
                 <header>
                <h1><i>Food Box</i></h1>
                   </header>
                 <h2 className="text-center">Food List</h2>
                 <div className = "row">
                    <button className="btn btn-primary" onClick={this.addFood}> Add Food Items</button>
                 </div>
                
                <br></br>
                
                 <div className = "row">
                        <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th> Name of Dish</th>
                                    <th> Type</th>
                                    <th> Price</th>
                                    <th>Category</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.students.map(
                                        food => 
                                        <tr key = {food.id}>
                                             <td> { food.name} </td>   
                                             <td> {food.type}</td>
                                             <td> {food.price}</td>
                                             <td> {food.category}</td>
                                             <td>  <button style={{marginLeft: "10px"}} className="btn btn-primary" onClick={this.updateFood}>Update</button>
                                             <button style={{marginLeft: "10px"}} className="btn btn-primary" onClick={this.deleteFood}>Delete</button>  
                                             <button style={{marginLeft: "10px"}} className="btn btn-primary">Enable</button> 
                                             <button style={{marginLeft: "10px"}} className="btn btn-primary">Disable</button> 
                                             </td>
                                        </tr>
                                    )
                                }
                            </tbody>
                        </table>

                 </div>

            </div>
        )
    }
}

export default ListFoodComponent