package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.openxava.view.View;
import org.openxava.view.meta.MetaGroup;
import org.openxava.view.meta.PropertiesSeparator;
import org.openxava.model.meta.MetaProperty;
import org.openxava.model.meta.MetaReference;
import org.openxava.model.meta.MetaCollection;
import org.openxava.web.WebEditors;
import org.openxava.web.taglib.IdTag;
import org.openxava.web.Ids;
import org.openxava.model.meta.MetaMember;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


private final static String LAST_TABLE_NOT_CLOSED = "xava.layout.detail.lastTableNotClose";
private boolean hasFrame(MetaMember m, View view) { 
	if (m instanceof MetaProperty) {
		return WebEditors.hasFrame((MetaProperty) m, view.getViewName());
	}
  	if (m instanceof MetaReference) {
  		return !view.displayReferenceWithNoFrameEditor((MetaReference) m);  		
  	}
  	return true;
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/xava/imports.jsp");
    _jspx_dependants.add("/xava/editorIcons.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.release();
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
      out.write('\n');
      out.write('\n');

String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
org.openxava.view.View view = (org.openxava.view.View) context.get(request, viewObject);
view.setViewObject(viewObject); 
String propertyPrefix = request.getParameter("propertyPrefix");
propertyPrefix = (propertyPrefix == null)?"":propertyPrefix; 
view.setPropertyPrefix(propertyPrefix);
boolean onlySections = view.hasSections() && view.getMetaMembers().isEmpty(); 

      out.write('\n');
      out.write('\n');
 
if (!onlySections) {	// IF Not Only Sections
	if (view.isFrame()) {	// IF Is Frame 

      out.write("\n");
      out.write("<table>\n");
      out.write("\t<tr>\n");
 
	}	// END IF Is Frame

      out.write('\n');

	Iterator it = view.getMetaMembers().iterator();
	String sfirst = request.getParameter("first");
	boolean first = !"false".equals(sfirst);
	String slast = request.getParameter("last");
	boolean last = !"false".equals(slast);
	boolean lastWasEditor = false;
	boolean lastWasProperty = false;
	boolean firstNoFrameMember = true; 
	boolean firstFrameMember = false; 
	while (it.hasNext()) {	// WHILE hasNext
		MetaMember m = (MetaMember) it.next();
		lastWasProperty = false;	
		int frameWidth = view.isVariousMembersInSameLine(m)?0:100;	
		if (!PropertiesSeparator.INSTANCE.equals(m)) {	// IF Not Properties Separator 
			if (firstNoFrameMember && !hasFrame(m, view)) {	// IF First NoFramed Member 		
					firstNoFrameMember = false;
					firstFrameMember = true;	
				if (request.getAttribute(LAST_TABLE_NOT_CLOSED) == null) {	// IF Last Table Closed

      out.write("\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tr>\n");

				} // END IF Last Table Closed
				else {	// IF Last Table Not Closed
					request.removeAttribute(LAST_TABLE_NOT_CLOSED);
				} // END IF Last Table Not Closed
			} // END IF First NoFramed Member
			else if (firstFrameMember && hasFrame(m, view)) {	// IF First Framed Member
				firstFrameMember = false;
				firstNoFrameMember = true;

      out.write("\n");
      out.write("\t\t\t</table>\n");
	
			} // END IF First Framed Member
		} // END If Not Properties Separator
		if (m instanceof MetaProperty) {	// IF MetaProperty	
			MetaProperty p = (MetaProperty) m;		
			if (!PropertiesSeparator.INSTANCE.equals(m)) {	// IF Not Properties Separator	
				boolean hasFrame = WebEditors.hasFrame(p, view.getViewName());
				lastWasEditor = !hasFrame;
				lastWasProperty = true;
				String propertyKey= Ids.decorate(
						request.getParameter("application"),
						request.getParameter("module"),
						propertyPrefix + p.getName());
				request.setAttribute(propertyKey, p);
				String urlEditor = "editor.jsp" // in this way because websphere 6 has problems with jsp:param
					+ "?propertyKey=" + propertyKey
					+ "&first=" + first
					+ "&hasFrame=" + hasFrame;		
				boolean withFrame = hasFrame && 
					(!view.isSection() || view.getMetaMembers().size() > 1);
				if (withFrame || (view.isSection() && view.getMembersNames().size() ==1)) { // IF Framed and Section
					if (first) { // IF First MetaProperty

      out.write("\t\t\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td colspan=\"4\">\n");
	
					}  // END IF First MetaProperty
				} // END IF Framed and Section
				if (withFrame) { // IF MetaPropertt With Frame			 					
					String labelKey = Ids.decorate(
						request.getParameter("application"),
						request.getParameter("module"),
						"label_" + propertyPrefix + p.getName()); 
					String label = view.getLabelFor(p);

      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t");
      out.print(style.getFrameHeaderStartDecoration(frameWidth) );
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameTitleStartDecoration() );
      out.write("\n");
      out.write("\t\t\t<span id=\"");
      out.print(labelKey);
      out.write('"');
      out.write('>');
      out.print(label);
      out.write("</span>\t\t\n");
      out.write("\t\t\t");
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
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f0 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f0.setParent(null);
      // /xava/editorIcons.jsp(6,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f0.setName("error_image_" + p.getQualifiedName());
      int _jspx_eval_xava_005fid_005f0 = _jspx_th_xava_005fid_005f0.doStartTag();
      if (_jspx_th_xava_005fid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f0);
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
      out.write("\t\t\t");
      out.print(style.getFrameTitleEndDecoration() );
      out.write("\t\n");
      out.write("\t\t\t");
      out.print(style.getFrameActionsStartDecoration());
      out.write('\n');
 
					String frameId = Ids.decorate(request, "frame_" + view.getPropertyPrefix() + p.getName());
					String frameActionsURL = "frameActions.jsp?frameId=" + frameId +
						"&closed=" + view.isFrameClosed(frameId); 

      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frameActionsURL, out, false);
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameActionsEndDecoration());
      out.write(" \t\t\t\t\t \t\t\t\t\t\n");
      out.write("\t\t\t");
      out.print(style.getFrameHeaderEndDecoration() );
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameContentStartDecoration(frameId + "content", view.isFrameClosed(frameId)));
      out.write('\n');
	
				} // END MetaProperty With Frame 

      out.write(" \n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, urlEditor, out, false);
      out.write('	');
      out.write('	');
      out.write('\n');

				if (withFrame) { // IF MetaProperty With Frame

      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameContentEndDecoration() );
      out.write('	');
      out.write('	');
      out.write('\n');

				} // END IF MetaProperty With Frame		
				first = false;
			} // END IF Not Properties Separator
			else { // IF Properties Separator
				if (!it.hasNext()) break; 					
				first = true;						
				if (lastWasEditor && !view.isAlignedByColumns()) { // IF LastWasEditor and Not Aligned 	

      out.write("\n");
      out.write("\t</tr></table>\t\t\t\n");
 
				} // END IF LastWasEditor and Not Aligned
				lastWasEditor = false;

      out.write("\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
		
			} // END IF Properties Separator
		} // END IF MetaProperty
		else { // IF Not MetaProperty
			lastWasEditor = false;
		  	if (m instanceof MetaReference) { // IF MetaReference
				MetaReference ref = (MetaReference) m;
				String referenceKey = Ids.decorate(
						request.getParameter("application"),
						request.getParameter("module"),
						propertyPrefix +  ref.getName()); 
				request.setAttribute(referenceKey, ref);
				if (view.displayReferenceWithNoFrameEditor(ref)) { // IF Display Reference Without Frame	
					lastWasEditor = true;			
					String urlReferenceEditor = "reference.jsp" // in this way because websphere 6 has problems with jsp:param
						+ "?referenceKey=" + referenceKey		
						+ "&first=" + first
						+ "&frame=false&composite=false&onlyEditor=false"; 				

      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, urlReferenceEditor, out, false);
      out.write('\n');

					first = false;		
				} // END IF Display MetaReference Without Frame
				else {	// IF Display MeteReference With Frame			
					String viewName = viewObject + "_" + ref.getName();
					View subview = view.getSubview(ref.getName());
					context.put(request, viewName, subview);
					String propertyInReferencePrefix = propertyPrefix + ref.getName() + ".";
					boolean withFrame = subview.isFrame() && 
						(!view.isSection() || view.getMetaMembers().size() > 1);
					lastWasEditor = !withFrame;
					boolean firstForSubdetail = first || withFrame;
					if (withFrame || (view.isSection() && view.getMembersNames().size() ==1)) { // IF MetaReference With Frame
						if (first) { // IF First MetaReference	

      out.write("\t\t\n");
      out.write("\t<tr><td colspan=\"4\">\n");
	
						} // END IF First MetaReference
					} // END IF MetaReference With Frame
					if (withFrame) { // IF MetaReference With Frame					 					
						String labelKey = Ids.decorate(
							request.getParameter("application"),
							request.getParameter("module"),
							"label_" + propertyPrefix + ref.getName()); 
						String label = view.getLabelFor(ref);

      out.write("\t\t\t\t\n");
      out.write("\t\t");
      out.print(style.getFrameHeaderStartDecoration(frameWidth) );
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(style.getFrameTitleStartDecoration() );
      out.write("\n");
      out.write("\t\t<span id=\"");
      out.print(labelKey);
      out.write('"');
      out.write('>');
      out.print(label);
      out.write("</span>\n");
      out.write("\t\t");
      out.print(style.getFrameTitleEndDecoration() );
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(style.getFrameActionsStartDecoration());
      out.write('\n');
 
						String frameId = Ids.decorate(request, "frame_" + view.getPropertyPrefix() + ref.getName());
						String frameActionsURL = "frameActions.jsp?frameId=" + frameId +
							"&closed=" + view.isFrameClosed(frameId); 		

      out.write('\n');
      out.write('	');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frameActionsURL, out, false);
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(style.getFrameActionsEndDecoration());
      out.write(" \t\t\t\t\t \t\t\t\t\t\n");
      out.write("\t\t");
      out.print(style.getFrameHeaderEndDecoration() );
      out.write('\n');
      out.write('	');
      out.write('	');
      out.print(style.getFrameContentStartDecoration(frameId + "content", view.isFrameClosed(frameId)) );
      out.write("\t\t\t\t\t\t\n");
		
					} // END IF MetaReference With Frame
			
					String urlReferenceEditor = null;
					if (view.displayReferenceWithNotCompositeEditor(ref)) { // IF Display Reference Without Composite Editor
						urlReferenceEditor = "reference.jsp" // in this way because websphere 6 has problems with jsp:param					
							+ "?referenceKey=" + referenceKey
							+ "&onlyEditor=true&frame=true&composite=false"		
							+ "&first=" + first;				
					} // END IF Display Reference Without Composite Editor
					else { // IF Display Reference With Composite Editor
						urlReferenceEditor = "reference.jsp" // in this way because websphere 6 has problems with jsp:param
							+ "?referenceKey=" + referenceKey
							+ "&onlyEditor=true&frame=true&composite=true"  
							+ "&viewObject=" + viewName					
							+ "&propertyPrefix=" + propertyInReferencePrefix 
							+ "&first=" + firstForSubdetail  
							+ "&last=" + !it.hasNext();
					} // END IF Display Reference With Composite Editor		

      out.write("  \n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, urlReferenceEditor, out, false);
      out.write('\n');

					if (withFrame) { // IF MetaReference With Frame

      out.write("\t\t\t\n");
      out.write("\t\t");
      out.print(style.getFrameContentEndDecoration() );
      out.write('	');
      out.write('	');
      out.write('\n');

					} // END IF MetaReference With Frame
				} // END Display MetaReference With Frame
				first = false; 
			} else if (m instanceof MetaCollection) { // IF MetaCollection
				MetaCollection collection = (MetaCollection) m;			
				boolean withFrame = !view.isSection() || view.getMetaMembers().size() > 1;
				boolean variousCollectionInLine = view.isVariousCollectionsInSameLine((MetaMember) m);
				boolean firstCollectionInLine = view.isFirstInLine((MetaMember) m);
				String styleCollectionTogether = 
					!variousCollectionInLine ? "" : 
					(firstCollectionInLine ? "float: left; " : "float: right; ") + 
					"overflow: auto; display: block ; border: 1px solid black; width: 49%; ";
				if (!variousCollectionInLine || (variousCollectionInLine && firstCollectionInLine)) { // IF Not Various Collection or First Collection In Line

      out.write("\n");
      out.write("\t<tr><td colspan=\"4\">\t\t\n");

				} // END IF Not Various Collection or First Collection In Line

      out.write("\n");
      out.write("\t\t\t<div style=\"");
      out.print(styleCollectionTogether );
      out.write('"');
      out.write('>');
      out.write('\n');
			
				if (withFrame) { // IF MetaCollection With Frame

      out.write("\t\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameHeaderStartDecoration(frameWidth));
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameTitleStartDecoration());
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(collection.getLabel(request) );
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameTitleEndDecoration());
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameActionsStartDecoration());
      out.write('\n');
 
					String frameId = Ids.decorate(request, "frame_" + view.getPropertyPrefix() + collection.getName());
					String frameActionsURL = "frameActions.jsp?frameId=" + frameId +
						"&closed=" + view.isFrameClosed(frameId);

      out.write("\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frameActionsURL, out, false);
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameActionsEndDecoration());
      out.write(" \t\t\t\t\t \t\t\t\t\t\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameHeaderEndDecoration());
      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameContentStartDecoration(frameId + "content", view.isFrameClosed(frameId)));
      out.write('\n');

				} // END IF MetaCollection With Frame

      out.write("\t\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "collection.jsp" + (("collection.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("collectionName", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(collection.getName()), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("viewObject", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(viewObject), request.getCharacterEncoding()), out, false);
      out.write('\n');
			
				if (withFrame) { // IF MetaCollection With Frame

      out.write("\n");
      out.write("\t\t\t\t");
      out.print(style.getFrameContentEndDecoration());
      out.write("\t\t\t\n");

				} // END IF MetaCollection With Frame

      out.write("\n");
      out.write("\t\t\t</div>\n");

			} else if (m instanceof MetaGroup) { // IF MetaGroup
				MetaGroup group = (MetaGroup) m;			
				String viewName = viewObject + "_" + group.getName();
				View subview = view.getGroupView(group.getName());			
				context.put(request, viewName, subview);

      out.write('\n');

				if (first) { // IF First MetaGroup
					first = false;

      out.write("\n");
      out.write("\t\t<tr><td colspan=\"4\">\n");
 
				} // END IF First MetaGroup

      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameHeaderStartDecoration(frameWidth));
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameTitleStartDecoration());
      out.write("\n");
      out.write("\t\t\t");
      out.print(group.getLabel(request));
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameTitleEndDecoration());
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameActionsStartDecoration());
      out.write('\n');
 
				String frameId = Ids.decorate(request, "frame_group_" + view.getPropertyPrefix() + group.getName());
				String frameActionsURL = "frameActions.jsp?frameId=" + frameId + 
					"&closed=" + view.isFrameClosed(frameId); 

      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, frameActionsURL, out, false);
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameActionsEndDecoration());
      out.write(" \t\t\t\t\t \t\t\t\n");
      out.write("\t\t\t");
      out.print(style.getFrameHeaderEndDecoration());
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameContentStartDecoration(frameId + "content", view.isFrameClosed(frameId)) );
      out.write("\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "detail.jsp" + (("detail.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("viewObject", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(viewName), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\t\t\t");
      out.print(style.getFrameContentEndDecoration() );
      out.write('\n');

			} // END IF MetaGroup
		} // END IF Not MetaProperty
	} // END While hasNext

      out.write('\n');
 
	if (lastWasEditor) { // IF Last Was Editor
		if (!(view.isRepresentsEntityReference() || view.isRepresentsAggregate()) || view.isFrame()) { // IF Not Entity or Aggregate or Frame

      out.write("\n");
      out.write("</tr></table> \n");
 
		} // END IF Not Entity or Aggregate or Frame

      out.write("\n");
      out.write("\t\t</td>\t\t\t\n");

	} // END IF Last Was Editor

      out.write('\n');
      out.write('\n');
      out.write('\n');
 
	if (firstFrameMember) {	// IF First Frame Member
		if (!(view.isSubview() && !view.isFrame())) { // IF Not Subview and Not Frame	

      out.write("\n");
      out.write("\t</table>\n");

		} // END IF Not Subview and Not Frame
		else { // IF Subview or Frame
			request.setAttribute(LAST_TABLE_NOT_CLOSED, new Boolean(true));
		} // END IF Subview or Frame 
	} // END IF First Frame Member

      out.write('\n');
      out.write('\n');
 	
	if (view.isFrame() && 
			!(last && view.getParent() != null && !view.getParent().isFrame()) && 			  		
			!(!lastWasProperty && view.isSection() && view.getMembersNamesWithoutSectionsAndCollections().size() == 1 
					&& view.getParent() != null && view.getParent().isFrame())) { // IF Frame	

      out.write("\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
 
	} // END IF Frame

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
} // END IF Not Only Sections 


      out.write('\n');
      out.write('\n');

