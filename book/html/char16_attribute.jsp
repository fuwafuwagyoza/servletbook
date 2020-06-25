<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "bean.Product" %>

<%@include file="header.jsp" %>
<% Product product = (Product)request.getAttribute("product"); %>

        <p>取得したリクエスト属性</p>

        <%=product.getId() %>:<%=product.getName() %>:<%=product.getPrice() %><br>

<%@include file="footer.jsp" %>
