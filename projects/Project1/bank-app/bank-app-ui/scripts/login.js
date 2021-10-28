let submit = document.getElementById("submit");
let error = document.getElementById("error");
let emailid= document.getElementById("email");
let passwordid = document.getElementById("password");
error.style.display="none";

submit.addEventListener("click" , function() { checkLogin()});

async function checkLogin(){

    
   let email = emailid.value;
   let password = passwordid.value;

   try{
       let response = await fetch("http://localhost:8080/bank-app-rest/customers/" + email+"/"+password);

       if(response.status==200){
           console.log("sucess");
           window.location.href="View.html";
           alert("Login Sucessfully  please click 'ok' ");
       }
       else if(response.status=="401"){
           console.log("failed");
           error.style.display="block";
           error.innerText="Enter correct Email or password";
       }
       else if (response.staus=="404"){
        error.style.display="block";
        error.innerText="Enter correct Email or password";
       }


   }
    catch(err){
    error.style.display="block";
    error.innerText="Server is facing some issue please try again later";
   }
}