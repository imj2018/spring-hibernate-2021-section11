<%-- JSTL allow to loop through a collection --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>

<!DOCTYPE html>
<html>

<head>
<title>Employee Confirmation</title>
</head>

<body>

<%-- call employee.getFirstName and employee.getLastName --%>
The employee is confirmed: ${employee.firstName} ${employee.lastName}

<br><br>

Country: ${employee.country}

<br><br>

Favorite Language: ${employee.favoriteLanguage}

<br><br>

Operating Systems:

<%-- JSTL foreach loop, will call the get employee.getOperatingSystem and 
loop over --%>
<ul>
	<c:forEach var="item" items="${employee.operatingSystems}">
		<li> ${item} </li>
	</c:forEach>
</ul>


</body>
</html>