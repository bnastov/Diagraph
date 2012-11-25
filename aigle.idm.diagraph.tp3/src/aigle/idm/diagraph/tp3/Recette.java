/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.Recette#getCout <em>Cout</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.Recette#getComposes <em>Composes</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.Recette#getOrigineRegionale <em>Origine Regionale</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.Recette#getVins <em>Vins</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp3.Tp3Package#getRecette()
 * @model annotation="diagraph node='null' kref\075vins='null' ref\075origineRegionale='null' lnk\075composes='null' nav:ingredient='null' style\075n1='null' style.kref.vins\075p1='null'"
 * @generated
 */
public interface Recette extends Named {
	/**
	 * Returns the value of the '<em><b>Cout</b></em>' attribute.
	 * The literals are from the enumeration {@link aigle.idm.diagraph.tp3.Cout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cout</em>' attribute.
	 * @see aigle.idm.diagraph.tp3.Cout
	 * @see #setCout(Cout)
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getRecette_Cout()
	 * @model
	 * @generated
	 */
	Cout getCout();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp3.Recette#getCout <em>Cout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cout</em>' attribute.
	 * @see aigle.idm.diagraph.tp3.Cout
	 * @see #getCout()
	 * @generated
	 */
	void setCout(Cout value);

	/**
	 * Returns the value of the '<em><b>Composes</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp3.Compose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composes</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getRecette_Composes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Compose> getComposes();

	/**
	 * Returns the value of the '<em><b>Origine Regionale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origine Regionale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origine Regionale</em>' reference.
	 * @see #setOrigineRegionale(Localisation)
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getRecette_OrigineRegionale()
	 * @model
	 * @generated
	 */
	Localisation getOrigineRegionale();

	/**
	 * Sets the value of the '{@link aigle.idm.diagraph.tp3.Recette#getOrigineRegionale <em>Origine Regionale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origine Regionale</em>' reference.
	 * @see #getOrigineRegionale()
	 * @generated
	 */
	void setOrigineRegionale(Localisation value);

	/**
	 * Returns the value of the '<em><b>Vins</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp3.Bouteille}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vins</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getRecette_Vins()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<Bouteille> getVins();

} // Recette
