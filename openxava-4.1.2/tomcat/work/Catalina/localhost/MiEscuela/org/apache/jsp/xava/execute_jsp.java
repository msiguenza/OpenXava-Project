package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.event.InputEvent;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.KeyStroke;
import org.openxava.controller.meta.MetaAction;
import org.openxava.view.View;
import org.openxava.util.Is;
import org.openxava.util.Users;
import org.openxava.util.Locales;
import org.openxava.util.XavaResources;

public final class execute_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      org.openxava.util.Messages errors = null;
      synchronized (request) {
        errors = (org.openxava.util.Messages) _jspx_page_context.getAttribute("errors", PageContext.REQUEST_SCOPE);
        if (errors == null){
          errors = new org.openxava.util.Messages();
          _jspx_page_context.setAttribute("errors", errors, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.util.Messages messages = null;
      synchronized (request) {
        messages = (org.openxava.util.Messages) _jspx_page_context.getAttribute("messages", PageContext.REQUEST_SCOPE);
        if (messages == null){
          messages = new org.openxava.util.Messages();
          _jspx_page_context.setAttribute("messages", messages, PageContext.REQUEST_SCOPE);
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
      out.write('\n');

String browser = (String) request.getAttribute("xava.portlet.user-agent");
if (browser == null) { 
	browser = request.getHeader("user-agent");
	request.setAttribute("xava.portlet.user-agent", browser);
}
Locales.setCurrent(request);

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
manager.resetPersistence();

org.openxava.tab.Tab t = (org.openxava.tab.Tab) context.get(request, "xava_tab");
request.setAttribute("tab", t);

      out.write('\n');
      org.openxava.tab.Tab tab = null;
      synchronized (request) {
        tab = (org.openxava.tab.Tab) _jspx_page_context.getAttribute("tab", PageContext.REQUEST_SCOPE);
        if (tab == null){
          tab = new org.openxava.tab.Tab();
          _jspx_page_context.setAttribute("tab", tab, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');

if (manager.isListMode() || manager.isSplitMode()) { 
	tab.deselectVisualizedRows();
}

      out.write('\n');
      out.write('\n');
 if (!"false".equals(request.getAttribute("xava.sendParametersToTab"))) { 
      out.write(' ');
      out.write(' ');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("tab"), "selected", request.getParameter("selected"), request, "selected", false);
      out.write('\n');
 } 
      out.write('\n');
      out.write('\n');

manager.setApplicationName(request.getParameter("application"));
manager.setModuleName(request.getParameter("module"));
manager.executeBeforeEachRequestActions(request, errors, messages); 
View view = (View) context.get(request, "xava_view");
view.setRequest(request);
view.setErrors(errors);
view.setMessages(messages);

java.util.Stack previousViews = (java.util.Stack) context.get(request, "xava_previousViews");
for (Iterator it = previousViews.iterator(); it.hasNext(); ) {
	View previousView = (View) it.next();
	previousView.setRequest(request);
	previousView.setErrors(errors);
	previousView.setMessages(messages);	
}

tab.setRequest(request);
if (manager.isListMode()) {  
	tab.setModelName(manager.getModelName());
	if (tab.getTabName() == null) { 
		tab.setTabName(manager.getTabName());
	}
}
boolean hasProcessRequest = manager.hasProcessRequest(request);
manager.preInitModule();
if (manager.isXavaView(request)) { 
	if (hasProcessRequest) {	
		view.assignValuesToWebView();
	}
}
manager.initModule(request, errors, messages);
manager.executeOnEachRequestActions(request, errors, messages); 
if (hasProcessRequest) {
	manager.execute(request, errors, messages);	
	if (manager.isListMode()) { // here and before execute the action
		tab.setModelName(manager.getModelName());	
		if (tab.getTabName() == null) { 
			tab.setTabName(manager.getTabName());
		}
	}
}
//after-each-request
manager.executeAfterEachRequestActions(request, errors, messages);

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
