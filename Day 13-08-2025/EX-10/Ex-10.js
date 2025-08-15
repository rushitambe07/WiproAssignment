let persons = [
    { name: "Shubham Bhoite", age: 23, city: "Rahuri" },
    { name: "Sham Machale", age: 25, city: "Daund" },
    { name: "Tejas Jadhav", age: 16, city: "Jamkhed" },
    { name: "Mayur Bankar", age: 18, city: "Pune" },
];

persons.map(i => {
    if (i.age >= 18) {
        i.status = "Adult";
    } else {
        i.status = "Minor";
    }
});

console.log(persons);
