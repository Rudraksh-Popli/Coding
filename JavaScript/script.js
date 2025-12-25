// nn bb ss u - Primitive Data Types in JavaScript
let a = null;
let b = 345;
let c = true;
let d = BigInt("567") + BigInt("3");
let e = "Rudraksh";
let f = Symbol("This is a symbol");
let g;
let h = undefined;
console.log(a, b, c, d, e, f, g, h);
console.log(typeof c);

// Objects - Non Primitive Data Type in JavaScript
const item =
{
    "Rudraksh": true,
    "Aarush": false,
    "John": 5,
    "Charles": undefined
};
console.log(item["John"]);