/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-07-15 13:53:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.front;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class center_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- ");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" -->\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/font.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/css/css/xadmin.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/static/js/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/static/js/xadmin.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .wrap {\r\n");
      out.write("            width: 1000px;\r\n");
      out.write("            height: 60px;\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("            margin-right: auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header_top {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 60px;\r\n");
      out.write("            padding-top: 20px;\r\n");
      out.write("            background-color: #fefefe;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header_bottom {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            background-color: red;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 150px;\r\n");
      out.write("            background-color: #fefefe;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .middle {\r\n");
      out.write("            width: 700px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            line-height: 50px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .middle li {\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .middle li a {\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #first {\r\n");
      out.write("            margin-left: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .right {\r\n");
      out.write("            float: right;\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            /* background-color: rgb(187, 175, 175); */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .right img {\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            width: 30px;\r\n");
      out.write("            margin-top: 6px;\r\n");
      out.write("            border-radius: 50%;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            color: blanchedalmond;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login {\r\n");
      out.write("            line-height: 40px;\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .zhuce {\r\n");
      out.write("            line-height: 50px;\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .wrap1 {\r\n");
      out.write("            width: 1000px;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("            margin-right: auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        section {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 950px;\r\n");
      out.write("            background-color: rgb(255, 245, 245);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .tuijian {\r\n");
      out.write("            width: 1000px;\r\n");
      out.write("            height: 400px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("            margin-right: auto;\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .zhanweifu {\r\n");
      out.write("            height: 1px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .tuijian_top {\r\n");
      out.write("            width: 960px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("            margin-right: auto;\r\n");
      out.write("            line-height: 50px;\r\n");
      out.write("            border-bottom: 1px solid black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .context {\r\n");
      out.write("            width: 800px;\r\n");
      out.write("            height: 300px;\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("            margin-right: auto;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .neirong li {\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            color: #aca9a9;\r\n");
      out.write("            margin-left: 10px;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .tupian {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 130px;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .wenzi {\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            height: 130px;\r\n");
      out.write("            margin-left: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        img {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 130px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .wenzi p {\r\n");
      out.write("            margin-top: 14px;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            background-color: #ffebee\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .last {\r\n");
      out.write("            width: 800px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("            margin-right: auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .last ul li {\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .shuru {\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 100px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #inp {\r\n");
      out.write("            outline: none;\r\n");
      out.write("            padding: 0 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .shuru input {\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 300px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            border: 1px solid red;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .shuru button {\r\n");
      out.write("            width: 50px;\r\n");
      out.write("            height: 35px;\r\n");
      out.write("            margin-top: 8px;\r\n");
      out.write("            margin-left: 5px;\r\n");
      out.write("            background-color: red;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .logo {\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .logo a {\r\n");
      out.write("            display: block;\r\n");
      out.write("            width: 190px;\r\n");
      out.write("            height: 60px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .logo a img {\r\n");
      out.write("            width: 190px;\r\n");
      out.write("            height: 60px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .right ul {\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            /* border: 1px solid #000; */\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .right ul li {\r\n");
      out.write("            width: 110px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            padding: 0 20px;\r\n");
      out.write("            line-height: 40px;\r\n");
      out.write("            background: #ffffff;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .right ul li:hover {\r\n");
      out.write("            background: #dad8d8;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .right ul li:hover a {\r\n");
      out.write("            color: rgb(255, 255, 255);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .right ul li a {\r\n");
      out.write("            color: rgb(124, 124, 123);\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"header_top\">\r\n");
      out.write("            <div class=\"wrap\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <!-- <a href=\"/shiduPage\">\r\n");
      out.write("                    <img src=\"/static/images/logo.a180d.png\" />\r\n");
      out.write("                </a> -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"shuru\">\r\n");
      out.write("                    <input type=\"text\" id=\"inp\">\r\n");
      out.write("                    <button>搜索</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"right\">\r\n");
      out.write("                    <ul id=\"personal\" onmouseover=\"show()\" onmouseout=\"yingcang()\">\r\n");
      out.write("                        <li style=\"display: flex; justify-content: space-between;\">\r\n");
      out.write("                            <img src=\"images/touxiang.png\" alt=\"\">\r\n");
      out.write("                            <a href=\"\">aaaaa</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li style=\"text-align:right;line-height: 40px\">\r\n");
      out.write("                            <a onclick=\"x_admin_show('编辑','information.html',600,400)\" href=\"javascript:;\">修改个人信息</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li style=\"text-align:right;line-height: 40px\">\r\n");
      out.write("                            <a href=\"mymoney.html\">我的钱包</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header_bottom\">\r\n");
      out.write("            <div class=\"wrap1\">\r\n");
      out.write("                <ul class=\"middle\">\r\n");
      out.write("                    <li id=\"first\"><a href=\"#\">全部分类</a></li>\r\n");
      out.write("                    <li><a href=\"#\">排行榜</a></li>\r\n");
      out.write("                    <li><a href=\"#\">免费</a></li>\r\n");
      out.write("                    <li><a href=\"#\">玄幻仙侠</a></li>\r\n");
      out.write("                    <li><a href=\"#\">轻小说</a></li>\r\n");
      out.write("                    <li><a href=\"#\">古代</a></li>\r\n");
      out.write("                    <li><a href=\"#\">现言</a></li>\r\n");
      out.write("                    <li><a href=\"#\">完本</a></li>\r\n");
      out.write("                    <li><a href=\"#\">青春</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    <section>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"zhanweifu\"></div>\r\n");
      out.write("        <div class=\"tuijian\">\r\n");
      out.write("            <div class=\"tuijian_top\">\r\n");
      out.write("                <h3>我的信息</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"context\">\r\n");
      out.write("                <ul class=\"neirong\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span>用户名：</span>\r\n");
      out.write("                        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reader.readerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span>性别：</span>\r\n");
      out.write("                        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reader.readerSex}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span>邮箱：</span>\r\n");
      out.write("                        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reader.readerEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span>电话：</span>\r\n");
      out.write("                        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reader.readerPhone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span>余额：</span>\r\n");
      out.write("                        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reader.balance}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <span>注册时间：</span>\r\n");
      out.write("                        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reader.readerAddTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"last\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\">关于我们</a></li>\r\n");
      out.write("                <li><a href=\"#\">联系我们</a></li>\r\n");
      out.write("                <li><a href=\"#\">帮助中心</a></li>\r\n");
      out.write("                <li><a href=\"#\">客服中心</a></li>\r\n");
      out.write("                <li><a href=\"#\">加入我们</a></li>\r\n");
      out.write("                <li><a href=\"#\">作家专区</a></li>\r\n");
      out.write("                <li><a href=\"#\">动漫频道</a></li>\r\n");
      out.write("                <li><a href=\"#\">游戏专区</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("    var personal = document.querySelector(\"#personal\");\r\n");
      out.write("    console.dir(personal)\r\n");
      out.write("    function show() {\r\n");
      out.write("        personal.style = \"overflow: visible;\"\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    function yingcang() {\r\n");
      out.write("        personal.style = \"overflow: hidden;\"\r\n");
      out.write("        // console.log(11111)\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
