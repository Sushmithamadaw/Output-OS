index.html


<html>
    <head>
        <title>Using jsp include and forward action</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <form action="front.jsp">
                <b>Operand 1:</b>
                <input type="text" name="field1" />
                <br>
                <br>
                <b>Operand 2:</b>
                <input type="text" name="field2" />
                <br>
                <br>
                <input type="submit" name="submit" value="add"/>
                <input type="submit" name="submit" value="sub"/>
            </form>
        </div>
    </body>
</html>


add.jsp

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adding 2 values</title>
    </head>
    <body>
        <h1>Adding 2 values</h1>
        <%
            int f1=Integer.parseInt(request.getParameter("field1"));
            int f2=Integer.parseInt(request.getParameter("field2"));
            int sum=f1+f2;
        %>
        <jsp:forward page="/result.jsp">
            <jsp:param name="result" value="<%=sum%>"/>
        </jsp:forward>
    <body        
</html>

sub.jsp

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subtracting 2 values</title>
    </head>
    <body>
        <h1>Subtracting 2 values<</h1>
        <% 
            int f1=Integer.parseInt(request.getParameter("field1"));
            int f2=Integer.parseInt(request.getParameter("field2"));
            int diff=f1-f2;
        %>
        <jsp:forward page="/result.jsp">
            <jsp:param name="result" value="<%=diff%>"/>
        </jsp:forward>
        
    </body>
</html>



result.jsp


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h1>Result</h1>
        <%=request.getParameter("result")%><br>
        <b>Use of Include Tag</b>
        <jsp:include page="page1.jsp">
            <jsp:param name="fname" value="MCA"/>
            <jsp:param name="lname" value="VCET"/>
            <jsp:param name="addr" value="Puttur"/>     
        </jsp:include>
    </body>
</html>


front.jsp

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page for get form values</title>
    </head>
    <body>
        <h1>Welcome to Vivekananda College of Engineering and technology</h1>
        <% String s1=request.getParameter("field1");
          String s2=request.getParameter("field2");
          Integer.parseInt(s1);
          Integer.parseInt(s2);
          String submit=request.getParameter("submit");
          if(submit.equals("add")){
              %>
              <jsp:forward page="/add.jsp"/>
              <%
                }
            else if(submit.equals("sub"))
            {
              %>
              <jsp:forward page="/sub.jsp"/>
             <%}
                %>

              
          }
          </body>
</html>


page1.jsp

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP include Page</title>
    </head>
    <body>
        <h1>JSP include</h1>
        First Name:<%=request.getParameter("fname")%><br>
        Last Name:<%=request.getParameter("lname")%><br>
        Address:<%=request.getParameter("addr")%><br>
        
                
    </body>
</html>

