
 // SEARCH FILTER
const search = document.getElementById("search");
const productName = document.querySelectorAll(".product-details h2");


search.addEventListener("keyup", filterProducts);


function filterProducts(e) {
    const text = e.target.value.toLowerCase();
    // console.log(productName[0]);
    productName.forEach(function(product) {
        const item = product.firstChild.textContent;
        if (item.toLowerCase().indexOf(text) != -1) {
            product.parentElement.parentElement.style.display = "block"
        } else {
            product.parentElement.parentElement.style.display = "none"
        }
    })
}

/*let carts=document.querySelectorAll('.add-cart');

let products = [
    {
        name: 'MDH garam masala',
        price: '78',
        inCart: 0,
    },
    {
        name: 'Catch garam masala',
        price: '75',
        inCart: 0,
    },
    {
        name: 'Everest garam masala',
        price: '80',
        inCart: 0,
    },
    {
        name: 'Ketchup',
        price: '80',
        inCart: 0,
    },

]

for(let i=0;i<carts.length;i++){

  carts[i].addEventListener('click',() => {
    cartNumbers(products[i]);
    totalCost(products[i])
  })  
}

function onLoadCartNumbers(){
    let productNumbers = localStorage.getItem('cartNumbers');

    if(productNumbers){
        document.querySelector('.cart span').textcontent = productNumbers;
    }
}

function cartNumbers(product){
    
    let productNumbers = localStorage.getItem('cartNumbers');
    productNumbers=parseInt(productNumbers);
    
    if(productNumbers){
        localStorage.setItem('cartNumbers', productNumbers + 1);
        document.querySelector('.cart span').textContent = productNumbers+1;
    }
     else
     {
        localStorage.setItem('cartNumbers',1);
      document.querySelector('.cart span').textContent=1;
    }
      setItems(product);
    
}


function setItems(product){

   let cartItems = localStorage.getItem('productsInCart');
   cartItems=JSON.parse(cartItems);
   console.log("My cartItems are",cartItems);
    
   if(cartItems!= null)
   {
      if(cartItems[product.name] == undefined)
      {cartItems = {
          ...cartItems,
          [product.name]:product
      }
    }
       cartItems[product.name].inCart += 1;
   } else{
   product.inCart=1;

     cartItems={
        [product.name]:product
    }
}
    localStorage.setItem("productsInCart",JSON.stringify(cartItems));
}
   
function totalCost(product){
// console.log("The product price is",product.price);

let cartCost=localStorage.getItem('totalCost');
//console.log("My cartCost is",cartCost);
if(cartCost !=null)
{
    cartCost=parseInt(cartCost);
    product.price=parseInt(product.price);
    //console.log(typeof product.price)
    
    localStorage.setItem("totalCost", cartCost + product.price );
}else{
localStorage.setItem("totalCost",product.price);
}
}

function displayCart(){

    let cartItems = localStorage.getItem("productsInCart");
cartItems = JSON.parse(cartItems);
let productContainer = document.querySelector(".products-container");
 
    
    if( cartItems && productContainer ) {
    console.log("running");
}
 }

 displayCart();
 

onLoadCartNumbers();*/
