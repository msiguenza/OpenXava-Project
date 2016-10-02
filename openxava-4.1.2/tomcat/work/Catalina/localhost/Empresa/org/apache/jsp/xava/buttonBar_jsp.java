package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.controller.meta.MetaAction;
import org.openxava.util.XavaPreferences;
import org.openxava.util.Is;

public final class buttonBar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/xava/imports.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005flink_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005flink_0026_005faction.release();
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
      out.write('\n');
      out.write('\n');

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
boolean onBottom = false;
String mode = request.getParameter("xava_mode"); 
if (mode == null) mode = manager.isSplitMode()?"detail":manager.getModeName();
boolean headerButtonBar = !manager.isSplitMode() || mode.equals("list");  
String helpImage = style.getHelpImage().startsWith("xava/")?request.getContextPath() + "/" + style.getHelpImage():style.getHelpImage();

if (manager.isButtonBarVisible()) {

      out.write("\n");
      out.write("\t<div class=\"");
      out.print(style.getButtonBar());
      out.write("\">\n");
      out.write("\t");

	java.util.Iterator it = manager.getMetaActions().iterator();
	boolean showLabels = XavaPreferences.getInstance().isShowLabelsForToolBarActions(); 
	while (it.hasNext()) {
		MetaAction action = (MetaAction) it.next();
		if (action.isHidden()) continue;
		if (action.appliesToMode(mode) && action.hasImage()) {
		
      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "barButton.jsp" + (("barButton.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("action", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(action.getQualifiedName()), request.getCharacterEncoding()), out, false);
      out.write("\t\t\n");
      out.write("\t\t");

		} 
	}
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t<span style=\"float: right\"> \n");
      out.write("\t");

	java.util.Stack previousViews = (java.util.Stack) context.get(request, "xava_previousViews"); 
	if (headerButtonBar && previousViews.isEmpty()) { 
		java.util.Iterator itSections = manager.getMetaActionsMode().iterator();
		while (itSections.hasNext()) {
			MetaAction action = (MetaAction) itSections.next();
			if (action.isHidden()) continue;
			String modeNameAction = action.getName().startsWith("detail")?"detail":action.getName();
			if (modeNameAction.equals(manager.getModeName())) {			
			
      out.write("\n");
      out.write("\t\t\t<span class=\"");
      out.print(style.getButtonBarActiveModeButton());
      out.write("\">\n");
      out.write("\t\t\t\t<a href=\"\">\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t");
      out.print(action.getLabel(request));
      out.write("\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t\t");

			}
			else {	
			
      out.write("\n");
      out.write("\t\t\t<span class=\"");
      out.print(style.getButtonBarModeButton());
      out.write("\">\t\t\t\n");
      out.write("\t\t\t\t");
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f0 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005faction.get(org.openxava.web.taglib.LinkTag.class);
      _jspx_th_xava_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flink_005f0.setParent(null);
      // /xava/buttonBar.jsp(61,4) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f0.setAction(action.getQualifiedName());
      int _jspx_eval_xava_005flink_005f0 = _jspx_th_xava_005flink_005f0.doStartTag();
      if (_jspx_eval_xava_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t&nbsp;&nbsp;\t\t \t\t\t\n");
          out.write("\t\t\t\t\t");
          out.print(action.getLabel(request));
          out.write("\n");
          out.write("\t\t\t\t\t&nbsp;&nbsp;\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_xava_005flink_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_xava_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005flink_0026_005faction.reuse(_jspx_th_xava_005flink_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005flink_0026_005faction.reuse(_jspx_th_xava_005flink_005f0);
      out.write("\n");
      out.write("\t\t\t</span>\n");
      out.write("\t\t\t");

			}
		}
	}	

	String language = request.getLocale().getLanguage();
	String href = XavaPreferences.getInstance().getDefaultHelpPrefix() + language;
	String target = XavaPreferences.getInstance().isHelpInNewWindow() ? "_blank" : "";
	if (!Is.empty(XavaPreferences.getInstance().getHelpPrefix())) { 
		href = 
			"/" + manager.getApplicationName() + "/" + 
			XavaPreferences.getInstance().getHelpPrefix() +
			manager.getModuleName() +
			"_" + language + 
			XavaPreferences.getInstance().getHelpSuffix();
	} 
	
      out.write("\n");
      out.write("\t\t<span class=\"");
      out.print(style.getHelp());
      out.write("\"> \n");
      out.write("\t\t\t<a href=\"");
      out.print(href);
      out.write("\" target=\"");
      out.print(target);
      out.write("\"><img src=\"");
      out.print(helpImage);
      out.write("\"/></a> \t\t\t\t\n");
      out.write("\t\t</span>\n");
      out.write("\t</span>\t\t\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t\n");
 } // end isButtonBarVisible 
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
