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
 * A representation of the literals of the enumeration '<em><b>Cout</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aigle.idm.diagraph.tp3.Tp3Package#getCout()
 * @model
 * @generated
 */
public enum Cout implements Enumerator {
	/**
	 * The '<em><b>Faible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	FAIBLE(0, "faible", "faible"),

	/**
	 * The '<em><b>Moyen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOYEN_VALUE
	 * @generated
	 * @ordered
	 */
	MOYEN(1, "moyen", "moyen"),

	/**
	 * The '<em><b>Eleve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVE_VALUE
	 * @generated
	 * @ordered
	 */
	ELEVE(2, "eleve", "eleve");

	/**
	 * The '<em><b>Faible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Faible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAIBLE
	 * @model name="faible"
	 * @generated
	 * @ordered
	 */
	public static final int FAIBLE_VALUE = 0;

	/**
	 * The '<em><b>Moyen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moyen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOYEN
	 * @model name="moyen"
	 * @generated
	 * @ordered
	 */
	public static final int MOYEN_VALUE = 1;

	/**
	 * The '<em><b>Eleve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eleve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELEVE
	 * @model name="eleve"
	 * @generated
	 * @ordered
	 */
	public static final int ELEVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cout</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Cout[] VALUES_ARRAY =
		new Cout[] {
			FAIBLE,
			MOYEN,
			ELEVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Cout</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Cout> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cout</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cout get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cout result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cout</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cout getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cout result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cout</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cout get(int value) {
		switch (value) {
			case FAIBLE_VALUE: return FAIBLE;
			case MOYEN_VALUE: return MOYEN;
			case ELEVE_VALUE: return ELEVE;
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
	private Cout(int value, String name, String literal) {
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
	
} //Cout
