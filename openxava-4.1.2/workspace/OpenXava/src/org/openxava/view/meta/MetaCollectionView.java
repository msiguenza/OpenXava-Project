package org.openxava.view.meta;

import java.io.Serializable;
import java.util.*;

import org.openxava.annotations.Tree;
import org.openxava.tab.meta.MetaRowStyle;
import org.openxava.util.Is;


/**
 * @author Javier Paniza
 */
public class MetaCollectionView extends MetaMemberView implements Serializable {
	
	private String editActionName;
	private String viewActionName; 
	private String newActionName;
	private String saveActionName;
	private String hideActionName;
	private String removeActionName;
	private String removeSelectedActionName;
	private Collection actionsDetailNames;
	private Collection actionsListNames;
	private List propertiesListNames;
	private String collectionName;
	private String mediatorClassName;
	private String viewName;
	private boolean readOnly = false;
	private boolean editOnly = false; 
	private boolean createReference = true;
	private boolean modifyReference = true; 
	private boolean asAggregate = false;
	private String propertiesListNamesAsString;
	private Collection rowStyles; 
	private String onSelectElementActionName;
	private Tree path;
	
	public void addActionDetailName(String actionName) {
		if (actionsDetailNames == null) actionsDetailNames = new ArrayList();
		actionsDetailNames.add(actionName);
	}
	
	public void addActionListName(String actionName) {
		if (actionsListNames == null) actionsListNames = new ArrayList();
		actionsListNames.add(actionName);		
	}
	
	public void addMetaRowStyle(MetaRowStyle style) {
		if (rowStyles == null) rowStyles = new ArrayList();
		rowStyles.add(style);
	}
	
	public boolean hasRowStyles() {
		return rowStyles != null;
	}
	
	public Collection getMetaRowStyles() {
		return rowStyles==null?Collections.EMPTY_LIST:rowStyles;
	}
	
	
	public String getMediatorClassName() {
		return mediatorClassName;
	}

	public void setMediatorClassName(String mediatorClassName) {
		this.mediatorClassName = mediatorClassName;
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
		
	public String getViewName() {		
		return viewName;
	}
		
	public void setViewName(String string) {
		viewName = string;
	}

	public boolean hasListProperties() {		
		return propertiesListNames != null && !propertiesListNames.isEmpty();
	}
	
	public List getPropertiesListNames() {
		return propertiesListNames == null?Collections.EMPTY_LIST:propertiesListNames;
	}
	
	public String getPropertiesListNamesAsString() { 
		return propertiesListNamesAsString;
	}

	public void setPropertiesList(String listProperties) {				 		
		if (!Is.emptyString(listProperties)) {
			propertiesListNamesAsString = listProperties;
			propertiesListNames = new ArrayList();
			StringTokenizer st = new StringTokenizer(listProperties, ",;");
			while (st.hasMoreTokens()) {
				String name = st.nextToken().trim();
				propertiesListNames.add(name); 
			}
		} 
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public void setReadOnly(boolean b) {
		readOnly = b;
	}

	public boolean isEditOnly() {
		return editOnly;
	}

	public void setEditOnly(boolean b) {
		editOnly = b;
	}

	public Collection getActionsDetailNames() {		
		return actionsDetailNames==null?Collections.EMPTY_LIST:actionsDetailNames;
	}
	
	public Collection getActionsListNames() {		
		return actionsListNames==null?Collections.EMPTY_LIST:actionsListNames;
	}
	
	public String getEditActionName() {
		return editActionName;
	}
	public void setEditActionName(String editActionName) {
		this.editActionName = editActionName;
	}

	public boolean isCreateReference() {
		return createReference;
	}

	public void setCreateReference(boolean createReference) {
		this.createReference = createReference;
	}

	public String getViewActionName() {
		return viewActionName;
	}

	public void setViewActionName(String viewActionName) {
		this.viewActionName = viewActionName;
	}

	public String getHideActionName() {
		return hideActionName;
	}

	public void setHideActionName(String hideActionName) {
		this.hideActionName = hideActionName;
	}

	public String getNewActionName() {
		return newActionName;
	}

	public void setNewActionName(String newActionName) {
		this.newActionName = newActionName;
	}

	public String getRemoveActionName() {
		return removeActionName;
	}

	public void setRemoveActionName(String removeActionName) {
		this.removeActionName = removeActionName;
	}

	public String getSaveActionName() {
		return saveActionName;
	}

	public void setSaveActionName(String saveActionName) {
		this.saveActionName = saveActionName;
	}

	public boolean isAsAggregate() {
		return asAggregate;
	}

	public void setAsAggregate(boolean asAggregate) {
		this.asAggregate = asAggregate;
	}

	public boolean isModifyReference() {
		return modifyReference;		
	}

	public void setModifyReference(boolean modifyReference) {
		this.modifyReference = modifyReference;
	}

	public String getRemoveSelectedActionName() {
		return removeSelectedActionName;
	}

	public void setRemoveSelectedActionName(String removeSelectedActionName) {
		this.removeSelectedActionName = removeSelectedActionName;
	}

	public String getOnSelectElementActionName() {
		return onSelectElementActionName;
	}

	public void setOnSelectElementActionName(String onSelectElementActionName) {
		this.onSelectElementActionName = onSelectElementActionName;
	}

	public void setPath(Tree path) {
		this.path = path;
	}

	public Tree getPath() {
		return path;
	}

}
