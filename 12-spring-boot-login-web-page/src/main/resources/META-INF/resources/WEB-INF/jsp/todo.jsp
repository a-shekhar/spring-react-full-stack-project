<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
	<head>
	<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css", rel="stylesheet">
		<title>Add Todo Page</title>
	</head>
	<body>
		<div class="container">
			<h1>Enter Todo Details</h1>
			<form method="post">
			Description: <input type="text" name="description">
			<input type = "submit" class="btn btn-success">
		</div>
		<script src="webjars/jquery/3.7.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</body>
</html>