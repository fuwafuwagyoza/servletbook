<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>検索ワードを入力してください</h2>
        <form action="../char14/search_2" method="post">
        <input type="text" name="price">以下の商品を
        <input type="submit" value="検索">
        </form>
<%@include file="footer.jsp" %>
