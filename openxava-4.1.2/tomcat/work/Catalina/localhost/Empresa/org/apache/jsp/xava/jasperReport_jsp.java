package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import org.openxava.util.XavaResources;
import org.openxava.util.Primitives;
import org.openxava.util.Strings;
import org.openxava.util.Is;
import org.openxava.tab.meta.MetaTab;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.model.meta.MetaProperty;
import org.openxava.util.XSystem;
import org.openxava.util.XavaPreferences;

public final class jasperReport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {



private static int EXTRA_WIDTH = 5; 

private void tightenWidths(int [] widths) {	
	int max = 190;
	int littleOnesTotal = 0;
	int littleOnesCount = 0;
	for (int i=0; i<widths.length; i++) {
		if (widths[i] <= 20) {
			littleOnesTotal+=widths[i];
			littleOnesCount++;
		}
	}	
	int spaceForBigOnes = max - littleOnesTotal;
	int bigOnesCount = widths.length - littleOnesCount; 
	int widthForBig = bigOnesCount==0?20:spaceForBigOnes / bigOnesCount; 
	if (widthForBig < 20) widthForBig = 20;
	for (int i=0; i<widths.length; i++) {
		if (widths[i] > 20 && widths[i] > widthForBig) widths[i] = widths[i] = widthForBig;
	}		
}

private String getType(MetaProperty p) throws Exception {
	if (p.hasValidValues() || 
		p.getType().equals(boolean.class) ||
		p.getType().equals(java.lang.Object.class)) return "java.lang.String";
	if (java.sql.Timestamp.class.equals(p.getType())) return "java.lang.String";
	if (java.util.Date.class.equals(p.getType())) return "java.lang.String";
	if (java.math.BigDecimal.class.equals(p.getType())) return "java.lang.String";
	if (java.sql.Time.class.equals(p.getType())) return "java.lang.String";
	if (java.lang.Number.class.isAssignableFrom(Primitives.toWrapperClass(p.getType()))) return "java.lang.Number";
	return Primitives.toWrapperClass(p.getType()).getName();
}

private String getAlign(MetaProperty p) throws Exception {
	String align = "Left";
	if (p.isNumber() && !p.hasValidValues()) align = "Right";
	else if (p.getType().equals(boolean.class)) align = "Center";
	return align;
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

      out.print("<?xml version='1.0' encoding='" + org.openxava.util.XSystem.getEncoding() + "' ?>");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE jasperReport PUBLIC \"-//JasperReports//DTD Report Design//EN\" \n");
      out.write("\"http://jasperreports.sourceforge.net/dtds/jasperreport.dtd\">\n");
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

String modelName = request.getParameter("model");
String reportName = Strings.change(modelName, ".", "_");
MetaModel metaModel = MetaModel.get(modelName);
String tabName = request.getParameter("tab");
MetaTab tab = null;
if (tabName.startsWith(org.openxava.tab.Tab.COLLECTION_PREFIX)) {
	tab = MetaTab.createDefault(metaModel);
}
else {
	MetaComponent component = metaModel.getMetaComponent();
	tab = component.getMetaTab(tabName);
}
String propertiesNames = request.getParameter("properties");
if (!Is.emptyString(propertiesNames)) {
	tab = tab.cloneMetaTab();
	tab.setPropertiesNames(propertiesNames);
}
java.util.Set totalProperties = Strings.toSet(request.getParameter("totalProperties"));
String language = request.getParameter("language");
if (language == null) language = org.openxava.util.Locales.getCurrent().getDisplayLanguage();
language = language == null?request.getLocale().getDisplayLanguage():language;
java.util.Locale locale = new java.util.Locale(language, "");

int columnsSeparation = 10; 
Iterator it = tab.getMetaProperties().iterator();
int [] widths = new int[tab.getMetaProperties().size()];
int totalWidth = 0;
int i=0;
while (it.hasNext()) {
	MetaProperty p = (MetaProperty) it.next();
	String label = p.getLabel(locale);	
	widths[i]=Math.max(p.getSize(), label.length());
	totalWidth+=widths[i];
	i++;
}
int letterWidth;
int letterSize;
int detailHeight;
int pageWidth;
int pageHeight;
int columnWidth;
String orientation = null;

if (totalWidth > 120) {
	tightenWidths(widths);
	orientation="Landscape";
	letterWidth = 4;
	letterSize = 7;
	detailHeight = 10;
	pageWidth=842;
	pageHeight=595;
	columnWidth=780;	
}
else if (totalWidth > 90) {
	orientation="Landscape";
	letterWidth = 6;
	letterSize=8;
	detailHeight = 10;
	pageWidth=842;
	pageHeight=595;
	columnWidth=780;	
} 
else if (totalWidth > 53) {
	orientation="Portrait";
	letterWidth = 6;
	letterSize=8;
	detailHeight = 10;
	pageWidth=595;
	pageHeight=842;
	columnWidth=535;
}
else {
	orientation="Portrait";
	letterWidth = 10;
	letterSize = 12;
	detailHeight = 15;
	pageWidth=595;
	pageHeight=842;
	columnWidth=535;
}


