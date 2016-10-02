package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.util.XavaPreferences;
import org.openxava.util.Is;
import org.openxava.controller.meta.MetaControllers;
import org.openxava.controller.meta.MetaAction;

public final class barButton_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/xava/imports.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.web.style.Style style = null;
      synchronized (request) {
        style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", PageContext.REQUEST_SCOPE);
        if (style == null){
          style = new org.openxava.web.style.Style();
          _jspx_page_context.setAttribute("style", style, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

boolean showLabels = XavaPreferences.getInstance().isShowLabelsForToolBarActions();
String actionName = request.getParameter("action");
if (!Is.emptyString(actionName)) {
	MetaAction action = MetaControllers.getMetaAction(request.getParameter("action"));
	String argv = request.getParameter("argv");
	String label = action.getLabel(request); 

      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<span class=\"");
      out.print(style.getButtonBarButton());
      out.write("\">\n");
      out.write("\t");
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f0 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction.get(org.openxava.web.taglib.LinkTag.class);
      _jspx_th_xava_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flink_005f0.setParent(null);
      // /xava/barButton.jsp(21,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f0.setAction(action.getQualifiedName());
      // /xava/barButton.jsp(21,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f0.setArgv(argv);
      int _jspx_eval_xava_005flink_005f0 = _jspx_th_xava_005flink_005f0.doStartTag();
      if (_jspx_eval_xava_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
 boolean showLabel = (showLabels || !action.hasImage()) && !Is.emptyString(label); 
          out.write('\n');
          out.write('	');
          out.write('	');
 if (action.hasImage()) { 
          out.write("\n");
          out.write("\t\t<span style=\"padding:4px; background: url(");
          out.print(request.getContextPath());
          out.write("/xava/");
          out.print(action.getImage());
          out.write(") no-repeat 5px 50%;\">\t\t\n");
          out.write("\t\t");
 if (!showLabel) { 
          out.write("\n");
          out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("\t\t");
 } else { 
          out.write("\n");
          out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
          out.write("\t\t");
 } 
          out.write("\n");
          out.write("\t\t</span>\t\t\n");
          out.write("\t\t");
 } else {
          out.write("\n");
          out.write("\t\t&nbsp;\n");
          out.write("\t\t");
 } 
          out.write('\n');
          out.write('	');
          out.write('	');
 if (showLabel) { 
          out.write("\t\t\t \t\t\t\t \t\t\t\n");
          out.write("\t\t");
          out.print(label);
          out.write("\n");
          out.write("\t\t&nbsp;\n");
          out.write("\t\t");
 } 
          out.write("\t\t\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_xava_005flink_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_xava_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction.reuse(_jspx_th_xava_005flink_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction.reuse(_jspx_th_xava_005flink_005f0);
      out.write("\n");
      out.write("</span>\n");

}

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
