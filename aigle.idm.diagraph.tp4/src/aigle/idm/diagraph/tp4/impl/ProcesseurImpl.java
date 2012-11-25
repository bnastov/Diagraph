/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Famille;
import aigle.idm.diagraph.tp4.Processeur;
import aigle.idm.diagraph.tp4.Tp4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processeur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.ProcesseurImpl#get_famille <em>famille</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcesseurImpl extends ElementEmbarqueImpl implements Processeur {
	/**
	 * The cached value of the '{@link #get_famille() <em>famille</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_famille()
	 * @generated
	 * @ordered
	 */
	protected Famille _famille;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcesseurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.PROCESSEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Famille get_famille() {
		if (_famille != null && _famille.eIsProxy()) {
			InternalEObject old_famille = (InternalEObject)_famille;
			_famille = (Famille)eResolveProxy(old_famille);
			if (_famille != old_famille) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp4Package.PROCESSEUR__FAMILLE, old_famille, _famille));
			}
		}
		return _famille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Famille basicGet_famille() {
		return _famille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_famille(Famille new_famille) {
		Famille old_famille = _famille;
		_famille = new_famille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.PROCESSEUR__FAMILLE, old_famille, _famille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp4Package.PROCESSEUR__FAMILLE:
				if (resolve) return get_famille();
				return basicGet_famille();
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
			case Tp4Package.PROCESSEUR__FAMILLE:
				set_famille((Famille)newValue);
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
			case Tp4Package.PROCESSEUR__FAMILLE:
				set_famille((Famille)null);
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
			case Tp4Package.PROCESSEUR__FAMILLE:
				return _famille != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcesseurImpl
