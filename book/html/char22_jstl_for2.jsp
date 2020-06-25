<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="header.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="i" begin="1" end="9">
    ${i}<br>
</c:forEach>

<%@include file="footer.jsp" %>
