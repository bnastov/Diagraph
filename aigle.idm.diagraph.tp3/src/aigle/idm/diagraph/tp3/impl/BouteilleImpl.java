/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3.impl;

import aigle.idm.diagraph.tp3.Bouteille;
import aigle.idm.diagraph.tp3.Tp3Package;
import aigle.idm.diagraph.tp3.Vin;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bouteille</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.BouteilleImpl#get_vin <em>vin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BouteilleImpl extends ValuedNamedImpl implements Bouteille {
	/**
	 * The cached value of the '{@link #get_vin() <em>vin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_vin()
	 * @generated
	 * @ordered
	 */
	protected Vin _vin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BouteilleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp3Package.Literals.BOUTEILLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vin get_vin() {
		if (_vin != null && _vin.eIsProxy()) {
			InternalEObject old_vin = (InternalEObject)_vin;
			_vin = (Vin)eResolveProxy(old_vin);
			if (_vin != old_vin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp3Package.BOUTEILLE__VIN, old_vin, _vin));
			}
		}
		return _vin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vin basicGet_vin() {
		return _vin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_vin(Vin new_vin) {
		Vin old_vin = _vin;
		_vin = new_vin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp3Package.BOUTEILLE__VIN, old_vin, _vin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp3Package.BOUTEILLE__VIN:
				if (resolve) return get_vin();
				return basicGet_vin();
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
			case Tp3Package.BOUTEILLE__VIN:
				set_vin((Vin)newValue);
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
			case Tp3Package.BOUTEILLE__VIN:
				set_vin((Vin)null);
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
			case Tp3Package.BOUTEILLE__VIN:
				return _vin != null;
		}
		return super.eIsSet(featureID);
	}

} //BouteilleImpl
