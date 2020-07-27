<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>検索ワードを入力してください</h2>
        <form action="../char15/search" method="post">
        <input type="text" name="word">
        <input type="submit" value="検索ぅ！">
        </form>
<%@include file="footer.jsp" %>
