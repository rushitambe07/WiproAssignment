var empList = [
    { name: "Shubham Bhoite", role: "Manager", empId: 101, salary: 50000 },
    { name: "Sham Machale", role: "Developer", empId: 102, salary: 60000 },
    { name: "Tejas Jadhav", role: "Manager", empId: 103, salary: 80000 },
    { name: "Mayur Bankar", role: "QA", empId: 104, salary: 70000 },
    { name: "Prashant Shendage", role: "Manager", empId: 105, salary: 90000 }
];


let totalSalary = empList.filter(emp => emp.role == "Manager").reduce((acc, emp) => acc + emp.salary, 0);

console.log("Total Salary of Managers:", totalSalary);
