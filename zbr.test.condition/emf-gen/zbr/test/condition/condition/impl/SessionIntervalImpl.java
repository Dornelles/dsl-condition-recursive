/**
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.condition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import zbr.test.condition.condition.ConditionPackage;
import zbr.test.condition.condition.MessageContent;
import zbr.test.condition.condition.SessionInterval;
import zbr.test.condition.condition.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zbr.test.condition.condition.impl.SessionIntervalImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link zbr.test.condition.condition.impl.SessionIntervalImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link zbr.test.condition.condition.impl.SessionIntervalImpl#getMessagecontent <em>Messagecontent</em>}</li>
 *   <li>{@link zbr.test.condition.condition.impl.SessionIntervalImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionIntervalImpl extends TermImpl implements SessionInterval
{
	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit TIME_UNIT_EDEFAULT = TimeUnit.SECOND;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessagecontent() <em>Messagecontent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagecontent()
	 * @generated
	 * @ordered
	 */
	protected MessageContent messagecontent;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionIntervalImpl()
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
		return ConditionPackage.Literals.SESSION_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFrequency()
	{
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(int newFrequency)
	{
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.SESSION_INTERVAL__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeUnit getTimeUnit()
	{
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnit(TimeUnit newTimeUnit)
	{
		TimeUnit oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.SESSION_INTERVAL__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageContent getMessagecontent()
	{
		return messagecontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagecontent(MessageContent newMessagecontent, NotificationChain msgs)
	{
		MessageContent oldMessagecontent = messagecontent;
		messagecontent = newMessagecontent;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionPackage.SESSION_INTERVAL__MESSAGECONTENT, oldMessagecontent, newMessagecontent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessagecontent(MessageContent newMessagecontent)
	{
		if (newMessagecontent != messagecontent)
		{
			NotificationChain msgs = null;
			if (messagecontent != null)
				msgs = ((InternalEObject)messagecontent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionPackage.SESSION_INTERVAL__MESSAGECONTENT, null, msgs);
			if (newMessagecontent != null)
				msgs = ((InternalEObject)newMessagecontent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionPackage.SESSION_INTERVAL__MESSAGECONTENT, null, msgs);
			msgs = basicSetMessagecontent(newMessagecontent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.SESSION_INTERVAL__MESSAGECONTENT, newMessagecontent, newMessagecontent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue)
	{
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.SESSION_INTERVAL__VALUE, oldValue, value));
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
			case ConditionPackage.SESSION_INTERVAL__MESSAGECONTENT:
				return basicSetMessagecontent(null, msgs);
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
			case ConditionPackage.SESSION_INTERVAL__FREQUENCY:
				return getFrequency();
			case ConditionPackage.SESSION_INTERVAL__TIME_UNIT:
				return getTimeUnit();
			case ConditionPackage.SESSION_INTERVAL__MESSAGECONTENT:
				return getMessagecontent();
			case ConditionPackage.SESSION_INTERVAL__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ConditionPackage.SESSION_INTERVAL__FREQUENCY:
				setFrequency((Integer)newValue);
				return;
			case ConditionPackage.SESSION_INTERVAL__TIME_UNIT:
				setTimeUnit((TimeUnit)newValue);
				return;
			case ConditionPackage.SESSION_INTERVAL__MESSAGECONTENT:
				setMessagecontent((MessageContent)newValue);
				return;
			case ConditionPackage.SESSION_INTERVAL__VALUE:
				setValue((String)newValue);
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
			case ConditionPackage.SESSION_INTERVAL__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case ConditionPackage.SESSION_INTERVAL__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case ConditionPackage.SESSION_INTERVAL__MESSAGECONTENT:
				setMessagecontent((MessageContent)null);
				return;
			case ConditionPackage.SESSION_INTERVAL__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ConditionPackage.SESSION_INTERVAL__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case ConditionPackage.SESSION_INTERVAL__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case ConditionPackage.SESSION_INTERVAL__MESSAGECONTENT:
				return messagecontent != null;
			case ConditionPackage.SESSION_INTERVAL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SessionIntervalImpl