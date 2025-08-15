function add() {
    let n1 = (document.getElementById("num1").value);
    let n2 = (document.getElementById("num2").value);
    document.getElementById("result").innerText = n1 + n2;
}

function subtract() {
    let n1 = Number(document.getElementById("num1").value);
    let n2 = Number(document.getElementById("num2").value);
    document.getElementById("result").innerText = n1 - n2;
}

function multiply() {
    let n1 = Number(document.getElementById("num1").value);
    let n2 = Number(document.getElementById("num2").value);
    document.getElementById("result").innerText = n1 * n2;
}

function divide() {
    let n1 = Number(document.getElementById("num1").value);
    let n2 = Number(document.getElementById("num2").value);

    if (n2 === 0) {
        document.getElementById("result").innerText = "Cannot divide by zero!";
    } else {
        document.getElementById("result").innerText = n1 / n2;
    }
}
