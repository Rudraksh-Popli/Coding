// 1. Use logical operators to find whether the age of a person lies between 10 and 20.
let a = prompt("Enter your age");
a = parseInt(a);
if (a > 10 && a < 20) {
    prompt("yes");
}
else {
    prompt("no");
}

// 2. Demonstrate the use of switch case statements in JavaScript.
let b = prompt("Hey ! What's your favourite fruit ?");
switch (b) {
    case "Oranges":
        alert("Oranges are $0.59 a pound.");
        break;
    case "Mangoes":
    case "Papayas":
        alert("Mangoes and papayas are $2.79 a pound.");
        break;
    default:
        alert("Out of Stock");
}

// 3. Write a JavaScript program to find whether a number is divisible by 2 and 3.
let c = prompt("Enter a number");
c = parseInt(c);
if (c % 6) {
    prompt("Number is not divisible by 2 and 3");
}
else {
    prompt("Number is divisible by 2 and 3");
}

// 4. Write a JavaScript program to find whether a number is divisible by 2 or 3.
let d = prompt("Enter a number");
d = parseInt(d);
if (d % 6 == 0) {
    prompt("Number is divisible by both 2 and 3");
}
else if (d % 2 == 0) {
    prompt("Number is only divisible by 2");
}
else if (d % 3 == 0) {
    prompt("Number is only divisible by 3");
}
else {
    prompt("Number is neither divisible by 2 nor 3");
}

// 5. Print "You can drive" or "You cannot drive" based on age being greater than 18 using ternary operator.
let e = prompt("Enter Age");
e = Number.parseInt(e);
alert("You can " + (e < 18 ? "not drive" : "drive"));