if (view.hasSections()) { // IF Has Sections

      out.write('\n');
 
	if (!onlySections && view.isSubview() && !view.isFrame()) {  // IF Not Only Sections and Subview and Not Frame

      out.write(" \n");
      out.write("\t          </tr>                \n");
      out.write("              </table>\n");
      out.write("              </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td colspan=\"4\">\n");
      out.write("              <table>                \n");
      out.write("                  <tr>\n");
      out.write("                    <td>\n");

	} // END IF Not Only Sections and Subview and Not Frame

      out.write("\n");
      out.write("\t<div id=\"");
      //  xava:id
      org.openxava.web.taglib.IdTag _jspx_th_xava_005fid_005f1 = (org.openxava.web.taglib.IdTag) _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.get(org.openxava.web.taglib.IdTag.class);
      _jspx_th_xava_005fid_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fid_005f1.setParent(null);
      // /xava/detail.jsp(402,10) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_xava_005fid_005f1.setName("sections_" + viewObject);
      int _jspx_eval_xava_005fid_005f1 = _jspx_th_xava_005fid_005f1.doStartTag();
      if (_jspx_th_xava_005fid_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fxava_005fid_0026_005fname_005fnobody.reuse(_jspx_th_xava_005fid_005f1);
      out.write("\"> \n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sections.jsp", out, false);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t\n");

	if (!onlySections && view.isSubview() && !view.isFrame()) { // IF Not Only Sections and Subview and Not Frame

      out.write("\n");
      out.write("\t\t \t\t\t</td>\n");
 
	} // END IF Not Only Sections and Subview and Not Frame
}

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
