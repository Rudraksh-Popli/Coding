/* Write a JavaScript Program to generate a random number and store it in a variable. The program then takes an input from the user to tell them whether the
guess was correct, greater or lesser than the original number. 100 - (no. of guesses) is the score of the user. The program is expected to terminate once
the number is guessed. Number should be between 1-100. */
function getRndInteger(min, max) {
    return (Math.floor(Math.random() * (max - min - 1)) + min + 1);
}
const prompt = require('prompt-sync')();
let answer = getRndInteger(1, 100);
let score = 100;
while (true) {
    let response = prompt("Guess the number between 1 and 100 : ");
    response = Number.parseInt(response);
    if (Number.isNaN(response)) {
        console.log("Invalid Input! Try Again.");
        continue;
    }
    else if (answer == response) {
        console.log(`You Won!\nYour score is : ${score}`);
        break;
    }
    else if (answer < response) {
        score--;
        console.log("Go Lower!");
    }
    else {
        score--;
        console.log("Go Higher!");
    }
}
console.log("Thank you for playing!");