<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "java.util.Date" %>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>名前を入力してください</h2>
        <form action="char8_total_out.jsp" method="post">
        <input type="text" name="price">
        円×
        <input type="text" name="count">
        個＝
        <input type="submit" value="計算">
        </form>
        <h2>名前を入力してください(例外処理記述)</h2>
        <form action="char8_total_out_script.jsp" method="post">
        <input type="text" name="price">
        円×
        <input type="text" name="count">
        個＝
        <input type="submit" value="計算(例外処理記述)">
        </form>
<%@include file="footer.jsp" %>
