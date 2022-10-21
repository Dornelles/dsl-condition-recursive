/**
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.condition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Term Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zbr.test.condition.condition.BinaryTermOperator#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link zbr.test.condition.condition.BinaryTermOperator#getRight <em>Right</em>}</li>
 *   <li>{@link zbr.test.condition.condition.BinaryTermOperator#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see zbr.test.condition.condition.ConditionPackage#getBinaryTermOperator()
 * @model
 * @generated
 */
public interface BinaryTermOperator extends Condition
{
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see zbr.test.condition.condition.ConditionPackage#getBinaryTermOperator_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link zbr.test.condition.condition.BinaryTermOperator#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Condition)
	 * @see zbr.test.condition.condition.ConditionPackage#getBinaryTermOperator_Right()
	 * @model containment="true"
	 * @generated
	 */
	Condition getRight();

	/**
	 * Sets the value of the '{@link zbr.test.condition.condition.BinaryTermOperator#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Condition value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Condition)
	 * @see zbr.test.condition.condition.ConditionPackage#getBinaryTermOperator_Left()
	 * @model containment="true"
	 * @generated
	 */
	Condition getLeft();

	/**
	 * Sets the value of the '{@link zbr.test.condition.condition.BinaryTermOperator#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Condition value);

} // BinaryTermOperator