class Box<T> {
    value: T;

    constructor(value: T) {
        this.value = value;
    }

    getValue(): T {
        return this.value;
    }
}

let numberBox = new Box<number>(667);
let stringBox = new Box<string>("Ram Ram");
let booleanBox = new Box<boolean>(true);

console.log("Number Box:", numberBox.getValue());
console.log("String Box:", stringBox.getValue());
console.log("Boolean Box:", booleanBox.getValue());
