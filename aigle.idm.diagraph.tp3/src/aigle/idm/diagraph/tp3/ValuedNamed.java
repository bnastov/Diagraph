/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valued Named</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.ValuedNamed#getPrix <em>Prix</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp3.Tp3Package#getValuedNamed()
 * @model annotation="diagraph label\075name='null' label\075prix='null'"
 * @generated
 */
public interface ValuedNamed extends Named {
	/**
	 * Returns the value of the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prix</em>' attribute.
	 * @see #setPrix(double)
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getValuedNamed_Prix()
	 * @model
	 * @generated
	 */
	double getPrix();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp3.ValuedNamed#getPrix <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prix</em>' attribute.
	 * @see #getPrix()
	 * @generated
	 */
	void setPrix(double value);

} // ValuedNamed
