/* 
Write a  program to generate the first N numbers in the Fibonacci series.
 The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
  For example, if N is 8, the Fibonacci series would be: 0, 1, 1, 2, 3, 5, 8, 13
   */

  

  function fibonacciIteration(N) {
    let result = [];
    let first = 0, second = 1;

    for (let i = 0; i < N; i++) {
        result.push(first);
        let next = first + second;
        first = second;
        second = next;
    }

    return result;
}

const N = 8;
const fibonacciSeries = fibonacciIteration(N);
console.log("Fibonacci Series using Iteration:", fibonacciSeries.join(' '));
