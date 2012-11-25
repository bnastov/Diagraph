/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3.impl;

import aigle.idm.diagraph.tp3.Compose;
import aigle.idm.diagraph.tp3.Ingredient;
import aigle.idm.diagraph.tp3.Tp3Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.ComposeImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.ComposeImpl#get_ingredient <em>ingredient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComposeImpl extends NamedImpl implements Compose {
	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected int quantite = QUANTITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #get_ingredient() <em>ingredient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_ingredient()
	 * @generated
	 * @ordered
	 */
	protected Ingredient _ingredient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp3Package.Literals.COMPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(int newQuantite) {
		int oldQuantite = quantite;
		quantite = newQuantite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp3Package.COMPOSE__QUANTITE, oldQuantite, quantite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient get_ingredient() {
		if (_ingredient != null && _ingredient.eIsProxy()) {
			InternalEObject old_ingredient = (InternalEObject)_ingredient;
			_ingredient = (Ingredient)eResolveProxy(old_ingredient);
			if (_ingredient != old_ingredient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp3Package.COMPOSE__INGREDIENT, old_ingredient, _ingredient));
			}
		}
		return _ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingredient basicGet_ingredient() {
		return _ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_ingredient(Ingredient new_ingredient) {
		Ingredient old_ingredient = _ingredient;
		_ingredient = new_ingredient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp3Package.COMPOSE__INGREDIENT, old_ingredient, _ingredient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp3Package.COMPOSE__QUANTITE:
				return getQuantite();
			case Tp3Package.COMPOSE__INGREDIENT:
				if (resolve) return get_ingredient();
				return basicGet_ingredient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tp3Package.COMPOSE__QUANTITE:
				setQuantite((Integer)newValue);
				return;
			case Tp3Package.COMPOSE__INGREDIENT:
				set_ingredient((Ingredient)newValue);
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
			case Tp3Package.COMPOSE__QUANTITE:
				setQuantite(QUANTITE_EDEFAULT);
				return;
			case Tp3Package.COMPOSE__INGREDIENT:
				set_ingredient((Ingredient)null);
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
			case Tp3Package.COMPOSE__QUANTITE:
				return quantite != QUANTITE_EDEFAULT;
			case Tp3Package.COMPOSE__INGREDIENT:
				return _ingredient != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (quantite: ");
		result.append(quantite);
		result.append(')');
		return result.toString();
	}

} //ComposeImpl
