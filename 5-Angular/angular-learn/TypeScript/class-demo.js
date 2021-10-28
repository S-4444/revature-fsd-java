import {Gender , age , someFunction} from "./gender.js"

var male = new Gender(1, "Male");
male.display();
console.log(male);
console.log(male.id);
console.log(male.name);

var female = new Gender(2, "Female");
female.display();

console.log(someFunction());
console.log(age);
