<%@page contentType="text/html; charset=UTF-8" %>
<%@page import = "bean.Product, java.util.List" %>

<%@include file="header.jsp" %>
<% List<Product> list = (List<Product>)request.getAttribute("productList"); %>

        <p>取得したリクエスト属性</p>
<% for (Product product : list) { %>
        <%=product.getId() %>:<%=product.getName() %>:<%=product.getPrice() %><br>
<% } %>

<%@include file="footer.jsp" %>
