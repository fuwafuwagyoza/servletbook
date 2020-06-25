<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "java.util.Date" %>

<%!
int a = 0;
%>
<%
int b = 0;
a++;
b++;
%>


<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <p>hello!!</p>
        <p>こんちわ</p>
        <p><%= new Date() %></p>
        <p>a =<%= a %></p>
        <p>b =<%= b %></p>
<%@include file="footer.jsp" %>
