<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Student Information</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body style="background-color: blue">
    <center>
        <br><br>
        <h2>Enter the Student Information</h2>
        <form action="file_1.jsp" method="post">
            <table>
                <tr> 
                    <td>Enter Name:</td>
                    <td>
                        <input type="text" name="name"/>
                    </td>
                </tr>
                 <tr> 
                     <td>Enter USN:</td>
                    <td>
                        <input type="text" name="usn"/>
                    </td>
                </tr>
                 <tr> 
                     <td>Enter Branch:</td>
                    <td>
                        <input type="text" name="branch"/>
                    </td>
                </tr>
                 <tr>
                     <td>Enter Email:</td>
                    <td>
                        <input type="email" name="email"/>
                    </td>
                </tr>
                 <tr>
                     <td>Enter Phone number:</td>
                    <td>
                        <input type="text" name="phone"/>
                    </td>
                </tr>
                 <tr>
                    
                    <td>
                        <input type="submit" value="submit"/>
                    </td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>




file 1

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
    </head>
    <body>
        <%@page language="java" import="java.beans.*" %>
                <jsp:useBean id="stud" class="program.studentBean" scope="request">
                    <jsp:setProperty name="stud" property="name"/>
                    <jsp:setProperty name="stud" property="usn"/>
                    <jsp:setProperty name="stud" property="branch"/>
                    <jsp:setProperty name="stud" property="email"/>
                    <jsp:setProperty name="stud" property="phone"/>
                </jsp:useBean> 
        <jsp:forward page="file_2.jsp"/>        
    </body>
</html>


file 2


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
    </head>
    <body>
    <center>
        <br><br>
        <br>
        <br>
        <b>STUDENT DETAILS RETRIEVED FROM STUDENT BEAN</b>
        <jsp:useBean id="stud" scope="session" class="program.studentBean" />
            <table>
                <tr>
                    <td>Student name:<jsp:getProperty name="stud" property="name"/></td>
                </tr>
                   <tr>
                    <td>Student USN:<jsp:getProperty name="stud" property="usn"/></td>
                </tr>
                   <tr>
                    <td>Student branch:<jsp:getProperty name="stud" property="branch"/></td>
                </tr>
                   <tr>
                    <td>Student Email:<jsp:getProperty name="stud" property="email"/></td>
                </tr>
                   <tr>
                    <td>Student Contact number<jsp:getProperty name="stud" property="phone"/></td>
                </tr>
            </table>
            
    </center>
    </body>
</html>


student bean

package program;

import java.io.Serializable;

/**
 *
 * @author mcacnj
 */
public class studentBean  implements Serializable{
    String name;
    String usn;
    String branch;
    String email;
    String phone;
    
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
        public String getusn(){
        return usn;
    }
    public void setusn(String usn){
        this.usn=usn;
    }
        public String getbranch(){
        return branch;
    }
    public void setbranch(String branch){
        this.branch=branch;
    }   
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
        public String getphone(){
        return phone;
    }
    public void setphone(String phone){
        this.phone=phone;
    }
}


