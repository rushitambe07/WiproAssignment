var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    Calculator.prototype.subtract = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
var calc = new Calculator();
console.log("Addition:", calc.add(5, 5));
console.log("Subtraction:", calc.subtract(15, 10));
