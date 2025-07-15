const prompt = require ("prompt-sync")({sigint: true})

// 1. Write a program to print the marks of a student in an object using for loop: object could be like this:
//  {
//   coco: 80,
//   harry: 98,
//   rohan: 75
//  }

let marks =
{
  coco: 80,
  harry: 98,
  rohan: 75
}
for (let i = 0; i < Object.keys(marks).length; i++)
{
  console.log("The marks of " + Object.keys(marks)[i] + " are " + marks[Object.keys(marks)[i]]);
}

// 2. Write a program in Q1 using for in loop

let marks1 =
{
  coco: 80,
  harry: 98,
  rohan: 75
}
for (let key in marks1)
{
  console.log("The marks of " + key + " are " + marks1[key]);
}

// 3. Write a program to print "try again" until the user enters the correct number

let correctNumber = 9;
let guessedNumber = null
while (guessedNumber != correctNumber)
{
    guessedNumber = prompt("Enter a number: ")
    if (guessedNumber == correctNumber)
    {
        break;
    }
    console.log("Try Again!");
}
console.log("congrats, youve guessed the number!")

// 4. Write a function to find the mean of 5 numbers

function findMean(num1, num2, num3, num4, num5)
{
  let sum = num1 + num2 + num3 + num4 + num5;
  let mean = sum / 5;
  return mean;
}
let result = findMean(10, 20, 30, 40, 50);
console.log("The mean of the numbers is " + result);