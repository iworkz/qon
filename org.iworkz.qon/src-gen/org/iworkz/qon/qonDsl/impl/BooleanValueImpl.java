/**
 */
package org.iworkz.qon.qonDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.iworkz.qon.qonDsl.BooleanValue;
import org.iworkz.qon.qonDsl.QonDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.impl.BooleanValueImpl#isTrue <em>True</em>}</li>
 *   <li>{@link org.iworkz.qon.qonDsl.impl.BooleanValueImpl#isFalse <em>False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanValueImpl extends MinimalEObjectImpl.Container implements BooleanValue
{
  /**
   * The default value of the '{@link #isTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrue()
   * @generated
   * @ordered
   */
  protected static final boolean TRUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrue()
   * @generated
   * @ordered
   */
  protected boolean true_ = TRUE_EDEFAULT;

  /**
   * The default value of the '{@link #isFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFalse()
   * @generated
   * @ordered
   */
  protected static final boolean FALSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFalse()
   * @generated
   * @ordered
   */
  protected boolean false_ = FALSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanValueImpl()
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
    return QonDslPackage.Literals.BOOLEAN_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTrue()
  {
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue(boolean newTrue)
  {
    boolean oldTrue = true_;
    true_ = newTrue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QonDslPackage.BOOLEAN_VALUE__TRUE, oldTrue, true_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFalse()
  {
    return false_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalse(boolean newFalse)
  {
    boolean oldFalse = false_;
    false_ = newFalse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QonDslPackage.BOOLEAN_VALUE__FALSE, oldFalse, false_));
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
      case QonDslPackage.BOOLEAN_VALUE__TRUE:
        return isTrue();
      case QonDslPackage.BOOLEAN_VALUE__FALSE:
        return isFalse();
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
      case QonDslPackage.BOOLEAN_VALUE__TRUE:
        setTrue((Boolean)newValue);
        return;
      case QonDslPackage.BOOLEAN_VALUE__FALSE:
        setFalse((Boolean)newValue);
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
      case QonDslPackage.BOOLEAN_VALUE__TRUE:
        setTrue(TRUE_EDEFAULT);
        return;
      case QonDslPackage.BOOLEAN_VALUE__FALSE:
        setFalse(FALSE_EDEFAULT);
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
      case QonDslPackage.BOOLEAN_VALUE__TRUE:
        return true_ != TRUE_EDEFAULT;
      case QonDslPackage.BOOLEAN_VALUE__FALSE:
        return false_ != FALSE_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (true: ");
    result.append(true_);
    result.append(", false: ");
    result.append(false_);
    result.append(')');
    return result.toString();
  }

} //BooleanValueImpl
