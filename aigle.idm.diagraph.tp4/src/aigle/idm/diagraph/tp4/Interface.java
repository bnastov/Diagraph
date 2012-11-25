/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.Interface#get_peripherique <em>peripherique</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Interface#getCalculateur <em>Calculateur</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getInterface()
 * @model annotation="diagraph link='null' cont\075Calculateur.interfaces='null' lsrc\075calculateur='null' ltrg\075_peripherique='null' style\075e1='null'"
 * @generated
 */
public interface Interface extends ElementEmbarque {
	/**
	 * Returns the value of the '<em><b>peripherique</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>peripherique</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>peripherique</em>' reference.
	 * @see #set_peripherique(Peripherique)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getInterface__peripherique()
	 * @model
	 * @generated
	 */
	Peripherique get_peripherique();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Interface#get_peripherique <em>peripherique</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>peripherique</em>' reference.
	 * @see #get_peripherique()
	 * @generated
	 */
	void set_peripherique(Peripherique value);

	/**
	 * Returns the value of the '<em><b>Calculateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculateur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculateur</em>' reference.
	 * @see #setCalculateur(Calculateur)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getInterface_Calculateur()
	 * @model
	 * @generated
	 */
	Calculateur getCalculateur();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Interface#getCalculateur <em>Calculateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculateur</em>' reference.
	 * @see #getCalculateur()
	 * @generated
	 */
	void setCalculateur(Calculateur value);

} // Interface
