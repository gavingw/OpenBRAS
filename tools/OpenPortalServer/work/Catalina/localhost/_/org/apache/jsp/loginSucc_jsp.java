/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2015-02-10 15:32:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class loginSucc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');

String portalPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/";
String radiusPath = request.getScheme()+"://"+request.getServerName()+":"+1817+"/login";

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\"/>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("    <title>用户登录成功</title>\n");
      out.write("    <meta http-equiv=\"pragma\" content=\"no-cache\"/>\n");
      out.write("    <meta http-equiv=\"cache-control\" content=\"no-cache\"/>\n");
      out.write("    <meta http-equiv=\"expires\" content=\"0\"/>\n");
      out.write("    <meta http-equiv=\"keywords\" content=\"Open Portal\"/>\n");
      out.write("    <meta http-equiv=\"description\" content=\"Open Portal info\"/>\n");
      out.write("    <link type=\"text/css\" href=\"css/index.css\" rel=\"stylesheet\" />\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function _submit() {\n");
      out.write("\t/*\n");
      out.write("\t1. 得到img元素\n");
      out.write("\t2. 修改其src为/day11_3/VerifyCodeServlet\n");
      out.write("\t*/\n");
      out.write("\tdocument.getElementById(\"msg\").innerHTML = \"正在请求认证，请稍等....\";\n");
      out.write("\tdocument.getElementById(\"loginoffSubmit\").disabled=true;\n");
      out.write("\treturn true;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write(" ");

    String username=(String)session.getAttribute("username");
    String password=(String)session.getAttribute("password");
    String ip=(String)session.getAttribute("ip");
    String message="";
    String msg=(String)request.getAttribute("msg");
    if(msg!=null){
    	message=msg;
    }
    
    if(username==null){
    	request.setAttribute("msg", "您还没有登录，请先登录！");
    	request.getRequestDispatcher("/index.jsp").forward(request, response);
    	return;
    }
    else{
    
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"page-content\">\n");
      out.write("        <div id=\"login-page\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"");
      out.print(basePath);
      out.write("\"><img alt=\"LaterThis\" src=\"images/logo.png\" /></a>\n");
      out.write("            </div>\n");
      out.write("           <form id=\"loginForm\" action=\"");
      out.print(path);
      out.write("/LoginOut\" method=\"post\"  onsubmit=\"_submit()\">\n");
      out.write("              <div id=\"success-login\">\n");
      out.write("              <p>\n");
      out.write("                        <label style=\"text-align: center ;\"><font color=\"red\"><b id=\"msg\">");
      out.print(message);
      out.write("</b></font></label> <br/>\n");
      out.write("                    </p>\n");
      out.write("\t\t\t        <p>\n");
      out.write("\t\t\t          <label>您已登录成功，可以连接网络，请不要关闭该窗口！！欢迎您：</label><span id=\"success-user\" class=\"id-note\"><font color=\"red\"><b>");
      out.print(username);
      out.write("</b></font></span>\n");
      out.write("\t\t\t          <br/>\n");
      out.write("\t\t\t           <label>IP地址：</LABEL><span id=\"success-user\" class=\"id-note\"><font color=\"red\"><b>");
      out.print(ip);
      out.write("</b></font></span>\n");
      out.write("\t\t\t           <br/>\n");
      out.write("\t\t\t        </p>\n");
      out.write("\t\t\t        <p>\n");
      out.write("\t\t\t          <input id=\"loginoffSubmit\" class=\"button\" type=\"submit\" value=\"退出\" name=\"logoff\" />  \n");
      out.write("\t\t\t        </p>\n");
      out.write("\t\t\t      </div>\n");
      out.write("              </form>\n");
      out.write("              <form id=\"Form\" action=\"");
      out.print(radiusPath);
      out.write("\" method=\"post\" target=\"_blank\">\n");
      out.write("              <div id=\"success-login\">\n");
      out.write("              <p>\n");
      out.write("               <input name=\"username\" type=\"hidden\" value=\"");
      out.print(username);
      out.write("\" />\n");
      out.write("               <input name=\"password\" type=\"hidden\" value=\"");
      out.print(password);
      out.write("\" />\n");
      out.write("\t\t\t          <input id=\"submit\" class=\"button\" type=\"submit\" value=\"点击查询用户信息\" name=\"submit\" />  \n");
      out.write("\t\t\t        </p>\n");
      out.write("\t\t\t      </div>\n");
      out.write("              </form>\n");
      out.write("                <p id=\"signup\">\n");
      out.write("                   Copyright &copy; 2014 - 2015 <a href=\"");
      out.print(basePath);
      out.write("\">OpenPortal Server-李硕</a>.  All Rights Reserved.\n");
      out.write("               </p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
} 
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
