/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4;

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
 * @see aigle.idm.diagraph.tp4.Tp4Factory
 * @model kind="package"
 *        annotation="diastyle.node.n1 background\075orange='null' font\075arial='null' layout\075vertical='null'"
 *        annotation="diastyle.partition.p1 background\075yellow='null'"
 *        annotation="diastyle.node.n2 background\075green='null'"
 *        annotation="diastyle.edge.e1 background\075red='null' arrowsize\0755='null' linewidth\0753='null'"
 *        annotation="diastyle.node.n3 background\075lightblue='null' font\075arial='null' shape\075custom='null' size\07540,40='null'"
 *        annotation="diastyle.edge.e2 parent\075e1='null' background\075darkblue='null'"
 *        annotation="diastyle.node.n4 parent\075n1='null' background\075cyan='null'"
 *        annotation="diastyle.partition.p2 background\075gray='null'"
 *        annotation="diastyle.partition.p3 background\075lightgray='null'"
 *        annotation="diastyle.edge.e3 parent\075e1='null' background\075orange='null'"
 *        annotation="diastyle.node.n5 background\075darkgreen='null'"
 *        annotation="diastyle.partition.p4 background\075lightgreen='null'"
 * @generated
 */
public interface Tp4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tp4";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tp4-v0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tp4Package eINSTANCE = aigle.idm.diagraph.tp4.impl.Tp4PackageImpl.init();

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.InfrastructureImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 0;

	/**
	 * The feature id for the '<em><b>Calculateurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__CALCULATEURS = 0;

	/**
	 * The feature id for the '<em><b>Peripheriques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__PERIPHERIQUES = 1;

	/**
	 * The feature id for the '<em><b>Localisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__LOCALISATIONS = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__DOCUMENTATION = 3;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.ElementEmbarqueImpl <em>Element Embarque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.ElementEmbarqueImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getElementEmbarque()
	 * @generated
	 */
	int ELEMENT_EMBARQUE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EMBARQUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cadence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EMBARQUE__CADENCE = 1;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EMBARQUE__TRACE = 2;

	/**
	 * The number of structural features of the '<em>Element Embarque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EMBARQUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.CalculateurImpl <em>Calculateur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.CalculateurImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getCalculateur()
	 * @generated
	 */
	int CALCULATEUR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEUR__NAME = ELEMENT_EMBARQUE__NAME;

	/**
	 * The feature id for the '<em><b>Cadence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEUR__CADENCE = ELEMENT_EMBARQUE__CADENCE;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEUR__TRACE = ELEMENT_EMBARQUE__TRACE;

	/**
	 * The feature id for the '<em><b>Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEUR__CATEGORIE = ELEMENT_EMBARQUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEUR__INTERFACES = ELEMENT_EMBARQUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processeurs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEUR__PROCESSEURS = ELEMENT_EMBARQUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Calculateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATEUR_FEATURE_COUNT = ELEMENT_EMBARQUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.PeripheriqueImpl <em>Peripherique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.PeripheriqueImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getPeripherique()
	 * @generated
	 */
	int PERIPHERIQUE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERIQUE__NAME = ELEMENT_EMBARQUE__NAME;

	/**
	 * The feature id for the '<em><b>Cadence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERIQUE__CADENCE = ELEMENT_EMBARQUE__CADENCE;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERIQUE__TRACE = ELEMENT_EMBARQUE__TRACE;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERIQUE__NATURE = ELEMENT_EMBARQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Peripherique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIPHERIQUE_FEATURE_COUNT = ELEMENT_EMBARQUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.NomenclatureImpl <em>Nomenclature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.NomenclatureImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getNomenclature()
	 * @generated
	 */
	int NOMENCLATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Zlocalisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE__ZLOCALISATION = 1;

	/**
	 * The number of structural features of the '<em>Nomenclature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMENCLATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.FamilleImpl <em>Famille</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.FamilleImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getFamille()
	 * @generated
	 */
	int FAMILLE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILLE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Docus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILLE__DOCUS = 1;

	/**
	 * The number of structural features of the '<em>Famille</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.InterfaceImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = ELEMENT_EMBARQUE__NAME;

	/**
	 * The feature id for the '<em><b>Cadence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CADENCE = ELEMENT_EMBARQUE__CADENCE;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TRACE = ELEMENT_EMBARQUE__TRACE;

	/**
	 * The feature id for the '<em><b>peripherique</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PERIPHERIQUE = ELEMENT_EMBARQUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CALCULATEUR = ELEMENT_EMBARQUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ELEMENT_EMBARQUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.LocalisationImpl <em>Localisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.LocalisationImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getLocalisation()
	 * @generated
	 */
	int LOCALISATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cote X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__COTE_X = 1;

	/**
	 * The feature id for the '<em><b>Cote Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__COTE_Y = 2;

	/**
	 * The number of structural features of the '<em>Localisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.DocumentationImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.VueDocumentationImpl <em>Vue Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.VueDocumentationImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getVueDocumentation()
	 * @generated
	 */
	int VUE_DOCUMENTATION = 8;

	/**
	 * The feature id for the '<em><b>Familles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_DOCUMENTATION__FAMILLES = 0;

	/**
	 * The feature id for the '<em><b>Nomenclatures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_DOCUMENTATION__NOMENCLATURES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_DOCUMENTATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Vue Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VUE_DOCUMENTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.ProcesseurImpl <em>Processeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.ProcesseurImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getProcesseur()
	 * @generated
	 */
	int PROCESSEUR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSEUR__NAME = ELEMENT_EMBARQUE__NAME;

	/**
	 * The feature id for the '<em><b>Cadence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSEUR__CADENCE = ELEMENT_EMBARQUE__CADENCE;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSEUR__TRACE = ELEMENT_EMBARQUE__TRACE;

	/**
	 * The feature id for the '<em><b>famille</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSEUR__FAMILLE = ELEMENT_EMBARQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Processeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSEUR_FEATURE_COUNT = ELEMENT_EMBARQUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.TraceImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 11;

	/**
	 * The feature id for the '<em><b>Tnomenclature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TNOMENCLATURE = 0;

	/**
	 * The feature id for the '<em><b>Date heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__DATE_HEURE = 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.impl.ZLocalisationImpl <em>ZLocalisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.impl.ZLocalisationImpl
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getZLocalisation()
	 * @generated
	 */
	int ZLOCALISATION = 12;

	/**
	 * The feature id for the '<em><b>Cord Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLOCALISATION__CORD_Z = 0;

	/**
	 * The feature id for the '<em><b>Localisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLOCALISATION__LOCALISATION = 1;

	/**
	 * The number of structural features of the '<em>ZLocalisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZLOCALISATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.Categorie <em>Categorie</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.Categorie
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getCategorie()
	 * @generated
	 */
	int CATEGORIE = 13;

	/**
	 * The meta object id for the '{@link aigle.idm.diagraph.tp4.Nature <em>Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aigle.idm.diagraph.tp4.Nature
	 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getNature()
	 * @generated
	 */
	int NATURE = 14;


	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see aigle.idm.diagraph.tp4.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp4.Infrastructure#getCalculateurs <em>Calculateurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calculateurs</em>'.
	 * @see aigle.idm.diagraph.tp4.Infrastructure#getCalculateurs()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Calculateurs();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp4.Infrastructure#getPeripheriques <em>Peripheriques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Peripheriques</em>'.
	 * @see aigle.idm.diagraph.tp4.Infrastructure#getPeripheriques()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Peripheriques();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp4.Infrastructure#getLocalisations <em>Localisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localisations</em>'.
	 * @see aigle.idm.diagraph.tp4.Infrastructure#getLocalisations()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Localisations();

	/**
	 * Returns the meta object for the containment reference '{@link aigle.idm.diagraph.tp4.Infrastructure#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see aigle.idm.diagraph.tp4.Infrastructure#getDocumentation()
	 * @see #getInfrastructure()
	 * @generated
	 */
	EReference getInfrastructure_Documentation();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Calculateur <em>Calculateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculateur</em>'.
	 * @see aigle.idm.diagraph.tp4.Calculateur
	 * @generated
	 */
	EClass getCalculateur();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.Calculateur#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Categorie</em>'.
	 * @see aigle.idm.diagraph.tp4.Calculateur#getCategorie()
	 * @see #getCalculateur()
	 * @generated
	 */
	EAttribute getCalculateur_Categorie();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp4.Calculateur#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see aigle.idm.diagraph.tp4.Calculateur#getInterfaces()
	 * @see #getCalculateur()
	 * @generated
	 */
	EReference getCalculateur_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp4.Calculateur#getProcesseurs <em>Processeurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processeurs</em>'.
	 * @see aigle.idm.diagraph.tp4.Calculateur#getProcesseurs()
	 * @see #getCalculateur()
	 * @generated
	 */
	EReference getCalculateur_Processeurs();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Peripherique <em>Peripherique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Peripherique</em>'.
	 * @see aigle.idm.diagraph.tp4.Peripherique
	 * @generated
	 */
	EClass getPeripherique();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.Peripherique#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see aigle.idm.diagraph.tp4.Peripherique#getNature()
	 * @see #getPeripherique()
	 * @generated
	 */
	EAttribute getPeripherique_Nature();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Nomenclature <em>Nomenclature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nomenclature</em>'.
	 * @see aigle.idm.diagraph.tp4.Nomenclature
	 * @generated
	 */
	EClass getNomenclature();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.Nomenclature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aigle.idm.diagraph.tp4.Nomenclature#getName()
	 * @see #getNomenclature()
	 * @generated
	 */
	EAttribute getNomenclature_Name();

	/**
	 * Returns the meta object for the containment reference '{@link aigle.idm.diagraph.tp4.Nomenclature#getZlocalisation <em>Zlocalisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zlocalisation</em>'.
	 * @see aigle.idm.diagraph.tp4.Nomenclature#getZlocalisation()
	 * @see #getNomenclature()
	 * @generated
	 */
	EReference getNomenclature_Zlocalisation();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Famille <em>Famille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Famille</em>'.
	 * @see aigle.idm.diagraph.tp4.Famille
	 * @generated
	 */
	EClass getFamille();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.Famille#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see aigle.idm.diagraph.tp4.Famille#getNom()
	 * @see #getFamille()
	 * @generated
	 */
	EAttribute getFamille_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp4.Famille#getDocus <em>Docus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Docus</em>'.
	 * @see aigle.idm.diagraph.tp4.Famille#getDocus()
	 * @see #getFamille()
	 * @generated
	 */
	EReference getFamille_Docus();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see aigle.idm.diagraph.tp4.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference '{@link aigle.idm.diagraph.tp4.Interface#get_peripherique <em>peripherique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>peripherique</em>'.
	 * @see aigle.idm.diagraph.tp4.Interface#get_peripherique()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface__peripherique();

	/**
	 * Returns the meta object for the reference '{@link aigle.idm.diagraph.tp4.Interface#getCalculateur <em>Calculateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calculateur</em>'.
	 * @see aigle.idm.diagraph.tp4.Interface#getCalculateur()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Calculateur();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localisation</em>'.
	 * @see aigle.idm.diagraph.tp4.Localisation
	 * @generated
	 */
	EClass getLocalisation();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.Localisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aigle.idm.diagraph.tp4.Localisation#getName()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_Name();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.Localisation#getCoteX <em>Cote X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cote X</em>'.
	 * @see aigle.idm.diagraph.tp4.Localisation#getCoteX()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_CoteX();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.Localisation#getCoteY <em>Cote Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cote Y</em>'.
	 * @see aigle.idm.diagraph.tp4.Localisation#getCoteY()
	 * @see #getLocalisation()
	 * @generated
	 */
	EAttribute getLocalisation_CoteY();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see aigle.idm.diagraph.tp4.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.Documentation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see aigle.idm.diagraph.tp4.Documentation#getDescription()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Description();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.VueDocumentation <em>Vue Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vue Documentation</em>'.
	 * @see aigle.idm.diagraph.tp4.VueDocumentation
	 * @generated
	 */
	EClass getVueDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp4.VueDocumentation#getFamilles <em>Familles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Familles</em>'.
	 * @see aigle.idm.diagraph.tp4.VueDocumentation#getFamilles()
	 * @see #getVueDocumentation()
	 * @generated
	 */
	EReference getVueDocumentation_Familles();

	/**
	 * Returns the meta object for the containment reference list '{@link aigle.idm.diagraph.tp4.VueDocumentation#getNomenclatures <em>Nomenclatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nomenclatures</em>'.
	 * @see aigle.idm.diagraph.tp4.VueDocumentation#getNomenclatures()
	 * @see #getVueDocumentation()
	 * @generated
	 */
	EReference getVueDocumentation_Nomenclatures();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.VueDocumentation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aigle.idm.diagraph.tp4.VueDocumentation#getName()
	 * @see #getVueDocumentation()
	 * @generated
	 */
	EAttribute getVueDocumentation_Name();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Processeur <em>Processeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processeur</em>'.
	 * @see aigle.idm.diagraph.tp4.Processeur
	 * @generated
	 */
	EClass getProcesseur();

	/**
	 * Returns the meta object for the reference '{@link aigle.idm.diagraph.tp4.Processeur#get_famille <em>famille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>famille</em>'.
	 * @see aigle.idm.diagraph.tp4.Processeur#get_famille()
	 * @see #getProcesseur()
	 * @generated
	 */
	EReference getProcesseur__famille();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.ElementEmbarque <em>Element Embarque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Embarque</em>'.
	 * @see aigle.idm.diagraph.tp4.ElementEmbarque
	 * @generated
	 */
	EClass getElementEmbarque();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.ElementEmbarque#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see aigle.idm.diagraph.tp4.ElementEmbarque#getName()
	 * @see #getElementEmbarque()
	 * @generated
	 */
	EAttribute getElementEmbarque_Name();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.ElementEmbarque#getCadence <em>Cadence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cadence</em>'.
	 * @see aigle.idm.diagraph.tp4.ElementEmbarque#getCadence()
	 * @see #getElementEmbarque()
	 * @generated
	 */
	EAttribute getElementEmbarque_Cadence();

	/**
	 * Returns the meta object for the containment reference '{@link aigle.idm.diagraph.tp4.ElementEmbarque#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see aigle.idm.diagraph.tp4.ElementEmbarque#getTrace()
	 * @see #getElementEmbarque()
	 * @generated
	 */
	EReference getElementEmbarque_Trace();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see aigle.idm.diagraph.tp4.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference '{@link aigle.idm.diagraph.tp4.Trace#getT_nomenclature <em>Tnomenclature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tnomenclature</em>'.
	 * @see aigle.idm.diagraph.tp4.Trace#getT_nomenclature()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_T_nomenclature();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.Trace#getDate_heure <em>Date heure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date heure</em>'.
	 * @see aigle.idm.diagraph.tp4.Trace#getDate_heure()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Date_heure();

	/**
	 * Returns the meta object for class '{@link aigle.idm.diagraph.tp4.ZLocalisation <em>ZLocalisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZLocalisation</em>'.
	 * @see aigle.idm.diagraph.tp4.ZLocalisation
	 * @generated
	 */
	EClass getZLocalisation();

	/**
	 * Returns the meta object for the attribute '{@link aigle.idm.diagraph.tp4.ZLocalisation#getCordZ <em>Cord Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cord Z</em>'.
	 * @see aigle.idm.diagraph.tp4.ZLocalisation#getCordZ()
	 * @see #getZLocalisation()
	 * @generated
	 */
	EAttribute getZLocalisation_CordZ();

	/**
	 * Returns the meta object for the reference '{@link aigle.idm.diagraph.tp4.ZLocalisation#getLocalisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Localisation</em>'.
	 * @see aigle.idm.diagraph.tp4.ZLocalisation#getLocalisation()
	 * @see #getZLocalisation()
	 * @generated
	 */
	EReference getZLocalisation_Localisation();

	/**
	 * Returns the meta object for enum '{@link aigle.idm.diagraph.tp4.Categorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Categorie</em>'.
	 * @see aigle.idm.diagraph.tp4.Categorie
	 * @generated
	 */
	EEnum getCategorie();

	/**
	 * Returns the meta object for enum '{@link aigle.idm.diagraph.tp4.Nature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nature</em>'.
	 * @see aigle.idm.diagraph.tp4.Nature
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
	Tp4Factory getTp4Factory();

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
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.InfrastructureImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '<em><b>Calculateurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__CALCULATEURS = eINSTANCE.getInfrastructure_Calculateurs();

		/**
		 * The meta object literal for the '<em><b>Peripheriques</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__PERIPHERIQUES = eINSTANCE.getInfrastructure_Peripheriques();

		/**
		 * The meta object literal for the '<em><b>Localisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__LOCALISATIONS = eINSTANCE.getInfrastructure_Localisations();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE__DOCUMENTATION = eINSTANCE.getInfrastructure_Documentation();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.CalculateurImpl <em>Calculateur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.CalculateurImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getCalculateur()
		 * @generated
		 */
		EClass CALCULATEUR = eINSTANCE.getCalculateur();

		/**
		 * The meta object literal for the '<em><b>Categorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATEUR__CATEGORIE = eINSTANCE.getCalculateur_Categorie();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATEUR__INTERFACES = eINSTANCE.getCalculateur_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Processeurs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALCULATEUR__PROCESSEURS = eINSTANCE.getCalculateur_Processeurs();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.PeripheriqueImpl <em>Peripherique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.PeripheriqueImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getPeripherique()
		 * @generated
		 */
		EClass PERIPHERIQUE = eINSTANCE.getPeripherique();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIPHERIQUE__NATURE = eINSTANCE.getPeripherique_Nature();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.NomenclatureImpl <em>Nomenclature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.NomenclatureImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getNomenclature()
		 * @generated
		 */
		EClass NOMENCLATURE = eINSTANCE.getNomenclature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMENCLATURE__NAME = eINSTANCE.getNomenclature_Name();

		/**
		 * The meta object literal for the '<em><b>Zlocalisation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOMENCLATURE__ZLOCALISATION = eINSTANCE.getNomenclature_Zlocalisation();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.FamilleImpl <em>Famille</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.FamilleImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getFamille()
		 * @generated
		 */
		EClass FAMILLE = eINSTANCE.getFamille();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILLE__NOM = eINSTANCE.getFamille_Nom();

		/**
		 * The meta object literal for the '<em><b>Docus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILLE__DOCUS = eINSTANCE.getFamille_Docus();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.InterfaceImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>peripherique</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PERIPHERIQUE = eINSTANCE.getInterface__peripherique();

		/**
		 * The meta object literal for the '<em><b>Calculateur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CALCULATEUR = eINSTANCE.getInterface_Calculateur();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.LocalisationImpl <em>Localisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.LocalisationImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getLocalisation()
		 * @generated
		 */
		EClass LOCALISATION = eINSTANCE.getLocalisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALISATION__NAME = eINSTANCE.getLocalisation_Name();

		/**
		 * The meta object literal for the '<em><b>Cote X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALISATION__COTE_X = eINSTANCE.getLocalisation_CoteX();

		/**
		 * The meta object literal for the '<em><b>Cote Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALISATION__COTE_Y = eINSTANCE.getLocalisation_CoteY();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.DocumentationImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__DESCRIPTION = eINSTANCE.getDocumentation_Description();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.VueDocumentationImpl <em>Vue Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.VueDocumentationImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getVueDocumentation()
		 * @generated
		 */
		EClass VUE_DOCUMENTATION = eINSTANCE.getVueDocumentation();

		/**
		 * The meta object literal for the '<em><b>Familles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VUE_DOCUMENTATION__FAMILLES = eINSTANCE.getVueDocumentation_Familles();

		/**
		 * The meta object literal for the '<em><b>Nomenclatures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VUE_DOCUMENTATION__NOMENCLATURES = eINSTANCE.getVueDocumentation_Nomenclatures();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VUE_DOCUMENTATION__NAME = eINSTANCE.getVueDocumentation_Name();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.ProcesseurImpl <em>Processeur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.ProcesseurImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getProcesseur()
		 * @generated
		 */
		EClass PROCESSEUR = eINSTANCE.getProcesseur();

		/**
		 * The meta object literal for the '<em><b>famille</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSEUR__FAMILLE = eINSTANCE.getProcesseur__famille();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.ElementEmbarqueImpl <em>Element Embarque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.ElementEmbarqueImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getElementEmbarque()
		 * @generated
		 */
		EClass ELEMENT_EMBARQUE = eINSTANCE.getElementEmbarque();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_EMBARQUE__NAME = eINSTANCE.getElementEmbarque_Name();

		/**
		 * The meta object literal for the '<em><b>Cadence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_EMBARQUE__CADENCE = eINSTANCE.getElementEmbarque_Cadence();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_EMBARQUE__TRACE = eINSTANCE.getElementEmbarque_Trace();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.TraceImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Tnomenclature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TNOMENCLATURE = eINSTANCE.getTrace_T_nomenclature();

		/**
		 * The meta object literal for the '<em><b>Date heure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__DATE_HEURE = eINSTANCE.getTrace_Date_heure();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.impl.ZLocalisationImpl <em>ZLocalisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.impl.ZLocalisationImpl
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getZLocalisation()
		 * @generated
		 */
		EClass ZLOCALISATION = eINSTANCE.getZLocalisation();

		/**
		 * The meta object literal for the '<em><b>Cord Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZLOCALISATION__CORD_Z = eINSTANCE.getZLocalisation_CordZ();

		/**
		 * The meta object literal for the '<em><b>Localisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZLOCALISATION__LOCALISATION = eINSTANCE.getZLocalisation_Localisation();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.Categorie <em>Categorie</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.Categorie
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getCategorie()
		 * @generated
		 */
		EEnum CATEGORIE = eINSTANCE.getCategorie();

		/**
		 * The meta object literal for the '{@link aigle.idm.diagraph.tp4.Nature <em>Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aigle.idm.diagraph.tp4.Nature
		 * @see aigle.idm.diagraph.tp4.impl.Tp4PackageImpl#getNature()
		 * @generated
		 */
		EEnum NATURE = eINSTANCE.getNature();

	}

} //Tp4Package
