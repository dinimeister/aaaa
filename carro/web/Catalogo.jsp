<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="Clase.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/Catalogo.js"></script>
        <link href="boostrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link type="text/css" rel="stylesheet" href="css/css1.css" />

        <script src="boostrap/js/bootstrap.min.js" type="text/javascript"></script>
        <title>Catalogo</title>

    </head>

    <body onload="cargar()">

        <%
            String codigo = (String) session.getAttribute("parametroCodigo");

            Usuario usu = Usuario_DB.listarUsuarioPorCodigo(codigo);
            String cliente = usu.getNombreUsuario() + ", " + usu.getApellidosUsuario();
        %>

        <form action="Servlet_Usu" method="post" id="frmCabecera">
            <input type="hidden" value="<%=usu.getTipoUsuario()%>" name="txtTipo" id="txtTipo">

            <nav  class="navbar navbar-inverse navbar-fixed-top">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <img src="Imagen/logo cluxer3.png" alt="" height="50" width="120">
                    </div>
                    <ul class="nav navbar-nav">
                        <li><a href="RegistrarVenta.jsp" id="lnkCompra">Mi compra</a></li>
                        <li><a href="CuentaAdministrador.jsp" id="lnkAdm">Administrar</a></li>
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="MiPerfil.jsp?codigoU=<%=usu.getCodigoUsuario()%>" id="lnkPerfil"><span class="glyphicon glyphicon-user"></span> mi Perfil</a></li>
                        <li><a href="Login.jsp" id="lnkLogin" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                        <li><a href="Servlet_Usu?accion=logout" id="lnkLogout" ><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
                    </ul>
                </div>
            </nav>
           <input type="hidden" name="accion" value="logout">
        </form>
        <hr>

        <form id="frmCatalogo">

            <table width="800" id="tablaCatalogo">
                <tr>
                    <th colspan="3">
                        <h1 style="text-align: center;"> Catalogo de productos </h1>
                    </th>
                </tr>

                <tbody>
                    <%
                        ArrayList<Producto> lista = Producto_DB.obtenerProductosHabilitados();
                        int salto = 0;
                        for (int i = 0; i < lista.size(); i++) {
                            Producto p = lista.get(i);
                    %>

                <th ><img align="center" src="Imagen/<%=p.getImagenP()%>" width="100" height="100"><br>
                    <%=p.getClaseProducto()%> <%=p.getMarcaProducto()%> <br>
                    <%=p.getDescripcion()%><br>
                    $<%=p.getPrecioP()%>.-<br>
                    <button type="button" class="btn btn-warning BotonModificar" name="btnModificar" value="Modificar" onclick="location.href = 'ModificarProducto.jsp?codigoP=<%=p.getCodigoP()%>'">Modificar</button>
                    <button type="button" class="btn btn-success BotonADD" name="btnADD" value="ADD Carrito" onclick="location.href = 'AnadirCarrito.jsp?codigoP=<%=p.getCodigoP()%>&&cliente=<%=cliente%>'" >ADD carro</button><br>

                </th>
                <%
                    salto++;
                    if (salto == 3) {
                %>

                <tr>

                    <%
                                salto = 0;
                            }
                        }
                    %>
                    </tbody>
            </table>
        </form>  
    </body>
</html>
