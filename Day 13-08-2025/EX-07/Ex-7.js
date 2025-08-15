// List of persons
let persons = [
    { name: "Shubham Bhoite", age: 23, city: "Rahuri" },
    { name: "Sham Machale", age: 25, city: "Daund" },
    { name: "Tejas Jadhav", age: 16, city: "Jamkhed" },
    { name: "Mayur Bankar", age: 18, city: "Pune" },
];

let voters = persons.filter(person => person.age >= 18);



for (let i = 0; i < voters.length; i++) {
    console.log(voters[i]);
}
