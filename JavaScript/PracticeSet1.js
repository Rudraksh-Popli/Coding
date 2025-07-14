// 1. Create a variable of type string and try to add a number to it.
let x = "Rudraksh"
let y = 4
console.log(x+y)
// 2. Use the typeof keyword to see the data type of the variables in the previous question.
console.log(typeof(x))
console.log(typeof(y))
console.log(typeof(x+y))
// 3. Create a constant object in JavaScript and then try to change its value to another data type.
// const biodata =
// { 
//     name : "Rudraksh",
//     age : 19
// }
// console.log(biodata)
// biodata = 29; // TypeError: Assignment to constant variable.
// 4. Try to add a new key to the previous const object.
const biodata =
{ 
    name : "Rudraksh", 
    age : 19
}
biodata.address = "123 Main St";
console.log(biodata);
// 5. Create a JavaScript program to make a month dictionary like 1 = January, 2 = February, and so on.
const months =
{
  1: "January",
  2: "February",
  3: "March",
  4: "April",
  5: "May",
  6: "June",
  7: "July",
  8: "August",
  9: "September",
  10: "October",
  11: "November",
  12: "December"
}
console.log(months);