<%-- 
    Document   : saludoJSP
    Created on : 21 sept. 2022, 17:16:13
    Author     : bauti
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Saludos desde JSP</h1>
        <p>Chicos y chicas, hoy es  <%= new Date()%> </p>
        <p> <%=   5500 * 1000%> </p>

        <% Enumeration<String> headers = request.getHeaderNames();
            Enumeration e = request.getHeaderNames();
            int c = 0;
            while (e.hasMoreElements()) {
                c++;
                String name = (String) e.nextElement();
                String value = request.getHeader(name);%>
        <p>( <%= c%> + "---" + <%= name%> + " = " + <%= value%> );  </p>
        <% }
        %>
        <% ArrayList<String> headersRespuesta = (ArrayList<String>) response.getHeaderNames();
            int j = 0;
            for (String string : headersRespuesta) {%>
                    <p>( <%= j%> + "---" + <%= string%>);  </p>
        <% }
        %>

        <a href="index.html"> Regeresar al index</a>
    </body>
</html>
