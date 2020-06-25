<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "java.util.Date" %>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>結果</h2>
        <% request.setCharacterEncoding("UTF-8"); %>
        <p>こんにちは<% out.println(request.getParameter("user")); %>さん</p>
<%@include file="footer.jsp" %>
