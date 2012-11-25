/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.Infrastructure#getCalculateurs <em>Calculateurs</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Infrastructure#getPeripheriques <em>Peripheriques</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Infrastructure#getLocalisations <em>Localisations</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.Infrastructure#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getInfrastructure()
 * @model annotation="diagraph pov='null'"
 * @generated
 */
public interface Infrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculateurs</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp4.Calculateur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculateurs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculateurs</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getInfrastructure_Calculateurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Calculateur> getCalculateurs();

	/**
	 * Returns the value of the '<em><b>Peripheriques</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp4.Peripherique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peripheriques</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peripheriques</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getInfrastructure_Peripheriques()
	 * @model containment="true"
	 * @generated
	 */
	EList<Peripherique> getPeripheriques();

	/**
	 * Returns the value of the '<em><b>Localisations</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp4.Localisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localisations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localisations</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getInfrastructure_Localisations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Localisation> getLocalisations();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(VueDocumentation)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getInfrastructure_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	VueDocumentation getDocumentation();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.Infrastructure#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(VueDocumentation value);

} // Infrastructure
