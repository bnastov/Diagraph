/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peripherique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.Peripherique#getNature <em>Nature</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getPeripherique()
 * @model annotation="diagraph node='null' label\075name='null' label\075nature='null' style\075n3='null' lnk\075trace='null'"
 * @generated
 */
public interface Peripherique extends ElementEmbarque {
	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link aigle.idm.diagraph.tp4.Nature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see aigle.idm.diagraph.tp4.Nature
	 * @see #setNature(Nature)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getPeripherique_Nature()
	 * @model
	 * @generated
	 */
	Nature getNature();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Peripherique#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see aigle.idm.diagraph.tp4.Nature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(Nature value);

} // Peripherique
