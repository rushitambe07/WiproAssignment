function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

let result1 = pair<number, string>(101, "Milind");
let result2 = pair<string, boolean>("Hello", true);
let result3 = pair<number, number>(5, 10);

console.log(result1); 
console.log(result2); 
console.log(result3); 
