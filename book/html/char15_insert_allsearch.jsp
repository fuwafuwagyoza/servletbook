<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "java.util.Date" %>

<%@include file="header.jsp" %>
        <p>追加する商品を入力してください。</p>
        <form action = "../char15/insert_allsearch" method = "post">
        商品 <input type = "text" name = "name"><br>
        価格 <input type = "text" name = "price">
        <input type = "submit" value = " 追加 ">
        </form>
<%@include file="footer.jsp" %>
