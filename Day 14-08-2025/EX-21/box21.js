var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var numberBox = new Box(667);
var stringBox = new Box("Ram Ram");
var booleanBox = new Box(true);
console.log("Number Box:", numberBox.getValue());
console.log("String Box:", stringBox.getValue());
console.log("Boolean Box:", booleanBox.getValue());
