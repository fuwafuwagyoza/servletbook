<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="header.jsp" %>
        <%-- メッセージの出力 --%>
        <h2>EL式テスト（コレクションクラス、配列、リクエストパラメータ）</h2>
        <p>
            ${test.mp["1"]}
        <br>
            ${test.mp["2"]}
        <br>
            ${test.mp["3"]}
        <br>
            ${test.mp["4"]}
        </p>

        <p>
            ${test.array[1]}
        <br>
            ${test.array[2]}
        <br>
            ${test.array[3]}
        <br>
            ${test.array[4]}
        </p>

        <p>
            ${param["unko"]}
            <br>
            ${param.price}×${param.count}＝${param.price*param.count}
        </p>

<%@include file="footer.jsp" %>
