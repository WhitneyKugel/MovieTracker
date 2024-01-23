<html>
  <head>
    <title>Bucket List Movies: Internal Server Error</title>
    <%@ include file="includes/header.jsp"%>
  </head>
  <body>
    <%@ include file="includes/navigation.jsp"%>
    <h1>Houston, we have a problem.</h1>
    <h2>Error Details:</h2>
    <p>Type ${pageContext.exception["class"]}</p>
    <%@ include file="includes/footer.jsp"%>
  </body>
</html>
