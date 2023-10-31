let num = 8;

let result = fact(num);

function fact(num) {
    if(num==0){
        return 1;
    }
    else{
        return num*fact(num-1);
    }
}

console.log(result);