let nums=[12,44,55,77,88,99,66,33];

nums.filter(n=> n%2===0)   // filtering element 
    .map(n=> n*2)          // mapping new values innto n*2
    .forEach(n=>{          // prinnting that values to console
        console.log(n);
    });

