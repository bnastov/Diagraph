/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3.impl;

import aigle.idm.diagraph.tp3.Ingredient;
import aigle.idm.diagraph.tp3.LivreRecettes;
import aigle.idm.diagraph.tp3.Localisation;
import aigle.idm.diagraph.tp3.Recette;
import aigle.idm.diagraph.tp3.Tp3Package;
import aigle.idm.diagraph.tp3.Vin;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Livre Recettes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.LivreRecettesImpl#getRecettes <em>Recettes</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.LivreRecettesImpl#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.LivreRecettesImpl#getDepartements <em>Departements</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.LivreRecettesImpl#getVins <em>Vins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivreRecettesImpl extends EObjectImpl implements LivreRecettes {
	/**
	 * The cached value of the '{@link #getRecettes() <em>Recettes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecettes()
	 * @generated
	 * @ordered
	 */
	protected EList<Recette> recettes;

	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> ingredients;

	/**
	 * The cached value of the '{@link #getDepartements() <em>Departements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartements()
	 * @generated
	 * @ordered
	 */
	protected EList<Localisation> departements;

	/**
	 * The cached value of the '{@link #getVins() <em>Vins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVins()
	 * @generated
	 * @ordered
	 */
	protected EList<Vin> vins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivreRecettesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp3Package.Literals.LIVRE_RECETTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recette> getRecettes() {
		if (recettes == null) {
			recettes = new EObjectContainmentEList<Recette>(Recette.class, this, Tp3Package.LIVRE_RECETTES__RECETTES);
		}
		return recettes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ingredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentEList<Ingredient>(Ingredient.class, this, Tp3Package.LIVRE_RECETTES__INGREDIENTS);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Localisation> getDepartements() {
		if (departements == null) {
			departements = new EObjectContainmentEList<Localisation>(Localisation.class, this, Tp3Package.LIVRE_RECETTES__DEPARTEMENTS);
		}
		return departements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vin> getVins() {
		if (vins == null) {
			vins = new EObjectContainmentEList<Vin>(Vin.class, this, Tp3Package.LIVRE_RECETTES__VINS);
		}
		return vins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp3Package.LIVRE_RECETTES__RECETTES:
				return ((InternalEList<?>)getRecettes()).basicRemove(otherEnd, msgs);
			case Tp3Package.LIVRE_RECETTES__INGREDIENTS:
				return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
			case Tp3Package.LIVRE_RECETTES__DEPARTEMENTS:
				return ((InternalEList<?>)getDepartements()).basicRemove(otherEnd, msgs);
			case Tp3Package.LIVRE_RECETTES__VINS:
				return ((InternalEList<?>)getVins()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp3Package.LIVRE_RECETTES__RECETTES:
				return getRecettes();
			case Tp3Package.LIVRE_RECETTES__INGREDIENTS:
				return getIngredients();
			case Tp3Package.LIVRE_RECETTES__DEPARTEMENTS:
				return getDepartements();
			case Tp3Package.LIVRE_RECETTES__VINS:
				return getVins();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tp3Package.LIVRE_RECETTES__RECETTES:
				getRecettes().clear();
				getRecettes().addAll((Collection<? extends Recette>)newValue);
				return;
			case Tp3Package.LIVRE_RECETTES__INGREDIENTS:
				getIngredients().clear();
				getIngredients().addAll((Collection<? extends Ingredient>)newValue);
				return;
			case Tp3Package.LIVRE_RECETTES__DEPARTEMENTS:
				getDepartements().clear();
				getDepartements().addAll((Collection<? extends Localisation>)newValue);
				return;
			case Tp3Package.LIVRE_RECETTES__VINS:
				getVins().clear();
				getVins().addAll((Collection<? extends Vin>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tp3Package.LIVRE_RECETTES__RECETTES:
				getRecettes().clear();
				return;
			case Tp3Package.LIVRE_RECETTES__INGREDIENTS:
				getIngredients().clear();
				return;
			case Tp3Package.LIVRE_RECETTES__DEPARTEMENTS:
				getDepartements().clear();
				return;
			case Tp3Package.LIVRE_RECETTES__VINS:
				getVins().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tp3Package.LIVRE_RECETTES__RECETTES:
				return recettes != null && !recettes.isEmpty();
			case Tp3Package.LIVRE_RECETTES__INGREDIENTS:
				return ingredients != null && !ingredients.isEmpty();
			case Tp3Package.LIVRE_RECETTES__DEPARTEMENTS:
				return departements != null && !departements.isEmpty();
			case Tp3Package.LIVRE_RECETTES__VINS:
				return vins != null && !vins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LivreRecettesImpl
