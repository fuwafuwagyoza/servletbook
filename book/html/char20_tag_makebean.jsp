<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="header.jsp" %>
<jsp:useBean id="product" class="bean.Product" scope="request"  />
<jsp:setProperty name="product" property="id" value="14" />
<jsp:setProperty name="product" property="name" value="タングステン" />
<jsp:setProperty name="product" property="price" value="2121" />
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
