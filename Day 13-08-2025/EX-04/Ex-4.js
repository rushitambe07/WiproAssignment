function updateRemaining() {
     maxLength = 50;
     enteredLength = document.getElementById("txt").value.length;
     remaining = maxLength - enteredLength;
    document.getElementById("remaining").innerText = remaining + " characters remaining";
}
