class Calculator {
    add(a: number, b: number): number {
        return a + b;
    }

    subtract(a: number, b: number): number {
        return a - b;
    }
}

let calc = new Calculator();
console.log("Addition:", calc.add(5, 5));
console.log("Subtraction:", calc.subtract(15, 10));
