// alert("Hello")
// console.log("Hey harry")

// console.log("Hello")
// let a = 4;
// let b = 2;
// console.log(a + b)
// console.log("log")
// console.info("info")
// console.warn("warn")
// console.error("err")
// console.assert("err" != false)
// console.assert("err" == false)

// console.time("forLoop")

// for (let i = 0; i < 500; i++)
// {
//   console.log(233)
// }

// console.timeEnd("forLoop")

// console.time("whileLoop")

// let i = 0;
// while (i < 500)
// {
//   console.log(233)
//   i++;
// }

// console.timeEnd("whileLoop")

// alert("Your Script Works")
// alert("Enter the value of a!")
// let a = prompt("Enter a here", "578")
// a = Number.parseInt(a)
// alert("You entered a of type " + (typeof a))
// let write = confirm("Do you want to write it to the page")
// if (write)
// {
//   document.write(a)
// }
// else
// {
//   document.write("Please allow me to write")
// }

// window.console.log(window)
// console.log(document.body)
// document.body.style.background = "yellow"

// console.log(document.body.firstChild)
// console.log(document.body.lastChild)
// let arr = Array.from(document.body.childNodes)
// console.log(arr)

// console.log(document.body.firstChild)
// a = document.body.firstChild
// console.log(a.parentNode)
// console.log(a.parentElement)
// console.log(a.firstChild.nextSibling)

// const changeBgRed = () =>
// {
//   document.body.firstElementChild.style.background = "red"
// }

// let b = document.body
// console.log("First child of b is: ", b.firstChild)
// console.log("First Element child of b is: ", b.firstElementChild)

// let t = document.body.firstElementChild.firstElementChild
// console.log(t)
// console.log(t.rows)
// console.log(t.caption)
// console.log(t.tHead.firstElementChild)
// console.log(t.tFoot)
// console.log(t.tBodies)
// console.log(t.rows[1].rowIndex)

// Change the card title to red
let ctitle = document.getElementById("firstcardtitle")
ctitle.style.color = "blue"

let ctitles = document.querySelectorAll(".card-title")
ctitles[0].style.color = "blue"
ctitles[1].style.color = "red"
ctitles[2].style.color = "green"
console.log(ctitles)

document.querySelector(".this").style.color = "black"
document.querySelector(".this").style.background = "red"

console.log(document.getElementsByTagName("a"))
console.log(document.querySelector(".card").getElementsByTagName("a"))
console.log(document.getElementsByName("search"))