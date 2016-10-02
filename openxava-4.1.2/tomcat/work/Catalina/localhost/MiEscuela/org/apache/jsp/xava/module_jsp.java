package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.util.Arrays;
import org.openxava.util.XavaResources;
import org.openxava.util.Locales;
import org.openxava.util.Users;
import org.openxava.util.XSystem;
import org.openxava.util.Strings;
import org.openxava.util.Is;
import org.openxava.web.dwr.Module;
import org.openxava.web.servlets.Servlets;
import org.openxava.web.Ids;
import org.openxava.web.servlets.Servlets;
import org.openxava.web.servlets.Servlets;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public final class module_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

private static Log log = LogFactory.getLog("module.jsp");

	private String getAdditionalParameters(HttpServletRequest request) {
		StringBuffer result = new StringBuffer();
		for (java.util.Enumeration en = request.getParameterNames(); en
				.hasMoreElements();) {
			String name = (String) en.nextElement();
			if ("application".equals(name) || "module".equals(name)
					|| "xava.portlet.application".equals(name)
					|| "xava.portlet.module".equals(name))
				continue;
			String value = request.getParameter(name);
			result.append('&');
			result.append(name);
			result.append('=');
			result.append(value);
		}
		return result.toString();
	}
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');

	if (request.getAttribute("style") == null) {
		request.setAttribute("style", org.openxava.web.style.Style
				.getInstance());
	}

      out.write('\n');
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
      out.write('\n');

	Servlets.setCharacterEncoding(request, response);
	Locales.setCurrent(request);	
	request.getSession().setAttribute("xava.user",
			request.getRemoteUser());
	Users.setCurrent(request); 
	String app = request.getParameter("application");
	String module = context.getCurrentModule(request);

	org.openxava.controller.ModuleManager managerHome = (org.openxava.controller.ModuleManager) context
			.get(request, "manager",
					"org.openxava.controller.ModuleManager");
	org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context
			.get(app, module, "manager",
					"org.openxava.controller.ModuleManager");

	manager.setSession(session);
	manager.setApplicationName(request.getParameter("application"));

	manager.setModuleName(module); // In order to show the correct description in head

	if (manager.isFormUpload()) {
		new Module().requestMultipart(request, response, app, module);
	}
	else {
		Module.restoreLastMessages(request, app, module); 
	}
	String browser = request.getHeader("user-agent");
	style.setBrowser(browser);
	boolean isPortlet = (session.getAttribute(Ids.decorate(app, request
			.getParameter("module"), "xava.portlet.uploadActionURL")) != null);

	Module.setPortlet(isPortlet);
	Module.setStyle(style);
	String version = org.openxava.controller.ModuleManager.getVersion();
	String realPath = request.getSession().getServletContext()
			.getRealPath("/");
	boolean coreViaAJAX = !manager.getPreviousModules().isEmpty() || manager.getDialogLevel() > 0;

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "execute.jsp", out, false);
      out.write('\n');

	if (!isPortlet) {

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" >\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>");
      out.print(managerHome.getModuleDescription());
      out.write("</title>\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/");
      out.print(style.getCssFile());
      out.write("?ox=");
      out.print(version);
      out.write("\" rel=\"stylesheet\" type=\"text/css\"> \n");
      out.write("\t");

 		String[] jsFiles = style.getNoPortalModuleJsFiles();
 			if (jsFiles != null) {
 				for (int i = 0; i < jsFiles.length; i++) {
 	
      out.write("\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/");
      out.print(jsFiles[i]);
      out.write("?ox=");
      out.print(version);
      out.write("\" type=\"text/javascript\"></script>\n");
      out.write("\t");

		}
			}
	
      out.write('\n');
      out.write('\n');

	}

      out.write('\n');
      out.write('	');

		for (java.util.Iterator it = style.getAdditionalCssFiles()
				.iterator(); it.hasNext();) {
			String cssFile = (String) it.next();
	
      out.write(" \n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"");
      out.print(request.getContextPath());
      out.print(cssFile);
      out.write("?ox=");
      out.print(version);
      out.write("\"/>\n");
      out.write("\t");

		}
	
      out.write(" \t\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/xava/js/dwr-engine.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/util.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/interface/Module.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/interface/Tab.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/interface/View.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/xava/js/openxava.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t");

		if (style.isNeededToIncludeCalendar()) {
	
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/xava/editors/calendar/calendar.js?ox=");
      out.print(version);
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/xava/editors/calendar/lang/calendar-");
      out.print(Locales.getCurrent().getLanguage());
      out.write(".js?ox=");
      out.print(version);
      out.write("\"></script>\t\n");
      out.write("\t");

			}
		
      out.write("\t\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/xava/js/calendar.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t");

		if (new File(realPath + "/xava/js/custom-editors.js").exists()) {
	
      out.write("\n");
      out.write("\t<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/xava/js/custom-editors.js?ox=");
      out.print(version);
      out.write("'></script>\n");
      out.write("\t");

		log.warn(XavaResources.getString("custom_editors_deprecated"));
		}
	
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tif (typeof jQuery != \"undefined\") {  \n");
      out.write("\t\t\tportalJQuery = jQuery;\n");
      out.write("\t\t}       \n");
      out.write("\t</script>\t\t\t\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/xava/js/jquery.js?ox=");
      out.print(version);
      out.write("\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/xava/js/jquery-ui.js?ox=");
      out.print(version);
      out.write("\"></script>\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/xava/js/jquery.bgiframe.min.js?ox=");
      out.print(version);
      out.write("\"></script>\n");
      out.write("\t");

		File jsEditorsFolder = new File(realPath + "/xava/editors/js");		
		String[] jsEditors = jsEditorsFolder.list();
		Arrays.sort(jsEditors);
		for (int i = 0; i < jsEditors.length; i++) {
	
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/xava/editors/js/");
      out.print(jsEditors[i]);
      out.write("?ox=");
      out.print(version);
      out.write("\"></script>\n");
      out.write("\t");

		}
	
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$ = jQuery;\n");
      out.write("\t\tif (typeof portalJQuery != \"undefined\") {  \n");
      out.write("\t\t\tjQuery = portalJQuery;    \n");
      out.write("\t\t}   \n");
      out.write("\t</script>\n");

	if (!isPortlet) {

      out.write("\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#ffffff\">\n");
      out.print(style.getNoPortalModuleStartDecoration(managerHome
						.getModuleDescription()));
      out.write('\n');

	}

      out.write(' ');
      out.write('\n');
 
if (manager.isResetFormPostNeeded()) {	

      out.write("\t\t\n");
      out.write("\t<form id=\"xava_reset_form\"></form>\n");
 } else  { 
      out.write("\n");
      out.write("\n");
      out.write("\t<input id=\"xava_last_module_change\" type=\"hidden\" value=\"\"/>\n");
      out.write("\t<input id=\"");
      if (_jspx_meth_xava_005fid_005f0(_jspx_page_context))
        return;
      out.write("\" type=\"hidden\" value=\"");
      out.print(coreViaAJAX);
      out.write("\"/>\n");
      out.write("\t<input id=\"");
      if (_jspx_meth_xava_005fid_005f1(_jspx_page_context))
        return;
      out.write("\" type=\"hidden\" value=\"\"/>\n");
      out.write("\t<input id=\"");
      if (_jspx_meth_xava_005fid_005f2(_jspx_page_context))
        return;
      out.write("\" type=\"hidden\" value=\"\"/>\n");
      out.write("\t\t\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<div id='xava_processing_layer' style='position:absolute;top:100px;left:150px;display:none; z-index: 9999'>\n");
      out.write("\t<table cellspacing='0'>\n");
      out.write("\t   <tr class='");
      out.print(style.getProcessing());
      out.write("'>\n");
      out.write("\t       <td align='center' valign='middle' style='line-height:1.4;padding:25px 80px;border:2px solid #000'>\n");
      out.write("\t           ");
      out.print(XavaResources.getString(request, "processing"));
      out.write("<br/>\n");
      out.write("\t           <img src='");
      out.print(request.getContextPath());
      out.write("/xava/images/processing.gif' name='xava_processingImage'/>\n");
      out.write("\t       </td>\n");
      out.write("\t   </tr>\n");
      out.write("\t</table>\n");
      out.write("\t</div>\t\n");
      out.write("\t<div id=\"");
      if (_jspx_meth_xava_005fid_005f3(_jspx_page_context))
        return;
      out.write("\" style=\"display: inline;\">\n");
      out.write("\t\t");

			if (!coreViaAJAX) {
		
      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "core.jsp", out, false);
      out.write('\n');
      out.write('	');
      out.write('	');

			}
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
 } 
      out.write("\t\t\t\n");
      out.write("\t<div id=\"xava_console\">\n");
      out.write("\t</div>\n");
      out.write("\n");

	if (!isPortlet) {

      out.write('\n');
      out.print(style.getNoPortalModuleEndDecoration());
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

	}

      out.write('\n');
      out.write('\n');
 
