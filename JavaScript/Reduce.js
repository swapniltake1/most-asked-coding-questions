let numArr=[16,8,66,77,22,69];

result = numArr.filter(n=> n%2===0)  // fileter
      .map(n => n*2 )       // map values 
      .reduce((a, b) => a+b);  // adding 1+2 and makinng total

      console.log(result);
    
      