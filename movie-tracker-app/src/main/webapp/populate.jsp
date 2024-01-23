<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Bucket List Movies: Populate DB</title>
    <%@ include file="includes/header.jsp"%>
  </head>
  <body>
    <div id="page-container">
      <div id="content-wrap">
        <div class="container">
          <%@ include file="includes/navigation.jsp"%>
          <p>WARNING: This action will over-write the existing database.</p>
          <div class="container">
            <form action="Populate" method="post">
              <input type="submit" value="Populate DB">
            </form>
          </div>
          <p>${message}</p>
        </div>
      </div>
      <%@ include file="includes/footer.jsp"%>
    </div>

  </body>
</html>