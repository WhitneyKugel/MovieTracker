<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Bucket List Movies: Search</title>
  <%@ include file="includes/header.jsp"%>
</head>
<div id="page-container">
  <div id="content-wrap">
<div class="container">
  <%@ include file="includes/navigation.jsp"%>
  <div class="container">
    <form action="SearchTitle" method="get">
      <label for="title">Search by title:</label>
      <input type="text" name="title" id="title">
      <input type="submit">
    </form>
  </div>
  <div class="container">
    <form action="SearchGenre" method="get">
      <label for="genre">Search by genre:</label>
      <input type="text" name="genre" id="genre">
      <input type="submit">
    </form>
  </div>
  <div class="container">
    <form action="SearchDirector" method="get">
      <label for="director">Search by director:</label>
      <input type="text" name="director" id="director">
      <input type="submit">
    </form>
  </div>
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