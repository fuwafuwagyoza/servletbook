<%@page contentType="text/html; charset=UTF-8" %>

<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>結果</h2>
        <% 
        try {
            request.setCharacterEncoding("UTF-8"); 
            int price = Integer.parseInt(request.getParameter("price"));
            int count = Integer.parseInt(request.getParameter("count"));
        %>
        <p><%=price %>×<%=count %>＝<%= count*price %></p>
        <% 
        } catch (Exception e) {
        %>
            <%-- メッセージの出力 --%>
            <p>数値を入力してください<p>
        <%
            out.println(e);
        }
        %>
<%@include file="footer.jsp" %>