if (manager.isResetFormPostNeeded()) {  
	manager.setResetFormPostNeeded(false);		

      out.write("\t\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t$(\"#xava_reset_form\").submit();\n");
      out.write("\t</script>\t\t\n");
 } else  { 
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
String prefix = Strings.change(manager.getApplicationName(), "-",
					"_")
					+ "_" + Strings.change(manager.getModuleName(), "-", "_");
			String onLoadFunction = prefix + "_openxavaOnLoad";
			String initiated = prefix + "_initiated";
      out.write('\n');
      out.print(onLoadFunction);
      out.write(" = function() { \n");
      out.write("\tif (openxava != null && openxava.");
      out.print(initiated);
      out.write(" == null) {\n");
      out.write("\t\topenxava.showFiltersMessage = '");
      if (_jspx_meth_xava_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\topenxava.hideFiltersMessage = '");
      if (_jspx_meth_xava_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\topenxava.loadingMessage = '");
      if (_jspx_meth_xava_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\topenxava.selectedRowClass = '");
      out.print(style.getSelectedRow());
      out.write("';\n");
      out.write("\t\topenxava.currentRowClass = '");
      out.print(style.getCurrentRow());
      out.write("';\n");
      out.write("\t\topenxava.currentRowCellClass = '");
      out.print(style.getCurrentRowCell());
      out.write("';\n");
      out.write("\t\topenxava.closeDialogOnEscape = ");
      out.print(browser != null && browser.indexOf("Firefox") >= 0 ? "false":"true");
      out.write(";\t\t  \n");
      out.write("\t\topenxava.calendarAlign = '");
      out.print(browser != null && browser.indexOf("MSIE 6") >= 0 ? "tr"
					: "Br");
      out.write("';\n");
      out.write("\t\t");
String initThemeScript = style.getInitThemeScript();
			if (initThemeScript != null) {
      out.write("\n");
      out.write("\t\topenxava.initTheme = function () { ");
      out.print(style.getInitThemeScript());
      out.write(" }; \n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\t\topenxava.init(\"");
      out.print(manager.getApplicationName());
      out.write("\", \"");
      out.print(manager.getModuleName());
      out.write("\");\n");
      out.write("\t\t");
if (coreViaAJAX) {
      out.write("\n");
      out.write("\t\topenxava.ajaxRequest(\"");
      out.print(manager.getApplicationName());
      out.write("\", \"");
      out.print(manager.getModuleName());
      out.write("\", true);\t\n");
      out.write("\t\t");
}
      out.write("\n");
      out.write("\t\topenxava.");
      out.print(initiated);
      out.write(" = true;\n");
      out.write("\t}\t\n");
      out.write("}\n");
      out.write("window.onload = ");
      out.print(onLoadFunction);
      out.write(";\n");
      out.write("setTimeout('");
      out.print(onLoadFunction);
      out.write("()', 1000);\n");
      out.write("document.additionalParameters=\"");
      out.print(getAdditionalParameters(request));
      out.write("\";\n");
      out.write("</script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_xava_005fid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f0.setParent(null);
    // /xava/module.jsp(185,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f0.setName("loading");
    int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
    if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f1.setParent(null);
    // /xava/module.jsp(186,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f1.setName("loaded_parts");
    int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
    if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f2 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f2.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f2.setParent(null);
    // /xava/module.jsp(187,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f2.setName("view_member");
    int _jspx_eval_xava_005fid_005f2 = _jspx_th_xava_005fid_005f2.doStartTag();
    if (_jspx_th_xava_005fid_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f3 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f3.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f3.setParent(null);
    // /xava/module.jsp(200,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f3.setName("core");
    int _jspx_eval_xava_005fid_005f3 = _jspx_th_xava_005fid_005f3.doStartTag();
    if (_jspx_th_xava_005fid_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
    return false;
  }

  private boolean _jspx_meth_xava_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fmessage_005f0.setParent(null);
    // /xava/module.jsp(241,33) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f0.setKey("show_filters");
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
    // /xava/module.jsp(242,33) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f1.setKey("hide_filters");
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
    // /xava/module.jsp(243,29) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f2.setKey("loading");
    int _jspx_eval_xava_005fmessage_005f2 = _jspx_th_xava_005fmessage_005f2.doStartTag();
    if (_jspx_th_xava_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f2);
    return false;
  }
}
