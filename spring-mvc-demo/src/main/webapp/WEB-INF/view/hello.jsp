<!DOCTYPE html>

<html>


<body>

Hello Spring!

<br><br>

<%-- can read form field data with ${param. form field name}--%>
Student name: ${param.studentName}

<br><br>

<%-- access attribute from the model i.e model.addAttribute("message", result); --%>
The message: ${message}

</body>

</html>