/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Localisation;
import aigle.idm.diagraph.tp4.Tp4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.LocalisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.LocalisationImpl#getCoteX <em>Cote X</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.LocalisationImpl#getCoteY <em>Cote Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalisationImpl extends EObjectImpl implements Localisation {
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
	 * The default value of the '{@link #getCoteX() <em>Cote X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoteX()
	 * @generated
	 * @ordered
	 */
	protected static final int COTE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoteX() <em>Cote X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoteX()
	 * @generated
	 * @ordered
	 */
	protected int coteX = COTE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoteY() <em>Cote Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoteY()
	 * @generated
	 * @ordered
	 */
	protected static final int COTE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoteY() <em>Cote Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoteY()
	 * @generated
	 * @ordered
	 */
	protected int coteY = COTE_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.LOCALISATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.LOCALISATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoteX() {
		return coteX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoteX(int newCoteX) {
		int oldCoteX = coteX;
		coteX = newCoteX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.LOCALISATION__COTE_X, oldCoteX, coteX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoteY() {
		return coteY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoteY(int newCoteY) {
		int oldCoteY = coteY;
		coteY = newCoteY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.LOCALISATION__COTE_Y, oldCoteY, coteY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp4Package.LOCALISATION__NAME:
				return getName();
			case Tp4Package.LOCALISATION__COTE_X:
				return getCoteX();
			case Tp4Package.LOCALISATION__COTE_Y:
				return getCoteY();
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
			case Tp4Package.LOCALISATION__NAME:
				setName((String)newValue);
				return;
			case Tp4Package.LOCALISATION__COTE_X:
				setCoteX((Integer)newValue);
				return;
			case Tp4Package.LOCALISATION__COTE_Y:
				setCoteY((Integer)newValue);
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
			case Tp4Package.LOCALISATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tp4Package.LOCALISATION__COTE_X:
				setCoteX(COTE_X_EDEFAULT);
				return;
			case Tp4Package.LOCALISATION__COTE_Y:
				setCoteY(COTE_Y_EDEFAULT);
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
			case Tp4Package.LOCALISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tp4Package.LOCALISATION__COTE_X:
				return coteX != COTE_X_EDEFAULT;
			case Tp4Package.LOCALISATION__COTE_Y:
				return coteY != COTE_Y_EDEFAULT;
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
		result.append(", coteX: ");
		result.append(coteX);
		result.append(", coteY: ");
		result.append(coteY);
		result.append(')');
		return result.toString();
	}

} //LocalisationImpl
