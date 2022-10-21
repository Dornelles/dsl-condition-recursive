/**
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.condition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import zbr.test.condition.condition.Condition;
import zbr.test.condition.condition.ConditionPackage;
import zbr.test.condition.condition.ConditionalExpression;
import zbr.test.condition.condition.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zbr.test.condition.condition.impl.ModelImpl#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link zbr.test.condition.condition.impl.ModelImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
	/**
	 * The cached value of the '{@link #getConditionalExpression() <em>Conditional Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalExpression> conditionalExpression;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ConditionPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalExpression> getConditionalExpression()
	{
		if (conditionalExpression == null)
		{
			conditionalExpression = new EObjectContainmentEList<ConditionalExpression>(ConditionalExpression.class, this, ConditionPackage.MODEL__CONDITIONAL_EXPRESSION);
		}
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getCondition()
	{
		if (condition == null)
		{
			condition = new EObjectContainmentEList<Condition>(Condition.class, this, ConditionPackage.MODEL__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case ConditionPackage.MODEL__CONDITIONAL_EXPRESSION:
				return ((InternalEList<?>)getConditionalExpression()).basicRemove(otherEnd, msgs);
			case ConditionPackage.MODEL__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case ConditionPackage.MODEL__CONDITIONAL_EXPRESSION:
				return getConditionalExpression();
			case ConditionPackage.MODEL__CONDITION:
				return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ConditionPackage.MODEL__CONDITIONAL_EXPRESSION:
				getConditionalExpression().clear();
				getConditionalExpression().addAll((Collection<? extends ConditionalExpression>)newValue);
				return;
			case ConditionPackage.MODEL__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Condition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case ConditionPackage.MODEL__CONDITIONAL_EXPRESSION:
				getConditionalExpression().clear();
				return;
			case ConditionPackage.MODEL__CONDITION:
				getCondition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case ConditionPackage.MODEL__CONDITIONAL_EXPRESSION:
				return conditionalExpression != null && !conditionalExpression.isEmpty();
			case ConditionPackage.MODEL__CONDITION:
				return condition != null && !condition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
