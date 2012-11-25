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
 * A representation of the model object '<em><b>Element Embarque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.ElementEmbarque#getName <em>Name</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.ElementEmbarque#getCadence <em>Cadence</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.ElementEmbarque#getTrace <em>Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp4.Tp4Package#getElementEmbarque()
 * @model annotation="diagraph label\075name='null' label\075cadence='null'"
 * @generated
 */
public interface ElementEmbarque extends EObject {
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
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getElementEmbarque_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.ElementEmbarque#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cadence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cadence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cadence</em>' attribute.
	 * @see #setCadence(double)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getElementEmbarque_Cadence()
	 * @model
	 * @generated
	 */
	double getCadence();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.ElementEmbarque#getCadence <em>Cadence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cadence</em>' attribute.
	 * @see #getCadence()
	 * @generated
	 */
	void setCadence(double value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference.
	 * @see #setTrace(Trace)
	 * @see aigle.idm.diagraph.tp4.Tp4Package#getElementEmbarque_Trace()
	 * @model containment="true"
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp4.ElementEmbarque#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

} // ElementEmbarque
