<div  style=background-color:blue;color:white><%="WELCOME" %></div>
<%!
   java.time.LocalDate ld=java.time.LocalDate.now();
int a=10,b=20;
   %>
<br/>
<%=new  java.util.Date() %>
<p/>
<%=ld %>
</p>
<%="SUM =" +(a+b)%>
  <hr/>
<% for( int i=1;i<=5;i++) {
	%>
	<h1 style=color:blue><%="Welcome"%><br></h1>
	<% }
%>