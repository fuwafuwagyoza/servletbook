<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>EL式テスト</h2>
        <p>
            ${product.id}
        <br>
            ${product.name}
        <br>
            ${product.price}
        </p>
        <p>${Math.random() > 0.5 ? "あたり" : "はずれ"}</p>

<%@include file="footer.jsp" %>
