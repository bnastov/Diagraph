/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Nomenclature;
import aigle.idm.diagraph.tp4.Tp4Package;
import aigle.idm.diagraph.tp4.ZLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nomenclature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.NomenclatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.NomenclatureImpl#getZlocalisation <em>Zlocalisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NomenclatureImpl extends EObjectImpl implements Nomenclature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZlocalisation() <em>Zlocalisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZlocalisation()
	 * @generated
	 * @ordered
	 */
	protected ZLocalisation zlocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NomenclatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.NOMENCLATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.NOMENCLATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZLocalisation getZlocalisation() {
		return zlocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZlocalisation(ZLocalisation newZlocalisation, NotificationChain msgs) {
		ZLocalisation oldZlocalisation = zlocalisation;
		zlocalisation = newZlocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tp4Package.NOMENCLATURE__ZLOCALISATION, oldZlocalisation, newZlocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZlocalisation(ZLocalisation newZlocalisation) {
		if (newZlocalisation != zlocalisation) {
			NotificationChain msgs = null;
			if (zlocalisation != null)
				msgs = ((InternalEObject)zlocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tp4Package.NOMENCLATURE__ZLOCALISATION, null, msgs);
			if (newZlocalisation != null)
				msgs = ((InternalEObject)newZlocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tp4Package.NOMENCLATURE__ZLOCALISATION, null, msgs);
			msgs = basicSetZlocalisation(newZlocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.NOMENCLATURE__ZLOCALISATION, newZlocalisation, newZlocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp4Package.NOMENCLATURE__ZLOCALISATION:
				return basicSetZlocalisation(null, msgs);
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
			case Tp4Package.NOMENCLATURE__NAME:
				return getName();
			case Tp4Package.NOMENCLATURE__ZLOCALISATION:
				return getZlocalisation();
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
			case Tp4Package.NOMENCLATURE__NAME:
				setName((String)newValue);
				return;
			case Tp4Package.NOMENCLATURE__ZLOCALISATION:
				setZlocalisation((ZLocalisation)newValue);
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
			case Tp4Package.NOMENCLATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tp4Package.NOMENCLATURE__ZLOCALISATION:
				setZlocalisation((ZLocalisation)null);
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
			case Tp4Package.NOMENCLATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tp4Package.NOMENCLATURE__ZLOCALISATION:
				return zlocalisation != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NomenclatureImpl
