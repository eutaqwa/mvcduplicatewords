<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.esa.basic.services.DuplicationRemoverServices" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h1>
		<font size='7' face='Century,Arial' color='green'>TABLE</font>
	</h1>
	<hr>
	<table border='1' cellpadding='24' cellspacing='3'>
		<tbody>
			<tr bgcolor='silver'>
				<td><center>NO</center></td>
				<td><center>Input</center></td>
				<td><center>Output</center></td>
				<td><center>Tanggal</center></td>
				<td><center>Kata Berulang</center></td>
			</tr>
			<tr>
				<td>1</td>
				<td><c:out value="${model.input}"></c:out></td>
				<td><c:out value="${model.output}"></c:out></td>
				<td><c:out value="${model.processedDate}"></c:out></td>
				<td><c:out value="${model.result}"></c:out></td>
			</tr>
		</tbody>
	</table>

</body>
</html>