class Stack<T> {
    private items: T[] = [];

    push(item: T): void {
        this.items.push(item);
    }

    pop(): T | undefined {
        return this.items.pop();
    }

    peek(): T | undefined {
        return this.items[this.items.length - 1];
    }
}

let numberStack = new Stack<number>();
numberStack.push(50);
numberStack.push(25);
numberStack.push(40);

console.log("Peek:", numberStack.peek()); 
console.log("Pop:", numberStack.pop());   
console.log("Peek after pop:", numberStack.peek());

let stringStack = new Stack<string>();
stringStack.push("Thar");
stringStack.push("Nexon");

console.log("Peek:", stringStack.peek()); 
console.log("Pop:", stringStack.pop());   
console.log("Peek after pop:", stringStack.peek()); 
