package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comparatorsCombo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/xava/imports.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.release();
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

String comparator = request.getParameter("comparator");
String prefix = request.getParameter("prefix");
if (prefix == null) prefix = "";
boolean isString = "true".equals(request.getParameter("isString"));
boolean isDate = "true".equals(request.getParameter("isDate"));
String eq = "eq".equals(comparator)?"selected='selected'":"";
String ne = "ne".equals(comparator)?"selected='selected'":"";
String ge = "ge".equals(comparator)?"selected='selected'":"";
String le = "le".equals(comparator)?"selected='selected'":"";
String gt = "gt".equals(comparator)?"selected='selected'":"";
String lt = "lt".equals(comparator)?"selected='selected'":"";
String startsWith = "starts_comparator".equals(comparator)?"selected='selected'":"";
String contains = "contains_comparator".equals(comparator)?"selected='selected'":"";
String notContains = "not_contains_comparator".equals(comparator)?"selected='selected'":"";
String year = "year_comparator".equals(comparator)?"selected='selected'":"";
String month = "month_comparator".equals(comparator)?"selected='selected'":"";
String yearMonth = "year_month_comparator".equals(comparator)?"selected='selected'":"";
int index = Integer.parseInt(request.getParameter("index"));

      out.write("\n");
      out.write("<select name=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f0.setParent(null);
      // /xava/comparatorsCombo.jsp(25,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f0.setName(prefix + "conditionComparator." + index);
      int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
      if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
      out.write("\" class=");
      out.print(style.getEditor());
      out.write('>');
      out.write('\n');
      out.write('	');

	if (isString) {
	
      out.write("\t\t\t\t\t\t\n");
      out.write("\t<option value=\"starts_comparator\" ");
      out.print(startsWith);
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("\t<option value=\"contains_comparator\" ");
      out.print(contains);
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("\t<option value=\"not_contains_comparator\" ");
      out.print(notContains);
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\t<option value=\"eq\" ");
      out.print(eq);
      out.write(">=</option>\n");
      out.write("\t<option value=\"ne\" ");
      out.print(ne);
      out.write("><></option>\n");
      out.write("\t<option value=\"ge\" ");
      out.print(ge);
      out.write(">>=</option>\n");
      out.write("\t<option value=\"le\" ");
      out.print(le);
      out.write("><=</option>\t\n");
      out.write("\t<option value=\"gt\" ");
      out.print(gt);
      out.write(">></option>\n");
      out.write("\t<option value=\"lt\" ");
      out.print(lt);
      out.write("><</option>\n");
      out.write("\t");

	if (isDate) {
	
      out.write("\n");
      out.write("\t<option value=\"year_comparator\" ");
      out.print(year);
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("\t<option value=\"month_comparator\" ");
      out.print(month);
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("\t<option value=\"year_month_comparator\" ");
      out.print(yearMonth);
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("\t");

	}	
	
      out.write("\n");
      out.write("</select>\t\n");
      out.write("\t");
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

  private boolean _jspx_meth_xava_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f0.setParent(null);
    // /xava/comparatorsCombo.jsp(29,51) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f0.setKey("starts_comparator");
    int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
    if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f1 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f1.setParent(null);
    // /xava/comparatorsCombo.jsp(30,51) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f1.setKey("contains_comparator");
    int _jspx_eval_xava_005fmessage_005f1 = _jspx_th_xava_005fmessage_005f1.doStartTag();
    if (_jspx_th_xava_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f2 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f2.setParent(null);
    // /xava/comparatorsCombo.jsp(31,58) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f2.setKey("not_contains_comparator");
    int _jspx_eval_xava_005fmessage_005f2 = _jspx_th_xava_005fmessage_005f2.doStartTag();
    if (_jspx_th_xava_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f3 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f3.setParent(null);
    // /xava/comparatorsCombo.jsp(44,43) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f3.setKey("year_comparator");
    int _jspx_eval_xava_005fmessage_005f3 = _jspx_th_xava_005fmessage_005f3.doStartTag();
    if (_jspx_th_xava_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f4 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f4.setParent(null);
    // /xava/comparatorsCombo.jsp(45,45) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f4.setKey("month_comparator");
    int _jspx_eval_xava_005fmessage_005f4 = _jspx_th_xava_005fmessage_005f4.doStartTag();
    if (_jspx_th_xava_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f5 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f5.setParent(null);
    // /xava/comparatorsCombo.jsp(46,54) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f5.setKey("year_month_comparator");
    int _jspx_eval_xava_005fmessage_005f5 = _jspx_th_xava_005fmessage_005f5.doStartTag();
    if (_jspx_th_xava_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f5);
    return false;
  }
}
