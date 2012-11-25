/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Calculateur;
import aigle.idm.diagraph.tp4.Infrastructure;
import aigle.idm.diagraph.tp4.Localisation;
import aigle.idm.diagraph.tp4.Peripherique;
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
 * An implementation of the model object '<em><b>Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.InfrastructureImpl#getCalculateurs <em>Calculateurs</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.InfrastructureImpl#getPeripheriques <em>Peripheriques</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.InfrastructureImpl#getLocalisations <em>Localisations</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.InfrastructureImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureImpl extends EObjectImpl implements Infrastructure {
	/**
	 * The cached value of the '{@link #getCalculateurs() <em>Calculateurs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculateurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Calculateur> calculateurs;

	/**
	 * The cached value of the '{@link #getPeripheriques() <em>Peripheriques</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeripheriques()
	 * @generated
	 * @ordered
	 */
	protected EList<Peripherique> peripheriques;

	/**
	 * The cached value of the '{@link #getLocalisations() <em>Localisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Localisation> localisations;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected VueDocumentation documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.INFRASTRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Calculateur> getCalculateurs() {
		if (calculateurs == null) {
			calculateurs = new EObjectContainmentEList<Calculateur>(Calculateur.class, this, Tp4Package.INFRASTRUCTURE__CALCULATEURS);
		}
		return calculateurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Peripherique> getPeripheriques() {
		if (peripheriques == null) {
			peripheriques = new EObjectContainmentEList<Peripherique>(Peripherique.class, this, Tp4Package.INFRASTRUCTURE__PERIPHERIQUES);
		}
		return peripheriques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Localisation> getLocalisations() {
		if (localisations == null) {
			localisations = new EObjectContainmentEList<Localisation>(Localisation.class, this, Tp4Package.INFRASTRUCTURE__LOCALISATIONS);
		}
		return localisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VueDocumentation getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(VueDocumentation newDocumentation, NotificationChain msgs) {
		VueDocumentation oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tp4Package.INFRASTRUCTURE__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(VueDocumentation newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tp4Package.INFRASTRUCTURE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tp4Package.INFRASTRUCTURE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.INFRASTRUCTURE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp4Package.INFRASTRUCTURE__CALCULATEURS:
				return ((InternalEList<?>)getCalculateurs()).basicRemove(otherEnd, msgs);
			case Tp4Package.INFRASTRUCTURE__PERIPHERIQUES:
				return ((InternalEList<?>)getPeripheriques()).basicRemove(otherEnd, msgs);
			case Tp4Package.INFRASTRUCTURE__LOCALISATIONS:
				return ((InternalEList<?>)getLocalisations()).basicRemove(otherEnd, msgs);
			case Tp4Package.INFRASTRUCTURE__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case Tp4Package.INFRASTRUCTURE__CALCULATEURS:
				return getCalculateurs();
			case Tp4Package.INFRASTRUCTURE__PERIPHERIQUES:
				return getPeripheriques();
			case Tp4Package.INFRASTRUCTURE__LOCALISATIONS:
				return getLocalisations();
			case Tp4Package.INFRASTRUCTURE__DOCUMENTATION:
				return getDocumentation();
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
			case Tp4Package.INFRASTRUCTURE__CALCULATEURS:
				getCalculateurs().clear();
				getCalculateurs().addAll((Collection<? extends Calculateur>)newValue);
				return;
			case Tp4Package.INFRASTRUCTURE__PERIPHERIQUES:
				getPeripheriques().clear();
				getPeripheriques().addAll((Collection<? extends Peripherique>)newValue);
				return;
			case Tp4Package.INFRASTRUCTURE__LOCALISATIONS:
				getLocalisations().clear();
				getLocalisations().addAll((Collection<? extends Localisation>)newValue);
				return;
			case Tp4Package.INFRASTRUCTURE__DOCUMENTATION:
				setDocumentation((VueDocumentation)newValue);
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
			case Tp4Package.INFRASTRUCTURE__CALCULATEURS:
				getCalculateurs().clear();
				return;
			case Tp4Package.INFRASTRUCTURE__PERIPHERIQUES:
				getPeripheriques().clear();
				return;
			case Tp4Package.INFRASTRUCTURE__LOCALISATIONS:
				getLocalisations().clear();
				return;
			case Tp4Package.INFRASTRUCTURE__DOCUMENTATION:
				setDocumentation((VueDocumentation)null);
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
			case Tp4Package.INFRASTRUCTURE__CALCULATEURS:
				return calculateurs != null && !calculateurs.isEmpty();
			case Tp4Package.INFRASTRUCTURE__PERIPHERIQUES:
				return peripheriques != null && !peripheriques.isEmpty();
			case Tp4Package.INFRASTRUCTURE__LOCALISATIONS:
				return localisations != null && !localisations.isEmpty();
			case Tp4Package.INFRASTRUCTURE__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //InfrastructureImpl
