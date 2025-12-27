let name1 = "Rudraksh";
console.log(name1.length);
for (let i = 0; i < name1.length; i++) {
    console.log(name1[i]);
}
let name2 = "Aarush";
// Template Literals
console.log(`${name1} is a "friend" of ${name2}.`); // String Interpolation
let fruit = "Bana\"na";
console.log(fruit, fruit.length);
fruit = 'Bana\'na';
console.log(fruit, fruit.length);
fruit = `Bana\`na`;
console.log(fruit, fruit.length);
fruit = `Bana\nna`;
console.log(fruit, fruit.length);
fruit = `Bana\tna`;
console.log(fruit, fruit.length);
fruit = `Bana\rna`;
console.log(fruit, fruit.length);

console.log(name1.toUpperCase());
console.log(name1.toLowerCase());
console.log(name1.slice(2,4));
console.log(name1.slice(2));
let dog = "Big Dog";
let newdog = dog.replace("Big","Small");
console.log(newdog);
let a1 = "This";
let a2 = "Exists";
let a3 = a1.concat(a2," Now");
console.log(a3);
let oldName = "                         Rudraksh        "
let newName = oldName.trim();
console.log(newName);