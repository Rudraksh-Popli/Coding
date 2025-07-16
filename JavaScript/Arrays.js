let marks_class_12 = [91, 82, 63, 84, false, "Not Present"]
console.log(marks_class_12[0])
console.log(marks_class_12[1])
console.log(marks_class_12[2])
console.log(marks_class_12[3])
console.log(marks_class_12[4])
console.log(marks_class_12[5])
console.log(marks_class_12[-2])
console.log(marks_class_12[6]) // Will be undefined because index 6 does not exist
console.log("The length of marks_class_12 is", marks_class_12.length)
marks_class_12[6] = 89 // Adding a new value to the array
console.log("The length of marks_class_12 is", marks_class_12.length)
marks_class_12[0] = 96 // Changing the value of an array
console.log(marks_class_12)
console.log(typeof marks_class_12)

// Array Methods
let num = [1, 2, 3, 34, 4]
let b = num.toString() // b is now a string 
console.log(b, typeof b)
let c = num.join(" and ")
console.log(c, typeof c)
// let r = num.pop() // pop returns the popped element
// console.log(num, r)
// let r = num.push(56) // push returns the new array length
// console.log(num, r)
// let r = num.shift()
// console.log(r, num) // Removes an element from the start of the array

let r = num.unshift(78)
console.log(r, num)
console.log(r)

// let num = [1, 2, 3, 4, 5, 6, 7, 8, 9]
// let num_more = [11, 12, 13, 14, 15, 16, 17, 18, 19]
// let num_even_more = [211, 212, 213, 214, 415, 416, 417, 418, 419]
// console.log(num.length)
// delete num[0]
// console.log(num.length)

// let newArray = num.concat(num_more, num_even_more)
// console.log(newArray)
// console.log(num, num_more)

// sort method
// let compare = (a, b)=>{
//   return b - a
// }
// let num = [551, 22, 3, 14, 5, 6, 7, 8, 229]
// num.sort(compare)
// num.reverse()
// console.log(num)

// Splice and Slice
let num1 = [551, 22, 3, 14, 5, 6, 7, 8, 229]
// let deletedValues = num1.splice(2, 4, 1021, 1022, 1023, 1024, 1025)
// console.log(num1)
// console.log(deletedValues)

// let newNum = num1.slice(3)
let newNum = num1.slice(3, 5)
console.log(newNum)

let num3 = [3, 5, 1, 2, 4]

// for(let i=0; i<num3.length;i++){
//   console.log(num3[i])
// }

// ForEach Loop
num3.forEach((element) =>
{
  console.log(element * element)
})

// Array.from 
let name2 = "Harry"
let arr = Array.from(name2)
console.log(arr)

// for...of 
for (let item of num3)
{
  console.log(item)
}

// for...in
for (let i in num3)
{
  console.log(num3[i])
}

let arr1 = [45, 23, 21]
// Array map method
let a = arr1.map((value, index, array) =>
{
  // console.log(value, index, array)
  return value + index
})
// console.log(arr1)

// Array filter method
let arr2 = [45, 23, 21, 0, 3, 5]
let a2 = arr2.filter((a) =>
{
  return a < 10
})
// console.log(a2, arr2)

// Array reduce method
let arr3 = [1, 2, 3, 5, 2, 1]
const reduce_func = (h1, h2) =>
{
  return h1 + h2
}
let newarr3 = arr3.reduce(reduce_func)
console.log(newarr3)