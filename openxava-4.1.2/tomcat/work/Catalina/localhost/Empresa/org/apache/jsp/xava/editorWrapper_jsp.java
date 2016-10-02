package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editorWrapper_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/xava/imports.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.release();
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
      out.write('\n');
      out.write('\n');
      //  xava:editor
      org.openxava.web.taglib.EditorTag _jspx_th_xava_005feditor_005f0 = (org.openxava.web.taglib.EditorTag) _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.get(org.openxava.web.taglib.EditorTag.class);
      _jspx_th_xava_005feditor_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005feditor_005f0.setParent(null);
      // /xava/editorWrapper.jsp(3,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005feditor_005f0.setProperty(request.getParameter("propertyName"));
      // /xava/editorWrapper.jsp(3,0) name = editable type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005feditor_005f0.setEditable(Boolean.valueOf(request.getParameter("editable")).booleanValue());
      // /xava/editorWrapper.jsp(3,0) name = throwPropertyChanged type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005feditor_005f0.setThrowPropertyChanged(Boolean.valueOf(request.getParameter("throwPropertyChanged")).booleanValue());
      int _jspx_eval_xava_005feditor_005f0 = _jspx_th_xava_005feditor_005f0.doStartTag();
      if (_jspx_th_xava_005feditor_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.reuse(_jspx_th_xava_005feditor_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.reuse(_jspx_th_xava_005feditor_005f0);
      out.write('\n');
      out.write('	');
      out.write('\n');
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
