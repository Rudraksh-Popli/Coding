const prompt = require('prompt-sync')();
// 1. Create an array of numbers and take input from the user to add numbers to this array.
let q1 = [31, 26, 11, 7, 14, 12];
console.log("Current Array :", q1)
let choice = true;
while (choice) {
    let ans1 = prompt("Enter number to add to array : ");
    ans1 = Number.parseInt(ans1);
    q1.push(ans1);
    console.log("Current Array :", q1);
    while (true) {
        choice = prompt("Want to add more numbers ? (y/n) : ");
        if (choice.toLowerCase() == 'y') {
            choice = true;
            break;
        }
        else if (choice.toLowerCase() == 'n') {
            choice = false;
            console.log("Thank you for your input.")
            break;
        }
        else {
            choice = false;
            console.log("Invalid Input! Try Again");
        }
    }
}

// 2. Keep Adding Numbers to the array in 1. until 0 is added to the array.
let q2 = [31, 26, 11, 7, 14, 12];
console.log("Current Array :", q2)
let choice2 = true;
while (choice2 && ans2 != 0) {
    var ans2 = prompt("Enter number to add to array : ");
    ans2 = Number.parseInt(ans2);
    q2.push(ans2);
    console.log("Current Array :", q2);
    while (true && ans2 != 0) {
        choice2 = prompt("Want to add more numbers ? (y/n) : ");
        if (choice2.toLowerCase() == 'y') {
            choice2 = true;
            break;
        }
        else if (choice2.toLowerCase() == 'n') {
            choice2 = false;
            console.log("Thank you for your input.")
            break;
        }
        else {
            choice2 = false;
            console.log("Invalid Input! Try Again.");
        }
    }
}

// 3. Filter for numbers divisible by 10 from a given array.
let q3 = [10, 90, 45, 23, 43, 2, 0, 1, 67, 80, -20, -30, -1, -2 - 67];
const thisFilters = (value) => {
    return !(value % 10);
}
let ans3 = q3.filter(thisFilters);
console.log(ans3);

// 4. Create an array of square of given numbers.
let q4 = [2, 4, 6, 8, 12, 14, 15, 16, 20, 100];
const thisMaps = (value) => {
    return value ** 2;
}
let ans4 = q4.map(thisMaps);
console.log(ans4);

// 5. Use reduce to calculate factorial of a number from an array of first n natural numbers (n being the number whose factorial needs to be calculated)
let q5 = prompt("Enter number to calculate factorial of : ");
q5 = Number.parseInt(q5);
let ans5 = [];
for (let i = 0; i < q5; i++) {
    ans5[i] = i + 1;
}
const thisReduces = (value1, value2) => {
    return value1 * value2;
}
let actualAns5 = ans5.reduce(thisReduces);
console.log(`The factorial of ${q5} is ${actualAns5}.`);