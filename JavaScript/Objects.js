let alien={
    name:'Swapnil',
    address:'Newasa, Ahmednagar',
    Education:'BE Computer Engineering'
}


// we  can access objects like this:
console.log(alien)

console.log(alien.address);

console.log(alien['name']);


let user={
    name:'Swapnil',
    id:101,
    Address:'Pune',
    laptop:{
        model:'acer',
        rem:'16GB',
        processor:'i5'
    }
}


console.log(user);

// to check avalable or not 

console.log(user.laptop.processor?.length);

delete user.laptop.processor;

console.log(alien);


console.log("_____________Trverce object with loop ____________");

for(let key in user){
    console.log(key ,user[key]);
}