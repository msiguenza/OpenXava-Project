package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.openxava.model.meta.MetaProperty;
import org.openxava.util.Strings;
import org.openxava.util.Align;
import org.openxava.util.Locales;
import org.openxava.util.XavaResources;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public final class textEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


private static Log log = LogFactory.getLog("textEditor.jsp");

private String getNumericAlt(boolean bSafari, int size, int scale) {
	try {		
		DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locales.getCurrent());
		DecimalFormatSymbols symbols = df.getDecimalFormatSymbols();
		StringBuffer result = new StringBuffer("alt='n"); // Negatives always allowed
		result.append(size > 9?"0":Integer.toString(size)); // Size
		if (scale == 0 || !df.isGroupingUsed()) result.append("x"); // no grouping separator
		else {
			switch (symbols.getGroupingSeparator()) {		
				case ',':
					if (bSafari) {
						result.append("x"); // none when browser is Safari
					}					
					else {
						result.append("c"); // comma
					}
					break;
				case '.':
					result.append("p"); // period
					break;
				case ' ':
					result.append("s"); // space
					break;
				case '\'': 
					result.append("a"); // apostrophe
					break;					
				default:
					result.append("x"); // none					
			}
		}
		result.append(df.getGroupingSize());
		switch (symbols.getDecimalSeparator()) {		
			case ',':
				result.append("c"); // comma
				break;
			default:
				result.append("p"); // period		
		}
		result.append(scale > 9?"9":Integer.toString(scale)); // Scale
		result.append("'");
		return result.toString();
	}
	catch (Exception ex) {
		log.warn(XavaResources.getString("default_numeric_editor_configuration")); 
		return "alt='n0c3p2'";
	}
}

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

String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String fvalue = (String) request.getAttribute(propertyKey + ".fvalue");
String align = p.isNumber()?"style='text-align:right'":"";
String browser = request.getHeader("user-agent").toLowerCase();
boolean bSafari = (browser != null && browser.indexOf("safari") != -1 && browser.indexOf("chrome") == -1) ? true : false;
boolean editable="true".equals(request.getParameter("editable"));
String disabled=editable?"":"disabled";
String script = request.getParameter("script");
boolean label = org.openxava.util.XavaPreferences.getInstance().isReadOnlyAsLabel();
String inputType = request.getParameter("inputType");
if (inputType == null) inputType = "text"; 
String smaxSize = request.getParameter("maxSize");
int maxSize = 0;
if (!org.openxava.util.Is.emptyString(smaxSize)) {
	maxSize = Integer.parseInt(smaxSize);
}
else {
	maxSize = org.openxava.util.XavaPreferences.getInstance().getMaxSizeForTextEditor();
}
int size = p.getSize() > maxSize?maxSize:p.getSize();
int maxLength = p.getSize();
String numericAlt = ""; 
String numericClass = ""; 
if (p.isNumber()) {
	if (p.getScale() > 0) {
		int sizeIncrement = (size - 1) / 3 + 2; // The points/commas for thousands + point/comma for decimal + minus sign
		size += sizeIncrement;
		maxLength += sizeIncrement;
	}
	String integer = p.getScale() == 0?"true":"false";	
	numericAlt = getNumericAlt(bSafari, p.getSize(), p.getScale());  
	numericClass = "xava_numeric"; 
}	

boolean fillWithZeros = "true".equals(request.getParameter("fillWithZeros"));
if (fillWithZeros && fvalue.length() > 0) {	
	fvalue = Strings.fix(fvalue, size, Align.RIGHT, '0');
}

if (editable || !label) {

      out.write("\n");
      out.write("<input id=\"");
      out.print(propertyKey);
      out.write("\"\n");
      out.write("    name=\"");
      out.print(propertyKey);
      out.write("\" class=\"");
      out.print(style.getEditor());
      out.write(' ');
      out.print(numericClass);
      out.write("\"\n");
      out.write("\ttype=\"");
      out.print(inputType);
      out.write("\" \n");
      out.write("\ttitle=\"");
      out.print(p.getDescription(request));
      out.write('"');
      out.write('\n');
      out.write('	');
      out.print(align);
      out.write("\n");
      out.write("\tmaxlength=\"");
      out.print(maxLength);
      out.write("\" \n");
      out.write("\tsize=\"");
      out.print(size);
      out.write('"');
      out.write('\n');
      out.write('	');
      out.print(numericAlt);
      out.write(" \n");
      out.write("\tvalue=\"");
      out.print(Strings.change(fvalue, "\"", "&quot;"));
      out.write("\"\t\n");
      out.write("\t");
      out.print(disabled);
      out.write('\n');
      out.write('	');
      out.print(script);
      out.write("\n");
      out.write("\t/>\n");

} else {

      out.write('\n');
      out.print(fvalue);
      out.write("&nbsp;\t\n");

}

      out.write('\n');
 if (!editable) { 
      out.write("\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.print(propertyKey);
      out.write("\" value=\"");
      out.print(fvalue);
      out.write('"');
      out.write('>');
      out.write('\n');
 } 
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
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
