let num = [3, 5, 1, 2, 4];
for (let i = 0; i < num.length; i++) {
    console.log(num[i]);
}

num.forEach((element) => {
    console.log(element * element);
})

let name1 = "Rudraksh";
let arrOfNum1 = Array.from(name1);
console.log(arrOfNum1);

for (let i of num) {
    console.log(i);
}

for (let i in num) {
    console.log(i);
}

for (let i in num) {
    console.log(num[i]);
}