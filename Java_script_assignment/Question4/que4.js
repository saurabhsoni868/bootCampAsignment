
var myObject = {
  "name": "saurabh",
  "last_name": "soni"
};

console.log("Original object: ")
console.log(myObject);
document.getElementById("original-object").innerHTML = myObject.name + ", " + myObject.last_name;

var myObjectCopy = {};

for (var key in myObject) {
  myObjectCopy[key] = myObject[key];
}

console.log("Copied object: ");
console.log(myObjectCopy);
document.getElementById("copied-object").innerHTML = myObjectCopy.name + ", " + myObjectCopy.last_name;