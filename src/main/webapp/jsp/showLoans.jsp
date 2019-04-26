<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; ISO-8859-1"
         pageEncoding="iso-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
th, td, table {
 border: 2px solid black;
 padding: 0px;
}
</style>
    <meta http-equiv="Content-Type" content="text/html"; charset=iso-8859-1>
    <title>Show Loans</title>
</head>
<body>
<h1>List of Loans</h1>
<table>
    <tr>
        <th>Loan ID</th>
        <th>Customer ID</th>
        <th>Customer Name</th>
        <th>Book title</th>
        <th>Author</th>
        <th>Due date</th>
    </tr>
    <tr>
    <c:forEach items="${loans}" var="loan">
        <tr>
            <td>${loan.lid}</td>
            <td>${loan.cust.cId}</td>
            <td>${loan.cust.cName}</td>
            <td>${loan.book.title}</td>
            <td>${loan.book.author}</td>
            <td>${loan.dueDate}</td>
        </tr>
    </c:forEach>
    </tr>
</table>

<a href="/">Home</a>
<a href="/showBooks">List Books</a>
<a href="/showCustomers">List Customers</a>
<a href="/showLoans">List Loans</a>
<a href="/">Delete Loan</a>

</body>
</html>