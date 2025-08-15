var Stack = /** @class */ (function () {
    function Stack() {
        this.items = [];
    }
    Stack.prototype.push = function (item) {
        this.items.push(item);
    };
    Stack.prototype.pop = function () {
        return this.items.pop();
    };
    Stack.prototype.peek = function () {
        return this.items[this.items.length - 1];
    };
    return Stack;
}());
var numberStack = new Stack();
numberStack.push(50);
numberStack.push(25);
numberStack.push(40);
console.log("Peek:", numberStack.peek());
console.log("Pop:", numberStack.pop());
console.log("Peek after pop:", numberStack.peek());
var stringStack = new Stack();
stringStack.push("Thar");
stringStack.push("Nexon");
console.log("Peek:", stringStack.peek());
console.log("Pop:", stringStack.pop());
console.log("Peek after pop:", stringStack.peek());
