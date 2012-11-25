/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vue Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.VueDocumentation#getFamilles <em>Familles</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.VueDocumentation#getNomenclatures <em>Nomenclatures</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.VueDocumentation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getVueDocumentation()
 * @model annotation="diagraph node='null' label\075name='null' kref\075familles='null' kref\075nomenclatures='null' style.kref.familles\075p2='null' style.kref.nomenclatures\075p3='null'"
 * @generated
 */
public interface VueDocumentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Familles</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp4.Famille}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Familles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Familles</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getVueDocumentation_Familles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Famille> getFamilles();

	/**
	 * Returns the value of the '<em><b>Nomenclatures</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp4.Nomenclature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nomenclatures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nomenclatures</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getVueDocumentation_Nomenclatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nomenclature> getNomenclatures();

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
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getVueDocumentation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.VueDocumentation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VueDocumentation
