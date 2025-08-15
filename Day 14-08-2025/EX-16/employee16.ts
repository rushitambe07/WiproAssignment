interface Employee {
    empId: number;
    empName: string;
    salary: number;
}
function printEmployees(employees: Employee[]): number {
    employees.forEach(emp => {
        console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    });
    return employees.length;
}

let employeeList: Employee[] = [
    { empId:1, empName: "Shubham", salary: 20000 },
    { empId: 2, empName: "Sham", salary: 40000 },
    { empId: 3, empName: "Tejas", salary: 15000 }
];

let count = printEmployees(employeeList);
console.log("Total Employees:", count);
