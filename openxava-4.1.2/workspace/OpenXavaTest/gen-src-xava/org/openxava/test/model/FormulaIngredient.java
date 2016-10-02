
// File generated by OpenXava: Mon Apr 11 14:05:50 CEST 2011
// Archivo generado por OpenXava: Mon Apr 11 14:05:50 CEST 2011

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Formula		Aggregate/Agregado: FormulaIngredient

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
public class FormulaIngredient implements java.io.Serializable, org.openxava.test.model.IFormulaIngredient {	

	// Constructor
	public FormulaIngredient() {
		initMembers();
	} 

	private void initMembers() { 
		setOid(null); 
		setImage(null); 	
	} 
	
	// Properties/Propiedades 
	private String oid;
	public String getOid() {
		return oid;
	}
	public void setOid(String newOid) {
		this.oid = newOid;
	} 
	private static org.openxava.converters.IConverter imageConverter;
	private org.openxava.converters.IConverter getImageConverter() {
		if (imageConverter == null) {
			try {
				imageConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("image");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "image"));
			}
			
		}	
		return imageConverter;
	} 
	private byte[] image;
	private byte[] get_Image() {
		return image;
	}
	private void set_Image(byte[] newImage) {
		this.image = newImage;
	} 	
	
	/**
	 * 
	 * 
	 */
	public byte[] getImage() {
		try {
			return (byte[]) getImageConverter().toJava(get_Image());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Image", "FormulaIngredient", "byte[]"));
		}
	}
	
	/**
	 * 
	 */
	public void setImage(byte[] newImage) {
		try { 
			set_Image((byte[]) getImageConverter().toDB(newImage));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Image", "FormulaIngredient", "byte[]"));
		}		
	} 

	// References/Referencias 

	private org.openxava.test.model.IIngredient ingredient; 	
	public org.openxava.test.model.IIngredient getIngredient() {
		if (ingredient != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				ingredient.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return ingredient;
	}
	public void setIngredient(org.openxava.test.model.IIngredient newIngredient) {
		if (newIngredient != null && !(newIngredient instanceof org.openxava.test.model.Ingredient)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.ingredient = newIngredient; 
	} 

	private org.openxava.test.model.IIngredient accentuate; 	
	public org.openxava.test.model.IIngredient getAccentuate() {
		if (accentuate != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				accentuate.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return accentuate;
	}
	public void setAccentuate(org.openxava.test.model.IIngredient newIngredient) {
		if (newIngredient != null && !(newIngredient instanceof org.openxava.test.model.Ingredient)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.accentuate = newIngredient; 
	} 

	private org.openxava.test.model.IFormula anotherFormula; 	
	public org.openxava.test.model.IFormula getAnotherFormula() {
		if (anotherFormula != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				anotherFormula.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return anotherFormula;
	}
	public void setAnotherFormula(org.openxava.test.model.IFormula newFormula) {
		if (newFormula != null && !(newFormula instanceof org.openxava.test.model.Formula)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.anotherFormula = newFormula; 
	} 

	private org.openxava.test.model.IFormula formula; 	
	public org.openxava.test.model.IFormula getFormula() {
		if (formula != null) {
			// Because not-found='ignore' annul lazy initialization, we simulate it
			try {
				formula.toString();
			}
			catch (Exception ex) {
				return null;
			}
		}	
		return formula;
	}
	public void setFormula(org.openxava.test.model.IFormula newFormula) {
		if (newFormula != null && !(newFormula instanceof org.openxava.test.model.Formula)) {
			throw new IllegalArgumentException(XavaResources.getString("ejb_to_pojo_illegal")); 
		}
		this.formula = newFormula; 
	} 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) { 
			metaModel = MetaComponent.get("Formula").getMetaAggregate("FormulaIngredient"); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "FormulaIngredient"));
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