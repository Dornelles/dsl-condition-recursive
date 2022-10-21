/**
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.condition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zbr.test.condition.condition.Model#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link zbr.test.condition.condition.Model#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see zbr.test.condition.condition.ConditionPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
	/**
	 * Returns the value of the '<em><b>Conditional Expression</b></em>' containment reference list.
	 * The list contents are of type {@link zbr.test.condition.condition.ConditionalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Expression</em>' containment reference list.
	 * @see zbr.test.condition.condition.ConditionPackage#getModel_ConditionalExpression()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalExpression> getConditionalExpression();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link zbr.test.condition.condition.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see zbr.test.condition.condition.ConditionPackage#getModel_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getCondition();

} // Model