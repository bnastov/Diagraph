/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see aigle.idm.diagraph.tp3.Tp3Package
 * @generated
 */
public interface Tp3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tp3Factory eINSTANCE = aigle.idm.diagraph.tp3.impl.Tp3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Livre Recettes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Livre Recettes</em>'.
	 * @generated
	 */
	LivreRecettes createLivreRecettes();

	/**
	 * Returns a new object of class '<em>Recette</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recette</em>'.
	 * @generated
	 */
	Recette createRecette();

	/**
	 * Returns a new object of class '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingredient</em>'.
	 * @generated
	 */
	Ingredient createIngredient();

	/**
	 * Returns a new object of class '<em>Vin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vin</em>'.
	 * @generated
	 */
	Vin createVin();

	/**
	 * Returns a new object of class '<em>Compose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compose</em>'.
	 * @generated
	 */
	Compose createCompose();

	/**
	 * Returns a new object of class '<em>Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Localisation</em>'.
	 * @generated
	 */
	Localisation createLocalisation();

	/**
	 * Returns a new object of class '<em>Bouteille</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bouteille</em>'.
	 * @generated
	 */
	Bouteille createBouteille();

	/**
	 * Returns a new object of class '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named</em>'.
	 * @generated
	 */
	Named createNamed();

	/**
	 * Returns a new object of class '<em>Valued Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valued Named</em>'.
	 * @generated
	 */
	ValuedNamed createValuedNamed();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Tp3Package getTp3Package();

} //Tp3Factory
