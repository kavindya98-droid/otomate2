<%-- 
    Document   : sign_up
    Created on : May 17, 2020, 12:11:27 PM
    Author     : Kavindya Nirmani
--%>

<%@page import="hibernate.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="login">
    <img id="i" class="profile-icon" src="homepage_img/user.png"/>
    <br/>
    <input class="f" name="f" type="file" id="f" onchange="viewFile();"/>
    <label for="f" class="l">Upload Profile Picture</label>
    <br/>
    <span>E-mail</span>
    <br/>
    <input type="text" id="username" name="username"/>
    <br/>
    <span>First Name</span>
    <br/>
    <input type="text" id="fname" name="fname"/>
    <br/>
    <span>Last Name</span>
    <br/>
    <input type="text" id="lname" name="lname"/>
    <br/>
    <span>Mobile</span>
    <br/>
    <input type="text" id="mobile" name="mobile"/>
    <br/>
    <span>Password</span>
    <br/>
    <input type="password" id="password" name="password"/>
    <br/><br/>
    <div class="ml-auto mr-auto">
        <button class="btn btn-outline-success btn-sm mr-auto" onclick="uploadImg();">Sign Up</button>
        <button class="btn btn-outline-danger btn-sm ml-auto" onclick="checkSignIn();">Cancel</button>
    </div>
    </div>

