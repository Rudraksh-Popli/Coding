// console.log(console);
// console.assert(3 > 5);
// console.assert(3 < 5);
// console.error("This is an error");
// let obj = { 1: 3, 2: 4, 3: 5, 4: 6 };
// console.table(obj);
// console.warn("Tread Carefully");
console.log("log");
console.info("info");
console.warn("warn");
console.error("err");
console.assert("err" != false);
console.assert("err" == false);
console.time("p1");
for (let i = 10; i >= 0; i--) {
    console.log(31);
}
console.timeEnd("p1");
console.time("p2");
let i = 10;
while (i >= 0) {
    console.log(31);
    i--;
}
console.timeEnd("p2");