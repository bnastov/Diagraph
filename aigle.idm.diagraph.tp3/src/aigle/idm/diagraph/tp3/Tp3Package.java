/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aigle.idm.diagraph.tp3.Tp3Factory
 * @model kind="package"
 *        annotation="diastyle.node.n3 parent\075n2='' background\075lightgreen='' shape\075ellipse='null' size\07580,80='null'"
 *        annotation="diastyle.partition.p1 background\075lightblue=''"
 *        annotation="diastyle.node.n2 background\075red='' layout\075vertical='' font\075arial='' size\0750,0='null'"
 *        annotation="diastyle.node.n6 background\075yellow=''"
 *        annotation="diastyle.edge.e1 background\075darkgreen='' arrowsize\0755='' linewidth\0753=''"
 *        annotation="diastyle.node.n1 background\075orange='' size\07560,60='null'"
 *        annotation="diastyle.node.n5 background\075yellow='null' shape\075custom='null' font\075arial='null' data\0750,0;40,0;40,30;30,30;30,40;40,30;30,40;0,40='null' size\07540,40='null'"
 *        annotation="diastyle.node.n4 shape\075custom='null' data\07520,0;40,40;0,40;20,0='null' size\07540,40='null' background\075lightblue='null'"
 * @generated
 */
public interface Tp3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tp3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tp3-v0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tp3Package eINSTANCE = aigle.idm.diagraph.tp3.impl.Tp3PackageImpl.init();

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.impl.LivreRecettesImpl <em>Livre Recettes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.impl.LivreRecettesImpl
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getLivreRecettes()
	 * @generated
	 */
	int LIVRE_RECETTES = 0;

	/**
	 * The feature id for the '<em><b>Recettes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES__RECETTES = 0;

	/**
	 * The feature id for the '<em><b>Ingredients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES__INGREDIENTS = 1;

	/**
	 * The feature id for the '<em><b>Departements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES__DEPARTEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Vins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES__VINS = 3;

	/**
	 * The number of structural features of the '<em>Livre Recettes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRE_RECETTES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.impl.NamedImpl
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.impl.RecetteImpl <em>Recette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.impl.RecetteImpl
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getRecette()
	 * @generated
	 */
	int RECETTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Cout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__COUT = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__COMPOSES = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Origine Regionale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__ORIGINE_REGIONALE = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__VINS = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Recette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.impl.ValuedNamedImpl <em>Valued Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.impl.ValuedNamedImpl
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getValuedNamed()
	 * @generated
	 */
	int VALUED_NAMED = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_NAMED__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_NAMED__PRIX = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Valued Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_NAMED_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.impl.IngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.impl.IngredientImpl
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NAME = VALUED_NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__PRIX = VALUED_NAMED__PRIX;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NATURE = VALUED_NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = VALUED_NAMED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.impl.VinImpl <em>Vin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.impl.VinImpl
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getVin()
	 * @generated
	 */
	int VIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIN__NAME = NAMED__NAME;

	/**
	 * The number of structural features of the '<em>Vin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIN_FEATURE_COUNT = NAMED_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.impl.ComposeImpl <em>Compose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.impl.ComposeImpl
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getCompose()
	 * @generated
	 */
	int COMPOSE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE__QUANTITE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ingredient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE__INGREDIENT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.impl.LocalisationImpl <em>Localisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.impl.LocalisationImpl
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getLocalisation()
	 * @generated
	 */
	int LOCALISATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__NAME = NAMED__NAME;

	/**
	 * The number of structural features of the '<em>Localisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.impl.BouteilleImpl <em>Bouteille</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.impl.BouteilleImpl
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getBouteille()
	 * @generated
	 */
	int BOUTEILLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTEILLE__NAME = VALUED_NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Prix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTEILLE__PRIX = VALUED_NAMED__PRIX;

	/**
	 * The feature id for the '<em><b>vin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTEILLE__VIN = VALUED_NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bouteille</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTEILLE_FEATURE_COUNT = VALUED_NAMED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.Cout <em>Cout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.Cout
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getCout()
	 * @generated
	 */
	int COUT = 9;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp3.Nature <em>Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp3.Nature
	 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getNature()
	 * @generated
	 */
	int NATURE = 10;


	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp3.LivreRecettes <em>Livre Recettes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livre Recettes</em>'.
	 * @see aigle.idm.diagraph.tp3.LivreRecettes
	 * @generated
	 */
	EClass getLivreRecettes();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp3.LivreRecettes#getRecettes <em>Recettes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recettes</em>'.
	 * @see aigle.idm.diagraph.tp3.LivreRecettes#getRecettes()
	 * @see #getLivreRecettes()
	 * @generated
	 */
	EReference getLivreRecettes_Recettes();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp3.LivreRecettes#getIngredients <em>Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredients</em>'.
	 * @see aigle.idm.diagraph.tp3.LivreRecettes#getIngredients()
	 * @see #getLivreRecettes()
	 * @generated
	 */
	EReference getLivreRecettes_Ingredients();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp3.LivreRecettes#getDepartements <em>Departements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departements</em>'.
	 * @see aigle.idm.diagraph.tp3.LivreRecettes#getDepartements()
	 * @see #getLivreRecettes()
	 * @generated
	 */
	EReference getLivreRecettes_Departements();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp3.LivreRecettes#getVins <em>Vins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vins</em>'.
	 * @see aigle.idm.diagraph.tp3.LivreRecettes#getVins()
	 * @see #getLivreRecettes()
	 * @generated
	 */
	EReference getLivreRecettes_Vins();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp3.Recette <em>Recette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recette</em>'.
	 * @see aigle.idm.diagraph.tp3.Recette
	 * @generated
	 */
	EClass getRecette();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp3.Recette#getCout <em>Cout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cout</em>'.
	 * @see aigle.idm.diagraph.tp3.Recette#getCout()
	 * @see #getRecette()
	 * @generated
	 */
	EAttribute getRecette_Cout();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp3.Recette#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composes</em>'.
	 * @see aigle.idm.diagraph.tp3.Recette#getComposes()
	 * @see #getRecette()
	 * @generated
	 */
	EReference getRecette_Composes();

	/**
	 * Returns the meta object for the reference '{@link aigle.idm.diagraph.tp3.Recette#getOrigineRegionale <em>Origine Regionale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origine Regionale</em>'.
	 * @see aigle.idm.diagraph.tp3.Recette#getOrigineRegionale()
	 * @see #getRecette()
	 * @generated
	 */
	EReference getRecette_OrigineRegionale();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp3.Recette#getVins <em>Vins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vins</em>'.
	 * @see aigle.idm.diagraph.tp3.Recette#getVins()
	 * @see #getRecette()
	 * @generated
	 */
	EReference getRecette_Vins();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp3.Ingredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see aigle.idm.diagraph.tp3.Ingredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp3.Ingredient#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see aigle.idm.diagraph.tp3.Ingredient#getNature()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Nature();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp3.Vin <em>Vin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vin</em>'.
	 * @see aigle.idm.diagraph.tp3.Vin
	 * @generated
	 */
	EClass getVin();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp3.Compose <em>Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compose</em>'.
	 * @see aigle.idm.diagraph.tp3.Compose
	 * @generated
	 */
	EClass getCompose();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp3.Compose#getQuantite <em>Quantite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantite</em>'.
	 * @see aigle.idm.diagraph.tp3.Compose#getQuantite()
	 * @see #getCompose()
	 * @generated
	 */
	EAttribute getCompose_Quantite();

	/**
	 * Returns the meta object for the reference '{@link aigle.idm.diagraph.tp3.Compose#get_ingredient <em>ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ingredient</em>'.
	 * @see aigle.idm.diagraph.tp3.Compose#get_ingredient()
	 * @see #getCompose()
	 * @generated
	 */
	EReference getCompose__ingredient();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp3.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localisation</em>'.
	 * @see aigle.idm.diagraph.tp3.Localisation
	 * @generated
	 */
	EClass getLocalisation();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp3.Bouteille <em>Bouteille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouteille</em>'.
	 * @see aigle.idm.diagraph.tp3.Bouteille
	 * @generated
	 */
	EClass getBouteille();

	/**
	 * Returns the meta object for the reference '{@link aigle.idm.diagraph.tp3.Bouteille#get_vin <em>vin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>vin</em>'.
	 * @see aigle.idm.diagraph.tp3.Bouteille#get_vin()
	 * @see #getBouteille()
	 * @generated
	 */
	EReference getBouteille__vin();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp3.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see aigle.idm.diagraph.tp3.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp3.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aigle.idm.diagraph.tp3.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp3.ValuedNamed <em>Valued Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valued Named</em>'.
	 * @see aigle.idm.diagraph.tp3.ValuedNamed
	 * @generated
	 */
	EClass getValuedNamed();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp3.ValuedNamed#getPrix <em>Prix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prix</em>'.
	 * @see aigle.idm.diagraph.tp3.ValuedNamed#getPrix()
	 * @see #getValuedNamed()
	 * @generated
	 */
	EAttribute getValuedNamed_Prix();

	/**
	 * Returns the meta object for enum '{@link aigle.idm.diagraph.tp3.Cout <em>Cout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cout</em>'.
	 * @see aigle.idm.diagraph.tp3.Cout
	 * @generated
	 */
	EEnum getCout();

	/**
	 * Returns the meta object for enum '{@link aigle.idm.diagraph.tp3.Nature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nature</em>'.
	 * @see aigle.idm.diagraph.tp3.Nature
	 * @generated
	 */
	EEnum getNature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tp3Factory getTp3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.impl.LivreRecettesImpl <em>Livre Recettes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.impl.LivreRecettesImpl
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getLivreRecettes()
		 * @generated
		 */
		EClass LIVRE_RECETTES = eINSTANCE.getLivreRecettes();

		/**
		 * The meta object literal for the '<em><b>Recettes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVRE_RECETTES__RECETTES = eINSTANCE.getLivreRecettes_Recettes();

		/**
		 * The meta object literal for the '<em><b>Ingredients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVRE_RECETTES__INGREDIENTS = eINSTANCE.getLivreRecettes_Ingredients();

		/**
		 * The meta object literal for the '<em><b>Departements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVRE_RECETTES__DEPARTEMENTS = eINSTANCE.getLivreRecettes_Departements();

		/**
		 * The meta object literal for the '<em><b>Vins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVRE_RECETTES__VINS = eINSTANCE.getLivreRecettes_Vins();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.impl.RecetteImpl <em>Recette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.impl.RecetteImpl
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getRecette()
		 * @generated
		 */
		EClass RECETTE = eINSTANCE.getRecette();

		/**
		 * The meta object literal for the '<em><b>Cout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECETTE__COUT = eINSTANCE.getRecette_Cout();

		/**
		 * The meta object literal for the '<em><b>Composes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETTE__COMPOSES = eINSTANCE.getRecette_Composes();

		/**
		 * The meta object literal for the '<em><b>Origine Regionale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETTE__ORIGINE_REGIONALE = eINSTANCE.getRecette_OrigineRegionale();

		/**
		 * The meta object literal for the '<em><b>Vins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETTE__VINS = eINSTANCE.getRecette_Vins();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.impl.IngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.impl.IngredientImpl
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__NATURE = eINSTANCE.getIngredient_Nature();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.impl.VinImpl <em>Vin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.impl.VinImpl
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getVin()
		 * @generated
		 */
		EClass VIN = eINSTANCE.getVin();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.impl.ComposeImpl <em>Compose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.impl.ComposeImpl
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getCompose()
		 * @generated
		 */
		EClass COMPOSE = eINSTANCE.getCompose();

		/**
		 * The meta object literal for the '<em><b>Quantite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSE__QUANTITE = eINSTANCE.getCompose_Quantite();

		/**
		 * The meta object literal for the '<em><b>ingredient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSE__INGREDIENT = eINSTANCE.getCompose__ingredient();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.impl.LocalisationImpl <em>Localisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.impl.LocalisationImpl
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getLocalisation()
		 * @generated
		 */
		EClass LOCALISATION = eINSTANCE.getLocalisation();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.impl.BouteilleImpl <em>Bouteille</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.impl.BouteilleImpl
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getBouteille()
		 * @generated
		 */
		EClass BOUTEILLE = eINSTANCE.getBouteille();

		/**
		 * The meta object literal for the '<em><b>vin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUTEILLE__VIN = eINSTANCE.getBouteille__vin();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.impl.NamedImpl
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.impl.ValuedNamedImpl <em>Valued Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.impl.ValuedNamedImpl
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getValuedNamed()
		 * @generated
		 */
		EClass VALUED_NAMED = eINSTANCE.getValuedNamed();

		/**
		 * The meta object literal for the '<em><b>Prix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUED_NAMED__PRIX = eINSTANCE.getValuedNamed_Prix();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.Cout <em>Cout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.Cout
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getCout()
		 * @generated
		 */
		EEnum COUT = eINSTANCE.getCout();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp3.Nature <em>Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp3.Nature
		 * @see aigle.idm.diagraph.tp3.impl.Tp3PackageImpl#getNature()
		 * @generated
		 */
		EEnum NATURE = eINSTANCE.getNature();

	}

} //Tp3Package
