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
 * A representation of the model object '<em><b>Nomenclature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.Nomenclature#getName <em>Name</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Nomenclature#getZlocalisation <em>Zlocalisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getNomenclature()
 * @model annotation="diagraph node='null' label\075name='null' lnk\075zlocalisation='null' nav:localisation='null'"
 * @generated
 */
public interface Nomenclature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getNomenclature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Nomenclature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Zlocalisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zlocalisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zlocalisation</em>' containment reference.
	 * @see #setZlocalisation(ZLocalisation)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getNomenclature_Zlocalisation()
	 * @model containment="true"
	 * @generated
	 */
	ZLocalisation getZlocalisation();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Nomenclature#getZlocalisation <em>Zlocalisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zlocalisation</em>' containment reference.
	 * @see #getZlocalisation()
	 * @generated
	 */
	void setZlocalisation(ZLocalisation value);

} // Nomenclature
