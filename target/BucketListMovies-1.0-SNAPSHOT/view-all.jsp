<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Bucket List Movies</title>
  <%@ include file="includes/header.jsp" %>
</head>
<body>
<div id="page-container">
  <div id="content-wrap">
    <div class="container">
      <%@ include file="includes/navigation.jsp" %>

      <div class="container">
        <c:choose>
          <c:when test="${empty movies}">
            <p>Sorry, the list of movies was empty.</p>
          </c:when>
          <c:otherwise>
            <c:forEach var="movie" items="${movies}">
              <div class="poster-Box">

                <div class="title-header">
                  <h2>${movie.title} (${movie.yearReleased})</h2>
                  <p>Directed by: ${movie.director}</p>
                  <p>${movie.rating} | ${movie.lengthInMinutes} min | ${movie.genre}</p>
                </div>
                <br>
                <p class="plot">${movie.plot}</p>

                <img class="poster" src="./assets/img/${movie.trailer}" alt="${movie.title} poster">
              </div>
              <hr>
            </c:forEach>
          </c:otherwise>
        </c:choose>
      </div>
    </div>
  </div>
  <%@ include file="includes/footer.jsp" %>
</div>
</body>
</html>
