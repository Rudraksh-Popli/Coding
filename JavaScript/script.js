const prompt = require('prompt-sync')();
// 1. Write a program to print the marks of a student in an object using for loop.
let obj =
{
    harry: 98,
    rohan: 70,
    aakash: 7
};
for (let i = 0; i < Object.keys(obj).length; i++) {
    console.log("Marks of", Object.keys(obj)[i], "are", obj[Object.keys(obj)[i]]);
}

// 2. Write the program in Q1 using for in loop.
for (let i in obj) {
    console.log("Marks of", i, "are", obj[i]);
}

// 3. Write a program to print "try again" until the user enters the correct number.
let correctNumber = 23;
let notFound = true;
while (notFound) {
    let a = prompt("Enter a number : ");
    a = Number.parseInt(a);
    if (a == correctNumber) {
        console.log("You Guessed It!")
        notFound = false;
    }
    else {
        console.log("Try Again!")
    }
}

// 4. Write a function to find mean of 5 numbers.
const pentaMean = (a, b, c, d, e) => {
    return ((a + b + c + d + e) / 5);
}
let b = prompt("Enter first number : ");
b = Number.parseInt(b);
let c = prompt("Enter second number : ");
c = Number.parseInt(c);
let d = prompt("Enter third number : ");
d = Number.parseInt(d);
let e = prompt("Enter fourth number : ");
e = Number.parseInt(e);
let f = prompt("Enter fifth number : ");
f = Number.parseInt(f);
console.log("Mean of", b, ",", c, ",", d, ",", e, ",", f, "is", pentaMean(b, c, d, e, f));