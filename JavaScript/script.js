// 1. Create a variable of type string and try to add a number to it

let a = "Rudraksh";
let b = 1412;
let c = a+b;
console.log(c);

// 2. Use typeof operator to find the datatype of the string in the last question

console.log(typeof c);

// 3. Create a const object in JavaScript. Can you change it to hold a number later

const item =
{
    "Rudraksh" : 96,
    "Aarush" : true,
    "Charles" : false,
    "John" : null
};

// item = 6; NO

// 4. Try to add a new key to the const object in Problem 3. Were you able to do it ?

item["Lewis"] = "Hamilton";
item["Charles"] = "Leclerc";
console.log(item); // YES

// 5. Write a JavaScript program to create a word-meaning dictionary of 5 words

const dict =
{
    "Avert" : "Avoid",
    "Bestow" : "Give",
    "Customary" : "Tradition",
    "Decline" : "Reject",
    "Furious" : "Angry"
};

console.log("Meaning of Avert is", dict["Avert"]);
console.log("Meaning of Bestow is", dict.Bestow);
console.log("Meaning of Customary is", dict["Customary"]);
console.log("Meaning of Decline is", dict["Decline"]);
console.log("Meaning of Furious is", dict["Furious"]);