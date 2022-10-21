/**
 * generated by Xtext 2.28.0
 */
package zbr.test.condition.condition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import zbr.test.condition.condition.ConditionPackage;
import zbr.test.condition.condition.WeekDay;
import zbr.test.condition.condition.WeekDaysInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Week Days Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zbr.test.condition.condition.impl.WeekDaysIntervalImpl#getStart <em>Start</em>}</li>
 *   <li>{@link zbr.test.condition.condition.impl.WeekDaysIntervalImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeekDaysIntervalImpl extends TermImpl implements WeekDaysInterval
{
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final WeekDay START_EDEFAULT = WeekDay.SUNDAY;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected WeekDay start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final WeekDay END_EDEFAULT = WeekDay.SUNDAY;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected WeekDay end = END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeekDaysIntervalImpl()
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
		return ConditionPackage.Literals.WEEK_DAYS_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeekDay getStart()
	{
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(WeekDay newStart)
	{
		WeekDay oldStart = start;
		start = newStart == null ? START_EDEFAULT : newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.WEEK_DAYS_INTERVAL__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeekDay getEnd()
	{
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(WeekDay newEnd)
	{
		WeekDay oldEnd = end;
		end = newEnd == null ? END_EDEFAULT : newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionPackage.WEEK_DAYS_INTERVAL__END, oldEnd, end));
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
			case ConditionPackage.WEEK_DAYS_INTERVAL__START:
				return getStart();
			case ConditionPackage.WEEK_DAYS_INTERVAL__END:
				return getEnd();
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
			case ConditionPackage.WEEK_DAYS_INTERVAL__START:
				setStart((WeekDay)newValue);
				return;
			case ConditionPackage.WEEK_DAYS_INTERVAL__END:
				setEnd((WeekDay)newValue);
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
			case ConditionPackage.WEEK_DAYS_INTERVAL__START:
				setStart(START_EDEFAULT);
				return;
			case ConditionPackage.WEEK_DAYS_INTERVAL__END:
				setEnd(END_EDEFAULT);
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
			case ConditionPackage.WEEK_DAYS_INTERVAL__START:
				return start != START_EDEFAULT;
			case ConditionPackage.WEEK_DAYS_INTERVAL__END:
				return end != END_EDEFAULT;
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
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //WeekDaysIntervalImpl
