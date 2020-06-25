<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="header.jsp" %>
<jsp:useBean id="product" class="bean.Product" scope="request"  />
        <%-- メッセージの出力 --%>
        <h2>アクションタグテスト</h2>
        <p>
            <jsp:getProperty name="product" property="id" />
        <br>
            <jsp:getProperty name="product" property="name" />
        <br>
            <jsp:getProperty name="product" property="price" />
        </p>

<%@include file="footer.jsp" %>
