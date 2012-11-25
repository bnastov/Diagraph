/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3.impl;

import aigle.idm.diagraph.tp3.Bouteille;
import aigle.idm.diagraph.tp3.Compose;
import aigle.idm.diagraph.tp3.Cout;
import aigle.idm.diagraph.tp3.Localisation;
import aigle.idm.diagraph.tp3.Recette;
import aigle.idm.diagraph.tp3.Tp3Package;

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
 * An implementation of the model object '<em><b>Recette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.RecetteImpl#getCout <em>Cout</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.RecetteImpl#getComposes <em>Composes</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.RecetteImpl#getOrigineRegionale <em>Origine Regionale</em>}</li>
 *   <li>{@link aigle.idm.diagraph.tp3.impl.RecetteImpl#getVins <em>Vins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecetteImpl extends NamedImpl implements Recette {
	/**
	 * The default value of the '{@link #getCout() <em>Cout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCout()
	 * @generated
	 * @ordered
	 */
	protected static final Cout COUT_EDEFAULT = Cout.FAIBLE;

	/**
	 * The cached value of the '{@link #getCout() <em>Cout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCout()
	 * @generated
	 * @ordered
	 */
	protected Cout cout = COUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposes() <em>Composes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Compose> composes;

	/**
	 * The cached value of the '{@link #getOrigineRegionale() <em>Origine Regionale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigineRegionale()
	 * @generated
	 * @ordered
	 */
	protected Localisation origineRegionale;

	/**
	 * The cached value of the '{@link #getVins() <em>Vins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVins()
	 * @generated
	 * @ordered
	 */
	protected EList<Bouteille> vins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecetteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tp3Package.Literals.RECETTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cout getCout() {
		return cout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCout(Cout newCout) {
		Cout oldCout = cout;
		cout = newCout == null ? COUT_EDEFAULT : newCout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp3Package.RECETTE__COUT, oldCout, cout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Compose> getComposes() {
		if (composes == null) {
			composes = new EObjectContainmentEList<Compose>(Compose.class, this, Tp3Package.RECETTE__COMPOSES);
		}
		return composes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation getOrigineRegionale() {
		if (origineRegionale != null && origineRegionale.eIsProxy()) {
			InternalEObject oldOrigineRegionale = (InternalEObject)origineRegionale;
			origineRegionale = (Localisation)eResolveProxy(oldOrigineRegionale);
			if (origineRegionale != oldOrigineRegionale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp3Package.RECETTE__ORIGINE_REGIONALE, oldOrigineRegionale, origineRegionale));
			}
		}
		return origineRegionale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation basicGetOrigineRegionale() {
		return origineRegionale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigineRegionale(Localisation newOrigineRegionale) {
		Localisation oldOrigineRegionale = origineRegionale;
		origineRegionale = newOrigineRegionale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp3Package.RECETTE__ORIGINE_REGIONALE, oldOrigineRegionale, origineRegionale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bouteille> getVins() {
		if (vins == null) {
			vins = new EObjectContainmentEList<Bouteille>(Bouteille.class, this, Tp3Package.RECETTE__VINS);
		}
		return vins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp3Package.RECETTE__COMPOSES:
				return ((InternalEList<?>)getComposes()).basicRemove(otherEnd, msgs);
			case Tp3Package.RECETTE__VINS:
				return ((InternalEList<?>)getVins()).basicRemove(otherEnd, msgs);
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
			case Tp3Package.RECETTE__COUT:
				return getCout();
			case Tp3Package.RECETTE__COMPOSES:
				return getComposes();
			case Tp3Package.RECETTE__ORIGINE_REGIONALE:
				if (resolve) return getOrigineRegionale();
				return basicGetOrigineRegionale();
			case Tp3Package.RECETTE__VINS:
				return getVins();
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
			case Tp3Package.RECETTE__COUT:
				setCout((Cout)newValue);
				return;
			case Tp3Package.RECETTE__COMPOSES:
				getComposes().clear();
				getComposes().addAll((Collection<? extends Compose>)newValue);
				return;
			case Tp3Package.RECETTE__ORIGINE_REGIONALE:
				setOrigineRegionale((Localisation)newValue);
				return;
			case Tp3Package.RECETTE__VINS:
				getVins().clear();
				getVins().addAll((Collection<? extends Bouteille>)newValue);
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
			case Tp3Package.RECETTE__COUT:
				setCout(COUT_EDEFAULT);
				return;
			case Tp3Package.RECETTE__COMPOSES:
				getComposes().clear();
				return;
			case Tp3Package.RECETTE__ORIGINE_REGIONALE:
				setOrigineRegionale((Localisation)null);
				return;
			case Tp3Package.RECETTE__VINS:
				getVins().clear();
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
			case Tp3Package.RECETTE__COUT:
				return cout != COUT_EDEFAULT;
			case Tp3Package.RECETTE__COMPOSES:
				return composes != null && !composes.isEmpty();
			case Tp3Package.RECETTE__ORIGINE_REGIONALE:
				return origineRegionale != null;
			case Tp3Package.RECETTE__VINS:
				return vins != null && !vins.isEmpty();
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
		result.append(" (cout: ");
		result.append(cout);
		result.append(')');
		return result.toString();
	}

} //RecetteImpl
