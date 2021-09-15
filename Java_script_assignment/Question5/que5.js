// part 1
var employees = [
  {name: "saurabh", age: 30, DOB: new Date(1990, 12, 15), salary: 900},
  {name: "raj", age: 40, DOB: new Date(1980, 8, 27), salary: 6000},
  {name: "abhi", age: 50, DOB: new Date(1970, 6, 2), salary: 4000},
  {name: "Raju", age: 40, DOB: new Date(1980, 5, 13), salary: 3000}
];
console.log(employees);

// part 2
var richEmployees = employees.filter(function (emp) {
  return emp.salary > 5000;
});
console.log(richEmployees);

// part 3
const groups = employees.reduce((groups, item) => {
  const age = (groups[item.age] || []);
  age.push(item);
  groups[item.age] = age;
  return groups;
}, {});
console.log(groups);


// part 4
var newEmployeesSalary = {};
for (let i = 0; i < employees.length; i++) 
{
  if (employees[i].salary < 1000 && employees[i].age > 20) 
  {
  newEmployeesSalary.name = employees[i].name;
  newEmployeesSalary.age = employees[i].age;
  newEmployeesSalary.DOB = employees[i].DOB;
  newEmployeesSalary.salary = 5*(employees[i].salary);
 }
}
console.log(newEmployeesSalary);