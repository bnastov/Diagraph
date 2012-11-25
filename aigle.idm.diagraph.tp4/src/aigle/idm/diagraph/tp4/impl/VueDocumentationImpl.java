/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Famille;
import aigle.idm.diagraph.tp4.Nomenclature;
import aigle.idm.diagraph.tp4.Tp4Package;
import aigle.idm.diagraph.tp4.VueDocumentation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vue Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.VueDocumentationImpl#getFamilles <em>Familles</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.VueDocumentationImpl#getNomenclatures <em>Nomenclatures</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.VueDocumentationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VueDocumentationImpl extends EObjectImpl implements VueDocumentation {
	/**
	 * The cached value of the '{@link #getFamilles() <em>Familles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilles()
	 * @generated
	 * @ordered
	 */
	protected EList<Famille> familles;

	/**
	 * The cached value of the '{@link #getNomenclatures() <em>Nomenclatures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomenclatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Nomenclature> nomenclatures;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VueDocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.VUE_DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Famille> getFamilles() {
		if (familles == null) {
			familles = new EObjectContainmentEList<Famille>(Famille.class, this, Tp4Package.VUE_DOCUMENTATION__FAMILLES);
		}
		return familles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nomenclature> getNomenclatures() {
		if (nomenclatures == null) {
			nomenclatures = new EObjectContainmentEList<Nomenclature>(Nomenclature.class, this, Tp4Package.VUE_DOCUMENTATION__NOMENCLATURES);
		}
		return nomenclatures;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.VUE_DOCUMENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp4Package.VUE_DOCUMENTATION__FAMILLES:
				return ((InternalEList<?>)getFamilles()).basicRemove(otherEnd, msgs);
			case Tp4Package.VUE_DOCUMENTATION__NOMENCLATURES:
				return ((InternalEList<?>)getNomenclatures()).basicRemove(otherEnd, msgs);
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
			case Tp4Package.VUE_DOCUMENTATION__FAMILLES:
				return getFamilles();
			case Tp4Package.VUE_DOCUMENTATION__NOMENCLATURES:
				return getNomenclatures();
			case Tp4Package.VUE_DOCUMENTATION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tp4Package.VUE_DOCUMENTATION__FAMILLES:
				getFamilles().clear();
				getFamilles().addAll((Collection<? extends Famille>)newValue);
				return;
			case Tp4Package.VUE_DOCUMENTATION__NOMENCLATURES:
				getNomenclatures().clear();
				getNomenclatures().addAll((Collection<? extends Nomenclature>)newValue);
				return;
			case Tp4Package.VUE_DOCUMENTATION__NAME:
				setName((String)newValue);
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
			case Tp4Package.VUE_DOCUMENTATION__FAMILLES:
				getFamilles().clear();
				return;
			case Tp4Package.VUE_DOCUMENTATION__NOMENCLATURES:
				getNomenclatures().clear();
				return;
			case Tp4Package.VUE_DOCUMENTATION__NAME:
				setName(NAME_EDEFAULT);
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
			case Tp4Package.VUE_DOCUMENTATION__FAMILLES:
				return familles != null && !familles.isEmpty();
			case Tp4Package.VUE_DOCUMENTATION__NOMENCLATURES:
				return nomenclatures != null && !nomenclatures.isEmpty();
			case Tp4Package.VUE_DOCUMENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //VueDocumentationImpl
