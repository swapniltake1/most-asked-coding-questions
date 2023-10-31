
let a = 10;

let result = `value of ${a}` ;

while(a<=100){
   
    console.log(a);

    // Template litral 
  console.log(result);


    a+=10;
    
    
}

console.log("''''");

// exp 2nd 

let num=123456;

var arr = [];

while(num>0){
  var reverseNum=+(num%10);
    num=parseInt(num/10);
    arr.push(reverseNum)
    console.log(reverseNum);
    
}

console.log(arr);

