

<% String mName =request.getMethod();
    if(mName.equals("GET")){
   %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

 

td
{
background:color:pink;
color:blue;}
</style>
</head>
<body>
<form action="Calculator.jsp" method=POST>
<table align=center cellpadding = 20px border = 5>
<tr>
<td colspan="2" align=center bgcolor=pink>CALCULATOR</td>
</tr>
<tr>
<td>Enter FirstNumber</td><td><input type="text" name="Fno"></td></tr>
<tr><td>Enter SecondNumber</td><td><input type="text" name="Sno"></td></tr>
<tr>
<td colspan="2" align=center>
<input type=submit value="Add" name="Mohan" style=color:red;background-color:skyblue;><hr>
<input type=submit value="Sub" name="Mohan" style=color:orange;background-color:grey><hr>
<input type=submit value="Mul" name="Mohan" style=color:blue;background-color:red;><hr>
<input type=submit value="Div" name="Mohan" style=color:green;background-color:blue;></td>
</tr>
</table>
</form>
</body>
</html>
<%  }
    else {
          double Fno=Double.parseDouble(request.getParameter("Fno"));
          double Sno=Double.parseDouble(request.getParameter("Sno"));
          String bName=request.getParameter("Mohan");
if(bName.equalsIgnoreCase("Add")){
out.println("SUM= ="+(Fno+Sno));
}
else if(bName.equalsIgnoreCase("Sub")){
out.println("Sub="+(Fno-Sno));
}
else if(bName.equalsIgnoreCase("Mul")){
out.println("Mul="+(Fno*Sno));
}
else if(bName.equalsIgnoreCase("Div")){
out.println("Div="+(Fno/Sno));

}
    }
%>