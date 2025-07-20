// 1. Write a program using the prompt function to take input of age as a value from the user
//      and use alert to tell them if they can drive or not.

// let age = prompt("Enter your age:");
// if (age >= 18)
// {
//     alert("You can drive!");
// }
// else
// {
//     alert("Sorry, you are not old enough to drive.");
// }

// 2. In question 1, use confirmto ask the user if they want to see the prompt again
//      and want to get prompted again for the age.

// let age;

// do
// {
//     age = prompt("Enter your age:");
//     if (age >= 18)
//     {
//         alert("You can drive!");
//     }
//     else
//     {
//         alert("Sorry, you are not old enough to drive.");
//     }
// }
// while(confirm("Do you want to see the prompt again?"));

// 3. In the previous question, use console.error to log the error of age is 0 or negative.

let age;

do
{
    age = prompt("Enter your age:");
    if (age > 0)
    {
        if (age >= 18)
        {
            alert("You can drive!");
        }
        else
        {
            alert("Sorry, you are not old enough to drive.");
        }
    } 
    else
    {
        console.error("Error: Age must be a positive number");
    }
}
while(confirm("Do you want to see the prompt again?"));

// 4. Write a program to prompt the user to input a number and change the URL to https://google.com
//      if the user enters a number greater than 4 (Hint: location.href).

let num = prompt("Enter a number:");

if (num > 4)
{
    location.href = "https://google.com";
}

// 5. Change the background of the page to yellow, red or any other color based on user input through prompt.

let color = prompt("Enter a color (yellow, red, etc.):");

document.body.style.backgroundColor = color;