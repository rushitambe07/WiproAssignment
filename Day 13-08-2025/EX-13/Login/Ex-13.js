function validateEmail() {
    let email = document.getElementById("email").value;
    let emailError = document.getElementById("emailError");
    let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email === "" || !regex.test(email)) {
        emailError.style.visibility = "visible";
        return false;
    } else {
        emailError.style.visibility = "hidden";
        return true;
    }
}

function validatePassword() {
    let password = document.getElementById("password").value;
    let passwordError = document.getElementById("passwordError");

    if (password === "") {
        passwordError.style.visibility = "visible";
        return false;
    } else {
        passwordError.style.visibility = "hidden";
        return true;
    }
}

function handleLogin() {
    let emailValid = validateEmail();
    let passwordValid = validatePassword();

    if (emailValid && passwordValid) {
        alert("Login successful!");
    } else {
        alert("Please fix errors before logging in.");
    }
}
