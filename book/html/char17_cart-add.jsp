<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "java.util.Date" %>

<%@include file="header.jsp" %>
        <p>カートに追加する商品を入力してください。</p>
        <form action = "../char17/cart-add" method = "post">
        商品<input type = "text" name = "name"><br>
        価格<input type = "text" name = "price"><br>
        <input type = "submit" value = " 追加 ">
        </form>
<%@include file="footer.jsp" %>
