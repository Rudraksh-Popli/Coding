// function onePlusAvg(x, y) {
//     return Math.round(1 + (x + y) / 2);
// }

const onePlusAvg = (x, y) => {
    return Math.round(1 + (x + y) / 2);
}

const hello = () => {
    console.log("Hello World");
}

let a = prompt("Enter the first number");
a = Number.parseInt(a);
let b = prompt("Enter the first number");
b = Number.parseInt(b);
alert("One plus Average of " + a + " and " + b + " is " + onePlusAvg(a, b));
let c = hello();
console.log(c);