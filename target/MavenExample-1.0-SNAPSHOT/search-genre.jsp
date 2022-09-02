<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Bucket List Movies: Search By Genre</title>
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
    <form action="SearchGenre" method="get">
      <label for="genre">Search by genre:</label>
      <input type="text" name="genre" id="genre">
      <input type="submit">
    </form>
  </div>
</div>
  </div>
<%@ include file="includes/footer.jsp"%>
</div>
</body>
</html>