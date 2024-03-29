/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.Compose#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.Compose#get_ingredient <em>ingredient</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp3.Tp3Package#getCompose()
 * @model annotation="diagraph link='null' label\075quantite='null' style\075e1='null'"
 * @generated
 */
public interface Compose extends Named {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #setQuantite(int)
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getCompose_Quantite()
	 * @model
	 * @generated
	 */
	int getQuantite();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp3.Compose#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(int value);

	/**
	 * Returns the value of the '<em><b>ingredient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ingredient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ingredient</em>' reference.
	 * @see #set_ingredient(Ingredient)
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getCompose__ingredient()
	 * @model
	 * @generated
	 */
	Ingredient get_ingredient();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp3.Compose#get_ingredient <em>ingredient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ingredient</em>' reference.
	 * @see #get_ingredient()
	 * @generated
	 */
	void set_ingredient(Ingredient value);

} // Compose
