/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Calculateur;
import aigle.idm.diagraph.tp4.Categorie;
import aigle.idm.diagraph.tp4.Interface;
import aigle.idm.diagraph.tp4.Processeur;
import aigle.idm.diagraph.tp4.Tp4Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculateur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.CalculateurImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.CalculateurImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp4.impl.CalculateurImpl#getProcesseurs <em>Processeurs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalculateurImpl extends ElementEmbarqueImpl implements Calculateur {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final Categorie CATEGORIE_EDEFAULT = Categorie.TEMPS_REEL_DUR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected Categorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getProcesseurs() <em>Processeurs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesseurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Processeur> processeurs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculateurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp4Package.Literals.CALCULATEUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(Categorie newCategorie) {
		Categorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp4Package.CALCULATEUR__CATEGORIE, oldCategorie, categorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, Tp4Package.CALCULATEUR__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processeur> getProcesseurs() {
		if (processeurs == null) {
			processeurs = new EObjectContainmentEList<Processeur>(Processeur.class, this, Tp4Package.CALCULATEUR__PROCESSEURS);
		}
		return processeurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp4Package.CALCULATEUR__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case Tp4Package.CALCULATEUR__PROCESSEURS:
				return ((InternalEList<?>)getProcesseurs()).basicRemove(otherEnd, msgs);
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
			case Tp4Package.CALCULATEUR__CATEGORIE:
				return getCategorie();
			case Tp4Package.CALCULATEUR__INTERFACES:
				return getInterfaces();
			case Tp4Package.CALCULATEUR__PROCESSEURS:
				return getProcesseurs();
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
			case Tp4Package.CALCULATEUR__CATEGORIE:
				setCategorie((Categorie)newValue);
				return;
			case Tp4Package.CALCULATEUR__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case Tp4Package.CALCULATEUR__PROCESSEURS:
				getProcesseurs().clear();
				getProcesseurs().addAll((Collection<? extends Processeur>)newValue);
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
			case Tp4Package.CALCULATEUR__CATEGORIE:
				setCategorie(CATEGORIE_EDEFAULT);
				return;
			case Tp4Package.CALCULATEUR__INTERFACES:
				getInterfaces().clear();
				return;
			case Tp4Package.CALCULATEUR__PROCESSEURS:
				getProcesseurs().clear();
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
			case Tp4Package.CALCULATEUR__CATEGORIE:
				return categorie != CATEGORIE_EDEFAULT;
			case Tp4Package.CALCULATEUR__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case Tp4Package.CALCULATEUR__PROCESSEURS:
				return processeurs != null && !processeurs.isEmpty();
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
		result.append(" (categorie: ");
		result.append(categorie);
		result.append(')');
		return result.toString();
	}

} //CalculateurImpl
