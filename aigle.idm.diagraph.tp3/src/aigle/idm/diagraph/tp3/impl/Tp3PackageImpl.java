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
import aigle.idm.diagraph.tp3.Ingredient;
import aigle.idm.diagraph.tp3.LivreRecettes;
import aigle.idm.diagraph.tp3.Localisation;
import aigle.idm.diagraph.tp3.Named;
import aigle.idm.diagraph.tp3.Nature;
import aigle.idm.diagraph.tp3.Recette;
import aigle.idm.diagraph.tp3.Tp3Factory;
import aigle.idm.diagraph.tp3.Tp3Package;
import aigle.idm.diagraph.tp3.ValuedNamed;
import aigle.idm.diagraph.tp3.Vin;

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
public class Tp3PackageImpl extends EPackageImpl implements Tp3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livreRecettesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recetteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composeEClass = null;

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
	private EClass bouteilleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuedNamedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coutEEnum = null;

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
	 * @see aigle.idm.diagraph.tp3.Tp3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tp3PackageImpl() {
		super(eNS_URI, Tp3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Tp3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tp3Package init() {
		if (isInited) return (Tp3Package)EPackage.Registry.INSTANCE.getEPackage(Tp3Package.eNS_URI);

		// Obtain or create and register package
		Tp3PackageImpl theTp3Package = (Tp3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Tp3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Tp3PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTp3Package.createPackageContents();

		// Initialize created meta-data
		theTp3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTp3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tp3Package.eNS_URI, theTp3Package);
		return theTp3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivreRecettes() {
		return livreRecettesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLivreRecettes_Recettes() {
		return (EReference)livreRecettesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLivreRecettes_Ingredients() {
		return (EReference)livreRecettesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLivreRecettes_Departements() {
		return (EReference)livreRecettesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLivreRecettes_Vins() {
		return (EReference)livreRecettesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecette() {
		return recetteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecette_Cout() {
		return (EAttribute)recetteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecette_Composes() {
		return (EReference)recetteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecette_OrigineRegionale() {
		return (EReference)recetteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecette_Vins() {
		return (EReference)recetteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIngredient() {
		return ingredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Nature() {
		return (EAttribute)ingredientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVin() {
		return vinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompose() {
		return composeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompose_Quantite() {
		return (EAttribute)composeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompose__ingredient() {
		return (EReference)composeEClass.getEStructuralFeatures().get(1);
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
	public EClass getBouteille() {
		return bouteilleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBouteille__vin() {
		return (EReference)bouteilleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamed_Name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuedNamed() {
		return valuedNamedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuedNamed_Prix() {
		return (EAttribute)valuedNamedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCout() {
		return coutEEnum;
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
	public Tp3Factory getTp3Factory() {
		return (Tp3Factory)getEFactoryInstance();
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
		livreRecettesEClass = createEClass(LIVRE_RECETTES);
		createEReference(livreRecettesEClass, LIVRE_RECETTES__RECETTES);
		createEReference(livreRecettesEClass, LIVRE_RECETTES__INGREDIENTS);
		createEReference(livreRecettesEClass, LIVRE_RECETTES__DEPARTEMENTS);
		createEReference(livreRecettesEClass, LIVRE_RECETTES__VINS);

		recetteEClass = createEClass(RECETTE);
		createEAttribute(recetteEClass, RECETTE__COUT);
		createEReference(recetteEClass, RECETTE__COMPOSES);
		createEReference(recetteEClass, RECETTE__ORIGINE_REGIONALE);
		createEReference(recetteEClass, RECETTE__VINS);

		ingredientEClass = createEClass(INGREDIENT);
		createEAttribute(ingredientEClass, INGREDIENT__NATURE);

		vinEClass = createEClass(VIN);

		composeEClass = createEClass(COMPOSE);
		createEAttribute(composeEClass, COMPOSE__QUANTITE);
		createEReference(composeEClass, COMPOSE__INGREDIENT);

		localisationEClass = createEClass(LOCALISATION);

		bouteilleEClass = createEClass(BOUTEILLE);
		createEReference(bouteilleEClass, BOUTEILLE__VIN);

		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);

		valuedNamedEClass = createEClass(VALUED_NAMED);
		createEAttribute(valuedNamedEClass, VALUED_NAMED__PRIX);

		// Create enums
		coutEEnum = createEEnum(COUT);
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
		recetteEClass.getESuperTypes().add(this.getNamed());
		ingredientEClass.getESuperTypes().add(this.getValuedNamed());
		vinEClass.getESuperTypes().add(this.getNamed());
		composeEClass.getESuperTypes().add(this.getNamed());
		localisationEClass.getESuperTypes().add(this.getNamed());
		bouteilleEClass.getESuperTypes().add(this.getValuedNamed());
		valuedNamedEClass.getESuperTypes().add(this.getNamed());

		// Initialize classes and features; add operations and parameters
		initEClass(livreRecettesEClass, LivreRecettes.class, "LivreRecettes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLivreRecettes_Recettes(), this.getRecette(), null, "recettes", null, 0, -1, LivreRecettes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLivreRecettes_Ingredients(), this.getIngredient(), null, "ingredients", null, 0, -1, LivreRecettes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLivreRecettes_Departements(), this.getLocalisation(), null, "departements", null, 0, -1, LivreRecettes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLivreRecettes_Vins(), this.getVin(), null, "vins", null, 0, -1, LivreRecettes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recetteEClass, Recette.class, "Recette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecette_Cout(), this.getCout(), "cout", null, 0, 1, Recette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecette_Composes(), this.getCompose(), null, "composes", null, 0, -1, Recette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecette_OrigineRegionale(), this.getLocalisation(), null, "origineRegionale", null, 0, 1, Recette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecette_Vins(), this.getBouteille(), null, "vins", null, 0, 2, Recette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingredientEClass, Ingredient.class, "Ingredient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIngredient_Nature(), this.getNature(), "nature", null, 0, 1, Ingredient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vinEClass, Vin.class, "Vin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composeEClass, Compose.class, "Compose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompose_Quantite(), ecorePackage.getEInt(), "quantite", null, 0, 1, Compose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompose__ingredient(), this.getIngredient(), null, "_ingredient", null, 0, 1, Compose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localisationEClass, Localisation.class, "Localisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bouteilleEClass, Bouteille.class, "Bouteille", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBouteille__vin(), this.getVin(), null, "_vin", null, 0, 1, Bouteille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedEClass, Named.class, "Named", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuedNamedEClass, ValuedNamed.class, "ValuedNamed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuedNamed_Prix(), ecorePackage.getEDouble(), "prix", null, 0, 1, ValuedNamed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(coutEEnum, Cout.class, "Cout");
		addEEnumLiteral(coutEEnum, Cout.FAIBLE);
		addEEnumLiteral(coutEEnum, Cout.MOYEN);
		addEEnumLiteral(coutEEnum, Cout.ELEVE);

		initEEnum(natureEEnum, Nature.class, "Nature");
		addEEnumLiteral(natureEEnum, Nature.LEGUME);
		addEEnumLiteral(natureEEnum, Nature.VIANDE);
		addEEnumLiteral(natureEEnum, Nature.POISSON);
		addEEnumLiteral(natureEEnum, Nature.CONDIMENT);
		addEEnumLiteral(natureEEnum, Nature.FRUIT);
		addEEnumLiteral(natureEEnum, Nature.FECULENT);
		addEEnumLiteral(natureEEnum, Nature.OEUF);
		addEEnumLiteral(natureEEnum, Nature.MATIERE_GRASSE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diastyle.node.n3
		createDiastyleAnnotations();
		// diastyle.partition.p1
		createDiastyle_1Annotations();
		// diastyle.node.n2
		createDiastyle_2Annotations();
		// diastyle.node.n6
		createDiastyle_3Annotations();
		// diastyle.edge.e1
		createDiastyle_4Annotations();
		// diastyle.node.n1
		createDiastyle_5Annotations();
		// diastyle.node.n5
		createDiastyle_6Annotations();
		// diastyle.node.n4
		createDiastyle_7Annotations();
		// EAnnotation0
		createEAnnotation0Annotations();
		// diagraph
		createDiagraphAnnotations();
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n3</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyleAnnotations() {
		String source = "diastyle.node.n3";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=n2", "",
			 "background=lightgreen", "",
			 "shape=ellipse", null,
			 "size=80,80", null
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
			 "background=lightblue", ""
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
			 "background=red", "",
			 "layout=vertical", "",
			 "font=arial", "",
			 "size=0,0", null
		   });															
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n6</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_3Annotations() {
		String source = "diastyle.node.n6";					
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=yellow", ""
		   });														
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.e1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_4Annotations() {
		String source = "diastyle.edge.e1";						
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=darkgreen", "",
			 "arrowsize=5", "",
			 "linewidth=3", ""
		   });													
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_5Annotations() {
		String source = "diastyle.node.n1";							
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=orange", "",
			 "size=60,60", null
		   });												
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n5</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_6Annotations() {
		String source = "diastyle.node.n5";								
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=yellow", null,
			 "shape=custom", null,
			 "font=arial", null,
			 "data=0,0;40,0;40,30;30,30;30,40;40,30;30,40;0,40", null,
			 "size=40,40", null
		   });											
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.n4</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_7Annotations() {
		String source = "diastyle.node.n4";									
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "shape=custom", null,
			 "data=20,0;40,40;0,40;20,0", null,
			 "size=40,40", null,
			 "background=lightblue", null
		   });										
	}

	/**
	 * Initializes the annotations for <b>EAnnotation0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEAnnotation0Annotations() {
		String source = "EAnnotation0";										
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
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
		  (livreRecettesEClass, 
		   source, 
		   new String[] {
			 "pov", null
		   });		
		addAnnotation
		  (recetteEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "kref=vins", null,
			 "ref=origineRegionale", null,
			 "lnk=composes", null,
			 "nav:ingredient", null,
			 "style=n1", null,
			 "style.kref.vins=p1", null
		   });		
		addAnnotation
		  (ingredientEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "style=n5", null
		   });		
		addAnnotation
		  (vinEClass, 
		   source, 
		   new String[] {
			 "node", null
		   });		
		addAnnotation
		  (composeEClass, 
		   source, 
		   new String[] {
			 "link", null,
			 "label=quantite", null,
			 "style=e1", null
		   });		
		addAnnotation
		  (localisationEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "style=n3", null
		   });		
		addAnnotation
		  (bouteilleEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "ref=_vin", null
		   });		
		addAnnotation
		  (namedEClass, 
		   source, 
		   new String[] {
			 "label=name", null
		   });		
		addAnnotation
		  (valuedNamedEClass, 
		   source, 
		   new String[] {
			 "label=name", null,
			 "label=prix", null
		   });
	}

} //Tp3PackageImpl
