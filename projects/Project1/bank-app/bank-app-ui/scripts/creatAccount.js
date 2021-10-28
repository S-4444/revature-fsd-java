let signup = document.getElementById("submit")
let firstName = document.getElementById("inputFirstName");
let lastName=document.getElementById("inputLastName");
let email = document.getElementById("inputEmail4");
let password = document.getElementById("inputPassword4");
let error = document.getElementById("error");
let emailError = document.getElementById("emailError");
let branchName= document.getElementById("inputState")
error.style.display="none";


console.log("good morning ")
let firstNameError = document.getElementById("firstNameError");
let valid = true;

signup.addEventListener("click", function () {
    

    if (firstName.value == "") {

        firstNameError.innerText = "First Or Last name is Required";
        valid = false;
    }
    if(lastName.value==""){
        firstNameError.innerText = "First Or Last name is Required";
        valid=false;
    }
    if(email.value==""){
        emailError.innerText = "Email or balance is Required";
        valid=false;
    }
    if(password.value==""){
        emailError.innerText = "Email or balance is Required";
        valid=false;
    }
    if (valid = true) {

        addCustomer();

    }
});

async function addCustomer() {

    let customer = {
        balance: password.value,
        first_name: firstName.value,
        last_name: lastName.value,
        branch: branchName.value,
        email: email.value,
      


    };
    var options = {
        method: 'POST',
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(customer)

    };
    try {
        let response = await fetch("http://localhost:8080/bank-app-rest/accounts", options);
        window.location.href = "View.html";
        alert("Account Create Sucessfully")
    } catch (err) {
       
        error.style.display = "block";
        error.innerText = "Sign-up failed. Retry or  Contact  administrator.";

    }

}
gridCheck.addEventListener("click", function() {
    console.log("Rai");
    valid = true ; 
})

firstName.addEventListener("keyup", function () {
    if (firstName.value != "" && firstName.value.length > 20) {

        firstNameError.innerText = "FirstName can't exced 20 charecters or null";
        valid = false;
    }
    if (firstName.value != "" && firstName.value.length <= 20) {

        firstNameError.innerText = "";
        valid = false;
    }
    if (firstName.value != "") {
        let pattern = /^[A-Za-z]+$/;

        if (!firstName.value.match(pattern)) {

            firstNameError.innerText = "Name should be numeric";
        }
        valid = false;
    }

})