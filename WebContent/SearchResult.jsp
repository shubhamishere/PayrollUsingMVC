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
  <h2>Search Results</h2>
  <p></p>            
  <table class="table">
    <thead>
      <tr>
        <th>Fullname</th>
        <th>Email</th>
        <th>Employee Type</th>
        <th>Worked Hours</th>
        <th>Sale Amount</th>
        <th>Payable Salary</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><%= (String)request.getAttribute("fullName") %></td>
        <td><%= (String)request.getAttribute("email") %></td>
        <td>john@example.com</td>
        <td>Doe</td>
        <td>john@example.com</td>
        <td>Doe</td>
      </tr>
      <tr>
        <td>Mary</td>
        <td>Moe</td>
        <td>mary@example.com</td>
        <td>Doe</td>
        <td>john@example.com</td>
        <td>Doe</td>
      </tr>
      <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>july@example.com</td><td>Doe</td>
        <td>john@example.com</td>
        <td>Doe</td>
      </tr>
    </tbody>
  </table>
</div>

</body>
</html>
