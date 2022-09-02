<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Bucket List Movies: Log In</title>
  <%@ include file="includes/header.jsp"%>
</head>
<body>
<div id="page-container">
  <div id="content-wrap">
    <div class="container">
      <div class="hero-unit">
        <h1><span class="flicker-fast">Bucket</span> List <span class="flicker-slow">Movies</span></h1>
      </div>

      <%@ include file="includes/navigation.jsp"%>

      <div id="logIn">

        <div  id="logIntoAccount">
          <h3>Already registered? Log in!</h3>

          <form action="Login" method="post">
            <label for="email-login">Email:</label>
            <input type="text" name="email-login" id="email-login">

            <label for="password-login">Password:</label>
            <input type="password" name="password-login" id="password-login">
            <br>
            <br>
            <input type="submit" value="Log In">
          </form>
        </div>

        <div id="createAccount">
          <h3>Create new user</h3>
          <p>${message}</p>

          <form action="AddNewUser" method="post">

            <label for="firstName">First Name</label>
            <input type="text" name="firstName" id="firstName">

            <label for="lastName">Last Name</label>
            <input type="text" name="lastName" id="lastName">

            <label for="email">Email:</label>
            <input type="text" name="email" id="email">

            <label for="password">Password:</label>
            <input type="password" name="password" id="password">

<%--            <label for="confirm-password">Confirm Password:</label>--%>
<%--            <input type="password" name="confirm-password" id="confirm-password">--%>
            <br>
            <br>
            <input type="submit" value="Create Account">
          </form>
        </div>

      </div>

    </div>
  </div>
  <%@ include file="includes/footer.jsp"%>
</div>
</body>
</html>