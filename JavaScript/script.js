// 1. What will the following print in JavaScript ?
console.log("har\"".length);
// Prints 4

// 2. Explore the includes, startsWith and endsWith function of a string.
let a = "Rudraksh Popli is a novice programmer";
console.log(a.endsWith("gamer"));
console.log(a.endsWith("r"));
console.log(a.endsWith("e"));
console.log(a.endsWith("mer"));
console.log(a.endsWith(" novice programmer"));
console.log(a.startsWith("gamer"));
console.log(a.startsWith("r"));
console.log(a.startsWith("e"));
console.log(a.startsWith("Rud"));
console.log(a.startsWith("Rudraksh Popli is a "));
console.log(a.includes(" "));
console.log(a.includes("n"));
console.log(a.includes("i i"));
console.log(a.includes("Novice"));
console.log(a.includes("ram"));

// 3. Write a program to convert a given string to lowercase.
const lowerCase = (x) => {
    return x.toLowerCase();
}
console.log(lowerCase("John"));

// 4. Extract the amount out of this string - "Please give Rs 1000"
let str1 = "Please give Rs 1000";
let amount = Number.parseInt(str1.slice("Please give Rs ".length));
console.log(amount, typeof amount);

// 5. Try to change 4th character of a given string.
let str2 = "These are bunch of words";
str2[3] = "K";
console.log(str2); // Prints the unchanged given string as strings are immutable