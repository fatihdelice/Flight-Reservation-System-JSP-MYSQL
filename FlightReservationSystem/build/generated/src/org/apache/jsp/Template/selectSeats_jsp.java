package org.apache.jsp.Template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class selectSeats_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link type=\"image/png\" rel=\"icon\" size=\"512x512\" href=\"../Assets/flighticon.png\"> \r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.3.1/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("            \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/css/userpanelstyle.css\"> \r\n");
      out.write("            <link rel=\"stylesheet\" href=\"../Assets/css/seats.css\"> \r\n");
      out.write("    <title>DeliceJet</title>\r\n");
      out.write("    \r\n");
      out.write("    <style>\r\n");
      out.write("                .user-row {\r\n");
      out.write("                    margin-bottom: 14px;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .user-row:last-child {\r\n");
      out.write("                    margin-bottom: 0;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .dropdown-user {\r\n");
      out.write("                    margin: 13px 0;\r\n");
      out.write("                    padding: 5px;\r\n");
      out.write("                    height: 100%;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .dropdown-user:hover {\r\n");
      out.write("                    cursor: pointer;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .table-user-information > tbody > tr {\r\n");
      out.write("                    border-top: 1px solid rgb(221, 221, 221);\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                .table-user-information > tbody > tr:first-child {\r\n");
      out.write("                    border-top: 0;\r\n");
      out.write("                }\r\n");
      out.write("                .table-user-information > tbody > tr > td {\r\n");
      out.write("                    border-top: 0;\r\n");
      out.write("                }\r\n");
      out.write("                * {\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .columns {\r\n");
      out.write("                float: left;\r\n");
      out.write("                width: 33.3%;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price {\r\n");
      out.write("                list-style-type: none;\r\n");
      out.write("                border: 1px solid #eee;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                -webkit-transition: 0.3s;\r\n");
      out.write("                transition: 0.3s;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price:hover {\r\n");
      out.write("                box-shadow: 0 8px 12px 0 rgba(0,0,0,0.2)\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price .header {\r\n");
      out.write("                background-color: #111;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 25px;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price li {\r\n");
      out.write("                border-bottom: 1px solid #eee;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .price .grey {\r\n");
      out.write("                background-color: #eee;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .button {\r\n");
      out.write("                background-color: #4CAF50;\r\n");
      out.write("                border: none;\r\n");
      out.write("                color: white;\r\n");
      out.write("                padding: 10px 25px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              @media only screen and (max-width: 600px) {\r\n");
      out.write("                .columns {\r\n");
      out.write("                  width: 100%;\r\n");
      out.write("                }\r\n");
      out.write("              }\r\n");
      out.write("            </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"main-content\">\r\n");
      out.write("    <!-- Top navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-top navbar-expand-md navbar-dark\" id=\"navbar-main\">\r\n");
      out.write("        &nbsp&nbsp&nbsp&nbsp&nbsp<img src=\"../Assets/flighticon.png\" height=\"40px\" style=\"width:35px!important\" />\r\n");
      out.write("        <a class=\"navbar-brand text-white \" href=\"../index.jsp\">DeliceJet</a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Header -->\r\n");
      out.write("    <div class=\"header pb-8 pt-5 pt-lg-8 d-flex align-items-center\" style=\"min-height: 400px; background-image: url(../Assets/fly.jpg); background-size: cover; background-position: center top;\">\r\n");
      out.write("        <!-- Mask -->\r\n");
      out.write("        <span class=\"mask bg-gradient-default opacity-8\"></span>\r\n");
      out.write("        <div class=\"container-fluid d-flex align-items-center\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 col-md-12\">\r\n");
      out.write("                    <img src=\"../Assets/plus-panel.png\" height=\"50px\" style=\"color:white;width:260px!important\" />\r\n");
      out.write("                    <h1 class=\"display-2 text-white\">Koltuk Seçimi...</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Page content -->\r\n");
      out.write("    <div class=\"container-fluid mt--7\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xl-2 order-xl-1\">\r\n");
      out.write("                    <div class=\"card bg-secondary shadow\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"text-dark-200\">                                \r\n");
      out.write("                                <ul class=\"list-group mb-4\">\r\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <i class=\"fas fa-check\" style=\"color: green\">&nbsp </i>Uçuş Seçimi\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <i class=\"fas fa-check\" style=\"color: green\">&nbsp </i>Yolcu Bilgileri\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                        <i class=\"fas fa-times\" style=\"color: red\">&nbsp </i>Koltuk Seçimi\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li class=\"list-group-item d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                       <i class=\"fas fa-times\" style=\"color: red\">&nbsp </i> Ödeme\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>                            \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            <div class=\"col-xl-10 order-xl-2 mb-5 mb-xl-0\">\r\n");
      out.write("                <div class=\"card card-profile shadow\">\r\n");
      out.write("                    <div class=\"card-header text-center border-5 pt-8 pt-md-4 pb-0 pb-md-4\">\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body pt-lg-5 pt-md-5\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col\">\r\n");
      out.write("                                <div class=\"card-profile-stats d-flex justify-content-left mt-md-2\">\r\n");
      out.write("                                        <table cellpadding=\"4\" cellspacing=\"4\" border=\"4\" id=\"table\" class=\"sortable\">\r\n");
      out.write("                                            <tbody>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat00F\" />00F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat06F\" />06F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat12F\" />12F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat18F\" />18F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat24E\" />24E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat30E\" />30E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat36E\" />36E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat42E\" />42E</td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat01F\"/>01F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat07F\"/>07F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat13F\"/>13F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat19F\"/>19F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat25E\"/>25E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat31E\"/>31E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat37E\"/>37E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat43E\"/>43E</td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                 <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat02F\"/>02F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat08F\"/>08F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat14F\"/>14F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat20F\"/>20F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat26E\"/>26E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat32E\"/>32E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat38E\"/>38E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat44E\"/>44E</td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th><h3></h3></th>\r\n");
      out.write("                                                    <th><h3></h3></th>\r\n");
      out.write("                                                    <th><h3></h3></th>\r\n");
      out.write("                                                    <th><h3></h3></th>\r\n");
      out.write("                                                    <th><h3></h3></th>\r\n");
      out.write("                                                    <th><h3></h3></th>\r\n");
      out.write("                                                    <th><h3></h3></th>\r\n");
      out.write("                                                    <th><h3></h3></th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat03F\"/>03F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat09F\"/>09F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat15F\"/>15F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat21F\"/>21F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat27E\"/>27E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat33E\"/>33E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat39E\"/>39E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat45E\"/>45E</td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat04F\"/>04F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat10F\"/>10F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat16F\"/>16F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat22F\"/>22F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat28E\"/>28E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat34E\"/>34E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat40E\"/>40E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat46E\"/>46E</td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat05F\"/>05F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat11F\"/>11F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat17F\"/>17F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat23F\"/>23F</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat29E\"/>29E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat35E\"/>35E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat41E\"/>41E</td>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <button onclick=\"clickFunc()\" type=\"submit\" id=\"seat47E\"/>47E</td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("   <script>\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            var panels = $('.user-infos');\r\n");
      out.write("            var panelsButton = $('.dropdown-user');\r\n");
      out.write("            panels.hide();\r\n");
      out.write("\r\n");
      out.write("            //Click dropdown\r\n");
      out.write("            panelsButton.click(function() {\r\n");
      out.write("                //get data-for attribute\r\n");
      out.write("                var dataFor = $(this).attr('data-for');\r\n");
      out.write("                var idFor = $(dataFor);\r\n");
      out.write("\r\n");
      out.write("                //current button\r\n");
      out.write("                var currentButton = $(this);\r\n");
      out.write("                idFor.slideToggle(400, function() {\r\n");
      out.write("                    //Completed slidetoggle\r\n");
      out.write("                    if(idFor.is(':visible'))\r\n");
      out.write("                    {\r\n");
      out.write("                        currentButton.html('<i class=\"glyphicon glyphicon-chevron-up text-muted\"></i>');\r\n");
      out.write("                    }\r\n");
      out.write("                    else\r\n");
      out.write("                    {\r\n");
      out.write("                        currentButton.html('<i class=\"glyphicon glyphicon-chevron-down text-muted\"></i>');\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
      out.write("\r\n");
      out.write("            $('button').click(function(e) {\r\n");
      out.write("                e.preventDefault();\r\n");
      out.write("                alert(\"This is a demo.\\n :-)\");\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("    function selectSeatsFunc() {\r\n");
      out.write("      document.getElementById(\"seat00F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat01F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat02F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat03F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat04F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat05F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat06F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat07F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat08F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat09F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat10F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat11F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat12F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat13F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat14F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat15F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat16F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat17F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat18F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat19F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat20F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat21F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat22F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat23F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat24F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat25F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat26F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat27F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat28F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat29F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat30F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat31F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat32F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat33F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat34F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat35F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat36F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat37F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat38F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat39F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat40F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat41F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat42F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat43F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat44F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat45F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat46F\").style.color = \"red\";\r\n");
      out.write("      document.getElementById(\"seat47F\").style.color = \"red\";\r\n");
      out.write("            \r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
