/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Localisation;
import aigle.idm.diagraph.tp4.Tp4Package;
import aigle.idm.diagraph.tp4.ZLocalisation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLocalisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.ZLocalisationImpl#getCordZ <em>Cord Z</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.ZLocalisationImpl#getLocalisation <em>Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZLocalisationImpl extends EObjectImpl implements ZLocalisation {
	/**
	 * The default value of the '{@link #getCordZ() <em>Cord Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCordZ()
	 * @generated
	 * @ordered
	 */
	protected static final int CORD_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCordZ() <em>Cord Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCordZ()
	 * @generated
	 * @ordered
	 */
	protected int cordZ = CORD_Z_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalisation() <em>Localisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisation()
	 * @generated
	 * @ordered
	 */
	protected Localisation localisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLocalisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.ZLOCALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCordZ() {
		return cordZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCordZ(int newCordZ) {
		int oldCordZ = cordZ;
		cordZ = newCordZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.ZLOCALISATION__CORD_Z, oldCordZ, cordZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation getLocalisation() {
		if (localisation != null && localisation.eIsProxy()) {
			InternalEObject oldLocalisation = (InternalEObject)localisation;
			localisation = (Localisation)eResolveProxy(oldLocalisation);
			if (localisation != oldLocalisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp4Package.ZLOCALISATION__LOCALISATION, oldLocalisation, localisation));
			}
		}
		return localisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation basicGetLocalisation() {
		return localisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalisation(Localisation newLocalisation) {
		Localisation oldLocalisation = localisation;
		localisation = newLocalisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.ZLOCALISATION__LOCALISATION, oldLocalisation, localisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp4Package.ZLOCALISATION__CORD_Z:
				return getCordZ();
			case Tp4Package.ZLOCALISATION__LOCALISATION:
				if (resolve) return getLocalisation();
				return basicGetLocalisation();
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
			case Tp4Package.ZLOCALISATION__CORD_Z:
				setCordZ((Integer)newValue);
				return;
			case Tp4Package.ZLOCALISATION__LOCALISATION:
				setLocalisation((Localisation)newValue);
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
			case Tp4Package.ZLOCALISATION__CORD_Z:
				setCordZ(CORD_Z_EDEFAULT);
				return;
			case Tp4Package.ZLOCALISATION__LOCALISATION:
				setLocalisation((Localisation)null);
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
			case Tp4Package.ZLOCALISATION__CORD_Z:
				return cordZ != CORD_Z_EDEFAULT;
			case Tp4Package.ZLOCALISATION__LOCALISATION:
				return localisation != null;
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
		result.append(" (cordZ: ");
		result.append(cordZ);
		result.append(')');
		return result.toString();
	}

} //ZLocalisationImpl
