<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "java.util.Date" %>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>名前を入力してください</h2>
        <form action="char8_greeting_out.jsp" method="post">
        <input type="text" name="user">
        <input type="submit" value="確定">
        </form>
<%@include file="footer.jsp" %>
