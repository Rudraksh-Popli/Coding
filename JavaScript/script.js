// 1. Write a program using prompt function to take input of age as a value from the user and use alert to tell him if he can drive!
// let age = prompt("Enter your age");
// age = Number.parseInt(age);
// if (Number.isNaN(age)) {
//     alert("Invalid Input!");
// }
// else if (age <= 0) {
//     alert("fr?");
// }
// else if (age >= 18) {
//     alert("You can drive!");
// }
// else {
//     alert("You cannot drive!");
// }

// 2. In Q1, use confirm to ask the user if he wants to see the prompt again.
// let age = prompt("Enter your age");
// age = Number.parseInt(age);
// let choice;
// if (Number.isNaN(age)) {
//     alert("Invalid Input!");
//     choice = confirm("Want to see the prompt again ?")
//     if (choice) {
//         alert("Invalid Input!");
//     }
// }
// else if (age <= 0) {
//     alert("fr?");
//     choice = confirm("Want to see the prompt again ?")
//     if (choice) {
//         alert("fr?");
//     }
// }
// else if (age >= 18) {
//     alert("You can drive!");
//     choice = confirm("Want to see the prompt again ?")
//     if (choice) {
//         alert("You can drive!");
//     }
// }
// else {
//     alert("You cannot drive!");
//     choice = confirm("Want to see the prompt again ?")
//     if (choice) {
//         alert("You cannot drive!");
//     }
// }

// 3. In the previous question, use console.error to log the error if the age entered is negative.
// let age = prompt("Enter your age");
// age = Number.parseInt(age);
// let choice;
// if (Number.isNaN(age)) {
//     alert("Invalid Input!");
//     choice = confirm("Want to see the prompt again ?")
//     if (choice) {
//         alert("Invalid Input!");
//     }
// }
// else if (age <= 0) {
//     console.error("Invalid Age!");
//     alert("fr?");
//     choice = confirm("Want to see the prompt again ?")
//     if (choice) {
//         alert("fr?");
//     }
// }
// else if (age >= 18) {
//     alert("You can drive!");
//     choice = confirm("Want to see the prompt again ?")
//     if (choice) {
//         alert("You can drive!");
//     }
// }
// else {
//     alert("You cannot drive!");
//     choice = confirm("Want to see the prompt again ?")
//     if (choice) {
//         alert("You cannot drive!");
//     }
// }

// 4. Write a program to change the url to google.com (Redirection) is user enters a number greater than 4.
// let num = prompt("Enter a number");
// num = Number.parseInt(num);
// if (num > 4) {
//     window.location = "https://www.google.com";
// }

// 5. Change the background of the page to yellow, red or any other color based on user input through prompt.
let colorChoice = prompt("Enter a color");
document.body.style.backgroundColor = colorChoice;