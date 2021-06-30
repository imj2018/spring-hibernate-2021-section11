<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title> Employee Contract Form </title>
</head>

<body>
 
 	<%-- spring mvc form tags form:form and form:input --%>
 	<%-- model attribute must match the attribute name given in controller "employee" i.e 
 	model.addAttribute("employee", employee); --%> 
 	<form:form action="processForm" modelAttribute="employee">
 	
 	<%-- property of Employee class, spring mvc will call employee.getFirstName 
 	behind the scences --%>
 	First name: <form:input path="firstName" />
 	
 	<br><br>
 	
 	First name: <form:input path="firstName" />
 	
 	<br><br>
 	
 	<%-- when submitted the setters are called student.setFirstName for whatever
 	 is passed in the fields by the user --%>
 	<input type="submit" value="Submit" />
 	
 	</form:form>
 	
 	
</body>

</html>

