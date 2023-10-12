<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style ="background: OldLace">
<B>Amount to be paid : Rs 2,000/-</B>
<form action ="thanks.jsp">
<table>
<tr><td>Select payment method<select name ="Select payment method" >
<option>Credit card</option>
<option>Debit card</option>
<option>UPI</option>
<option>Internet Banking</option>
</select>
<tr><td>Payment Details</td><td><input type="text" name="Details"></td></tr>
<tr><td>Enter OTP</td><td><input type="text" name="OTP"></td></tr>
<tr><td></td><td><input type="submit" value="PAY"></td></tr>
</table>
</form>
</body>
</html>