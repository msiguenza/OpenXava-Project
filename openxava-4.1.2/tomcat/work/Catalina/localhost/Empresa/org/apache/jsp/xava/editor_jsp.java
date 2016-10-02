package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.util.XavaPreferences;
import org.openxava.util.Is;
import org.openxava.model.meta.MetaProperty;
import org.openxava.view.meta.MetaPropertyView;

public final class editor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/xava/imports.jsp");
    _jspx_dependants.add("/xava/htmlTagsEditor.jsp");
    _jspx_dependants.add("/xava/editorIcons.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.util.Messages errors = null;
      synchronized (request) {
        errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", PageContext.REQUEST_SCOPE);
        if (errors == null){
          errors = new org.openxava.util.Messages();
          _jspx_page_context.setAttribute("errors", errors, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      synchronized (request) {
        style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", PageContext.REQUEST_SCOPE);
        if (style == null){
          style = new org.openxava.web.style.Style();
          _jspx_page_context.setAttribute("style", style, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
org.openxava.view.View view = (org.openxava.view.View) context.get(request, viewObject);
String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String shasFrame = request.getParameter("hasFrame"); 
boolean hasFrame="true".equals(shasFrame)?true:false;
boolean editable = view.isEditable(p);
boolean lastSearchKey = view.isLastSearchKey(p); 
boolean throwPropertyChanged = view.throwsPropertyChanged(p);
	

int labelFormat = view.getLabelFormatForProperty(p);
String labelStyle = view.getLabelStyleForProperty(p);
if (Is.empty(labelStyle)) labelStyle = XavaPreferences.getInstance().getDefaultLabelStyle();
String label = view.getLabelFor(p);

      out.write('\n');
      out.write('\n');

String sfirst = request.getParameter("first"); 
boolean first="true".equals(sfirst)?true:false;

String preLabel=null;
String postLabel=null;
String preIcons=null;
String postIcons=null;
String preEditor=null;
String postEditor=null;
String labelAlign=org.openxava.util.XavaPreferences.getInstance().getLabelAlign();

if (first && !view.isAlignedByColumns()) { 
	preLabel="<td style='vertical-align: middle;text-align: " + labelAlign + "' class='" + style.getLabel() + "'>"; 
	postLabel="</td>";
	preIcons="<td style='vertical-align: middle' class='" + style.getEditorWrapper()+ "'>";
	postIcons="</td>";	
	preEditor="<td style='vertical-align: middle;'><table border='0' cellpadding='0' cellspacing='0'><tr><td style='vertical-align: middle' class='" + style.getEditorWrapper()+ "'>";
	postEditor="</td>";
} 
else {
	preLabel="<td style='vertical-align: middle;text-align: " + labelAlign + "' class='" + style.getLabel() + "'>&nbsp;&nbsp;";
	postLabel="</td>";
	preIcons="<td style='vertical-align: middle' class='" + style.getEditorWrapper()+ "'>";
	postIcons="</td>";
	preEditor="<td style='vertical-align: middle' class='" + style.getEditorWrapper()+ "'>";
	postEditor="</td>";
}

      out.write('\n');
  
if (first && !view.isAlignedByColumns()) label = org.openxava.util.Strings.change(label, " ", "&nbsp;");

      out.write('\n');
      out.write('\n');
 if (!hasFrame) {  
      out.write('\n');
      out.write('\n');
      out.print(preLabel);
      out.write('\n');
 if (labelFormat == MetaPropertyView.NORMAL_LABEL) { 
      out.write("\n");
      out.write("<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f0.setParent(null);
      // /xava/editor.jsp(41,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f0.setName("label_" + view.getPropertyPrefix() + p.getName());
      int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
      if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
      out.write("\" class=\"");
      out.print(labelStyle);
      out.write('"');
      out.write('>');
      out.write('\n');
      out.print(label);
      out.write("\n");
      out.write("</span>\n");
 } 
      out.write('\n');
      out.print(postLabel);
      out.write('\n');
      out.print(preIcons);
      out.write('\n');
 if (labelFormat != MetaPropertyView.SMALL_LABEL) { 
      out.write('\n');
 if (p.isKey()) { 
      out.write("\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/key.gif\"/>\n");
 } else if (p.isRequired()) { 
      out.write("\t\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/required.gif\"/>\n");
 } 
      out.write(" \n");
      out.write("<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f1.setParent(null);
      // /xava/editorIcons.jsp(6,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f1.setName("error_image_" + p.getQualifiedName());
      int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
      if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
      out.write("\"> \n");
 if (errors.memberHas(p)) { 
      out.write("\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/error.gif\"/>\n");
 } 
      out.write("\n");
      out.write("</span>\n");
      out.write('\n');
 } 
      out.write('\n');
      out.print(postIcons);
      out.write('\n');
      out.print(preEditor);
      out.write('\n');
 if (labelFormat == MetaPropertyView.SMALL_LABEL) { 	

      out.write("\n");
      out.write("<table border='0' cellpadding='0', cellspacing='0'><tr><td align='bottom'>\n");
      out.write("<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f2 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f2.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f2.setParent(null);
      // /xava/editor.jsp(55,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f2.setName("label_" + view.getPropertyPrefix() + p.getName());
      int _jspx_eval_xava_005fid_005f2 = _jspx_th_xava_005fid_005f2.doStartTag();
      if (_jspx_th_xava_005fid_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
      out.write("\" class=\"");
      out.print(style.getSmallLabel());
      out.write(' ');
      out.print(labelStyle);
      out.write('"');
      out.write('>');
      out.print(label);
      out.write("</span>\n");
 if (p.isKey()) { 
      out.write("\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/key.gif\"/>\n");
 } else if (p.isRequired()) { 
      out.write("\t\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/required.gif\"/>\n");
 } 
      out.write(" \n");
      out.write("<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f3 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f3.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f3.setParent(null);
      // /xava/editorIcons.jsp(6,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f3.setName("error_image_" + p.getQualifiedName());
      int _jspx_eval_xava_005fid_005f3 = _jspx_th_xava_005fid_005f3.doStartTag();
      if (_jspx_th_xava_005fid_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
      out.write("\"> \n");
 if (errors.memberHas(p)) { 
      out.write("\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/error.gif\"/>\n");
 } 
      out.write("\n");
      out.write("</span>\n");
      out.write("\n");
      out.write("</td></tr>\n");
      out.write("<tr><td style='vertical-align: middle'>\n");
 } 
      out.write('\n');
      out.write('\n');
 } // if (!hasFrame) 
      out.write("\n");
      out.write("<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f4 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f4.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f4.setParent(null);
      // /xava/editor.jsp(62,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f4.setName("editor_" + view.getPropertyPrefix() + p.getName());
      int _jspx_eval_xava_005fid_005f4 = _jspx_th_xava_005fid_005f4.doStartTag();
      if (_jspx_th_xava_005fid_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f4);
      out.write("\"> \n");
      //  xava:editor
      org.openxava.web.taglib.EditorTag _jspx_th_xava_005feditor_005f0 = (org.openxava.web.taglib.EditorTag) _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.get(org.openxava.web.taglib.EditorTag.class);
      _jspx_th_xava_005feditor_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005feditor_005f0.setParent(null);
      // /xava/editor.jsp(63,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005feditor_005f0.setProperty(p.getName());
      // /xava/editor.jsp(63,0) name = editable type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005feditor_005f0.setEditable(editable);
      // /xava/editor.jsp(63,0) name = throwPropertyChanged type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005feditor_005f0.setThrowPropertyChanged(throwPropertyChanged);
      int _jspx_eval_xava_005feditor_005f0 = _jspx_th_xava_005feditor_005f0.doStartTag();
      if (_jspx_th_xava_005feditor_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.reuse(_jspx_th_xava_005feditor_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005feditor_0026_005fthrowPropertyChanged_005fproperty_005feditable_005fnobody.reuse(_jspx_th_xava_005feditor_005f0);
      out.write("\n");
      out.write("</span>\n");
 if (view.propertyHasActions(p)) { 
      out.write("\n");
      out.write("<span id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f5 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f5.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f5.setParent(null);
      // /xava/editor.jsp(66,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f5.setName("property_actions_" + view.getPropertyPrefix() + p.getName());
      int _jspx_eval_xava_005fid_005f5 = _jspx_th_xava_005fid_005f5.doStartTag();
      if (_jspx_th_xava_005fid_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f5);
      out.write('"');
      out.write('>');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "propertyActions.jsp" + (("propertyActions.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("propertyName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(p.getName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("lastSearchKey", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(lastSearchKey), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("editable", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(editable), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("</span>\n");
 } 
      out.write('\n');
      out.write('\n');
 if (!hasFrame) { 
      out.write('\n');
      out.print(postEditor);
      out.write('\n');
 if (labelFormat == MetaPropertyView.SMALL_LABEL) { 
      out.write("\n");
      out.write("</td></tr>\n");
      out.write("</table>\n");
 } 
      out.write('\n');
      out.write('\n');
 } // if (!hasFrame) 
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
