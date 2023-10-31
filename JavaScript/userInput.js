let readline = require('readline');

const screen = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

screen.question('please Enter Your Name ? ::', (answer) => {
    console.log('you entered ::'+answer);
    console.log('Thank you !');
    screen.close();
});