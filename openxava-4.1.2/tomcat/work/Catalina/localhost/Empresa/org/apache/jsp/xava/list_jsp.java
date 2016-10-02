package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.tab.impl.IXTableModel;
import org.openxava.util.Strings;
import org.openxava.util.XavaPreferences;
import org.openxava.model.meta.MetaProperty;
import org.openxava.web.WebEditors;
import org.openxava.util.Is;
import org.openxava.web.Ids;
import org.openxava.controller.meta.MetaAction;
import org.openxava.controller.meta.MetaControllers;
import org.openxava.web.Actions;
import org.openxava.util.Users;
import java.util.prefs.Preferences;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/xava/imports.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssStyle_005fcssClass_005fargv_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssStyle_005fargv_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fintParam_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssStyle_005fcssClass_005fargv_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssStyle_005fargv_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fintParam_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction.release();
    _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssStyle_005fcssClass_005fargv_005faction.release();
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssStyle_005fargv_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.release();
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fintParam_005fnobody.release();
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
      out.write('\n');
      out.write('\n');

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
String collection = request.getParameter("collection"); 
String id = "list";
String collectionArgv = "";
String prefix = "";
String tabObject = request.getParameter("tabObject");
String scrollId = "list_scroll"; 
tabObject = (tabObject == null || tabObject.equals(""))?"xava_tab":tabObject;
if (collection != null && !collection.equals("")) {
	id = collection;
	collectionArgv=",collection="+collection;
	prefix = tabObject + "_";
	scrollId = "collection_scroll"; 
}
org.openxava.tab.Tab tab = (org.openxava.tab.Tab) context.get(request, tabObject);
tab.setRequest(request); 
String action=request.getParameter("rowAction");
action=action==null?manager.getEnvironment().getValue("XAVA_LIST_ACTION"):action;
String viewObject = request.getParameter("viewObject");
String actionArgv = viewObject != null && !viewObject.equals("")?",viewObject=" + viewObject:"";
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject; 
org.openxava.view.View view = (org.openxava.view.View) context.get(request, viewObject);
java.util.Collection rowActions = view.isRepresentsCollection()?view.getRowActionsNames():manager.getRowActionsNames(); 
String sfilter = request.getParameter("filter");
boolean filter = !"false".equals(sfilter);
String displayFilter=""; 
String imageFilter="hide-filter";
String filterMessage="hide_filters";
if (!tab.isFilterVisible()) {
	displayFilter="none"; 
	imageFilter ="show-filter"; 
	filterMessage="show_filters";
}
String lastRow = request.getParameter("lastRow");
boolean singleSelection="true".equalsIgnoreCase(request.getParameter("singleSelection"));
String onSelectCollectionElementAction = view.getOnSelectCollectionElementAction();
MetaAction onSelectCollectionElementMetaAction = Is.empty(onSelectCollectionElementAction) ? null : MetaControllers.getMetaAction(onSelectCollectionElementAction);
String selectedRowStyle = style.getSelectedRowStyle();
String rowStyle = "border-bottom: 1px solid;";
int currentRow = ((Number) context.get(request, "xava_row")).intValue(); 
String cssCurrentRow = style.getCurrentRow(); 

      out.write("\n");
      out.write("\n");
      out.write("<input type=\"hidden\" name=\"xava_list");
      out.print(tab.getTabName());
      out.write("_filter_visible\"/>\n");
      out.write("\n");
      out.write("\n");

	if (tab.isTitleVisible()) {

      out.write("\n");
      out.write("<table width=\"100%\" id=\"list-title\" class=");
      out.print(style.getListTitleWrapper());
      out.write(">\n");
      out.write("<tr><td class=");
      out.print(style.getListTitle());
      out.write('>');
      out.write('\n');
      out.print(tab.getTitle());
      out.write("\n");
      out.write("</td></tr>\n");
      out.write("</table>\n");

	}

      out.write("\n");
      out.write("<div class=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f0.setParent(null);
      // /xava/list.jsp(78,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f0.setName(scrollId);
      int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
      if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
      out.write("\" style=\"overflow: auto;\"> \n");
      out.write("  <table id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f1.setParent(null);
      // /xava/list.jsp(79,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f1.setName(id);
      int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
      if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
      out.write("\" class=\"");
      out.print(style.getList());
      out.write('"');
      out.write(' ');
      out.print(style.getListCellSpacing());
      out.write(" style=\"");
      out.print(style.getListStyle());
      out.write("\">  \n");
      out.write("<tr class=\"");
      out.print(style.getListHeader());
      out.write("\">\n");
      out.write("<th class=\"");
      out.print(style.getListHeaderCell());
      out.write("\" style=\"text-align: center\">\n");
      out.write("\t");

		String imageFilterPrefix = request.getContextPath() + "/xava/images/";
	
      out.write("\n");
      out.write("\t<input name=\"xava_image_filter_prefix\" type=\"hidden\" value=\"");
      out.print(imageFilterPrefix);
      out.write("\"/>     \n");
      out.write("\t<a id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f2 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f2.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f2.setParent(null);
      // /xava/list.jsp(86,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f2.setName("filter_link_" + id);
      int _jspx_eval_xava_005fid_005f2 = _jspx_th_xava_005fid_005f2.doStartTag();
      if (_jspx_th_xava_005fid_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f2);
      out.write("\" href=\"javascript:openxava.manageFilterRow('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', '");
      out.print(id);
      out.write("', '");
      out.print(tabObject);
      out.write("')\" title=\"");
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f0.setParent(null);
      // /xava/list.jsp(86,214) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fmessage_005f0.setKey(filterMessage);
      int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
      if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
      out.write("\"><img id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f3 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f3.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f3.setParent(null);
      // /xava/list.jsp(86,265) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f3.setName("filter_image_" + id);
      int _jspx_eval_xava_005fid_005f3 = _jspx_th_xava_005fid_005f3.doStartTag();
      if (_jspx_th_xava_005fid_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f3);
      out.write("\" align='middle' \n");
      out.write("\t\tsrc='");
      out.print(imageFilterPrefix);
      out.print(imageFilter);
      out.write(".gif' border='0'/></a>\n");
      out.write("\t");
 if (tab.isCustomizeAllowed()) { 
      out.write(' ');
      out.write('\n');
      out.write('	');
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f0 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      _jspx_th_xava_005fimage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f0.setParent(null);
      // /xava/list.jsp(89,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f0.setAction("List.customize");
      // /xava/list.jsp(89,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f0.setArgv(collectionArgv);
      int _jspx_eval_xava_005fimage_005f0 = _jspx_th_xava_005fimage_005f0.doStartTag();
      if (_jspx_th_xava_005fimage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f0);
      out.write('\n');
      out.write('	');

		if (tab.isCustomize()) {
	
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f1 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      _jspx_th_xava_005fimage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f1.setParent(null);
      // /xava/list.jsp(92,3) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f1.setAction("List.addColumns");
      // /xava/list.jsp(92,3) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f1.setArgv(collectionArgv);
      int _jspx_eval_xava_005fimage_005f1 = _jspx_th_xava_005fimage_005f1.doStartTag();
      if (_jspx_th_xava_005fimage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f1);

		}
	} 
	
      out.write("\n");
      out.write("</th>\n");
      out.write("<th class=\"");
      out.print(style.getListHeaderCell());
      out.write("\" width=\"5\">\n");
      out.write("\t");

		if (!singleSelection){
			String actionOnClickAll = Actions.getActionOnClickAll(
			request.getParameter("application"), request.getParameter("module"), 
			onSelectCollectionElementAction, viewObject, prefix,
			selectedRowStyle, rowStyle);
	
      out.write("\n");
      out.write("\t<INPUT type=\"CHECKBOX\" name=\"");
      if (_jspx_meth_xava_005fid_005f4(_jspx_page_context))
        return;
      out.write("\" value=\"");
      out.print(prefix);
      out.write("selected_all\" ");
      out.print(actionOnClickAll);
      out.write(" />\n");
      out.write("\t");

		}
	
      out.write("\n");
      out.write("</th>\n");

	tab.reset();
java.util.Collection properties = tab.getMetaProperties();
java.util.Iterator it = properties.iterator();
int columnIndex = 0;
Preferences preferences = Users.getCurrentPreferences();
while (it.hasNext()) {
	MetaProperty property = (MetaProperty) it.next();
	String align = "";
	if (style.isAlignHeaderAsData()) {
		align =property.isNumber() && !property.hasValidValues()?"vertical-align: middle;text-align: right":"vertical-align: middle";
	}
	int columnWidth = tab.getColumnWidth(columnIndex);
	String width = columnWidth<0?"":"width: " + columnWidth + "px"; 

      out.write("\n");
      out.write("<th class=\"");
      out.print(style.getListHeaderCell());
      out.write("\" style=\"");
      out.print(align);
      out.write("; padding-right: 0px\" >\n");
      out.write("<div id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f5 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f5.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f5.setParent(null);
      // /xava/list.jsp(126,9) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f5.setName(id);
      int _jspx_eval_xava_005fid_005f5 = _jspx_th_xava_005fid_005f5.doStartTag();
      if (_jspx_th_xava_005fid_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f5);
      out.write("_col");
      out.print(columnIndex);
      out.write("\" class=\"");
      out.print(((tab.isResizeColumns())?("xava_resizable"):("")) );
      out.write("\" style=\"overflow: hidden; ");
      out.print(width);
      out.write("\" > \n");

	if (tab.isCustomize()) {

      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f2 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      _jspx_th_xava_005fimage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f2.setParent(null);
      // /xava/list.jsp(129,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f2.setAction("List.moveColumnToLeft");
      // /xava/list.jsp(129,2) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f2.setArgv("columnIndex="+columnIndex+collectionArgv);
      int _jspx_eval_xava_005fimage_005f2 = _jspx_th_xava_005fimage_005f2.doStartTag();
      if (_jspx_th_xava_005fimage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f2);

	}

      out.write('\n');

	String label = property.getQualifiedLabel(request).replaceAll(" ", "&nbsp;"); 
	if (property.isCalculated()) {

      out.write('\n');
      out.print(label);
      out.write("&nbsp;\n");

	} else {

      out.write("\n");
      out.write("<span class=\"");
      out.print(style.getListOrderBy());
      out.write('"');
      out.write('>');
      out.write('\n');
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f0 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction.get(org.openxava.web.taglib.LinkTag.class);
      _jspx_th_xava_005flink_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flink_005f0.setParent(null);
      // /xava/list.jsp(141,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f0.setAction("List.orderBy");
      // /xava/list.jsp(141,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f0.setArgv("property="+property.getQualifiedName() + collectionArgv);
      int _jspx_eval_xava_005flink_005f0 = _jspx_th_xava_005flink_005f0.doStartTag();
      if (_jspx_eval_xava_005flink_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.print(label);
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
      out.write("&nbsp;\n");
      out.write("</span>\n");

	if (tab.isOrderAscending(property.getQualifiedName())) {

      out.write("\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/");
      out.print(style.getAscendingImage());
      out.write("\" border=\"0\" align=\"middle\"/>\n");

	}

      out.write('\n');

	if (tab.isOrderDescending(property.getQualifiedName())) {

      out.write("\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/");
      out.print(style.getDescendingImage());
      out.write("\" border=\"0\" align=\"middle\"/>\n");

	}

      out.write('\n');

	if (tab.isOrderAscending2(property.getQualifiedName())) {

      out.write("\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/");
      out.print(style.getAscending2Image());
      out.write("\" border=\"0\" align=\"middle\"/>\n");

	}

      out.write('\n');

	if (tab.isOrderDescending2(property.getQualifiedName())) {

      out.write("\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/xava/images/");
      out.print(style.getDescending2Image());
      out.write("\" border=\"0\" align=\"middle\"/>\n");

	}

      out.write('	');
      out.write('\n');

		}
		   
		   if (tab.isCustomize()) {
	
      out.write('\n');
      out.write('	');
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f3 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      _jspx_th_xava_005fimage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f3.setParent(null);
      // /xava/list.jsp(176,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f3.setAction("List.moveColumnToRight");
      // /xava/list.jsp(176,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f3.setArgv("columnIndex="+columnIndex+collectionArgv);
      int _jspx_eval_xava_005fimage_005f3 = _jspx_th_xava_005fimage_005f3.doStartTag();
      if (_jspx_th_xava_005fimage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f3);
      out.write('\n');
      out.write('	');
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f4 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      _jspx_th_xava_005fimage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f4.setParent(null);
      // /xava/list.jsp(177,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f4.setAction("List.removeColumn");
      // /xava/list.jsp(177,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f4.setArgv("columnIndex="+columnIndex+collectionArgv);
      int _jspx_eval_xava_005fimage_005f4 = _jspx_th_xava_005fimage_005f4.doStartTag();
      if (_jspx_th_xava_005fimage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f4);
      out.write('\n');

	}

      out.write("\n");
      out.write("</div> \n");
      out.write("</th>\n");

	columnIndex++;
}

      out.write("\n");
      out.write("</tr>\n");

	if (filter) {

      out.write("\n");
      out.write("<tr id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f6 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f6.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f6.setParent(null);
      // /xava/list.jsp(191,8) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f6.setName("tr_list_filter_" + id);
      int _jspx_eval_xava_005fid_005f6 = _jspx_th_xava_005fid_005f6.doStartTag();
      if (_jspx_th_xava_005fid_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f6);
      out.write("\" class=");
      out.print(style.getListSubheader());
      out.write(" style=\"display: ");
      out.print(displayFilter);
      out.write("\"> \n");
      out.write("<th class=");
      out.print(style.getListSubheaderCell());
      out.write(" style=\"text-align: center\">\n");
      //  xava:action
      org.openxava.web.taglib.ActionTag _jspx_th_xava_005faction_005f0 = (org.openxava.web.taglib.ActionTag) _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ActionTag.class);
      _jspx_th_xava_005faction_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005faction_005f0.setParent(null);
      // /xava/list.jsp(193,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005faction_005f0.setAction("List.filter");
      // /xava/list.jsp(193,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005faction_005f0.setArgv(collectionArgv);
      int _jspx_eval_xava_005faction_005f0 = _jspx_th_xava_005faction_005f0.doStartTag();
      if (_jspx_th_xava_005faction_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f0);
      out.write("\n");
      out.write("</th>\n");
      out.write("<th class=");
      out.print(style.getListSubheaderCell());
      out.write(" width=\"5\">\n");
      out.write("\t<a title='");
      if (_jspx_meth_xava_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("' href=\"javascript:void(0)\">\n");
      out.write("\t\t<img src='");
      out.print(request.getContextPath());
      out.write("/xava/images/clear-right.gif'\n");
      out.write("\t\t\tborder='0' align='middle' onclick=\"openxava.clearCondition('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', '");
      out.print(prefix);
      out.write("')\"/>\n");
      out.write("\t</a>\n");
      out.write("</th>\n");

it = properties.iterator();
String [] conditionValues = tab.getConditionValues();
String [] conditionComparators = tab.getConditionComparators();
int iConditionValues = -1;
columnIndex = 0; 
while (it.hasNext()) {
	MetaProperty property = (MetaProperty) it.next();
	if (!property.isCalculated()) {
		iConditionValues++; 
		boolean isValidValues = property.hasValidValues();
		boolean isString = "java.lang.String".equals(property.getType().getName());
		boolean isBoolean = "boolean".equals(property.getType().getName()) || "java.lang.Boolean".equals(property.getType().getName());
		boolean isDate = java.util.Date.class.isAssignableFrom(property.getType()) && !property.getType().equals(java.sql.Time.class);
		String editorURLDescriptionsList = WebEditors.getEditorURLDescriptionsList(tab.getTabName(), tab.getModelName(), Ids.decorate(request, property.getQualifiedName()), iConditionValues, prefix, property.getQualifiedName(), property.getName());
		int maxLength = property.getSize();
		int length = Math.min(isString?property.getSize()*4/5:property.getSize(), 20);
		String value= conditionValues==null?"":conditionValues[iConditionValues];
		String comparator = conditionComparators==null?"":Strings.change(conditionComparators[iConditionValues], "=", "eq");
		int columnWidth = tab.getColumnWidth(columnIndex);
		String width = columnWidth<0?"":"width: " + columnWidth + "px";

      out.write("\n");
      out.write("<th class=\"");
      out.print(style.getListSubheaderCell());
      out.write("\" align=\"left\">\n");
      out.write("<div class=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f7 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f7.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f7.setParent(null);
      // /xava/list.jsp(224,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f7.setName(id);
      int _jspx_eval_xava_005fid_005f7 = _jspx_th_xava_005fid_005f7.doStartTag();
      if (_jspx_th_xava_005fid_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f7);
      out.write("_col");
      out.print(columnIndex);
      out.write("\" style=\"overflow: hidden; ");
      out.print(width);
      out.write('"');
      out.write('>');
      out.write('\n');
 		
		if (isValidValues) {

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "comparatorsValidValuesCombo.jsp" + (("comparatorsValidValuesCombo.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("validValues", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(property.getValidValuesLabels(request)), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("value", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(value), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("base0", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(Boolean.toString(!property.isNumber())), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("prefix", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(prefix), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("index", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(iConditionValues), request.getCharacterEncoding()), out, false);
      out.write('	');
      out.write('	');
      out.write('\n');

		}
		else if (!Is.empty(editorURLDescriptionsList)) {

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, editorURLDescriptionsList + ((editorURLDescriptionsList).indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("value", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(value), request.getCharacterEncoding()), out, false);
      out.write('\n');

		}
		else if (isBoolean) {

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "comparatorsBooleanCombo.jsp" + (("comparatorsBooleanCombo.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("comparator", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(comparator), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("prefix", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(prefix), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("index", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(iConditionValues), request.getCharacterEncoding()), out, false);
      out.write('\n');

		} else { // Not boolean
	String urlComparatorsCombo = "comparatorsCombo.jsp" // in this way because websphere 6 has problems with jsp:param
	+ "?comparator=" + comparator
	+ "&isString=" + isString
	+ "&isDate=" + isDate
	+ "&prefix=" + prefix  
	+ "&index=" + iConditionValues;

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, urlComparatorsCombo, out, false);
      out.write("\n");
      out.write("<input name=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f8 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f8.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f8.setParent(null);
      // /xava/list.jsp(262,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f8.setName(prefix + "conditionValue." + iConditionValues);
      int _jspx_eval_xava_005fid_005f8 = _jspx_th_xava_005fid_005f8.doStartTag();
      if (_jspx_th_xava_005fid_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f8);
      out.write("\" class=");
      out.print(style.getEditor());
      out.write(" type=\"text\" maxlength=\"");
      out.print(maxLength);
      out.write("\" size=\"");
      out.print(length);
      out.write("\" value=\"");
      out.print(value);
      out.write("\"/>\n");
      out.write("\t");

		}
	
      out.write("\n");
      out.write("</div>\t\n");
      out.write("</th>\n");

	}
	else {

      out.write("\n");
      out.write("<th class=");
      out.print(style.getListSubheaderCell());
      out.write("></th>\n");

	}
	columnIndex++; 
} // while

      out.write("\n");
      out.write("</tr>\n");

	} /* if (filter) */

      out.write('\n');

	int totalSize = 0;
if (tab.isRowsHidden()) {

      out.write("\n");
      out.write("\t<tr id=\"nodata\"><td align=\"center\">\n");
      out.write("\t");
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f1 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.LinkTag.class);
      _jspx_th_xava_005flink_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flink_005f1.setParent(null);
      // /xava/list.jsp(287,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f1.setAction("List.showRows");
      // /xava/list.jsp(287,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f1.setArgv(collectionArgv);
      int _jspx_eval_xava_005flink_005f1 = _jspx_th_xava_005flink_005f1.doStartTag();
      if (_jspx_th_xava_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005flink_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005flink_005f1);
      out.write("\n");
      out.write("\t</td></tr>\n");

	}
else {
IXTableModel model = tab.getTableModel(); 
totalSize = tab.getTotalSize();
if (totalSize > 0) {
for (int f=tab.getInitialIndex(); f<model.getRowCount() && f < tab.getFinalIndex(); f++) {
	String checked=tab.isSelected(f)?"checked='true'":"";	
	String cssClass=f%2==0?style.getListPair():style.getListOdd();	
	String cssCellClass=f%2==0?style.getListPairCell():style.getListOddCell(); 
	String cssStyle = tab.getStyle(f);
	if (cssStyle != null) {
		cssClass = cssClass + " " + cssStyle; 
		if (style.isApplySelectedStyleToCellInList()) cssCellClass = cssCellClass + " " + cssStyle; 
	}
	String events=f%2==0?style.getListPairEvents():style.getListOddEvents(); 
	String cssClassToActionOnClick = cssClass;
	if (tab.isSelected(f)){
		cssClass = "_XAVA_SELECTED_ROW_ " + cssClass; 
		rowStyle = rowStyle + " " + selectedRowStyle;
	}
	String prefixIdRow = Ids.decorate(request, prefix);	

      out.write("\n");
      out.write("<tr id=\"");
      out.print(prefixIdRow);
      out.print(f);
      out.write("\" class=\"");
      out.print(cssClass);
      out.write('"');
      out.write(' ');
      out.print(events);
      out.write(" style=\"");
      out.print(rowStyle);
      out.write("\">\n");
      out.write("\t<td class=\"");
      out.print(cssCellClass);
      out.write("\" style=\"vertical-align: middle;text-align: center; ");
      out.print(style.getListCellStyle());
      out.write("\">\n");
      out.write("\t<nobr> \n");

	if (!org.openxava.util.Is.emptyString(action)) { 

      out.write('\n');
      //  xava:action
      org.openxava.web.taglib.ActionTag _jspx_th_xava_005faction_005f1 = (org.openxava.web.taglib.ActionTag) _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ActionTag.class);
      _jspx_th_xava_005faction_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005faction_005f1.setParent(null);
      // /xava/list.jsp(318,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005faction_005f1.setAction(action);
      // /xava/list.jsp(318,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005faction_005f1.setArgv("row=" + f + actionArgv);
      int _jspx_eval_xava_005faction_005f1 = _jspx_th_xava_005faction_005f1.doStartTag();
      if (_jspx_th_xava_005faction_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f1);
      out.write('\n');

	}
	for (java.util.Iterator itRowActions = rowActions.iterator(); itRowActions.hasNext(); ) { 	
		String rowAction = (String) itRowActions.next();		

      out.write('\n');
      //  xava:action
      org.openxava.web.taglib.ActionTag _jspx_th_xava_005faction_005f2 = (org.openxava.web.taglib.ActionTag) _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ActionTag.class);
      _jspx_th_xava_005faction_005f2.setPageContext(_jspx_page_context);
      _jspx_th_xava_005faction_005f2.setParent(null);
      // /xava/list.jsp(324,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005faction_005f2.setAction(rowAction);
      // /xava/list.jsp(324,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005faction_005f2.setArgv("row=" + f + actionArgv);
      int _jspx_eval_xava_005faction_005f2 = _jspx_th_xava_005faction_005f2.doStartTag();
      if (_jspx_th_xava_005faction_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005faction_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005faction_005f2);
      out.write('\n');

	}
	String actionOnClick = Actions.getActionOnClick(
		request.getParameter("application"), request.getParameter("module"), 
		onSelectCollectionElementAction, f, viewObject, prefixIdRow + f,
		selectedRowStyle, rowStyle, 
		onSelectCollectionElementMetaAction);

      out.write("\n");
      out.write("\t</nobr> \n");
      out.write("\t</td>\n");
      out.write("\t<td class=\"");
      out.print(cssCellClass);
      out.write("\" style=\"");
      out.print(style.getListCellStyle());
      out.write("\">\n");
      out.write("\t<INPUT type=\"");
      out.print(singleSelection?"RADIO":"CHECKBOX");
      out.write("\" name=\"");
      if (_jspx_meth_xava_005fid_005f9(_jspx_page_context))
        return;
      out.write("\" value=\"");
      out.print(prefix + "selected");
      out.write(':');
      out.print(f);
      out.write('"');
      out.write(' ');
      out.print(checked);
      out.write(' ');
      out.print(actionOnClick);
      out.write(" />\n");
      out.write("\t</td>\t\n");

	for (int c=0; c<model.getColumnCount(); c++) {
		MetaProperty p = tab.getMetaProperty(c);
		String align =p.isNumber() && !p.hasValidValues()?"vertical-align: middle;text-align: right; ":"vertical-align: middle; ";
		String cellStyle = align + style.getListCellStyle();
		int columnWidth = tab.getColumnWidth(c);
		String width = columnWidth<0?"":"width: " + columnWidth + "px"; 		
		String fvalue = null;
		if (p.hasValidValues()) {
			fvalue = p.getValidValueLabel(request, model.getValueAt(f, c));
		}
		else {
			fvalue = WebEditors.format(request, p, model.getValueAt(f, c), errors, view.getViewName(), true);
		}
		Object title = WebEditors.formatTitle(request, p, model.getValueAt(f, c), errors, view.getViewName(), true); 

      out.write("\n");
      out.write("\t<td class=\"");
      out.print(cssCellClass);
      out.write("\" style=\"");
      out.print(cellStyle);
      out.write("; padding-right: 0px\">\t\n");
      out.write("\t\t");
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f2 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssStyle_005fcssClass_005fargv_005faction.get(org.openxava.web.taglib.LinkTag.class);
      _jspx_th_xava_005flink_005f2.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flink_005f2.setParent(null);
      // /xava/list.jsp(355,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f2.setAction(action);
      // /xava/list.jsp(355,2) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f2.setArgv("row=" + f + actionArgv);
      // /xava/list.jsp(355,2) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f2.setCssClass(cssStyle);
      // /xava/list.jsp(355,2) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f2.setCssStyle("text-decoration: none; outline: none");
      int _jspx_eval_xava_005flink_005f2 = _jspx_th_xava_005flink_005f2.doStartTag();
      if (_jspx_eval_xava_005flink_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t<div title=\"");
          out.print(title);
          out.write("\" class=\"");
          if (_jspx_meth_xava_005fid_005f10(_jspx_th_xava_005flink_005f2, _jspx_page_context))
            return;
          out.write(' ');
          //  xava:id
          org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f11 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
          _jspx_th_xava_005fid_005f11.setPageContext(_jspx_page_context);
          _jspx_th_xava_005fid_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_xava_005flink_005f2);
          // /xava/list.jsp(356,60) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_xava_005fid_005f11.setName(id);
          int _jspx_eval_xava_005fid_005f11 = _jspx_th_xava_005fid_005f11.doStartTag();
          if (_jspx_th_xava_005fid_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f11);
            return;
          }
          _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f11);
          out.write("_col");
          out.print(c);
          out.write("\" style=\"overflow: hidden; ");
          out.print(width);
          out.write("\">\n");
          out.write("\t\t\t\t<nobr>");
          out.print(fvalue);
          out.write("&nbsp;</nobr>\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_xava_005flink_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_xava_005flink_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssStyle_005fcssClass_005fargv_005faction.reuse(_jspx_th_xava_005flink_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssStyle_005fcssClass_005fargv_005faction.reuse(_jspx_th_xava_005flink_005f2);
      out.write("\t\n");
      out.write("\t</td>\n");

	}

      out.write("\n");
      out.write("</tr>\n");

}

      out.write("\n");
      out.write("<tr class=\"");
      out.print(style.getTotalRow());
      out.write("\">\n");
      out.write("<td style=\"");
      out.print(style.getTotalEmptyCellStyle());
      out.write("\"/>\n");
      out.write("<td style=\"");
      out.print(style.getTotalEmptyCellStyle());
      out.write("\"/>\n");

for (int c=0; c<model.getColumnCount(); c++) {
	MetaProperty p = tab.getMetaProperty(c);
	String align =p.isNumber() && !p.hasValidValues()?"vertical-align: middle;text-align: right; ":"vertical-align: middle; ";
	String cellStyle = align + style.getListCellStyle();	
	if (tab.hasTotal(c)) {
		String ftotal = WebEditors.format(request, p, tab.getTotal(c), errors, view.getViewName(), true);
	
      out.write(" \t\n");
      out.write("\t<td class=\"");
      out.print(style.getTotalCell());
      out.write("\" style=\"");
      out.print(style.getTotalCellStyle());
      out.write("\">\n");
      out.write("\t<div class=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f12 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f12.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f12.setParent(null);
      // /xava/list.jsp(380,13) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f12.setName(id);
      int _jspx_eval_xava_005fid_005f12 = _jspx_th_xava_005fid_005f12.doStartTag();
      if (_jspx_th_xava_005fid_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f12);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f12);
      out.write("_col");
      out.print(c);
      out.write("\" style=\"overflow: hidden;\">\n");
      out.write("\t<nobr>\n");
      out.write("\t");
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f5 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssStyle_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      _jspx_th_xava_005fimage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f5.setParent(null);
      // /xava/list.jsp(382,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f5.setAction("List.removeColumnSum");
      // /xava/list.jsp(382,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f5.setArgv("property="+p.getQualifiedName() + collectionArgv);
      // /xava/list.jsp(382,1) name = cssStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f5.setCssStyle("vertical-align: top;");
      int _jspx_eval_xava_005fimage_005f5 = _jspx_th_xava_005fimage_005f5.doStartTag();
      if (_jspx_th_xava_005fimage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssStyle_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssStyle_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f5);
      out.write('\n');
      out.write('	');
      out.print(ftotal);
      out.write("&nbsp;\n");
      out.write("\t</nobr>\t\n");
      out.write("\t</div>\t\n");
      out.write("\t</td>\n");
      out.write("\t");
	
	}
	else if (tab.isTotalCapable(c)) {
	
      out.write("\t \t\n");
      out.write("\t<td style=\"");
      out.print(style.getTotalCapableCellStyle() );
      out.write("\">\t\t\n");
      out.write("\t\t");
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f6 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      _jspx_th_xava_005fimage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f6.setParent(null);
      // /xava/list.jsp(392,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f6.setAction("List.sumColumn");
      // /xava/list.jsp(392,2) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f6.setArgv("property="+p.getQualifiedName() + collectionArgv);
      int _jspx_eval_xava_005fimage_005f6 = _jspx_th_xava_005fimage_005f6.doStartTag();
      if (_jspx_th_xava_005fimage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f6);
      out.write("&nbsp;\t\n");
      out.write("\t</td>\n");
      out.write("\t");
	
	}
	else {
	
      out.write("\t \n");
      out.write("\t<td style=\"");
      out.print(style.getTotalEmptyCellStyle());
      out.write("\"/>\n");
      out.write("\t");
		
	}	
}

      out.write("\n");
      out.write("</tr>\n");

}
else {

      out.write("\n");
      out.write("<tr id=\"nodata\"><td class=\"");
      out.print(totalSize==0?style.getMessages():style.getErrors());
      out.write('"');
      out.write('>');
      out.write('\n');
 if (totalSize == 0) { 
      out.write("\n");
      out.write("<b>");
      if (_jspx_meth_xava_005fmessage_005f2(_jspx_page_context))
        return;
      out.write("</b>\n");
 } else { 
      out.write("\n");
      out.write("<b>");
      if (_jspx_meth_xava_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("</b>\n");
 } 
      out.write("\n");
      out.write("</td></tr>\n");

}
}

if (lastRow != null) {

      out.write("\n");
      out.write("<tr>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, lastRow, out, false);
      out.write("\n");
      out.write("</tr>\n");

}

      out.write("\n");
      out.write("</table>\n");
      out.write("</div> \n");
      out.write("\n");
 if (!tab.isRowsHidden()) { 
      out.write("\n");
      out.write("<table width=\"100%\" class=\"");
      out.print(style.getListInfo());
      out.write("\">\n");
      out.write("<tr class='");
      out.print(style.getListInfoDetail());
      out.write("'>\n");
      out.write("<td class='");
      out.print(style.getListInfoDetail());
      out.write('\'');
      out.write('>');
      out.write('\n');

int last=tab.getLastPage();
int current=tab.getPage();
if (current > 1) {

      out.write('\n');
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f7 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      _jspx_th_xava_005fimage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f7.setParent(null);
      // /xava/list.jsp(439,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f7.setAction("List.goPreviousPage");
      // /xava/list.jsp(439,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f7.setArgv(collectionArgv);
      // /xava/list.jsp(439,0) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f7.setCssClass("page-navigation page-navigation-arrow");
      int _jspx_eval_xava_005fimage_005f7 = _jspx_th_xava_005fimage_005f7.doStartTag();
      if (_jspx_th_xava_005fimage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f7);
      out.write('\n');

}
else {

      out.write("\n");
      out.write("<span class='");
      out.print(style.getPageNavigationArrowDisable());
      out.write("'><img \n");
      out.write("\tsrc='");
      out.print(request.getContextPath());
      out.write("/xava/images/previous_page_disable.gif' \n");
      out.write("\tborder=0 align=\"absmiddle\"/></span>\n");
	
} 
for (int i=1; i<=last; i++) {
if (i == current) {

      out.write("\n");
      out.write("<span class=\"");
      out.print(style.getPageNavigationSelected());
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</span>\n");
 } else { 
      out.write('\n');
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f3 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.get(org.openxava.web.taglib.LinkTag.class);
      _jspx_th_xava_005flink_005f3.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flink_005f3.setParent(null);
      // /xava/list.jsp(454,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f3.setAction("List.goPage");
      // /xava/list.jsp(454,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f3.setArgv("page=" + i + collectionArgv);
      // /xava/list.jsp(454,0) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f3.setCssClass(style.getPageNavigation());
      int _jspx_eval_xava_005flink_005f3 = _jspx_th_xava_005flink_005f3.doStartTag();
      if (_jspx_eval_xava_005flink_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.print(i);
          int evalDoAfterBody = _jspx_th_xava_005flink_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_xava_005flink_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.reuse(_jspx_th_xava_005flink_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005flink_0026_005fcssClass_005fargv_005faction.reuse(_jspx_th_xava_005flink_005f3);
      out.write('\n');
 }} 
if (!tab.isLastPage()) {

      out.write('\n');
      //  xava:image
      org.openxava.web.taglib.ImageTag _jspx_th_xava_005fimage_005f8 = (org.openxava.web.taglib.ImageTag) _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.ImageTag.class);
      _jspx_th_xava_005fimage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fimage_005f8.setParent(null);
      // /xava/list.jsp(458,0) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f8.setAction("List.goNextPage");
      // /xava/list.jsp(458,0) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f8.setArgv(collectionArgv);
      // /xava/list.jsp(458,0) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fimage_005f8.setCssClass(style.getPageNavigationArrow());
      int _jspx_eval_xava_005fimage_005f8 = _jspx_th_xava_005fimage_005f8.doStartTag();
      if (_jspx_th_xava_005fimage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fimage_0026_005fcssClass_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005fimage_005f8);
      out.write('\n');
 
} 
else {

      out.write("\n");
      out.write("<span class='");
      out.print(style.getPageNavigationArrowDisable());
      out.write("'><img \n");
      out.write("\tsrc='");
      out.print(request.getContextPath());
      out.write("/xava/images/next_page_disable.gif' \n");
      out.write("\tborder=0 align=\"absmiddle\"/></span>\n");
	
} 

      out.write("\n");
      out.write("&nbsp;\n");
      out.write("<select id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f13 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f13.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f13.setParent(null);
      // /xava/list.jsp(470,12) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f13.setName(id + "_rowCount");
      int _jspx_eval_xava_005fid_005f13 = _jspx_th_xava_005fid_005f13.doStartTag();
      if (_jspx_th_xava_005fid_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f13);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f13);
      out.write("\" class=");
      out.print(style.getEditor());
      out.write("\n");
      out.write("\tonchange=\"openxava.setPageRowCount('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', '");
      out.print(collection==null?"":collection);
      out.write("', this)\">\n");
      out.write("\t");
 
	int [] rowCounts = { 5, 10, 15, 20 }; // The peformance with more than 20 rows is poor for page reloading 
	for (int i=0; i<rowCounts.length; i++) {
		String selected = rowCounts[i] == tab.getPageRowCount()?"selected='selected'":""; 	
	
      out.write("\t\n");
      out.write("\t<option value=\"");
      out.print(rowCounts[i]);
      out.write('"');
      out.write(' ');
      out.print(selected );
      out.write('>');
      out.print(rowCounts[i]);
      out.write("</option>\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("</select>\n");
      out.write("<span class=\"");
      out.print(style.getRowsPerPage());
      out.write("\">\t \n");
      if (_jspx_meth_xava_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</span>\n");
      out.write("</td>\n");
      out.write("<td style='text-align: right; vertical-align: middle' class='");
      out.print(style.getListInfoDetail());
      out.write('\'');
      out.write('>');
      out.write('\n');
 if (XavaPreferences.getInstance().isShowCountInList()) { 
      out.write('\n');
      //  xava:message
      org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f5 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fintParam_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
      _jspx_th_xava_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f5.setParent(null);
      // /xava/list.jsp(488,0) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fmessage_005f5.setKey("list_count");
      // /xava/list.jsp(488,0) name = intParam type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fmessage_005f5.setIntParam(totalSize);
      int _jspx_eval_xava_005fmessage_005f5 = _jspx_th_xava_005fmessage_005f5.doStartTag();
      if (_jspx_th_xava_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fintParam_005fnobody.reuse(_jspx_th_xava_005fmessage_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fintParam_005fnobody.reuse(_jspx_th_xava_005fmessage_005f5);
      out.write('\n');
 } 
      out.write('\n');
 if (collection == null) { 
      out.write('\n');
      out.write('(');
      //  xava:link
      org.openxava.web.taglib.LinkTag _jspx_th_xava_005flink_005f4 = (org.openxava.web.taglib.LinkTag) _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction_005fnobody.get(org.openxava.web.taglib.LinkTag.class);
      _jspx_th_xava_005flink_005f4.setPageContext(_jspx_page_context);
      _jspx_th_xava_005flink_005f4.setParent(null);
      // /xava/list.jsp(491,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f4.setAction("List.hideRows");
      // /xava/list.jsp(491,1) name = argv type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005flink_005f4.setArgv(collectionArgv);
      int _jspx_eval_xava_005flink_005f4 = _jspx_th_xava_005flink_005f4.doStartTag();
      if (_jspx_th_xava_005flink_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005flink_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005flink_0026_005fargv_005faction_005fnobody.reuse(_jspx_th_xava_005flink_005f4);
      out.write(')');
      out.write('\n');
 } 
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
 } 
      out.write('\n');
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

  private boolean _jspx_meth_xava_005fid_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f4 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f4.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f4.setParent(null);
    // /xava/list.jsp(105,30) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f4.setName("xava_selected_all");
    int _jspx_eval_xava_005fid_005f4 = _jspx_th_xava_005fid_005f4.doStartTag();
    if (_jspx_th_xava_005fid_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f4);
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
    // /xava/list.jsp(196,11) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f1.setKey("clear_condition_values");
    int _jspx_eval_xava_005fmessage_005f1 = _jspx_th_xava_005fmessage_005f1.doStartTag();
    if (_jspx_th_xava_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f9 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f9.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f9.setParent(null);
    // /xava/list.jsp(336,61) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f9.setName("xava_selected");
    int _jspx_eval_xava_005fid_005f9 = _jspx_th_xava_005fid_005f9.doStartTag();
    if (_jspx_th_xava_005fid_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f9);
    return false;
  }

  private boolean _jspx_meth_xava_005fid_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_xava_005flink_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  xava:id
    org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f10 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
    _jspx_th_xava_005fid_005f10.setPageContext(_jspx_page_context);
    _jspx_th_xava_005fid_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_xava_005flink_005f2);
    // /xava/list.jsp(356,34) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fid_005f10.setName("tipable");
    int _jspx_eval_xava_005fid_005f10 = _jspx_th_xava_005fid_005f10.doStartTag();
    if (_jspx_th_xava_005fid_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f10);
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
    // /xava/list.jsp(410,3) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f2.setKey("no_objects");
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
    // /xava/list.jsp(412,3) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f3.setKey("list_error");
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
    // /xava/list.jsp(483,0) name = key type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_xava_005fmessage_005f4.setKey("rows_per_page");
    int _jspx_eval_xava_005fmessage_005f4 = _jspx_th_xava_005fmessage_005f4.doStartTag();
    if (_jspx_th_xava_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f4);
    return false;
  }
}
