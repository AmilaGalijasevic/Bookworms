<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>BookWorms</title>

<!-- Bootstrap Core CSS -->
<link href="CSS\bootstrap.min.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>

<!-- Theme CSS -->
<link href="CSS\agency.min.css" rel="stylesheet">
<link href="CSS\style.css" rel="stylesheet">

</head>

<body id="page-top" class="index">

	<!-- Navigation -->
	<nav id="mainNav"
		class="navbar navbar-default navbar-custom navbar-fixed-top">
	<div class="container">
		
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> Menu <i
					class="fa fa-bars"></i>
			</button>
			<a class="navbar-brand page-scroll" href="#page-top">BookWorms</a>
		</div>

		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden"><a href="#page-top"></a></li>
				<li><a class="page-scrol" href="#login">LOG IN</a></li>
				<li><a class="page-scrol" href="#signup">SIGN UP</a></li>
				<li><a class="page-scrol" href="#about">ABOUT</a></li>
				<li><a class="page-scrol" href="#contact">CONTACT</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>

	<!-- Header -->
	<header>
	<div class="container">
		<div class="intro-text">
			<div class="intro-lead-in">Book Lovers Unite!</div>
			<div class="intro-heading">Read with us</div>
			<a href="#login" class="page-scroll btn btn-xl">Share your
				favorite books</a>
		</div>
	</div>
	</header>

	<section id="login">
	<form class="form-horizontal" id="LogInServlet" action="LogInServlet"
		method="post">
		<div class="container">
			<div class="form">
				<input type="text" name="email" class="zocial-dribbble"
					placeholder="Enter your email" /> <input type="password"
					name="password" placeholder="Password" /> <input type="submit"
					value="Log In" />
			</div>
		</div>
	</form>
	</section>


	<section id="signup">
	<form class="formm-horizontal" id="SignUpServlet" action="SignUpServlet"
		method="post">
		<div class="container">

			<div class="formSignUp">
				<input type="text" class="zocial-dribbble" name="name" placeholder="Enter your name" /> 
				<input type="text" class="zocial-dribbble" name="lastname" placeholder="Enter your lastname" /> 
				<input type="text" class="zocial-dribbble" name = "email" placeholder="Enter your email" /> 
				<input type="password" name = "password" placeholder="Enter your password" /> 
				<input type="text" class="zocial-dribbble" name= "sex" placeholder="Enter your sex" /> 
				<input type="text" class="zocial-dribbble" name= "address" placeholder="Enter your address" /> 
				<input type="text" class="zocial-dribbble" name = "phone"placeholder="Enter your phone number" /> 
				<input type="submit" value="Sign Up" />


			</div>
		</div>

	</form>
	</section>
	
	<section id="about">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading">About</h2>
				<h3 class="section-subheading text-muted">Bringing book lovers
					together</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<ul class="timeline">
					<li>
						<div class="tiimeline-image">
							<img class="img-circle img-responsive"
								src="http://nre15.educacao.ba.gov.br/wp-content/uploads/2016/05/livros-tumblr.jpg"
								alt="them books">
						</div>
						<div class="timeline-panel">
							<div class="timeline-heading">

								<h4 class="subheading">Our Mission</h4>
							</div>
							<div class="timeline-body">
								<p class="text-muted">Our mission is to bring book lovers
									and bookworms together so they could share their favorite
									books. Ever read a book that totally rocked your world? Well now
									you can share it with people who also had their world shaken!
									Rate and recommend books to other people or just enjoy the
									company of people like you. We hope that you will find our site
									enjoyable and that you would recommend it to other booklovers.</p>
							</div>
						</div>
					</li>
					</ul>
			</div>
		</div>
		</div>
		<br>
		<br>
	</section>
	<section id="contact">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading">Contact Us</h2>
				<a href="http://www.facebook.com" id="face">Check out our
					facebook page. </br> LIKE & SHARE!
				</a>
			</div>
		</div>
	</div>
	</section>
</body>
</html>
