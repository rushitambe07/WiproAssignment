let questions = [
    { q: "Capital of India?", options: ["Delhi", "Mumbai", "Chennai"], answer: "Delhi" },
    { q: "2 + 2 = ?", options: ["3", "4", "5"], answer: "4" },
    { q: "Color of sky?", options: ["Blue", "Green", "Red"], answer: "Blue" }
];

let index = 0, score = 0;

function loadQuestion() {
    document.getElementById("feedback").innerHTML = "";
    document.getElementById("question").innerHTML = questions[index].q;

    let optDiv = document.getElementById("options");
    optDiv.innerHTML = "";
    questions[index].options.forEach(opt => {
        let btn = document.createElement("button");
        btn.innerHTML = opt;
        btn.onclick = () => checkAnswer(opt);
        optDiv.appendChild(btn);
        optDiv.appendChild(document.createElement("br"));
    });

    document.getElementById("score").innerHTML = "Score: " + score;
}

function checkAnswer(selected) {
    if (selected === questions[index].answer) {
        document.getElementById("feedback").innerHTML = "✅ Correct!";
        score++;
    } else {
        document.getElementById("feedback").innerHTML = "❌ Wrong!";
    }
    document.getElementById("score").innerHTML = "Score: " + score;
}

function nextQuestion() {
    index++;
    if (index < questions.length) {
        loadQuestion();
    } else {
        document.body.innerHTML = "<h2>Quiz Finished!</h2><p>Your score: " + score + "</p>";
    }
}

loadQuestion();
