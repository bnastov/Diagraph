/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Nomenclature;
import aigle.idm.diagraph.tp4.Tp4Package;
import aigle.idm.diagraph.tp4.Trace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.TraceImpl#getT_nomenclature <em>Tnomenclature</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.TraceImpl#getDate_heure <em>Date heure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceImpl extends EObjectImpl implements Trace {
	/**
	 * The cached value of the '{@link #getT_nomenclature() <em>Tnomenclature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_nomenclature()
	 * @generated
	 * @ordered
	 */
	protected Nomenclature t_nomenclature;

	/**
	 * The default value of the '{@link #getDate_heure() <em>Date heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_heure()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_HEURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate_heure() <em>Date heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_heure()
	 * @generated
	 * @ordered
	 */
	protected String date_heure = DATE_HEURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nomenclature getT_nomenclature() {
		if (t_nomenclature != null && t_nomenclature.eIsProxy()) {
			InternalEObject oldT_nomenclature = (InternalEObject)t_nomenclature;
			t_nomenclature = (Nomenclature)eResolveProxy(oldT_nomenclature);
			if (t_nomenclature != oldT_nomenclature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp4Package.TRACE__TNOMENCLATURE, oldT_nomenclature, t_nomenclature));
			}
		}
		return t_nomenclature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nomenclature basicGetT_nomenclature() {
		return t_nomenclature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_nomenclature(Nomenclature newT_nomenclature) {
		Nomenclature oldT_nomenclature = t_nomenclature;
		t_nomenclature = newT_nomenclature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.TRACE__TNOMENCLATURE, oldT_nomenclature, t_nomenclature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate_heure() {
		return date_heure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_heure(String newDate_heure) {
		String oldDate_heure = date_heure;
		date_heure = newDate_heure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.TRACE__DATE_HEURE, oldDate_heure, date_heure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp4Package.TRACE__TNOMENCLATURE:
				if (resolve) return getT_nomenclature();
				return basicGetT_nomenclature();
			case Tp4Package.TRACE__DATE_HEURE:
				return getDate_heure();
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
			case Tp4Package.TRACE__TNOMENCLATURE:
				setT_nomenclature((Nomenclature)newValue);
				return;
			case Tp4Package.TRACE__DATE_HEURE:
				setDate_heure((String)newValue);
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
			case Tp4Package.TRACE__TNOMENCLATURE:
				setT_nomenclature((Nomenclature)null);
				return;
			case Tp4Package.TRACE__DATE_HEURE:
				setDate_heure(DATE_HEURE_EDEFAULT);
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
			case Tp4Package.TRACE__TNOMENCLATURE:
				return t_nomenclature != null;
			case Tp4Package.TRACE__DATE_HEURE:
				return DATE_HEURE_EDEFAULT == null ? date_heure != null : !DATE_HEURE_EDEFAULT.equals(date_heure);
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
		result.append(" (date_heure: ");
		result.append(date_heure);
		result.append(')');
		return result.toString();
	}

} //TraceImpl
