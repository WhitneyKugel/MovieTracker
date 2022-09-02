<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="description"
        content="This is a servlet example that demonstrates how to use IO to output the contents of an excel spreadsheet to a webpage.">
  <title>Bucket List Movies: Home</title>
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
        <h1>Welcome and thanks for joining!</h1>
      </div>
      <div class="container">
        <div class="trailerBox">
          <div class="topRow">
            <div class="topLight" id="topLight1"></div>
            <div class="topLight" id="topLight2"></div>
            <div class="topLight" id="topLight3"></div>
            <div class="topLight" id="topLight4"></div>
            <div class="topLight" id="topLight5"></div>
          </div>
          <div class="leftColumn">
            <div class="lightLeft" id="leftLight1"></div>
            <div class="lightLeft" id="leftLight2"></div>
            <div class="lightLeft" id="leftLight3"></div>
            <div class="lightLeft" id="leftLight4"></div>
            <div class="lightLeft" id="leftLight5"></div>
            <div class="lightLeft" id="leftLight6"></div>
          </div>
          <iframe class="trailer" src="https://www.youtube.com/embed/Mw91RJ_m_7g">
          </iframe>
          <div class="rightColumn">
            <div class="lightRight" id="rightLight1"></div>
            <div class="lightRight" id="rightLight2"></div>
            <div class="lightRight" id="rightLight3"></div>
            <div class="lightRight" id="rightLight4"></div>
            <div class="lightRight" id="rightLight5"></div>
            <div class="lightRight" id="rightLight6"></div>
          </div>
          <div class="bottomRow">
            <div class="bottomLight" id="bottomLight1"></div>
            <div class="bottomLight" id="bottomLight2"></div>
            <div class="bottomLight" id="bottomLight3"></div>
            <div class="bottomLight" id="bottomLight4"></div>
            <div class="bottomLight" id="bottomLight5"></div>
          </div>
        </div>
        <hr>
      </div>
    </div>
  </div>
  <%@ include file="includes/footer.jsp"%>
</div>
</body>
</html>