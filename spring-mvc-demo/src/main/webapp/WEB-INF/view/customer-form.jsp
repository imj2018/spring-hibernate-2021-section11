<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Registration Form</title>
		<%-- maps to cssClass="error" for lastName--%>
	<style>
		.error {color:red})
	</style>
</head>

<body>

<i>Fill out the form. Asterik (*) means required.</i>

<br><br>
	
	<form:form action="processForm" modelAttribute="customer">
	
	
		First name: <form:input path="firstName" />
	
		<br><br>
	
		Last name (*): <form:input path="lastName" />
		<%-- @NotNull(message = "is required") --%>
		<form:errors path="lastName" cssClass="error" />
	
		<br><br>
	
	
		<input type="submit" value="Submit" />
	
	</form:form>

</body>

</html>