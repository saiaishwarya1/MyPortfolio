import React, { Component } from 'react'

class UpdateFoodComponent extends Component {
    // url=`http://localhost:8080/pro/update/${id}`;
    state={s:{id:"",name:"",type:"",price:"",category:""}}
    id=React.createRef();
    name =React.createRef();
    type=React.createRef();
    price  =React.createRef();
    category =React.createRef();
        updateFood(){
            var id = Number(this.id.current.value);
        var s={
            id: id,
            name:this.name.current.value,
            type:this.type.current.value,
            price:Number(this.price.current.value),
            category:this.category.current.value
        };
        var url=`http://localhost:8080/pro/update/${id}`;
        fetch(this.url,{method:'PUT',headers:{'Content-Type':'Application/json'},body:JSON.stringify(s)})
        .then( ()=>alert("Row added successfully..."))
        .catch(err => alert("Error " +err));
    }

    render(){
        var s =this.state.s;
        return <div>
            <h1>Update Food item</h1>
            <table border="1">
                <tr>
                    <td>ID</td> <td><input type="number" ref={this.id}/></td>
                    <button onClick={()=>this.updateFood()}>Update</button>
                </tr>
                <tr>
                    <td>Name</td> <td><input type="text" ref={this.name} /></td>
                    
                </tr>
                <tr>
                    <td>Type</td> <td><input type="text" ref={this.type} /></td>
                    
                </tr>
                <tr>
                    <td>Price</td> <td><input type="text" ref={this.price} /></td>
                    
                </tr>
                <tr>
                    <td>Category</td> <td><input type="text" ref={this.category} /></td>
                    
                </tr>
            </table>
        </div>
    }
}

export default UpdateFoodComponent