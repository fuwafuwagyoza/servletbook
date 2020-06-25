<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="header.jsp" %>
<%@page errorPage = "char8_total-error.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>結果</h2>
        <% 
        request.setCharacterEncoding("UTF-8"); 
        int price = Integer.parseInt(request.getParameter("price"));
        int count = Integer.parseInt(request.getParameter("count"));
        %>
        <p><%=price %>×<%=count %>＝<%= count*price %></p>
<%@include file="footer.jsp" %>
