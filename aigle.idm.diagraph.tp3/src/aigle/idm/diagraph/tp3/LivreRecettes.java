/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Livre Recettes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.LivreRecettes#getRecettes <em>Recettes</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.LivreRecettes#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.LivreRecettes#getDepartements <em>Departements</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.LivreRecettes#getVins <em>Vins</em>}</li>
 * </ul>
 * </p>
 *
 * @see aigle.idm.diagraph.tp3.Tp3Package#getLivreRecettes()
 * @model annotation="diagraph pov='null'"
 * @generated
 */
public interface LivreRecettes extends EObject {
	/**
	 * Returns the value of the '<em><b>Recettes</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp3.Recette}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recettes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recettes</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getLivreRecettes_Recettes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recette> getRecettes();

	/**
	 * Returns the value of the '<em><b>Ingredients</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp3.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredients</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getLivreRecettes_Ingredients()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ingredient> getIngredients();

	/**
	 * Returns the value of the '<em><b>Departements</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp3.Localisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departements</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getLivreRecettes_Departements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Localisation> getDepartements();

	/**
	 * Returns the value of the '<em><b>Vins</b></em>' containment reference list.
	 * The list contents are of type {@link aigle.idm.diagraph.tp3.Vin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vins</em>' containment reference list.
	 * @see aigle.idm.diagraph.tp3.Tp3Package#getLivreRecettes_Vins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vin> getVins();

} // LivreRecettes
