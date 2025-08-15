let persons = [
    { name: "Shubham Bhoite", age: 23, city: "Rahuri" },
    { name: "Sham Machale", age: 25, city: "Daund" },
    { name: "Tejas Jadhav", age: 16, city: "Jamkhed" },
    { name: "Mayur Bankar", age: 18, city: "Pune" },
];


for (let i = 0; i < persons.length; i++) {
    if (persons[i].age >= 18) {
        persons[i].status = "Adult";
    } else {
        persons[i].status = "Minor";
    }
}

console.log(persons);