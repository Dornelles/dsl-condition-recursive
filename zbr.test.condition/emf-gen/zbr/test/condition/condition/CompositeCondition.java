/**
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.condition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zbr.test.condition.condition.CompositeCondition#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see zbr.test.condition.condition.ConditionPackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition extends Condition
{
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link zbr.test.condition.condition.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see zbr.test.condition.condition.ConditionPackage#getCompositeCondition_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

} // CompositeCondition