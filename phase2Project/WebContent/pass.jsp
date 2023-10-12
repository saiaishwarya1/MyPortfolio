<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style ="background: OldLace">
<h1>Welcome Admin</h1>
<br><br><B>Enter details</B>
<form action ="srch" method ="post">
<table>
<tr><td>Date of Travel   <select name ="Day" >
<option>01</option>
<option>02</option>
<option>03</option>
<option>04</option>
<option>05</option>
<option>06</option>
<option>07</option>
<option>08</option>
<option>09</option>
<option>10</option>
<option>11</option>
<option>12</option>
<option>13</option>
<option>14</option>
<option>15</option>
<option>16</option>
<option>17</option>
<option>18</option>
<option>19</option>
<option>20</option>
<option>21</option>
<option>22</option>
<option>23</option>
<option>24</option>
<option>25</option>
<option>26</option>
<option>27</option>
<option>28</option>
<option>29</option>
<option>30</option>
<option>31</option>
</select>
<select name ="Month">
<option>Jan</option>
<option>Feb</option>
<option>Mar</option>
<option>Apr</option>
<option>May</option>
<option>June</option>
<option>Jul</option>
<option>Aug</option>
<option>Spt</option>
<option>Oct</option>
<option>Nov</option>
<option>Dec</option>
</select>
<select name = "Year">
<option>2021</option>
<option>2022</option>
</select></tr></td>

<tr><td>Source City</td><td><input type="text" name="source"></td></tr>
<tr><td>Destination City</td><td><input type="text" name="destination"></td></tr>
<tr><td>Number of person</td><td><input type="text" name="person"></td></tr>
<tr><td></td><td><input type="submit" value="Search flights"></td></tr>
</table>
</form>

<br><br><B>Change password</B>
<form method=post action ="changed.jsp" >
<table>
<tr><td>Old password </td><td><input type="password" ></td></tr>
<tr><td>New password</td><td><input type="password" ></td></tr>
<tr><td></td><td><input type="submit" value="change"></td></tr>
</table>
</form>
</body>
</html>