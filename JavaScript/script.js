let a = prompt("Hey ! What's your age ?");
console.log(typeof a);
a = Number.parseInt(a);
console.log(typeof a);
if (a <= 0) {
    alert("This is an invalid age");
}
else if (a < 9) {
    alert("You are a kid, don't drive");
}
else if (a < 18 && a > 9) {
    alert("You are a kid, drive with supervision");
}
else {
    alert("You can drive");
}

let b = prompt("Hey ! What's your favourite fruit ?");
switch (b) {
    case "Oranges":
        alert("Oranges are $0.59 a pound.");
        break;
    case "Mangoes":
    case "Papayas":
        alert("Mangoes and papayas are $2.79 a pound.");
        break;
    default:
        alert("Out of Stock");
}

let c = prompt("Enter Age");
c = Number.parseInt(c);
alert("You can" + (c < 18 ? "not drive" : "drive"));