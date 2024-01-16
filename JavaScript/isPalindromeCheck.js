
let checkPalinndrome = (input)=>{
    const cleanedInput = input.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
   
    let reverse = cleanedInput.split('').reverse().join('');
    // console.log(cleanedInput, reverse);
       
    return cleanedInput === reverse;
}

const str = " heh";
const res = checkPalinndrome(str);
console.log("Your String is Palindrome ?", res);




