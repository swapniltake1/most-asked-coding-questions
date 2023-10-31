

    let num = 1;
    
    function show(){
        console.log("hii",num);
        num++;
        if(num <= 10000)
           show();
    }

    show();
