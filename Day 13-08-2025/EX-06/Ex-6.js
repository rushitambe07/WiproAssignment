let names = ["Shubham", "Sham", "Ram", "Tejas", "Mayur", "Prashant"];

// Filter names with length > 5 and convert to uppercase
let result = names
    .filter(name => name.length > 5)
    .map(name => name.toUpperCase());

console.log("Original names:", names);
console.log("Filtered & Uppercase:", result);
