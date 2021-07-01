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
 	
 	<%-- binding (data binding) property of Employee class, spring mvc will call employee.getFirstName 
 	behind the scences --%>
 	First name: <form:input path="firstName" />
 	
 	<br><br>
 	
 	First name: <form:input path="lastName" />
 	
 	<br><br>
 	
 	Country:
 	
 	<br><br>
 	<%-- bind to the country property, somehow binds via form:select to the selected country 
 	from countryOptions collection (LinkedHashMap) for result i.e Country: NAM --%>
 	<form:select path="country">
 	
 		<%-- set fields --%>	
 		<%--  form:options not form:option to return the collection 
 		with employee.getCountryOptions  --%>
 		<form:options items="${employee.countryOptions}" />	 	
 	
 	</form:select>
 	
 	<br><br>
 	
 	Favorite Language:
 	
 	<%-- bind to property, call setter for favorite language--%>
 	Java <form:radiobutton path="favoriteLanguage" value="Java" />
 	C# <form:radiobutton path="favoriteLanguage" value="C#" />
 	PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
 	Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" /> 	
 	
 	<br><br>
 	
 	
 	<%-- when submitted the setters are called employee.setFirstName etc for whatever
 	 is passed in the fields by the user --%>
 	<input type="submit" value="Submit" />
 	
 	</form:form>
 	
 	
</body>

</html>