      out.write("\n");
      out.write("\n");
      out.write("<jasperReport\n");
      out.write("\t\t name=\"");
      out.print(reportName);
      out.write("\"\n");
      out.write("\t\t columnCount=\"1\"\n");
      out.write("\t\t printOrder=\"Vertical\"\n");
      out.write("\t\t orientation=\"");
      out.print(orientation);
      out.write("\"\n");
      out.write("\t\t pageWidth=\"");
      out.print(pageWidth);
      out.write("\"\n");
      out.write("\t\t pageHeight=\"");
      out.print(pageHeight);
      out.write("\"\n");
      out.write("\t\t columnWidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t columnSpacing=\"0\"\n");
      out.write("\t\t leftMargin=\"30\"\n");
      out.write("\t\t rightMargin=\"30\"\n");
      out.write("\t\t topMargin=\"20\"\n");
      out.write("\t\t bottomMargin=\"20\"\n");
      out.write("\t\t whenNoDataType=\"NoPages\"\n");
      out.write("\t\t isTitleNewPage=\"false\"\n");
      out.write("\t\t isSummaryNewPage=\"false\">\t\t \n");
      out.write("\t");

	String fontPath=request.getSession().getServletContext().getRealPath("/WEB-INF/fonts/").concat(System.getProperty("file.separator"));
	String fontName="DejaVu Sans";
	String fontNameExt="DejaVuSans.ttf";
	String boldFontNameExt="DejaVuSans-Bold.ttf";	
	String pdfEncoding="Identity-H";
	
      out.write("\t\n");
      out.write("\t<reportFont name=\"Arial_Normal\" isDefault=\"true\" fontName=\"");
      out.print(fontName);
      out.write("\" size=\"8\" pdfFontName=\"");
      out.print(fontPath.concat(fontNameExt));
      out.write("\" pdfEncoding=\"");
      out.print(pdfEncoding);
      out.write("\" isPdfEmbedded=\"true\"/>\n");
      out.write("\t<reportFont name=\"Arial_Bold\" isDefault=\"false\" fontName=\"");
      out.print(fontName);
      out.write("\" size=\"8\" isBold=\"true\" pdfFontName=\"");
      out.print(fontPath.concat(boldFontNameExt));
      out.write("\" pdfEncoding=\"");
      out.print(pdfEncoding);
      out.write("\" isPdfEmbedded=\"true\"/>\n");
      out.write("\t<reportFont name=\"Arial_Italic\" isDefault=\"false\" fontName=\"");
      out.print(fontName);
      out.write("\" size=\"8\" isItalic=\"true\" pdfFontName=\"");
      out.print(fontPath.concat(fontNameExt));
      out.write("\" pdfEncoding=\"");
      out.print(pdfEncoding);
      out.write("\" isPdfEmbedded=\"true\"/>\n");
      out.write("\n");
      out.write("\t<parameter name=\"Title\" class=\"java.lang.String\"/>\t\n");
      out.write("\t<parameter name=\"Organization\" class=\"java.lang.String\"/>\n");
      out.write("\t");

	it = tab.getMetaProperties().iterator();
	while (it.hasNext()) {
		MetaProperty p = (MetaProperty) it.next();				
		if (totalProperties.contains(p.getQualifiedName())) {
			String type=getType(p);			
	
      out.write("\n");
      out.write("\t<parameter name=\"");
      out.print(p.getQualifiedName());
      out.write("__TOTAL__\" class=\"");
      out.print(type);
      out.write("\"/> \t\n");
      out.write("\t");

		}
	}
	
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t");

	it = tab.getMetaProperties().iterator();
	while (it.hasNext()) {
		MetaProperty p = (MetaProperty) it.next();
		String type=getType(p); 
	
      out.write("\n");
      out.write("\t<field name=\"");
      out.print(Strings.change(p.getQualifiedName(), ".", "_"));
      out.write("\" class=\"");
      out.print(type);
      out.write("\"/> \t\n");
      out.write("\t");

	}
	
