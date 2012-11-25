/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Calculateur;
import aigle.idm.diagraph.tp4.Interface;
import aigle.idm.diagraph.tp4.Peripherique;
import aigle.idm.diagraph.tp4.Tp4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.InterfaceImpl#get_peripherique <em>peripherique</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.InterfaceImpl#getCalculateur <em>Calculateur</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends ElementEmbarqueImpl implements Interface {
	/**
	 * The cached value of the '{@link #get_peripherique() <em>peripherique</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_peripherique()
	 * @generated
	 * @ordered
	 */
	protected Peripherique _peripherique;

	/**
	 * The cached value of the '{@link #getCalculateur() <em>Calculateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculateur()
	 * @generated
	 * @ordered
	 */
	protected Calculateur calculateur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peripherique get_peripherique() {
		if (_peripherique != null && _peripherique.eIsProxy()) {
			InternalEObject old_peripherique = (InternalEObject)_peripherique;
			_peripherique = (Peripherique)eResolveProxy(old_peripherique);
			if (_peripherique != old_peripherique) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp4Package.INTERFACE__PERIPHERIQUE, old_peripherique, _peripherique));
			}
		}
		return _peripherique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peripherique basicGet_peripherique() {
		return _peripherique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_peripherique(Peripherique new_peripherique) {
		Peripherique old_peripherique = _peripherique;
		_peripherique = new_peripherique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.INTERFACE__PERIPHERIQUE, old_peripherique, _peripherique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calculateur getCalculateur() {
		if (calculateur != null && calculateur.eIsProxy()) {
			InternalEObject oldCalculateur = (InternalEObject)calculateur;
			calculateur = (Calculateur)eResolveProxy(oldCalculateur);
			if (calculateur != oldCalculateur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp4Package.INTERFACE__CALCULATEUR, oldCalculateur, calculateur));
			}
		}
		return calculateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calculateur basicGetCalculateur() {
		return calculateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculateur(Calculateur newCalculateur) {
		Calculateur oldCalculateur = calculateur;
		calculateur = newCalculateur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.INTERFACE__CALCULATEUR, oldCalculateur, calculateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp4Package.INTERFACE__PERIPHERIQUE:
				if (resolve) return get_peripherique();
				return basicGet_peripherique();
			case Tp4Package.INTERFACE__CALCULATEUR:
				if (resolve) return getCalculateur();
				return basicGetCalculateur();
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
			case Tp4Package.INTERFACE__PERIPHERIQUE:
				set_peripherique((Peripherique)newValue);
				return;
			case Tp4Package.INTERFACE__CALCULATEUR:
				setCalculateur((Calculateur)newValue);
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
			case Tp4Package.INTERFACE__PERIPHERIQUE:
				set_peripherique((Peripherique)null);
				return;
			case Tp4Package.INTERFACE__CALCULATEUR:
				setCalculateur((Calculateur)null);
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
			case Tp4Package.INTERFACE__PERIPHERIQUE:
				return _peripherique != null;
			case Tp4Package.INTERFACE__CALCULATEUR:
				return calculateur != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
