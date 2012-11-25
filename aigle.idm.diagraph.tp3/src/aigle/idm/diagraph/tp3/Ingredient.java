/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.Ingredient#getNature <em>Nature</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp3.Tp3Package#getIngredient()
 * @model annotation="diagraph node='null' style\075n5='null'"
 * @generated
 */
public interface Ingredient extends ValuedNamed {
	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link aigle.idm.diagraph.tp3.Nature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see aigle.idm.diagraph.tp3.Nature
	 * @see #setNature(Nature)
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getIngredient_Nature()
	 * @model
	 * @generated
	 */
	Nature getNature();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp3.Ingredient#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see aigle.idm.diagraph.tp3.Nature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(Nature value);

} // Ingredient
