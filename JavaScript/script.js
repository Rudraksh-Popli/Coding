let arr1 = [45, 23, 31, 78, 65];
let a1 = arr1.map((value, index, array) => {
    console.log(value, index, array);
    return value ** index;
})
console.log(a1);

let arr2 = [45, 56, 50, 70, 84, 5, 10, 12];
let a2 = arr2.filter((value) => {
    return value < 50;
})
console.log(a2);

let arr3 = [14, 12, 2006, 11, 7, 2007, 14, 2, 2001];
const reduce_func = (value1, value2) => {
    return value1 + value2;
}
let a3 = arr3.reduce(reduce_func);
console.log(a3);