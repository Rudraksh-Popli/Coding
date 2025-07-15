const prompt = require ("prompt-sync")({sigint: true})

// 1. Create a JavaScript program to check if a age is between 10 and 20.

let age = prompt("Enter your age : ");

if (age >= 10 && age <= 20)
{
  console.log("You are between 10 and 20");
}
else
{
  console.log("You are not between 10 and 20");
}

// 2. Demonsrate the use of switch case in JavaScript.

let day = prompt("Enter a day : ");
switch (day)
{
  case "Monday":
    console.log("Today is Monday");
    break;
  case "Tuesday":
    console.log("Today is Tuesday");
    break;
  case "Wednesday":
    console.log("Today is Wednesday");
    break;
  case "Thursday":
    console.log("Today is Thursday");
    break;
  case "Friday":
    console.log("Today is Friday");
    break;
  case "Saturday":
    console.log("Today is Saturday");
    break;
  case "Sunday":
    console.log("Today is Sunday");
    break;
  default:
    console.log("Invalid day");
}

// 3. Create a JavaScript program to check if a number is divisible by 2 and 3.

let num1 = prompt("Enter a number : ");

if (num1 % 2 == 0 && num1 % 3 == 0)
{
  console.log("The number is divisible by 2 and 3");
}
else
{
  console.log("The number is not divisible by 2 and 3");
}

// 4. Create a JavaScript program to check if a number is divisible by 2 or 3.

let num2 = prompt("Enter a number : ");

if (num2 % 2 == 0 && num2 % 3 == 0)
{
  console.log("The number is divisible by both 2 and 3");
}
else if (num2 % 2 == 0)
{
  console.log("The number is divisible by 2");
} 
else if (num2 % 3 == 0)
{
  console.log("The number is divisible by 3");
}
else
{
  console.log("The number is not divisible by 2 or 3");
}

// 5. Print "you can drive" if the age is greater than or equal to 18, otherwise print "you cannot drive".
//      Use the ternary operator.

let age2 = prompt("Enter your age : ");
age2 >= 18 ? console.log("You can drive") : console.log("You cannot drive");