      out.write("\t\n");
      out.write("\t\t<background>\n");
      out.write("\t\t\t<band height=\"0\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</background>\n");
      out.write("\t\t<title>\n");
      out.write("\t\t\t<band height=\"25\"  isSplitAllowed=\"true\" >\n");
      out.write("\n");
      out.write("\t\t\t\t<textField>\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\"\n");
      out.write("\t\t\t\t\t\twidth=\"200\"\n");
      out.write("\t\t\t\t\t\theight=\"25\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Left\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"8\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t<textFieldExpression class=\"java.lang.String\">$P{Organization}</textFieldExpression>\t\t\t\t\t\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<textField>\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"61\"\n");
      out.write("\t\t\t\t\t\ty=\"5\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth - 125);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"20\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Center\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"16\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t<textFieldExpression class=\"java.lang.String\">$P{Title}</textFieldExpression>\t\t\t\t\t\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"23\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"1Point\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- Top line\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"3\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"1Point\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
      out.write("\t\t\t\t-->\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</title>\n");
      out.write("\t\t<pageHeader>\n");
      out.write("\t\t\t<band height=\"9\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</pageHeader>\n");
      out.write("\t\t<columnHeader>\n");
      out.write("\t\t\t<band height=\"15\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t\t<rectangle radius=\"0\" >\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"15\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#808080\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"None\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</rectangle>\n");
      out.write("\t\t\t\t<line direction=\"BottomUp\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"Thin\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
      out.write("\t\t\t\t<line direction=\"BottomUp\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"14\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"Thin\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");

it = tab.getMetaProperties().iterator();
int x = 0;
i=0;
while (it.hasNext()) {			
	MetaProperty p = (MetaProperty) it.next();
	int width=widths[i++]*letterWidth + EXTRA_WIDTH; 		

      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<staticText>\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(x);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"2\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(width);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"13\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"");
      out.print(getAlign(p));
      out.write("\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"10\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t");
 String label = "<![CDATA[" + p.getLabel(locale) + "]]>"; 
      out.write("\n");
      out.write("\t\t\t\t\t<text>");
      out.print(label);
      out.write("</text>\n");
      out.write("\t\t\t\t</staticText>\n");

	x+=(width+columnsSeparation);
}

      out.write("\t\t\t\t\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</columnHeader>\n");
      out.write("\t\t\n");
      out.write("\t\t<detail>\n");
      out.write("\t\t\t<band height=\"19\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\" \n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#808080\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"Float\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"true\"/>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"Thin\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");

it = tab.getMetaProperties().iterator();
x = 0;
i=0;
while (it.hasNext()) {			
	MetaProperty p = (MetaProperty) it.next();	
	int width=widths[i++]*letterWidth + + EXTRA_WIDTH; 

      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"true\" pattern=\"\" isBlankWhenNull=\"true\" evaluationTime=\"Now\" hyperlinkType=\"None\" >\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(x);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"2\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(width);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"");
      out.print(detailHeight);
      out.write("\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"");
      out.print(getAlign(p));
      out.write("\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"");
      out.print(letterSize);
      out.write("\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t");
		
					String type=getType(p);
					
      out.write("\n");
      out.write("\t\t\t\t\t<textFieldExpression   class=\"");
      out.print(type);
      out.write("\">$F{");
      out.print(Strings.change(p.getQualifiedName(), ".", "_"));
      out.write("}</textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");

	x+=(width+columnsSeparation);
}

      out.write("\t\t\t\t\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</detail>\n");
      out.write("\t\t<pageFooter>\n");
      out.write("\t\t\t<band height=\"27\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"false\" pattern=\"\" isBlankWhenNull=\"false\" evaluationTime=\"Now\" hyperlinkType=\"None\" >\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(columnWidth - 210);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"4\"\n");
      out.write("\t\t\t\t\t\twidth=\"174\"\n");
      out.write("\t\t\t\t\t\theight=\"19\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Right\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"10\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t");

				String iniPageLabel = "<![CDATA[\"" + XavaResources.getString(request, "page") + " \"";
				String endPageLabel = " \" " + XavaResources.getString("of") + " \"]]>";
				
      out.write("\n");
      out.write("\t\t\t\t<textFieldExpression class=\"java.lang.String\">");
      out.print(iniPageLabel);
      out.write(" + $V{PAGE_NUMBER} + ");
      out.print(endPageLabel);
      out.write("</textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"false\" pattern=\"\" isBlankWhenNull=\"false\" evaluationTime=\"Report\" hyperlinkType=\"None\" >\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(columnWidth - 36);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"4\"\n");
      out.write("\t\t\t\t\t\twidth=\"36\"\n");
      out.write("\t\t\t\t\t\theight=\"19\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Left\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"10\" />\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t<textFieldExpression   class=\"java.lang.String\"><![CDATA[\" \" + $V{PAGE_NUMBER}]]></textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"1\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"2Point\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"false\" pattern=\"\" isBlankWhenNull=\"false\" evaluationTime=\"Now\" hyperlinkType=\"None\" >\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"1\"\n");
      out.write("\t\t\t\t\t\ty=\"6\"\n");
      out.write("\t\t\t\t\t\twidth=\"209\"\n");
      out.write("\t\t\t\t\t\theight=\"19\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"Left\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Normal\" size=\"10\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t<textFieldExpression   class=\"java.lang.String\">\n");
      out.write("\t\t\t\t\t<![CDATA[java.text.DateFormat.getDateInstance().format(new java.util.Date())]]>\n");
      out.write("\t\t\t\t</textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</pageFooter>\n");
      out.write("\t\t<summary>\n");
      out.write("\t\t\t<band height=\"19\"  isSplitAllowed=\"true\" >\n");
      out.write("\t\t\t\t<line direction=\"TopDown\">\n");
      out.write("\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Opaque\"\n");
      out.write("\t\t\t\t\t\tx=\"0\"\n");
      out.write("\t\t\t\t\t\ty=\"0\" \n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(columnWidth);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"0\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#808080\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"Float\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"true\"/>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<graphicElement stretchType=\"NoStretch\" pen=\"Thin\" fill=\"Solid\" />\n");
      out.write("\t\t\t\t</line>\n");

it = tab.getMetaProperties().iterator();
x = 0;
i=0;
while (it.hasNext()) {			
	MetaProperty p = (MetaProperty) it.next();	
	int width=widths[i++]*letterWidth + + EXTRA_WIDTH;
	if (totalProperties.contains(p.getQualifiedName())) { 

      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<textField isStretchWithOverflow=\"true\" pattern=\"\" isBlankWhenNull=\"true\" evaluationTime=\"Now\" hyperlinkType=\"None\" >\t\t\t\t\t<reportElement\n");
      out.write("\t\t\t\t\t\tmode=\"Transparent\"\n");
      out.write("\t\t\t\t\t\tx=\"");
      out.print(x);
      out.write("\"\n");
      out.write("\t\t\t\t\t\ty=\"2\"\n");
      out.write("\t\t\t\t\t\twidth=\"");
      out.print(width);
      out.write("\"\n");
      out.write("\t\t\t\t\t\theight=\"");
      out.print(detailHeight);
      out.write("\"\n");
      out.write("\t\t\t\t\t\tforecolor=\"#000000\"\n");
      out.write("\t\t\t\t\t\tbackcolor=\"#FFFFFF\"\n");
      out.write("\t\t\t\t\t\tpositionType=\"FixRelativeToTop\"\n");
      out.write("\t\t\t\t\t\tisPrintRepeatedValues=\"true\"\n");
      out.write("\t\t\t\t\t\tisRemoveLineWhenBlank=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintInFirstWholeBand=\"false\"\n");
      out.write("\t\t\t\t\t\tisPrintWhenDetailOverflows=\"false\"/>\n");
      out.write("\t\t\t\t\t<textElement textAlignment=\"");
      out.print(getAlign(p));
      out.write("\" verticalAlignment=\"Top\" lineSpacing=\"Single\">\n");
      out.write("\t\t\t\t\t\t<font reportFont=\"Arial_Bold\" size=\"");
      out.print(letterSize);
      out.write("\"/>\n");
      out.write("\t\t\t\t\t</textElement>\n");
      out.write("\t\t\t\t\t");
		
					String type=getType(p);										
					
      out.write("\n");
      out.write("\t\t\t\t\t<textFieldExpression class=\"");
      out.print(type);
      out.write("\">$P{");
      out.print(Strings.change(p.getQualifiedName(), ".", "_"));
      out.write("__TOTAL__}</textFieldExpression>\n");
      out.write("\t\t\t\t</textField>\n");

	} 			
	x+=(width+columnsSeparation);
}

      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t</band>\n");
      out.write("\t\t</summary>\n");
      out.write("</jasperReport>\n");
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
