/**
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.condition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Number Of Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zbr.test.condition.condition.MaxNumberOfOperation#getOperationsNumber <em>Operations Number</em>}</li>
 *   <li>{@link zbr.test.condition.condition.MaxNumberOfOperation#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see zbr.test.condition.condition.ConditionPackage#getMaxNumberOfOperation()
 * @model
 * @generated
 */
public interface MaxNumberOfOperation extends Term
{
	/**
	 * Returns the value of the '<em><b>Operations Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations Number</em>' attribute.
	 * @see #setOperationsNumber(int)
	 * @see zbr.test.condition.condition.ConditionPackage#getMaxNumberOfOperation_OperationsNumber()
	 * @model
	 * @generated
	 */
	int getOperationsNumber();

	/**
	 * Sets the value of the '{@link zbr.test.condition.condition.MaxNumberOfOperation#getOperationsNumber <em>Operations Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations Number</em>' attribute.
	 * @see #getOperationsNumber()
	 * @generated
	 */
	void setOperationsNumber(int value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link zbr.test.condition.condition.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see zbr.test.condition.condition.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see zbr.test.condition.condition.ConditionPackage#getMaxNumberOfOperation_TimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link zbr.test.condition.condition.MaxNumberOfOperation#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see zbr.test.condition.condition.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

} // MaxNumberOfOperation
