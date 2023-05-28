<%-- 
    Document   : add
    Created on : May 27, 2023, 12:14:06 PM
    Author     : Elpepe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Agregar persona</h1>
            <form action="Controlador">
                ID:<br>
                <input type="text" name="txtDni">
                <br>
                Nombres:<br>
                <input type="text" name="txtNom">
                <input type="submit" name="accion" value="Agregar"><br>
            </form>
        </div>
    </body>
</html>
