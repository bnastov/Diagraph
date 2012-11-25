/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3.impl;

import aigle.idm.diagraph.tp3.Tp3Package;
import aigle.idm.diagraph.tp3.ValuedNamed;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valued Named</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.ValuedNamedImpl#getPrix <em>Prix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValuedNamedImpl extends NamedImpl implements ValuedNamed {
	/**
	 * The default value of the '{@link #getPrix() <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrix()
	 * @generated
	 * @ordered
	 */
	protected static final double PRIX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrix() <em>Prix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrix()
	 * @generated
	 * @ordered
	 */
	protected double prix = PRIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuedNamedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp3Package.Literals.VALUED_NAMED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrix(double newPrix) {
		double oldPrix = prix;
		prix = newPrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp3Package.VALUED_NAMED__PRIX, oldPrix, prix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp3Package.VALUED_NAMED__PRIX:
				return getPrix();
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
			case Tp3Package.VALUED_NAMED__PRIX:
				setPrix((Double)newValue);
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
			case Tp3Package.VALUED_NAMED__PRIX:
				setPrix(PRIX_EDEFAULT);
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
			case Tp3Package.VALUED_NAMED__PRIX:
				return prix != PRIX_EDEFAULT;
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
		result.append(" (prix: ");
		result.append(prix);
		result.append(')');
		return result.toString();
	}

} //ValuedNamedImpl
