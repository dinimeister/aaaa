package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Clase.*;

public final class Catalogo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/Catalogo.js\"></script>\n");
      out.write("        <link href=\"boostrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/css1.css\" />\n");
      out.write("\n");
      out.write("        <script src=\"boostrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Catalogo</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body onload=\"cargar()\">\n");
      out.write("\n");
      out.write("        ");

            String codigo = (String) session.getAttribute("parametroCodigo");

            Usuario usu = Usuario_DB.listarUsuarioPorCodigo(codigo);
            String cliente = usu.getNombreUsuario() + ", " + usu.getApellidosUsuario();
        
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"Servlet_Usu\" method=\"post\" id=\"frmCabecera\">\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(usu.getTipoUsuario());
      out.write("\" name=\"txtTipo\" id=\"txtTipo\">\n");
      out.write("\n");
      out.write("            <nav  class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <img src=\"Imagen/logo cluxer3.png\" alt=\"\" height=\"50\" width=\"120\">\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"RegistrarVenta.jsp\" id=\"lnkCompra\">Mi compra</a></li>\n");
      out.write("                        <li><a href=\"CuentaAdministrador.jsp\" id=\"lnkAdm\">Administrar</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"MiPerfil.jsp?codigoU=");
      out.print(usu.getCodigoUsuario());
      out.write("\" id=\"lnkPerfil\"><span class=\"glyphicon glyphicon-user\"></span> mi Perfil</a></li>\n");
      out.write("                        <li><a href=\"Login.jsp\" id=\"lnkLogin\" ><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("                        <li><a href=\"Servlet_Usu?accion=logout\" id=\"lnkLogout\" ><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("           <input type=\"hidden\" name=\"accion\" value=\"logout\">\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <form id=\"frmCatalogo\">\n");
      out.write("\n");
      out.write("            <table width=\"800\" id=\"tablaCatalogo\">\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"3\">\n");
      out.write("                        <h1 style=\"text-align: center;\"> Catalogo de productos </h1>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        ArrayList<Producto> lista = Producto_DB.obtenerProductosHabilitados();
                        int salto = 0;
                        for (int i = 0; i < lista.size(); i++) {
                            Producto p = lista.get(i);
                    
      out.write("\n");
      out.write("\n");
      out.write("                <th ><img align=\"center\" src=\"Imagen/");
      out.print(p.getImagenP());
      out.write("\" width=\"100\" height=\"100\"><br>\n");
      out.write("                    ");
      out.print(p.getClaseProducto());
      out.write(' ');
      out.print(p.getMarcaProducto());
      out.write(" <br>\n");
      out.write("                    ");
      out.print(p.getDescripcion());
      out.write("<br>\n");
      out.write("                    $");
      out.print(p.getPrecioP());
      out.write(".-<br>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning BotonModificar\" name=\"btnModificar\" value=\"Modificar\" onclick=\"location.href = 'ModificarProducto.jsp?codigoP=");
      out.print(p.getCodigoP());
      out.write("'\">Modificar</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-success BotonADD\" name=\"btnADD\" value=\"ADD Carrito\" onclick=\"location.href = 'AnadirCarrito.jsp?codigoP=");
      out.print(p.getCodigoP());
      out.write("&&cliente=");
      out.print(cliente);
      out.write("'\" >ADD carro</button><br>\n");
      out.write("\n");
      out.write("                </th>\n");
      out.write("                ");

                    salto++;
                    if (salto == 3) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    ");

                                salto = 0;
                            }
                        }
                    
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
