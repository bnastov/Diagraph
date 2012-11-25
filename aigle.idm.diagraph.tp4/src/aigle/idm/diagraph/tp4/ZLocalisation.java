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
 * A representation of the model object '<em><b>ZLocalisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.ZLocalisation#getCordZ <em>Cord Z</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.ZLocalisation#getLocalisation <em>Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getZLocalisation()
 * @model annotation="diagraph link='null' label\075cordZ='null'"
 * @generated
 */
public interface ZLocalisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Cord Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cord Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cord Z</em>' attribute.
	 * @see #setCordZ(int)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getZLocalisation_CordZ()
	 * @model
	 * @generated
	 */
	int getCordZ();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.ZLocalisation#getCordZ <em>Cord Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cord Z</em>' attribute.
	 * @see #getCordZ()
	 * @generated
	 */
	void setCordZ(int value);

	/**
	 * Returns the value of the '<em><b>Localisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localisation</em>' reference.
	 * @see #setLocalisation(Localisation)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getZLocalisation_Localisation()
	 * @model
	 * @generated
	 */
	Localisation getLocalisation();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.ZLocalisation#getLocalisation <em>Localisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localisation</em>' reference.
	 * @see #getLocalisation()
	 * @generated
	 */
	void setLocalisation(Localisation value);

} // ZLocalisation
