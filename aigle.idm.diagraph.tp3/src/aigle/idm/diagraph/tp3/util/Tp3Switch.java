/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3.util;

import aigle.idm.diagraph.tp3.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see aigle.idm.diagraph.tp3.Tp3Package
 * @generated
 */
public class Tp3Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tp3Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp3Switch() {
		if (modelPackage == null) {
			modelPackage = Tp3Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Tp3Package.LIVRE_RECETTES: {
				LivreRecettes livreRecettes = (LivreRecettes)theEObject;
				T result = caseLivreRecettes(livreRecettes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tp3Package.RECETTE: {
				Recette recette = (Recette)theEObject;
				T result = caseRecette(recette);
				if (result == null) result = caseNamed(recette);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tp3Package.INGREDIENT: {
				Ingredient ingredient = (Ingredient)theEObject;
				T result = caseIngredient(ingredient);
				if (result == null) result = caseValuedNamed(ingredient);
				if (result == null) result = caseNamed(ingredient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tp3Package.VIN: {
				Vin vin = (Vin)theEObject;
				T result = caseVin(vin);
				if (result == null) result = caseNamed(vin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tp3Package.COMPOSE: {
				Compose compose = (Compose)theEObject;
				T result = caseCompose(compose);
				if (result == null) result = caseNamed(compose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tp3Package.LOCALISATION: {
				Localisation localisation = (Localisation)theEObject;
				T result = caseLocalisation(localisation);
				if (result == null) result = caseNamed(localisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tp3Package.BOUTEILLE: {
				Bouteille bouteille = (Bouteille)theEObject;
				T result = caseBouteille(bouteille);
				if (result == null) result = caseValuedNamed(bouteille);
				if (result == null) result = caseNamed(bouteille);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tp3Package.NAMED: {
				Named named = (Named)theEObject;
				T result = caseNamed(named);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tp3Package.VALUED_NAMED: {
				ValuedNamed valuedNamed = (ValuedNamed)theEObject;
				T result = caseValuedNamed(valuedNamed);
				if (result == null) result = caseNamed(valuedNamed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Livre Recettes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Livre Recettes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivreRecettes(LivreRecettes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecette(Recette object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ingredient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIngredient(Ingredient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVin(Vin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompose(Compose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalisation(Localisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bouteille</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bouteille</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBouteille(Bouteille object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valued Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valued Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuedNamed(ValuedNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Tp3Switch
