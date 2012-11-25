/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.Processeur#get_famille <em>famille</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getProcesseur()
 * @model annotation="diagraph node='null' label\075name='null' ref\075_famille='null' style\075n2='null' style.ref._famille\075e3='null'"
 * @generated
 */
public interface Processeur extends ElementEmbarque {
	/**
	 * Returns the value of the '<em><b>famille</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>famille</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>famille</em>' reference.
	 * @see #set_famille(Famille)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getProcesseur__famille()
	 * @model
	 * @generated
	 */
	Famille get_famille();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Processeur#get_famille <em>famille</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>famille</em>' reference.
	 * @see #get_famille()
	 * @generated
	 */
	void set_famille(Famille value);

} // Processeur
