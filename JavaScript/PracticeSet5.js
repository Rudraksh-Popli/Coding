const prompt = require ("prompt-sync")({sigint: true})

// 1. Create an array of numbers and take input from the user to add numbers to this array.

// let numbers = [1, 2, 3, 4, 5];
// let input = prompt("Enter a number: ");
// input = Number(input);
// numbers.push(input);
// console.log(numbers);

// 2. Keep adding numbers to the array in Q1 until 0 is entered.

// let numbers = [1, 2, 3, 4, 5];
// let input = prompt("Enter a number: ");
// input = Number(input);
// while (input != 0)
// {
//   numbers.push(input);
//   input = prompt("Enter a number: ");
//   input = Number(input);
// }
// console.log(numbers);
let numbers = [1, 2, 3, 4, 5];
let input = null;
do
{
  input = prompt("Enter a number: ");
  input = Number(input);
  numbers.push(input);
}
while (input != 0);
console.log(numbers);

// 3. Filter for numbers deivisible by 10 from an array of numbers.

let numbers3 = [10, 29, 33, 40, 50, 61, 17, 38, 90, 7];
let filtered = numbers3.filter(function (number3)
{
  return number3 % 10 == 0;
});
console.log(filtered);

// 4. Create an array of square of given numbers.

let numbers4 = [1, 2, 3, 4, 5];
let squares = numbers4.map(function (number4)
{
  return number4 * number4;
});
console.log(squares);

// 5. Use the reduce method to calulate factorial of a given number from an array of first n natural numbers
//      (n being the numbers whose factorial needs to be calculated).

let numbers5 = [1, 2, 3, 4, 5];
let factorial = numbers5.reduce(function (x1, x2)
{
  return x1 * x2;
});
console.log(factorial);