function sumNumbers(...nums) {
    return nums.reduce((sum, n) => sum + n, 0);
}

console.log(sumNumbers(1, 2, 3));        
console.log(sumNumbers(5, 10, 15, 10)); 
