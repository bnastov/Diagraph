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
 * A representation of the model object '<em><b>Localisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.Localisation#getName <em>Name</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Localisation#getCoteX <em>Cote X</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Localisation#getCoteY <em>Cote Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getLocalisation()
 * @model annotation="diagraph node='null' label\075name='null' label\075coteX='null' label\075coteY='null' style\075n4='null'"
 * @generated
 */
public interface Localisation extends EObject {
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
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getLocalisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Localisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cote X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cote X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cote X</em>' attribute.
	 * @see #setCoteX(int)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getLocalisation_CoteX()
	 * @model
	 * @generated
	 */
	int getCoteX();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Localisation#getCoteX <em>Cote X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cote X</em>' attribute.
	 * @see #getCoteX()
	 * @generated
	 */
	void setCoteX(int value);

	/**
	 * Returns the value of the '<em><b>Cote Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cote Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cote Y</em>' attribute.
	 * @see #setCoteY(int)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getLocalisation_CoteY()
	 * @model
	 * @generated
	 */
	int getCoteY();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Localisation#getCoteY <em>Cote Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cote Y</em>' attribute.
	 * @see #getCoteY()
	 * @generated
	 */
	void setCoteY(int value);

} // Localisation
