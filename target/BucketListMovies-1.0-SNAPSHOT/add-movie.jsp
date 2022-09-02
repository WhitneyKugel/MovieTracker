<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Bucket List Movies: Add New Movie</title>
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

          <p>${message}</p>

          <div id="newMovie">

            <div class="container" id="leftNewMovie">
              <form action="AddNewMovie" method="post">
                <label for="title">Title:</label>
                <input type="text" name="title" id="title">

                <label for="plot">Plot:</label>
                <input type="text" name="plot" id="plot">

                <label for="director">Director:</label>
                <input type="text" name="director" id="director">

                <label for="lengthInMinutes">Length in minutes:</label>
                <input type="text" name="lengthInMinutes" id="lengthInMinutes">

                <label for="yearReleased">Year Released:</label>
                <input type="text" name="yearReleased" id="yearReleased">

                <label for="rating">Rating:</label>
                <input type="text" name="rating" id="rating">

                <label for="genre">Genre:</label>
                <input type="text" name="genre" id="genre">

                <label for="trailer">YouTube Trailer Link:</label>
                <input type="text" name="trailer" id="trailer">

                <br>

                <input type="submit">
              </form>
            </div>

            <div id="rightNewMovie">
              <p>
                Catalog your favorite movies, movie bucket list, or store your current library in the system. For a
                robust catalog, ensure that all fields are entered properly.
                <iframe src="https://www.youtube.com/embed/Mw91RJ_m_7g" id="smallVideo">
                </iframe>
              </p>
            </div>

          </div>

        </div>
      </div>
      <%@ include file="includes/footer.jsp"%>
    </div>
  </body>
</html>