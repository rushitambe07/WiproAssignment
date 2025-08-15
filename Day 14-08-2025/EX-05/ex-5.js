class Vehicle {
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    getInfo() {
        return this.year + " " + this.make + " " + this.model;
    }
}

class Car extends Vehicle {
    constructor(make, model, year, numDoors) {
        super(make, model, year); 
        this.numDoors = numDoors;
    }

    getInfo() {
        return this.year + " " + this.make + " " + this.model + " - " + this.numDoors + " doors";
    }
}

let myCar = new Car("Mahindra", "Thar", 2024, 2);
console.log(myCar.getInfo()); 