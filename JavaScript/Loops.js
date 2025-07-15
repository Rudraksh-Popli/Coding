const prompt = require ("prompt-sync")({sigint: true})
// Program to add first n natural numbers
let sum = 0
let n = prompt("Enter the value of n : ")
n = Number.parseInt(n)
for (let i = 0; i < n; i++)
{
  sum += (i + 1)
}
console.log("Sum of first " + n + " natural numbers is " + sum)
// console.log(i)

let obj =
{
  harry: 90,
  shubh: 45,
  shivika: 56,
  ritika: 57,
  shiv: 23
}

// For in loop
for (let a in obj)
{
  console.log("Marks of " + a + " are " + obj[a])
}

// For of loop
for (let b of "Harry")
{
  console.log(b)
}

// while loop

let n1 = prompt("Enter the value of n : ")
n1 = Number.parseInt(n1)

let i1 = 0;
while(i1<n1)
{
  console.log(i1)
  i1++;
}

// do while loop
let n2 = prompt("Enter the value of n : ")
n2 = Number.parseInt(n2)

let i2 = 10;
do
{
  console.log(i2)
  i2++;
}
while (i2 < n2)