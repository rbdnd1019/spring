/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.75
 * Generated at: 2022-05-21 10:11:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/workspace/workspace_hgw_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/team0/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1532606274000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar", Long.valueOf(1651151418248L));
    _jspx_dependants.put("jar:file:/C:/workspace/workspace_hgw_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/team0/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1651151360745L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../views/common/head.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"site-mobile-menu\">\r\n");
      out.write("        <div class=\"site-mobile-menu-header\">\r\n");
      out.write("            <div class=\"site-mobile-menu-close\">\r\n");
      out.write("            	<span class=\"icofont-close js-menu-toggle\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("        	<div class=\"site-mobile-menu-body\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("    </div> <!-- /.untree_co-hero -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../views/common/nav.jsp", out, false);
      out.write("\r\n");
      out.write("    <div class=\"untree_co-hero\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row align-items-center justify-content-center\">\r\n");
      out.write("                <div class=\"col-12\">\r\n");
      out.write("                    <div class=\"row align-items-center justify-content-between\">\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <h1 class=\"mb-4 heading\" data-aos=\"fade-up\" data-aos-delay=\"100\">\"?????? ??????????\"</h1>\r\n");
      out.write("                            <div class=\"mb-4 desc\" data-aos=\"fade-up\" data-aos-delay=\"200\">\r\n");
      out.write("                            	<p><a href=\"#\" target=\"_blank\" class=\"link-highlight\">????????? ????????? ???</a></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group\">\r\n");
      out.write("	                            <input class=\"form-control mr-1\" type=\"text\" id=\"address\" placeholder=\"????????? ???????????????\">\r\n");
      out.write("								<button class=\"btn btn-primary btn-sm\" type=\"button\" onclick=\"execDaumPostcode()\" >????????????</button>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\" id=\"map\" style=\"width:438px; height:250px ;margin-top:10px;display:none\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6\" data-aos=\"fade-up\" data-aos-delay=\"100\">\r\n");
      out.write("                            <div class=\"w3-content w3-section\" >\r\n");
      out.write("								<img class=\"mySlides\" src=\"/resources/assets/images/??????.png\" >\r\n");
      out.write("								<img class=\"mySlides\" src=\"/resources/assets/images/??????.png\" >\r\n");
      out.write("								<img class=\"mySlides\" src=\"/resources/assets/images/??????.png\" >\r\n");
      out.write("								<img class=\"mySlides\" src=\"/resources/assets/images/??????.png\" >\r\n");
      out.write("								<img class=\"mySlides\" src=\"/resources/assets/images/?????????.png\" >\r\n");
      out.write("								<img class=\"mySlides\" src=\"/resources/assets/images/??????.png\" >\r\n");
      out.write("							</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <!-- /.row -->\r\n");
      out.write("        </div> <!-- /.container -->\r\n");
      out.write("    </div>	  \r\n");
      out.write("	<div class=\"untree_co-section\">\r\n");
      out.write("	    <div class=\"container\">\r\n");
      out.write("	    	<div class=\"row mb-5\">\r\n");
      out.write("	     		<div class=\"col-lg-12 text-center\">\r\n");
      out.write("	        	<ul class=\"custom-nav js-custom-dots list-unstyled\">\r\n");
      out.write("	            	<li class=\"active\"><a href=\"#\">menu</a></li>\r\n");
      out.write("	        	</ul>\r\n");
      out.write("	        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	    <div class=\"owl-single no-dots owl-carousel\">\r\n");
      out.write("			<div class=\"item\">\r\n");
      out.write("	        	<div class=\"row mb-5\">\r\n");
      out.write("	            	<div class=\"col-12 text-center\">\r\n");
      out.write("	            	<h2 class=\"heading\">Category</h2>\r\n");
      out.write("	        		</div>\r\n");
      out.write("	       		</div>\r\n");
      out.write("		        <div class=\"row\">\r\n");
      out.write("		        	<div class=\"col-6 col-md-6 col-lg-4 mb-4\">\r\n");
      out.write("			            <div class=\"product\">\r\n");
      out.write("			            	<a href=\"/store/list/1\" class=\"thumbnail\"><img src=\"/resources/assets/images/??????.png\" alt=\"Image\" class=\"img-fluid\"></a>\r\n");
      out.write("			                <h3 class=\"mb-0\"><a href=\"/store/list/1\">??????</a></h3>\r\n");
      out.write("			            </div>\r\n");
      out.write("		        	</div>\r\n");
      out.write("			        <div class=\"col-6 col-md-6 col-lg-4 mb-4\">\r\n");
      out.write("			        	<div class=\"product\">\r\n");
      out.write("			            	<a href=\"/store/list/2\" class=\"thumbnail\"><img src=\"/resources/assets/images/??????.png\" alt=\"Image\" class=\"img-fluid\"></a>\r\n");
      out.write("			                <h3 class=\"mb-0\"><a href=\"/store/list/2\">??????</a></h3>\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        <div class=\"col-6 col-md-6 col-lg-4 mb-4\">\r\n");
      out.write("			        	<div class=\"product\">\r\n");
      out.write("			            	<a href=\"/store/list/3\" class=\"thumbnail\"><img src=\"/resources/assets/images/??????.png\" alt=\"Image\" class=\"img-fluid\"></a>\r\n");
      out.write("			                <h3 class=\"mb-0\"><a href=\"/store/list/3\">?????????</a></h3>\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        <div class=\"col-6 col-md-6 col-lg-4 mb-4\">\r\n");
      out.write("				        <div class=\"product\">\r\n");
      out.write("			                <a href=\"/store/list/4\" class=\"thumbnail\"><img src=\"/resources/assets/images/??????.png\" alt=\"Image\" class=\"img-fluid\"></a>\r\n");
      out.write("			                <h3 class=\"mb-0\"><a href=\"/store/list/4\">??????</a></h3>\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        <div class=\"col-6 col-md-6 col-lg-4 mb-4\">\r\n");
      out.write("				        <div class=\"product\">\r\n");
      out.write("			                <a href=\"/store/list/5\" class=\"thumbnail\"><img src=\"/resources/assets/images/?????????.png\" alt=\"Image\" class=\"img-fluid\"></a>\r\n");
      out.write("			                <h3 class=\"mb-0\"><a href=\"/store/list/5\">??????/?????????</a></h3>\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("			        <div class=\"col-6 col-md-6 col-lg-4 mb-4\">\r\n");
      out.write("			     		<div class=\"product\">\r\n");
      out.write("			            	<a href=\"/store/list/6\" class=\"thumbnail\"><img src=\"/resources/assets/images/??????.png\" alt=\"Image\" class=\"img-fluid\"></a>\r\n");
      out.write("			                <h3 class=\"mb-0\"><a href=\"/store/list/6\">??????/??????</a></h3>\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("			    </div>\r\n");
      out.write("		    </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../views/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("//W3school Automatic Slideshow\r\n");
      out.write("	var myIndex = 0;\r\n");
      out.write("	carousel();\r\n");
      out.write("	function carousel(){\r\n");
      out.write("	    var i;\r\n");
      out.write("	    var x = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("	    for (i = 0; i < x.length; i++){\r\n");
      out.write("	        x[i].style.display = \"none\";\r\n");
      out.write("	    }\r\n");
      out.write("	    myIndex++;\r\n");
      out.write("	    if (myIndex > x.length ) {\r\n");
      out.write("	        myIndex = 1\r\n");
      out.write("	    }\r\n");
      out.write("	    x[myIndex-1].style.display = \"block\";\r\n");
      out.write("	    setTimeout(carousel, 1500); //Change image every 1.5 seconds\r\n");
      out.write("	};\r\n");
      out.write("\r\n");
      out.write("//?????? ????????? ?????? API\r\n");
      out.write("    var mapContainer = document.getElementById('map'), // ????????? ????????? div\r\n");
      out.write("        mapOption = {\r\n");
      out.write("            center: new daum.maps.LatLng(37.537187, 127.005476), // ????????? ????????????\r\n");
      out.write("            level: 5 // ????????? ?????? ??????\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("    //????????? ?????? ??????\r\n");
      out.write("    var map = new daum.maps.Map(mapContainer, mapOption);\r\n");
      out.write("    //??????-?????? ?????? ????????? ??????\r\n");
      out.write("    var geocoder = new daum.maps.services.Geocoder();\r\n");
      out.write("    //????????? ?????? ??????\r\n");
      out.write("    var marker = new daum.maps.Marker({\r\n");
      out.write("        position: new daum.maps.LatLng(37.537187, 127.005476),\r\n");
      out.write("        map: map\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function execDaumPostcode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                var addr = data.address; // ?????? ?????? ??????\r\n");
      out.write("\r\n");
      out.write("                // ?????? ????????? ?????? ????????? ?????????.\r\n");
      out.write("                document.getElementById(\"address\").value = addr;\r\n");
      out.write("                // ????????? ?????? ????????? ??????\r\n");
      out.write("                geocoder.addressSearch(data.address, function(results, status) {\r\n");
      out.write("                    // ??????????????? ????????? ???????????????\r\n");
      out.write("                    if (status === daum.maps.services.Status.OK) {\r\n");
      out.write("                        var result = results[0]; //????????? ????????? ?????? ??????\r\n");
      out.write("                        // ?????? ????????? ?????? ????????? ?????????\r\n");
      out.write("                        var coords = new daum.maps.LatLng(result.y, result.x);\r\n");
      out.write("                        // ????????? ????????????.\r\n");
      out.write("                        mapContainer.style.display = \"block\";\r\n");
      out.write("                        map.relayout();\r\n");
      out.write("                        // ?????? ????????? ????????????.\r\n");
      out.write("                        map.setCenter(coords);\r\n");
      out.write("                        // ????????? ??????????????? ?????? ????????? ?????????.\r\n");
      out.write("                        marker.setPosition(coords)\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
