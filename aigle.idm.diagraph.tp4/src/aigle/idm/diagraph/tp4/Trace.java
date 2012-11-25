/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.Trace#getT_nomenclature <em>Tnomenclature</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Trace#getDate_heure <em>Date heure</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getTrace()
 * @model annotation="diagraph link='null' label\075date_heure='null' style\075e2='null'"
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Tnomenclature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tnomenclature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tnomenclature</em>' reference.
	 * @see #setT_nomenclature(Nomenclature)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getTrace_T_nomenclature()
	 * @model
	 * @generated
	 */
	Nomenclature getT_nomenclature();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Trace#getT_nomenclature <em>Tnomenclature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tnomenclature</em>' reference.
	 * @see #getT_nomenclature()
	 * @generated
	 */
	void setT_nomenclature(Nomenclature value);

	/**
	 * Returns the value of the '<em><b>Date heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date heure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date heure</em>' attribute.
	 * @see #setDate_heure(String)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getTrace_Date_heure()
	 * @model
	 * @generated
	 */
	String getDate_heure();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Trace#getDate_heure <em>Date heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date heure</em>' attribute.
	 * @see #getDate_heure()
	 * @generated
	 */
	void setDate_heure(String value);

} // Trace
