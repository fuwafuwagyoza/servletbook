<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "java.util.Date" %>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <p>スクリプトレットで乱数 =<% out.println(Math.random()); %></p>
        <p>式で乱数 =<%= Math.random() %></p>
<%@include file="footer.jsp" %>

