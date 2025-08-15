class Util {
    // a) Get today's date in dd-mm-YYYY format
    getDate() {
    let today = new Date();
    let day = today.getDate();
    let month = today.getMonth() + 1; 
    let year = today.getFullYear();
    return day + "-" + month + "-" + year;
    }

    // b) Get value of PI
    getPIValue() {
        return Math.PI;
    }

    // c) Convert Centigrade to Fahrenheit
    convertC2F(celsius) {
        return (celsius * 9/5) + 32;
    }

    // d) Get first n elements of Fibonacci series
    getFibonacci(n) {
        let fib = [0, 1];
        for (let i = 2; i < n; i++) {
            fib.push(fib[i - 1] + fib[i - 2]);
        }
        return fib;
    }
}


let util = new Util();

console.log("Date:", util.getDate()); 
console.log("PI Value:", util.getPIValue()); 
console.log("25°C in Fahrenheit:", util.convertC2F(25)); 
console.log("First 5 Fibonacci numbers:", util.getFibonacci(2)); 
