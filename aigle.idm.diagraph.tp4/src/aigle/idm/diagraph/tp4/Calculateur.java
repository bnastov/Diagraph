/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculateur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.Calculateur#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Calculateur#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Calculateur#getProcesseurs <em>Processeurs</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getCalculateur()
 * @model annotation="diagraph node='null' label\075name='null' kref\075processeurs='null' style\075n1='null' style.kref.processeurs\075p1='null'"
 * @generated
 */
public interface Calculateur extends ElementEmbarque {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link aigle.idm.diagraph.tp4.Categorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see aigle.idm.diagraph.tp4.Categorie
	 * @see #setCategorie(Categorie)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getCalculateur_Categorie()
	 * @model
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Calculateur#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see aigle.idm.diagraph.tp4.Categorie
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(Categorie value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp4.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getCalculateur_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Processeurs</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp4.Processeur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processeurs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processeurs</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getCalculateur_Processeurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Processeur> getProcesseurs();

} // Calculateur
