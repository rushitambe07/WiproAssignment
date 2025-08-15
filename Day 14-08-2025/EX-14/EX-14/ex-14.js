function login() {
    let userId = document.getElementById("userId").value;
    if (userId) {
        localStorage.setItem("userId", userId);
        document.getElementById("status").innerText = "Logged in as " + userId;
    } else {
        alert("Please enter User ID");
    }
}

function logout() {
    localStorage.removeItem("userId");
    document.getElementById("status").innerText = "Logged out";
}

document.addEventListener("DOMContentLoaded", function () {
    let storedUser = localStorage.getItem("userId");
    if (storedUser) {
        document.getElementById("status").innerText = "Logged in as " + storedUser;
    }
});

