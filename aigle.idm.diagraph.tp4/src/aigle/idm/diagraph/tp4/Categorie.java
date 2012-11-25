/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package aigle.idm.diagraph.tp4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see aigle.idm.diagraph.tp4.Tp4Package#getCategorie()
 * @model
 * @generated
 */
public enum Categorie implements Enumerator {
	/**
	 * The '<em><b>Temps Reel Dur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPS_REEL_DUR_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPS_REEL_DUR(0, "tempsReelDur", "tempsReelDur"),

	/**
	 * The '<em><b>Temps Reel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPS_REEL_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPS_REEL(1, "tempsReel", "tempsReel"),

	/**
	 * The '<em><b>Standard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(2, "standard", "standard");

	/**
	 * The '<em><b>Temps Reel Dur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temps Reel Dur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPS_REEL_DUR
	 * @model name="tempsReelDur"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPS_REEL_DUR_VALUE = 0;

	/**
	 * The '<em><b>Temps Reel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temps Reel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPS_REEL
	 * @model name="tempsReel"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPS_REEL_VALUE = 1;

	/**
	 * The '<em><b>Standard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @model name="standard"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Categorie[] VALUES_ARRAY =
		new Categorie[] {
			TEMPS_REEL_DUR,
			TEMPS_REEL,
			STANDARD,
		};

	/**
	 * A public read-only list of all the '<em><b>Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Categorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Categorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Categorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Categorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Categorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Categorie get(int value) {
		switch (value) {
			case TEMPS_REEL_DUR_VALUE: return TEMPS_REEL_DUR;
			case TEMPS_REEL_VALUE: return TEMPS_REEL;
			case STANDARD_VALUE: return STANDARD;
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
	private Categorie(int value, String name, String literal) {
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
	
} //Categorie
