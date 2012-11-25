/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aigle.idm.diagraph.tp3.Tp3Package#getNature()
 * @model
 * @generated
 */
public enum Nature implements Enumerator {
	/**
	 * The '<em><b>Legume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGUME_VALUE
	 * @generated
	 * @ordered
	 */
	LEGUME(0, "legume", "legume"),

	/**
	 * The '<em><b>Viande</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIANDE_VALUE
	 * @generated
	 * @ordered
	 */
	VIANDE(1, "viande", "viande"),

	/**
	 * The '<em><b>Poisson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POISSON_VALUE
	 * @generated
	 * @ordered
	 */
	POISSON(2, "poisson", "poisson"),

	/**
	 * The '<em><b>Condiment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDIMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONDIMENT(3, "condiment", "condiment"),

	/**
	 * The '<em><b>Fruit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRUIT_VALUE
	 * @generated
	 * @ordered
	 */
	FRUIT(4, "fruit", "fruit"),

	/**
	 * The '<em><b>Feculent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FECULENT_VALUE
	 * @generated
	 * @ordered
	 */
	FECULENT(5, "feculent", "feculent"),

	/**
	 * The '<em><b>Oeuf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OEUF_VALUE
	 * @generated
	 * @ordered
	 */
	OEUF(6, "oeuf", "oeuf"),

	/**
	 * The '<em><b>Matiere Grasse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATIERE_GRASSE_VALUE
	 * @generated
	 * @ordered
	 */
	MATIERE_GRASSE(7, "matiereGrasse", "matiereGrasse");

	/**
	 * The '<em><b>Legume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Legume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEGUME
	 * @model name="legume"
	 * @generated
	 * @ordered
	 */
	public static final int LEGUME_VALUE = 0;

	/**
	 * The '<em><b>Viande</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Viande</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIANDE
	 * @model name="viande"
	 * @generated
	 * @ordered
	 */
	public static final int VIANDE_VALUE = 1;

	/**
	 * The '<em><b>Poisson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poisson</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POISSON
	 * @model name="poisson"
	 * @generated
	 * @ordered
	 */
	public static final int POISSON_VALUE = 2;

	/**
	 * The '<em><b>Condiment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Condiment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDIMENT
	 * @model name="condiment"
	 * @generated
	 * @ordered
	 */
	public static final int CONDIMENT_VALUE = 3;

	/**
	 * The '<em><b>Fruit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fruit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRUIT
	 * @model name="fruit"
	 * @generated
	 * @ordered
	 */
	public static final int FRUIT_VALUE = 4;

	/**
	 * The '<em><b>Feculent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Feculent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FECULENT
	 * @model name="feculent"
	 * @generated
	 * @ordered
	 */
	public static final int FECULENT_VALUE = 5;

	/**
	 * The '<em><b>Oeuf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oeuf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OEUF
	 * @model name="oeuf"
	 * @generated
	 * @ordered
	 */
	public static final int OEUF_VALUE = 6;

	/**
	 * The '<em><b>Matiere Grasse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Matiere Grasse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATIERE_GRASSE
	 * @model name="matiereGrasse"
	 * @generated
	 * @ordered
	 */
	public static final int MATIERE_GRASSE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Nature[] VALUES_ARRAY =
		new Nature[] {
			LEGUME,
			VIANDE,
			POISSON,
			CONDIMENT,
			FRUIT,
			FECULENT,
			OEUF,
			MATIERE_GRASSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Nature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Nature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nature get(int value) {
		switch (value) {
			case LEGUME_VALUE: return LEGUME;
			case VIANDE_VALUE: return VIANDE;
			case POISSON_VALUE: return POISSON;
			case CONDIMENT_VALUE: return CONDIMENT;
			case FRUIT_VALUE: return FRUIT;
			case FECULENT_VALUE: return FECULENT;
			case OEUF_VALUE: return OEUF;
			case MATIERE_GRASSE_VALUE: return MATIERE_GRASSE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Nature(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Nature
