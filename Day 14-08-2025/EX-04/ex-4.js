class BankAccount {
    constructor(accountNumber, balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    deposit(amount) {
        this.balance += amount;
        console.log(`Deposited: ${amount}. New Balance: ${this.balance}`);
    }

    withdraw(amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            console.log(`Withdrawn: ${amount}. New Balance: ${this.balance}`);
        } else {
            console.log("Insufficient balance!");
        }
    }
}

let acc = new BankAccount(12345, 2000);
acc.deposit(400);    
acc.withdraw(500);   
acc.withdraw(2000);  
