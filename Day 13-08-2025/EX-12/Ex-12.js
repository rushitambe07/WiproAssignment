function check() {
    let str = document.getElementById("txt").value;
    let rev = "";

    for (let i = str.length - 1; i >= 0; i--) {
        rev += str[i];
    }

    alert(str === rev ? "Palindrome" : "Not Palindrome");
}
