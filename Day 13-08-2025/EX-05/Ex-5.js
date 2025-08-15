var x = 4; // global scope variable
const z = 9; // constant variable

function f() {
    x = 9; // modifies global var
    let y = 8; // block scope variable

    console.log("x in function is " + x);
    console.log("y in function is " + y);

    if (true) {
        let z = 18; // block scope variable
        console.log("y in if block is " + y); // y accessible here
        console.log("z in if block is " + z); // local z
    }

    console.log("z in function is " + z); 
}

f(); 

console.log("x outside function is " + x);
console.log("z outside function is " + z);
