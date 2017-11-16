<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

  <meta charset="UTF-8">

  <title>Login</title>
<link href="css/css1.css" rel="stylesheet" type="text/css"/>
<link href="boostrap/css/logincss.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">

</head>



  
  

  <body>

    <div class="container">

      <div id="login">

        <form action="Servlet_Usu" method="post" id="frmLogin">

          <fieldset class="clearfix">

            <p><span class="fontawesome-user"></span><input type="text" name="txtUsuario" value="Usuario" placeholder="Ingrese usuario" id="txtUsuario"     onBlur="if(this.value == '') this.value = 'Usuario'" onFocus="if(this.value == 'Usuario') this.value = ''" required></p> <!-- JS because of IE support; better: placeholder="Username" -->
            <p><span class="fontawesome-lock"></span><input type="password" name="txtClave" value="txtClave" placeholder="Ingrese contraseña" id="txtClave"     onBlur="if(this.value == '') this.value = 'txtClave'" onFocus="if(this.value == 'txtClave') this.value = ''" required></p> <!-- JS because of IE support; better: placeholder="Password" -->
            <p><input type="submit" name="btnIngresar" value="Ingresar" id="btnIngresar"></p>

          </fieldset>
       <input type="hidden" name="accion" value="login">
        </form>

        <p> <a href="RegistrarCliente.jsp">Registrese Aqui</a><span class="fontawesome-arrow-right"></span></p>

      </div> <!-- end login -->

    </div>

  </body>
</html>


<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/Login.js"></script>
        <link type="text/css" rel="stylesheet" href="css/css1.css" />
        <title>Login</title>
    </head>
    
    <body>
        
        
       <!-- <div>
            <form method="post" action="Servlet_Usu" id="frmLogin">
                <table id="tablaLogin">
                    <tr>
                        <th>
                            <h1>Login</h1>
                        </th>
                    </tr>
                    <tr>
                        <td>
                            <input type="text" name="txtUsuario" placeholder="Ingrese usuario" id="txtUsuario" class="textBox">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="password" name="txtClave" placeholder="Ingrese contraseÃ±a" id="txtClave" class="textBox">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="button" name="btnIngresar" value="Ingresar" id="btnIngresar" >
                        </td>
                    </tr>
                    <tr>
                        <td class="centrarBoton">
                            <a href="RegistrarCliente.jsp" id="lnkRegistrarUsuario"><h4>Registrate aqui</h4></a>
                        </td>
                    </tr>
                </table>
                    <input type="hidden" name="accion" value="login">
            </form>
        </div>
    </body>
</html>-->
