<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "java.util.Date" %>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>金額、個数、送料を入力してください</h2>
        <form action="char8_totaltest_out.jsp" method="post">
        <input type="text" name="price">
        円×
        <input type="text" name="count">
        個×
        <input type="text" name="delivery">
        送料＝
        <input type="submit" value="計算">
        </form>
<%@include file="footer.jsp" %>
