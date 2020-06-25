<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="header.jsp" %>
<%@page isErrorPage = "true" %>
        <%-- メッセージの出力 --%>
        <h2>数値を入力してください</h2>
        <%= exception %> 
<%@include file="footer.jsp" %>
