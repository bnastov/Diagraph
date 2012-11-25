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
 * A representation of the model object '<em><b>Famille</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.Famille#getNom <em>Nom</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Famille#getDocus <em>Docus</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getFamille()
 * @model annotation="diagraph node='null' label\075nom='null' kref\075docus='null' style\075n2='null' style.kref.docus\075p4='null'"
 * @generated
 */
public interface Famille extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getFamille_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Famille#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Docus</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp4.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docus</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getFamille_Docus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documentation> getDocus();

} // Famille
