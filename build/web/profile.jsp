<%-- 
    Document   : profile
    Created on : May 15, 2020, 3:47:33 PM
    Author     : Kavindya Nirmani
--%>

<%@page import="hibernate.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Customer customer = (Customer) session.getAttribute("customer");
    if (customer != null) {

%>
<div class="">
    <div  class="profile-icon" style=" background-image: url('cus_pic/<%= customer.getCusImg()%>');"></div>
    <div class="login">
        <span><%= customer.getFname() + " " + customer.getLname()%>(<%= customer.getMobile()%>)</span>
        <br/>
        <span><%= customer.getEmail()%></span>
        <br/>
        <span><%= customer.getRating()%> &Star;</span>
    </div>
    <div>
        <button class="btn btn-outline-success btn-sm" onclick="signOut();">Sign Out</button>
    </div>
</div>

<%

} else {

%>
<div class="login">
    <span>E-mail</span>
    <br/>
    <input type="text" id="username"/>
    <br/>
    <span>Password</span>
    <br/>
    <input type="password" id="password"/>
    <br/><br/>
    <div class="ml-auto mr-auto">
        <button class="btn btn-outline-success btn-sm mr-auto" onclick="signIn();">Sign In</button>
        <button class="btn btn-outline-primary btn-sm ml-auto" onclick="forgetPassword();">Forget Password</button>

        <button class="btn btn-outline-info btn-sm ml-auto" onclick="signUp();">Create new account</button>
    </div>
</div>
<%    }
%>
