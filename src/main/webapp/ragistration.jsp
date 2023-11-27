<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sing up</title>
<style type="text/css">
h1{
color:white;
text-align: center;
height:50px;
width: 300px;
background-color: #0f1111;
margin: 0px;
border: 8px solid #cbd6cf; 

}
div{
border: 8px solid #e0bc07; 
background-color: url("https://images.unsplash.com/photo-1633174524827-db00a6b7bc74?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YW1hem9ufGVufDB8fDB8fHwy");
height:320px;
width:300px;
}
body{
padding-left:550px;
padding-top:140px;
text-align: center;
background-image: url("https://images.unsplash.com/photo-1633174524827-db00a6b7bc74?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YW1hem9ufGVufDB8fDB8fHwy");
color:white;
}
p{
padding-top:0;
font-size: 20px;
}
input{
background-color: #edf7f7;
}

</style>
</head>
<body>
<h1>Sign up Here..</h1>
<div>
<p>Amazon.in<p/>
	<form action="regform" method="post">
		Name : <input type="text" placeholder=" Enter your name" name="name1" /> <br> <br /> 
		Email : <input	type="text" placeholder="Enter your Email" name="email1" /> <br> <br /> 
	    Password : <input type="password" placeholder="Enter your password" name="pass1" /> <br> <br /> 
		Gender : <input	type="radio" name="gender1" value="male" /> Male <input type="radio" name="gender1" value="female" />female<br> <br />
		 City : <select	name="city1">
			<option>Select city</option>
			<option>Delhi</option>
			<option>Mumbai</option>
			<option>Pune</option>
			<option>Odisha</option>
			<option>Utarpradesh</option>
			<option>banglore</option>
		</select><br> <br />
		 <input type="submit" value="Register" />
	</form>
	<form action="login.jsp" method="post">
	<input type="submit" value="Login" />
	</form>
</div>
</body>
</html>