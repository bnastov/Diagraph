/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.util;

import aigle.idm.diagraph.tp4.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aigle.idm.diagraph.tp4.Tp4Package
 * @generated
 */
public class Tp4AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tp4Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp4AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Tp4Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tp4Switch<Adapter> modelSwitch =
		new Tp4Switch<Adapter>() {
			@Override
			public Adapter caseInfrastructure(Infrastructure object) {
				return createInfrastructureAdapter();
			}
			@Override
			public Adapter caseCalculateur(Calculateur object) {
				return createCalculateurAdapter();
			}
			@Override
			public Adapter casePeripherique(Peripherique object) {
				return createPeripheriqueAdapter();
			}
			@Override
			public Adapter caseNomenclature(Nomenclature object) {
				return createNomenclatureAdapter();
			}
			@Override
			public Adapter caseFamille(Famille object) {
				return createFamilleAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseLocalisation(Localisation object) {
				return createLocalisationAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseVueDocumentation(VueDocumentation object) {
				return createVueDocumentationAdapter();
			}
			@Override
			public Adapter caseProcesseur(Processeur object) {
				return createProcesseurAdapter();
			}
			@Override
			public Adapter caseElementEmbarque(ElementEmbarque object) {
				return createElementEmbarqueAdapter();
			}
			@Override
			public Adapter caseTrace(Trace object) {
				return createTraceAdapter();
			}
			@Override
			public Adapter caseZLocalisation(ZLocalisation object) {
				return createZLocalisationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Infrastructure
	 * @generated
	 */
	public Adapter createInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Calculateur <em>Calculateur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Calculateur
	 * @generated
	 */
	public Adapter createCalculateurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Peripherique <em>Peripherique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Peripherique
	 * @generated
	 */
	public Adapter createPeripheriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Nomenclature <em>Nomenclature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Nomenclature
	 * @generated
	 */
	public Adapter createNomenclatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Famille <em>Famille</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Famille
	 * @generated
	 */
	public Adapter createFamilleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Localisation
	 * @generated
	 */
	public Adapter createLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.VueDocumentation <em>Vue Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.VueDocumentation
	 * @generated
	 */
	public Adapter createVueDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Processeur <em>Processeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Processeur
	 * @generated
	 */
	public Adapter createProcesseurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.ElementEmbarque <em>Element Embarque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.ElementEmbarque
	 * @generated
	 */
	public Adapter createElementEmbarqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aigle.idm.diagraph.tp4.ZLocalisation <em>ZLocalisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aigle.idm.diagraph.tp4.ZLocalisation
	 * @generated
	 */
	public Adapter createZLocalisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Tp4AdapterFactory
