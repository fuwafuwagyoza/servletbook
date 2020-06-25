<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <p>hello!!</p>
        <p>こんちわ</p>
        <p><% out.println(new java.util.Date()); %></p>
<%@include file="footer.jsp" %>
