<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; ISO-8859-1"
	pageEncoding="iso-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
th, td, table {
	border: 2px solid black;
	padding: 0px;
}
</style>
<meta http-equiv="Content-Type" content="text/html" ; charset=iso-8859-1>
<title>Show Customers</title>
</head>
<body>

	<h1>Customers</h1>
	<c:forEach items="${customers}" var="c">
		<h2>${c.cId}${c.cName}</h2>
         Loan Period: ${c.loanPeriod}
                      
                      
        <h3>${c.cName}'s Loan</h3>
        
		<table>
			<tr>
				<th>Loan ID</th>
				<th>Book ID</th>
				<th>Title</th>
				<th>Author</th>
			</tr>
			
			<c:forEach items="${c.loans}" var="loan">
			<tr>
				<th>${loan.lid}</th>
				<th>${loan.book.bid}</th>
				<th>${loan.book.title}</th>
				<th>${loan.book.author}</th>
				</c:forEach>
			</tr>
		</table>
	</c:forEach>


	<a href="/">Home</a>
	<a href="/addBook">Add Book</a>
	<a href="showCustomers">List Customers</a>
	<a href="showLoans">List Loans</a>

</body>
</html>