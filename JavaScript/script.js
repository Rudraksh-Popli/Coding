/* Use JavaScript to create a game of Snake, Water & Gun. The game should ask you to enter S, W or G. The computer should be able to randomly generate
S, W or G and declare Win or Loss using alert. Use confirm and prompt wherever required */
const makeRandomChoice = () => {
    let computerChoice = Math.floor(Math.random() * 3);
    if (computerChoice == 0) {
        return "s";
    }
    else if (computerChoice == 1) {
        return "w";
    }
    else {
        return "g";
    }
}
while (true) {
    let compChoice = makeRandomChoice();
    let userChoice = prompt("Choose Snake, Water or Gun (S or W or G)");
    if (!userChoice) {
        alert("Game Cancelled!");
        break;
    }
    userChoice = userChoice.toLowerCase();
    if (userChoice != "s" && userChoice != "w" && userChoice != "g") {
        alert("Invalid Choice! Try Again.");
        continue;
    }
    else if (userChoice == compChoice) {
        alert("Tied");
    }
    else if (userChoice == "s" && compChoice == "w") {
        alert("You Won");
    }
    else if (userChoice == "s" && compChoice == "g") {
        alert("Computer Won");
    }
    else if (userChoice == "w" && compChoice == "s") {
        alert("Computer Won");
    }
    else if (userChoice == "w" && compChoice == "g") {
        alert("You Won");
    }
    else if (userChoice == "g" && compChoice == "s") {
        alert("You Won");
    }
    else if (userChoice == "g" && compChoice == "w") {
        alert("Computer Won");
    }
    else
    {
        alert("Made By Rudraksh Popli");
    }
    let askingPlayer = confirm("Wanna Play Again?");
    if (!askingPlayer) {
        break;
    }
}