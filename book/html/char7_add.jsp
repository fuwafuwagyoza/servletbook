<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "java.util.Date" %>

<%!
int add (int a, int b) {
    return a + b;
}
%>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <p>hello!!</p>
        <p>こんちわ</p>
        <p><%= new Date() %></p>
        <p>1 + 3 =<%= add(1, 3) %></p>
        <p>21 + 33 =<%= add(21, 33) %></p>
<%@include file="footer.jsp" %>
