function noilin(){
	var name=document.getElementById("name").value;//jeswanth
	var age=document.getElementById("age").value;
	var email=document.getElementById("email").value;
	var password=document.getElementById("pwd").value;
	var confirm_password=document.getElementById("cpwd").value;
	if(name==""){
		alert("Please enter your name");
		return false;
	}
	else if(/*jes.length=8<=6*/name.length<=6){
		alert("Please enter your valid full name");
		return false;
	}
	else if(age<18){
		alert("Your not eligible to visit our website, when you get 18 years old you can visit again.");
		return false;
	}
	else if(age.length>3){
		alert("Enter your valid age");
		return false;
	}
	else if(password.length<=8){//8
		alert("Enter strong password");
		return false;
	}
	else if(confirm_password.length<=8){
		alert("Enter strong password");
		return false;
	}
	else if(password!=confirm_password){
		alert("Check Your password and reenter the password.");
		return false;
	}
	else{
		return true;
	}
}