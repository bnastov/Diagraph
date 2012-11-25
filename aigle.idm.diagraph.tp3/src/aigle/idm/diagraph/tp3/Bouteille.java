/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bouteille</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.Bouteille#get_vin <em>vin</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp3.Tp3Package#getBouteille()
 * @model annotation="diagraph node='null' ref\075_vin='null'"
 * @generated
 */
public interface Bouteille extends ValuedNamed {
	/**
	 * Returns the value of the '<em><b>vin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>vin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>vin</em>' reference.
	 * @see #set_vin(Vin)
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getBouteille__vin()
	 * @model
	 * @generated
	 */
	Vin get_vin();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp3.Bouteille#get_vin <em>vin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>vin</em>' reference.
	 * @see #get_vin()
	 * @generated
	 */
	void set_vin(Vin value);

} // Bouteille
