import React, { Component } from 'react'

 
class DeleteFoodComponent extends React.Component{
             id=React.createRef();
        state={msg:''};      
        deleteEmployee(){
    var id = Number(this.id.current.value)
            console.log(id)
            var url = `http://localhost:8080/pro/delete/${id}`;
            fetch(url,{
                method:'DELETE'
            })
            .then(response=>response.json())
            .then(result => this.setState({msg:JSON.stringify(result)}))
            .then( ()=>alert("Row delted successfully..."))
        }        
        render(){
            return (<div>
                <h1>Delete Food Item </h1>
                ID: <input type="number" ref={this.id}  />  <br/>
                <input type="submit" value="Delete" onClick={()=>this.deleteEmployee()} /> <hr/>
                {this.state.msg}
                </div>)
        };
}
export default DeleteFoodComponent;




