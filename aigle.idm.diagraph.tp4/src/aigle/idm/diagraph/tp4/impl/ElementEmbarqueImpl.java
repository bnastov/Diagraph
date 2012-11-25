/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.ElementEmbarque;
import aigle.idm.diagraph.tp4.Tp4Package;
import aigle.idm.diagraph.tp4.Trace;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Embarque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.ElementEmbarqueImpl#getName <em>Name</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.ElementEmbarqueImpl#getCadence <em>Cadence</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.ElementEmbarqueImpl#getTrace <em>Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementEmbarqueImpl extends EObjectImpl implements ElementEmbarque {
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
	 * The default value of the '{@link #getCadence() <em>Cadence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCadence()
	 * @generated
	 * @ordered
	 */
	protected static final double CADENCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCadence() <em>Cadence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCadence()
	 * @generated
	 * @ordered
	 */
	protected double cadence = CADENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected Trace trace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementEmbarqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.ELEMENT_EMBARQUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.ELEMENT_EMBARQUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCadence() {
		return cadence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCadence(double newCadence) {
		double oldCadence = cadence;
		cadence = newCadence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.ELEMENT_EMBARQUE__CADENCE, oldCadence, cadence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace getTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrace(Trace newTrace, NotificationChain msgs) {
		Trace oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tp4Package.ELEMENT_EMBARQUE__TRACE, oldTrace, newTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(Trace newTrace) {
		if (newTrace != trace) {
			NotificationChain msgs = null;
			if (trace != null)
				msgs = ((InternalEObject)trace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tp4Package.ELEMENT_EMBARQUE__TRACE, null, msgs);
			if (newTrace != null)
				msgs = ((InternalEObject)newTrace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tp4Package.ELEMENT_EMBARQUE__TRACE, null, msgs);
			msgs = basicSetTrace(newTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.ELEMENT_EMBARQUE__TRACE, newTrace, newTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp4Package.ELEMENT_EMBARQUE__TRACE:
				return basicSetTrace(null, msgs);
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
			case Tp4Package.ELEMENT_EMBARQUE__NAME:
				return getName();
			case Tp4Package.ELEMENT_EMBARQUE__CADENCE:
				return getCadence();
			case Tp4Package.ELEMENT_EMBARQUE__TRACE:
				return getTrace();
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
			case Tp4Package.ELEMENT_EMBARQUE__NAME:
				setName((String)newValue);
				return;
			case Tp4Package.ELEMENT_EMBARQUE__CADENCE:
				setCadence((Double)newValue);
				return;
			case Tp4Package.ELEMENT_EMBARQUE__TRACE:
				setTrace((Trace)newValue);
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
			case Tp4Package.ELEMENT_EMBARQUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tp4Package.ELEMENT_EMBARQUE__CADENCE:
				setCadence(CADENCE_EDEFAULT);
				return;
			case Tp4Package.ELEMENT_EMBARQUE__TRACE:
				setTrace((Trace)null);
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
			case Tp4Package.ELEMENT_EMBARQUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tp4Package.ELEMENT_EMBARQUE__CADENCE:
				return cadence != CADENCE_EDEFAULT;
			case Tp4Package.ELEMENT_EMBARQUE__TRACE:
				return trace != null;
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
		result.append(", cadence: ");
		result.append(cadence);
		result.append(')');
		return result.toString();
	}

} //ElementEmbarqueImpl
