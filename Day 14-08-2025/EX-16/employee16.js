function printEmployees(employees) {
    employees.forEach(function (emp) {
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    });
    return employees.length;
}
var employeeList = [
    { empId: 1, empName: "Shubham", salary: 20000 },
    { empId: 2, empName: "Sham", salary: 40000 },
    { empId: 3, empName: "Tejas", salary: 15000 }
];
var count = printEmployees(employeeList);
console.log("Total Employees:", count);
