/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4.impl;

import aigle.idm.diagraph.tp4.Calculateur;
import aigle.idm.diagraph.tp4.Categorie;
import aigle.idm.diagraph.tp4.Documentation;
import aigle.idm.diagraph.tp4.ElementEmbarque;
import aigle.idm.diagraph.tp4.Famille;
import aigle.idm.diagraph.tp4.Infrastructure;
import aigle.idm.diagraph.tp4.Interface;
import aigle.idm.diagraph.tp4.Localisation;
import aigle.idm.diagraph.tp4.Nature;
import aigle.idm.diagraph.tp4.Nomenclature;
import aigle.idm.diagraph.tp4.Peripherique;
import aigle.idm.diagraph.tp4.Processeur;
import aigle.idm.diagraph.tp4.Tp4Factory;
import aigle.idm.diagraph.tp4.Tp4Package;
import aigle.idm.diagraph.tp4.Trace;
import aigle.idm.diagraph.tp4.VueDocumentation;
import aigle.idm.diagraph.tp4.ZLocalisation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tp4PackageImpl extends EPackageImpl implements Tp4Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculateurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass peripheriqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nomenclatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vueDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEmbarqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zLocalisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categorieEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum natureEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see aigle.idm.diagraph.tp4.Tp4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tp4PackageImpl() {
		super(eNS_URI, Tp4Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Tp4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tp4Package init() {
		if (isInited) return (Tp4Package)EPackage.Registry.INSTANCE.getEPackage(Tp4Package.eNS_URI);

		// Obtain or create and register package
		Tp4PackageImpl theTp4Package = (Tp4PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Tp4PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Tp4PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTp4Package.createPackageContents();

		// Initialize created meta-data
		theTp4Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTp4Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tp4Package.eNS_URI, theTp4Package);
		return theTp4Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Calculateurs() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Peripheriques() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Localisations() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructure_Documentation() {
		return (EReference)infrastructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculateur() {
		return calculateurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculateur_Categorie() {
		return (EAttribute)calculateurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculateur_Interfaces() {
		return (EReference)calculateurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculateur_Processeurs() {
		return (EReference)calculateurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeripherique() {
		return peripheriqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeripherique_Nature() {
		return (EAttribute)peripheriqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNomenclature() {
		return nomenclatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNomenclature_Name() {
		return (EAttribute)nomenclatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNomenclature_Zlocalisation() {
		return (EReference)nomenclatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamille() {
		return familleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFamille_Nom() {
		return (EAttribute)familleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamille_Docus() {
		return (EReference)familleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface__peripherique() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Calculateur() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalisation() {
		return localisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalisation_Name() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalisation_CoteX() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalisation_CoteY() {
		return (EAttribute)localisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Description() {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVueDocumentation() {
		return vueDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVueDocumentation_Familles() {
		return (EReference)vueDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVueDocumentation_Nomenclatures() {
		return (EReference)vueDocumentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVueDocumentation_Name() {
		return (EAttribute)vueDocumentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcesseur() {
		return processeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcesseur__famille() {
		return (EReference)processeurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementEmbarque() {
		return elementEmbarqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementEmbarque_Name() {
		return (EAttribute)elementEmbarqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementEmbarque_Cadence() {
		return (EAttribute)elementEmbarqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementEmbarque_Trace() {
		return (EReference)elementEmbarqueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_T_nomenclature() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrace_Date_heure() {
		return (EAttribute)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZLocalisation() {
		return zLocalisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZLocalisation_CordZ() {
		return (EAttribute)zLocalisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZLocalisation_Localisation() {
		return (EReference)zLocalisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategorie() {
		return categorieEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNature() {
		return natureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp4Factory getTp4Factory() {
		return (Tp4Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		infrastructureEClass = createEClass(INFRASTRUCTURE);
		createEReference(infrastructureEClass, INFRASTRUCTURE__CALCULATEURS);
		createEReference(infrastructureEClass, INFRASTRUCTURE__PERIPHERIQUES);
		createEReference(infrastructureEClass, INFRASTRUCTURE__LOCALISATIONS);
		createEReference(infrastructureEClass, INFRASTRUCTURE__DOCUMENTATION);

		calculateurEClass = createEClass(CALCULATEUR);
		createEAttribute(calculateurEClass, CALCULATEUR__CATEGORIE);
		createEReference(calculateurEClass, CALCULATEUR__INTERFACES);
		createEReference(calculateurEClass, CALCULATEUR__PROCESSEURS);

		peripheriqueEClass = createEClass(PERIPHERIQUE);
		createEAttribute(peripheriqueEClass, PERIPHERIQUE__NATURE);

		nomenclatureEClass = createEClass(NOMENCLATURE);
		createEAttribute(nomenclatureEClass, NOMENCLATURE__NAME);
		createEReference(nomenclatureEClass, NOMENCLATURE__ZLOCALISATION);

		familleEClass = createEClass(FAMILLE);
		createEAttribute(familleEClass, FAMILLE__NOM);
		createEReference(familleEClass, FAMILLE__DOCUS);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__PERIPHERIQUE);
		createEReference(interfaceEClass, INTERFACE__CALCULATEUR);

		localisationEClass = createEClass(LOCALISATION);
		createEAttribute(localisationEClass, LOCALISATION__NAME);
		createEAttribute(localisationEClass, LOCALISATION__COTE_X);
		createEAttribute(localisationEClass, LOCALISATION__COTE_Y);

		documentationEClass = createEClass(DOCUMENTATION);
		createEAttribute(documentationEClass, DOCUMENTATION__DESCRIPTION);

		vueDocumentationEClass = createEClass(VUE_DOCUMENTATION);
		createEReference(vueDocumentationEClass, VUE_DOCUMENTATION__FAMILLES);
		createEReference(vueDocumentationEClass, VUE_DOCUMENTATION__NOMENCLATURES);
		createEAttribute(vueDocumentationEClass, VUE_DOCUMENTATION__NAME);

		processeurEClass = createEClass(PROCESSEUR);
		createEReference(processeurEClass, PROCESSEUR__FAMILLE);

		elementEmbarqueEClass = createEClass(ELEMENT_EMBARQUE);
		createEAttribute(elementEmbarqueEClass, ELEMENT_EMBARQUE__NAME);
		createEAttribute(elementEmbarqueEClass, ELEMENT_EMBARQUE__CADENCE);
		createEReference(elementEmbarqueEClass, ELEMENT_EMBARQUE__TRACE);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__TNOMENCLATURE);
		createEAttribute(traceEClass, TRACE__DATE_HEURE);

		zLocalisationEClass = createEClass(ZLOCALISATION);
		createEAttribute(zLocalisationEClass, ZLOCALISATION__CORD_Z);
		createEReference(zLocalisationEClass, ZLOCALISATION__LOCALISATION);

		// Create enums
		categorieEEnum = createEEnum(CATEGORIE);
		natureEEnum = createEEnum(NATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		calculateurEClass.getESuperTypes().add(this.getElementEmbarque());
		peripheriqueEClass.getESuperTypes().add(this.getElementEmbarque());
		interfaceEClass.getESuperTypes().add(this.getElementEmbarque());
		processeurEClass.getESuperTypes().add(this.getElementEmbarque());

		// Initialize classes and features; add operations and parameters
		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructure_Calculateurs(), this.getCalculateur(), null, "calculateurs", null, 0, -1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructure_Peripheriques(), this.getPeripherique(), null, "peripheriques", null, 0, -1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructure_Localisations(), this.getLocalisation(), null, "localisations", null, 0, -1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructure_Documentation(), this.getVueDocumentation(), null, "documentation", null, 0, 1, Infrastructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calculateurEClass, Calculateur.class, "Calculateur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalculateur_Categorie(), this.getCategorie(), "categorie", null, 0, 1, Calculateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalculateur_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, Calculateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCalculateur_Processeurs(), this.getProcesseur(), null, "processeurs", null, 0, -1, Calculateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(peripheriqueEClass, Peripherique.class, "Peripherique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeripherique_Nature(), this.getNature(), "nature", null, 0, 1, Peripherique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nomenclatureEClass, Nomenclature.class, "Nomenclature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNomenclature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Nomenclature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNomenclature_Zlocalisation(), this.getZLocalisation(), null, "zlocalisation", null, 0, 1, Nomenclature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familleEClass, Famille.class, "Famille", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFamille_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Famille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamille_Docus(), this.getDocumentation(), null, "docus", null, 0, -1, Famille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface__peripherique(), this.getPeripherique(), null, "_peripherique", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Calculateur(), this.getCalculateur(), null, "calculateur", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localisationEClass, Localisation.class, "Localisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalisation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalisation_CoteX(), ecorePackage.getEInt(), "coteX", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalisation_CoteY(), ecorePackage.getEInt(), "coteY", null, 0, 1, Localisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vueDocumentationEClass, VueDocumentation.class, "VueDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVueDocumentation_Familles(), this.getFamille(), null, "familles", null, 0, -1, VueDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVueDocumentation_Nomenclatures(), this.getNomenclature(), null, "nomenclatures", null, 0, -1, VueDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVueDocumentation_Name(), ecorePackage.getEString(), "name", null, 0, 1, VueDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processeurEClass, Processeur.class, "Processeur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcesseur__famille(), this.getFamille(), null, "_famille", null, 0, 1, Processeur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEmbarqueEClass, ElementEmbarque.class, "ElementEmbarque", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementEmbarque_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementEmbarque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementEmbarque_Cadence(), ecorePackage.getEDouble(), "cadence", null, 0, 1, ElementEmbarque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementEmbarque_Trace(), this.getTrace(), null, "trace", null, 0, 1, ElementEmbarque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_T_nomenclature(), this.getNomenclature(), null, "t_nomenclature", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrace_Date_heure(), ecorePackage.getEString(), "date_heure", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zLocalisationEClass, ZLocalisation.class, "ZLocalisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZLocalisation_CordZ(), ecorePackage.getEInt(), "cordZ", null, 0, 1, ZLocalisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZLocalisation_Localisation(), this.getLocalisation(), null, "localisation", null, 0, 1, ZLocalisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(categorieEEnum, Categorie.class, "Categorie");
		addEEnumLiteral(categorieEEnum, Categorie.TEMPS_REEL_DUR);
		addEEnumLiteral(categorieEEnum, Categorie.TEMPS_REEL);
		addEEnumLiteral(categorieEEnum, Categorie.STANDARD);

		initEEnum(natureEEnum, Nature.class, "Nature");
		addEEnumLiteral(natureEEnum, Nature.SORTIE);
		addEEnumLiteral(natureEEnum, Nature.ENTREE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diastyle.node.n1
		createDiastyleAnnotations();
		// diastyle.partition.p1
		createDiastyle_1Annotations();
		// diastyle.node.n2
		createDiastyle_2Annotations();
		// diastyle.edge.e1
		createDiastyle_3Annotations();
		// diastyle.node.n3
		createDiastyle_4Annotations();
		// diastyle.edge.e2
		createDiastyle_5Annotations();
		// diastyle.node.n4
		createDiastyle_6Annotations();
		// diastyle.partition.p2
		createDiastyle_7Annotations();
		// diastyle.partition.p3
		createDiastyle_8Annotations();
		// diastyle.edge.e3
		createDiastyle_9Annotations();
		// diastyle.node.n5
		createDiastyle_10Annotations();
		// diastyle.partition.p4
		createDiastyle_11Annotations();
		// diagraph
		createDiagraphAnnotations();
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyleAnnotations() {
		String source = "diastyle.node.n1";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=orange", null,
			 "font=arial", null,
			 "layout=vertical", null
		   });																								
	}

	/**
	 * Initializes the annotations for <b>diastyle.partition.p1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_1Annotations() {
		String source = "diastyle.partition.p1";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=yellow", null
		   });																							
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_2Annotations() {
		String source = "diastyle.node.n2";				
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=green", null
		   });																						
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.e1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_3Annotations() {
		String source = "diastyle.edge.e1";					
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=red", null,
			 "arrowsize=5", null,
			 "linewidth=3", null
		   });																					
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n3</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_4Annotations() {
		String source = "diastyle.node.n3";						
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=lightblue", null,
			 "font=arial", null,
			 "shape=custom", null,
			 "size=40,40", null
		   });																				
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.e2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_5Annotations() {
		String source = "diastyle.edge.e2";							
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=e1", null,
			 "background=darkblue", null
		   });																			
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n4</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_6Annotations() {
		String source = "diastyle.node.n4";								
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=n1", null,
			 "background=cyan", null
		   });																		
	}

	/**
	 * Initializes the annotations for <b>diastyle.partition.p2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_7Annotations() {
		String source = "diastyle.partition.p2";									
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=gray", null
		   });																	
	}

	/**
	 * Initializes the annotations for <b>diastyle.partition.p3</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_8Annotations() {
		String source = "diastyle.partition.p3";										
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=lightgray", null
		   });																
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.e3</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_9Annotations() {
		String source = "diastyle.edge.e3";											
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=e1", null,
			 "background=orange", null
		   });															
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n5</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_10Annotations() {
		String source = "diastyle.node.n5";												
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=darkgreen", null
		   });														
	}

	/**
	 * Initializes the annotations for <b>diastyle.partition.p4</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_11Annotations() {
		String source = "diastyle.partition.p4";													
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=lightgreen", null
		   });													
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations() {
		String source = "diagraph";														
		addAnnotation
		  (infrastructureEClass, 
		   source, 
		   new String[] {
			 "pov", null
		   });		
		addAnnotation
		  (calculateurEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=name", null,
			 "kref=processeurs", null,
			 "style=n1", null,
			 "style.kref.processeurs=p1", null
		   });		
		addAnnotation
		  (peripheriqueEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=name", null,
			 "label=nature", null,
			 "style=n3", null,
			 "lnk=trace", null
		   });		
		addAnnotation
		  (nomenclatureEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=name", null,
			 "lnk=zlocalisation", null,
			 "nav:localisation", null
		   });		
		addAnnotation
		  (familleEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=nom", null,
			 "kref=docus", null,
			 "style=n2", null,
			 "style.kref.docus=p4", null
		   });		
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "link", null,
			 "cont=Calculateur.interfaces", null,
			 "lsrc=calculateur", null,
			 "ltrg=_peripherique", null,
			 "style=e1", null
		   });		
		addAnnotation
		  (localisationEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=name", null,
			 "label=coteX", null,
			 "label=coteY", null,
			 "style=n4", null
		   });		
		addAnnotation
		  (documentationEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=description", null,
			 "style=n5", null
		   });		
		addAnnotation
		  (vueDocumentationEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=name", null,
			 "kref=familles", null,
			 "kref=nomenclatures", null,
			 "style.kref.familles=p2", null,
			 "style.kref.nomenclatures=p3", null
		   });		
		addAnnotation
		  (processeurEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=name", null,
			 "ref=_famille", null,
			 "style=n2", null,
			 "style.ref._famille=e3", null
		   });		
		addAnnotation
		  (elementEmbarqueEClass, 
		   source, 
		   new String[] {
			 "label=name", null,
			 "label=cadence", null
		   });		
		addAnnotation
		  (traceEClass, 
		   source, 
		   new String[] {
			 "link", null,
			 "label=date_heure", null,
			 "style=e2", null
		   });		
		addAnnotation
		  (zLocalisationEClass, 
		   source, 
		   new String[] {
			 "link", null,
			 "label=cordZ", null
		   });
	}

} //Tp4PackageImpl
