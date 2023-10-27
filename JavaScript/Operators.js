/**
 * This is a series of questions that are asked to Javascript Developers.
 * 
 * */

let a = 10;
let b = '20';

console.log(a + b) // 1020 (A)
console.log(a + +b) // 30  (B)
console.log(a - b) // -10  (C)
console.log(a / b) // 0.5  (D)
console.log(a * b) // 200  (E)
console.log(++a+ +b) //31  (F)

/**
 * Reasons behind this output
 * 
 * (A) The + operator works as a concatentation operator here
 * (B) The first + operator is normal addition but the second + operator is casting the {string} to {Number}
 * (C) The - operator casts b to {Number}
 * (D) The / operator casts b to {Number}
 * (E) The * operator casts b to {Number}
 * (F) The first ++ operator works as a pre-increment operator, the second + operator is simple addition operator
 * and lastly the + operator casts the b from {string} to {Number} type
 * */