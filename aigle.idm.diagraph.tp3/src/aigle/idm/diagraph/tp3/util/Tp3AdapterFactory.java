/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3.util;

import aigle.idm.diagraph.tp3.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aigle.idm.diagraph.tp3.Tp3Package
 * @generated
 */
public class Tp3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tp3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Tp3Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tp3Switch<Adapter> modelSwitch =
		new Tp3Switch<Adapter>() {
			@Override
			public Adapter caseLivreRecettes(LivreRecettes object) {
				return createLivreRecettesAdapter();
			}
			@Override
			public Adapter caseRecette(Recette object) {
				return createRecetteAdapter();
			}
			@Override
			public Adapter caseIngredient(Ingredient object) {
				return createIngredientAdapter();
			}
			@Override
			public Adapter caseVin(Vin object) {
				return createVinAdapter();
			}
			@Override
			public Adapter caseCompose(Compose object) {
				return createComposeAdapter();
			}
			@Override
			public Adapter caseLocalisation(Localisation object) {
				return createLocalisationAdapter();
			}
			@Override
			public Adapter caseBouteille(Bouteille object) {
				return createBouteilleAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseValuedNamed(ValuedNamed object) {
				return createValuedNamedAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp3.LivreRecettes <em>Livre Recettes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp3.LivreRecettes
	 * @generated
	 */
	public Adapter createLivreRecettesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp3.Recette <em>Recette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp3.Recette
	 * @generated
	 */
	public Adapter createRecetteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp3.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp3.Ingredient
	 * @generated
	 */
	public Adapter createIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp3.Vin <em>Vin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp3.Vin
	 * @generated
	 */
	public Adapter createVinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp3.Compose <em>Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp3.Compose
	 * @generated
	 */
	public Adapter createComposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp3.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp3.Localisation
	 * @generated
	 */
	public Adapter createLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp3.Bouteille <em>Bouteille</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp3.Bouteille
	 * @generated
	 */
	public Adapter createBouteilleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp3.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp3.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp3.ValuedNamed <em>Valued Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp3.ValuedNamed
	 * @generated
	 */
	public Adapter createValuedNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Tp3AdapterFactory
