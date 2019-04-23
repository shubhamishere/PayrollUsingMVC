<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>SEARCH EMPLOYEE</h2>
  <form action="Second" method="post">
    <div class="form-group">
      <label for="name">Enter employee email:</label>
      <input type="text" class="form-control" id="searchEmail" placeholder="Enter name" name="searchEmail">
    </div>
	
	<div class="form-group" id="extra-field"></div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>