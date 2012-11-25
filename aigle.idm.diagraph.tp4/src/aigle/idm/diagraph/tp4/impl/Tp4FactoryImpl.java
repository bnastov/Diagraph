/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tp4FactoryImpl extends EFactoryImpl implements Tp4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tp4Factory init() {
		try {
			Tp4Factory theTp4Factory = (Tp4Factory)EPackage.Registry.INSTANCE.getEFactory("http:///tp4-v0"); 
			if (theTp4Factory != null) {
				return theTp4Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tp4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp4FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Tp4Package.INFRASTRUCTURE: return createInfrastructure();
			case Tp4Package.CALCULATEUR: return createCalculateur();
			case Tp4Package.PERIPHERIQUE: return createPeripherique();
			case Tp4Package.NOMENCLATURE: return createNomenclature();
			case Tp4Package.FAMILLE: return createFamille();
			case Tp4Package.INTERFACE: return createInterface();
			case Tp4Package.LOCALISATION: return createLocalisation();
			case Tp4Package.DOCUMENTATION: return createDocumentation();
			case Tp4Package.VUE_DOCUMENTATION: return createVueDocumentation();
			case Tp4Package.PROCESSEUR: return createProcesseur();
			case Tp4Package.ELEMENT_EMBARQUE: return createElementEmbarque();
			case Tp4Package.TRACE: return createTrace();
			case Tp4Package.ZLOCALISATION: return createZLocalisation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Tp4Package.CATEGORIE:
				return createCategorieFromString(eDataType, initialValue);
			case Tp4Package.NATURE:
				return createNatureFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Tp4Package.CATEGORIE:
				return convertCategorieToString(eDataType, instanceValue);
			case Tp4Package.NATURE:
				return convertNatureToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure createInfrastructure() {
		InfrastructureImpl infrastructure = new InfrastructureImpl();
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calculateur createCalculateur() {
		CalculateurImpl calculateur = new CalculateurImpl();
		return calculateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Peripherique createPeripherique() {
		PeripheriqueImpl peripherique = new PeripheriqueImpl();
		return peripherique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nomenclature createNomenclature() {
		NomenclatureImpl nomenclature = new NomenclatureImpl();
		return nomenclature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Famille createFamille() {
		FamilleImpl famille = new FamilleImpl();
		return famille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation createLocalisation() {
		LocalisationImpl localisation = new LocalisationImpl();
		return localisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VueDocumentation createVueDocumentation() {
		VueDocumentationImpl vueDocumentation = new VueDocumentationImpl();
		return vueDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processeur createProcesseur() {
		ProcesseurImpl processeur = new ProcesseurImpl();
		return processeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementEmbarque createElementEmbarque() {
		ElementEmbarqueImpl elementEmbarque = new ElementEmbarqueImpl();
		return elementEmbarque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZLocalisation createZLocalisation() {
		ZLocalisationImpl zLocalisation = new ZLocalisationImpl();
		return zLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie createCategorieFromString(EDataType eDataType, String initialValue) {
		Categorie result = Categorie.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategorieToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nature createNatureFromString(EDataType eDataType, String initialValue) {
		Nature result = Nature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp4Package getTp4Package() {
		return (Tp4Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tp4Package getPackage() {
		return Tp4Package.eINSTANCE;
	}

} //Tp4FactoryImpl
