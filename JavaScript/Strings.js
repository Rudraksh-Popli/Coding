let name1 = "Harry"
console.log(name1.length)
console.log(name1[0])
console.log(name1[1])
let friend = 'Prakash'
console.log(friend)
// let myfriend = "Shubh' // Dont do this
// console.log(myfriend)

// Template literals or String Interpolation
let boy1 = "Pramod"
let boy2 = "Nikhil"
// Nikhil is a friend of Pramod
let sentence = `${boy2} is a friend of ${boy1}`
console.log(sentence)

// Escape Sequence Characters
// let fruit = 'Bana\'na'
// console.log(fruit)
let fruit1 = "Bana\"na"
console.log(fruit1)
let fruit2 = "Bana\nna"
console.log(fruit2)
let fruit3 = "Bana\tna"
console.log(fruit3)
let fruit4 = "Bana\rna"
console.log(fruit4)

let name2 = "Harry"
console.log(name2.length)

console.log(name2.toUpperCase())
console.log(name2.toLowerCase())
console.log(name2.slice(2, 4))
console.log(name2.slice(2))
console.log(name2.replace("Har", "Per"))
let friend1 = "Naman"
console.log(name2.concat(" is a friend of ", friend1, " Ok"))
let friend2 = "      Meena        "
console.log(friend2)
console.log(friend2.trim())
let fr = "Raman" + "Shivika" + "Harry"
console.log(fr[0])
console.log(fr[1])
console.log(fr[2])
console.log(fr[3])
fr[4]= "o" // This is not possible 
console.log(fr)

// QuickQuiz: Use a for loop to print a string

let str = "Hello";
for (let char of str)
{
    console.log(char);
}