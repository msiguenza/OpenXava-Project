
// File generated by OpenXava: Mon Apr 11 14:05:49 CEST 2011
// Archivo generado por OpenXava: Mon Apr 11 14:05:49 CEST 2011

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Task		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class Task implements java.io.Serializable, org.openxava.test.model.ITask {	

	// Constructor
	public Task() {
		initMembers();
	} 

	private void initMembers() { 
		setOid(null); 
		setUser(null); 
		setUserGivenName(null); 
		setUserFamilyName(null); 
		setUserEMail(null); 
		setDate(null); 
		setSummary(null); 
		setComments(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter commentsConverter;
	private org.openxava.converters.IConverter getCommentsConverter() {
		if (commentsConverter == null) {
			try {
				commentsConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("comments");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "comments"));
			}
			
		}	
		return commentsConverter;
	} 
	private java.lang.String comments;
	private java.lang.String get_Comments() {
		return comments;
	}
	private void set_Comments(java.lang.String newComments) {
		this.comments = newComments;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.lang.String getComments() {
		try {
			return (java.lang.String) getCommentsConverter().toJava(get_Comments());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Comments", "Task", "java.lang.String"));
		}
	}
	
	/**
	 * 
	 */
	public void setComments(java.lang.String newComments) {
		try { 
			set_Comments((java.lang.String) getCommentsConverter().toDB(newComments));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Comments", "Task", "java.lang.String"));
		}		
	} 
	private static org.openxava.converters.IConverter summaryConverter;
	private org.openxava.converters.IConverter getSummaryConverter() {
		if (summaryConverter == null) {
			try {
				summaryConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("summary");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "summary"));
			}
			
		}	
		return summaryConverter;
	} 
	private java.lang.String summary;
	private java.lang.String get_Summary() {
		return summary;
	}
	private void set_Summary(java.lang.String newSummary) {
		this.summary = newSummary;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.lang.String getSummary() {
		try {
			return (java.lang.String) getSummaryConverter().toJava(get_Summary());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Summary", "Task", "java.lang.String"));
		}
	}
	
	/**
	 * 
	 */
	public void setSummary(java.lang.String newSummary) {
		try { 
			set_Summary((java.lang.String) getSummaryConverter().toDB(newSummary));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Summary", "Task", "java.lang.String"));
		}		
	} 
	private static org.openxava.converters.IConverter userConverter;
	private org.openxava.converters.IConverter getUserConverter() {
		if (userConverter == null) {
			try {
				userConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("user");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "user"));
			}
			
		}	
		return userConverter;
	} 
	private java.lang.String user;
	private java.lang.String get_User() {
		return user;
	}
	private void set_User(java.lang.String newUser) {
		this.user = newUser;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getUser() {
		try {
			return (String) getUserConverter().toJava(get_User());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "User", "Task", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setUser(String newUser) {
		try { 
			set_User((java.lang.String) getUserConverter().toDB(newUser));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "User", "Task", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter userFamilyNameConverter;
	private org.openxava.converters.IConverter getUserFamilyNameConverter() {
		if (userFamilyNameConverter == null) {
			try {
				userFamilyNameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("userFamilyName");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "userFamilyName"));
			}
			
		}	
		return userFamilyNameConverter;
	} 
	private java.lang.String userFamilyName;
	private java.lang.String get_UserFamilyName() {
		return userFamilyName;
	}
	private void set_UserFamilyName(java.lang.String newUserFamilyName) {
		this.userFamilyName = newUserFamilyName;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getUserFamilyName() {
		try {
			return (String) getUserFamilyNameConverter().toJava(get_UserFamilyName());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UserFamilyName", "Task", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setUserFamilyName(String newUserFamilyName) {
		try { 
			set_UserFamilyName((java.lang.String) getUserFamilyNameConverter().toDB(newUserFamilyName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UserFamilyName", "Task", "String"));
		}		
	} 
	private String oid;
	public String getOid() {
		return oid;
	}
	public void setOid(String newOid) {
		this.oid = newOid;
	} 
	private static org.openxava.converters.IConverter userGivenNameConverter;
	private org.openxava.converters.IConverter getUserGivenNameConverter() {
		if (userGivenNameConverter == null) {
			try {
				userGivenNameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("userGivenName");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "userGivenName"));
			}
			
		}	
		return userGivenNameConverter;
	} 
	private java.lang.String userGivenName;
	private java.lang.String get_UserGivenName() {
		return userGivenName;
	}
	private void set_UserGivenName(java.lang.String newUserGivenName) {
		this.userGivenName = newUserGivenName;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getUserGivenName() {
		try {
			return (String) getUserGivenNameConverter().toJava(get_UserGivenName());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UserGivenName", "Task", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setUserGivenName(String newUserGivenName) {
		try { 
			set_UserGivenName((java.lang.String) getUserGivenNameConverter().toDB(newUserGivenName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UserGivenName", "Task", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter dateConverter;
	private org.openxava.converters.IConverter getDateConverter() {
		if (dateConverter == null) {
			try {
				dateConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("date");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "date"));
			}
			
		}	
		return dateConverter;
	} 
	private java.sql.Date date;
	private java.sql.Date get_Date() {
		return date;
	}
	private void set_Date(java.sql.Date newDate) {
		this.date = newDate;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.util.Date getDate() {
		try {
			return (java.util.Date) getDateConverter().toJava(get_Date());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Date", "Task", "java.util.Date"));
		}
	}
	
	/**
	 * 
	 */
	public void setDate(java.util.Date newDate) {
		try { 
			set_Date((java.sql.Date) getDateConverter().toDB(newDate));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Date", "Task", "java.util.Date"));
		}		
	} 
	private static org.openxava.converters.IConverter userEMailConverter;
	private org.openxava.converters.IConverter getUserEMailConverter() {
		if (userEMailConverter == null) {
			try {
				userEMailConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("userEMail");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "userEMail"));
			}
			
		}	
		return userEMailConverter;
	} 
	private java.lang.String userEMail;
	private java.lang.String get_UserEMail() {
		return userEMail;
	}
	private void set_UserEMail(java.lang.String newUserEMail) {
		this.userEMail = newUserEMail;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getUserEMail() {
		try {
			return (String) getUserEMailConverter().toJava(get_UserEMail());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UserEMail", "Task", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setUserEMail(String newUserEMail) {
		try { 
			set_UserEMail((java.lang.String) getUserEMailConverter().toDB(newUserEMail));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "UserEMail", "Task", "String"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Task findByOid(java.lang.String oid) throws javax.ejb.ObjectNotFoundException {
 		if (XavaPreferences.getInstance().isJPAPersistence()) { 			
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from Task as o where o.oid = :arg0"); 
			query.setParameter("arg0", oid); 
 			try {
				return (Task) query.getSingleResult();
			}
			catch (Exception ex) {
				// In this way in order to work with Java pre 5 
				if (ex.getClass().getName().equals("javax.persistence.NoResultException")) {
					throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Task"));
				}
				else {
					ex.printStackTrace();
					throw new RuntimeException(ex.getMessage());
				}
			}  		
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Task as o where o.oid = :arg0"); 
			query.setParameter("arg0", oid); 
			Task r = (Task) query.uniqueResult();
			if (r == null) {
				throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Task"));
			}
			return r; 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Task").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Task"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}