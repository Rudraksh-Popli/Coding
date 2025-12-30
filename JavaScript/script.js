alert("This script is working");
alert("Enter the value of a");
let a = prompt("Enter the value of a here", "578");
a = Number.parseInt(a);
alert(`You entered "a" of type ${typeof a}.`);
let write = confirm(`Do you want to write the values of "a" to the page ?`);
if (write) {

    document.write(a);
}
else {
    document.write("Allow me to write");
}