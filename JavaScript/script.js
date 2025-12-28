// let marks = [90, 87, 65, 85, 96, 75, null, false, "Absent"];
// console.log(marks);
// console.log(typeof marks);
// for (let i = 0; i < marks.length; i++) {
//     console.log(marks[i]);
// }
// console.log(marks[-1]);
// console.log(marks[10]);
// marks[10] = 89;
// marks[1] = 88;
// console.log(marks);
// console.log(marks[10]);
// console.log(marks[9]);

// let thisList = [1, 2, 34, 34, 5, 6, 4];
// console.log(thisList, typeof thisList);
// let b = thisList.toString();
// console.log(b, typeof b);
// let c = thisList.join("?")
// console.log(c);
// let r = thisList.pop();
// console.log(r, typeof r);
// console.log(thisList, typeof thisList);
// let s = thisList.push("69");
// console.log(s, typeof s);
// console.log(thisList, typeof thisList);
// let t = thisList.shift();
// console.log(t, typeof t);
// console.log(thisList, typeof thisList);
// let u = thisList.unshift("23");
// console.log(u, typeof u);
// console.log(thisList, typeof thisList);

let arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
console.log(arr1);
delete arr1[1];
console.log(arr1);
console.log(arr1.length);
let arr2 = [11, 22, 33, 44, 55, 66, 77, 88, 99, 0];
let arr3 = [10, 20, 30, 40, 50, 60, 70, 80, 90, 0];
let arr4 = arr2.concat(arr1, arr3);
console.log(arr4);
const compare = (a, b) => {
    return a - b;
}
arr4.sort(compare);
arr4.reverse();
console.log(arr4);
let deletedValeus = arr2.splice(2, 3, 1021, 1022, 1023, 1024, 1025);
console.log(arr2);
console.log(deletedValeus, typeof deletedValeus);
let newArr2 = arr2.slice(3);
console.log(newArr2);
console.log(arr2);
newArr2 = arr2.slice(5,8);
console.log(newArr2);
console.log(arr2);