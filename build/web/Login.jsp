<%-- 
    Document   : Login
    Created on : May 14, 2022, 4:03:39 PM
    Author     : Pisano
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Log In</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
body {
	color: #434343;
	background: #dfe7e9;
	font-family: 'Varela Round', sans-serif;
}
.form-control {
	font-size: 16px;
	transition: all 0.4s;
	box-shadow: none;
}
.form-control:focus {
	border-color: #5cb85c;
}
.form-control, .btn {
	border-radius: 50px;
	outline: none !important;
}
.signin-form {
	width: 400px;
	margin: 0 auto;
	padding: 30px 0;
}
.signin-form form {
	border-radius: 5px;
	margin-bottom: 20px;
	background: #fff;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 40px;
}
.signin-form a {
	color: white;
}    
.signin-form h2 {
	text-align: center;
	font-size: 34px;
	margin: 10px 0 15px;
}
.signin-form .hint-text {
	color: #999;
	text-align: center;
	margin-bottom: 20px;
}
.signin-form .form-group {
	margin-bottom: 20px;
}
.signin-form .btn {        
	font-size: 18px;
	line-height: 26px;        
	font-weight: bold;
	text-align: center;
}
.signin-form .small {
	font-size: 13px;
}
.signin-btn {
	text-align: center;
	border-color: #5cb85c;
	transition: all 0.4s;
}
.signin-btn:hover {
	background: #5cb85c;
	opacity: 0.8;
}
.or-seperator {
	margin: 50px 0 15px;
	text-align: center;
	border-top: 1px solid #e0e0e0;
}
.or-seperator b {
	padding: 0 10px;
	width: 40px;
	height: 40px;
	font-size: 16px;
	text-align: center;
	line-height: 40px;
	background: #fff;
	display: inline-block;
	border: 1px solid #e0e0e0;
	border-radius: 50%;
	position: relative;
	top: -22px;
	z-index: 1;
}
.social-btn .btn {
	color: #fff;
	margin: 10px 0 0 30px;
	font-size: 15px;
	width: 55px;
	height: 55px;
	line-height: 45px;
	border-radius: 50%;
	font-weight: normal;
	text-align: center;
	border: none;
	transition: all 0.4s;
}	
.social-btn .btn:first-child {
	margin-left: 0;
}
.social-btn .btn:hover {
	opacity: 0.8;
}
.social-btn .btn-primary {
	background: #507cc0;
}
.social-btn .btn-info {
	background: #64ccf1;
}
.social-btn .btn-danger {
	background: #df4930;
}
.social-btn .btn i {
	font-size: 20px;
}
.content-style {
    text-align: center;
    color: red;
}
</style>
</head>
<body>  
<div class="signin-form" id="logreg-forms">
    <form class="form-signin" action="login" method="post">
		<h2>Log in</h2>
        <p class="hint-text">Log in with your social media account</p>
		<div class="social-btn text-center">
			<a href="#" class="btn btn-primary btn-lg" title="Facebook"><i class="fa fa-facebook"></i></a>
			<a href="#" class="btn btn-info btn-lg" title="Twitter"><i class="fa fa-twitter"></i></a>
			<a href="#" class="btn btn-danger btn-lg" title="Google"><i class="fa fa-google"></i></a>
		</div>
		<div class="or-seperator"><b>or</b></div>
                <p class="content-style" class="text-danger">${mess}</p>
                <p class="content-style" class="text-danger">${mess1}</p>
        <div class="form-group">
        	<input type="text" class="form-control input-lg" name="user" id="inputEmail" autofocus="" placeholder="Username" required="required">
        </div>
		<div class="form-group">
            <input type="password" class="form-control input-lg" name="pass" id="inputPassword" placeholder="Password" required="required">
        </div>  
        <div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block signin-btn">Sign in</button>
               <button type="submit" class="btn btn-success btn-lg btn-block signin-btn"><a  href="Register.jsp">Sign up New Account</a></button>
            
        </div>
<!--        <div class="text-center small"><a href="#">Forgot Your password?</a></div>
          <div class="text-center small">Don't have an account? <a href="#">Sign up</a></div-->
    </form>
</div>
</body>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            function toggleResetPswd(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle() // display:block or none
                $('#logreg-forms .form-reset').toggle() // display:block or none
            }

            function toggleSignUp(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle(); // display:block or none
                $('#logreg-forms .form-signup').toggle(); // display:block or none
            }

            $(() => {
                // Login Register Form
                $('#logreg-forms #forgot_pswd').click(toggleResetPswd);
                $('#logreg-forms #cancel_reset').click(toggleResetPswd);
                $('#logreg-forms #btn-signup').click(toggleSignUp);
                $('#logreg-forms #cancel_signup').click(toggleSignUp);
            })
        </script>
    </body>
</html>
