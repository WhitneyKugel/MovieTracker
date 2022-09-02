<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Bucket List Movies: Search By Year</title>
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

  <div class="container">
    <form action="SearchYear" method="get">
      <label for="yearReleased">Search by year:</label>
      <input type="text" name="yearReleased" id="yearReleased">
      <input type="submit">
    </form>

  </div>
</div>
  </div>
  <%@ include file="includes/footer.jsp"%>
</div>
</body>
</html>