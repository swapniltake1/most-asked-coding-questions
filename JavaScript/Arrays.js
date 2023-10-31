// 2 types of array creation inn js;

//type 1
let values=new Array();
/// type 2
let myArray=[];

// addinng element in array 

values.push(1,2,3);
myArray.push(11,22,33,44,55,66);

console.log(values);
console.log(myArray);

// methods in arrays

values.push(4);

myArray.pop();

console.log(myArray);


// shift
// unshift
// splice

/// loops to travverce array 

for (const iterator of myArray) {
    console.log(iterator);
}

for (const key in myArray) {
    console.log(key);
}
