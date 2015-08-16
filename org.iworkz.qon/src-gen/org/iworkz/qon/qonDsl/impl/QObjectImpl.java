/**
 */
package org.iworkz.qon.qonDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QProperty;
import org.iworkz.qon.qonDsl.QSystemProperty;
import org.iworkz.qon.qonDsl.QonDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.impl.QObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.iworkz.qon.qonDsl.impl.QObjectImpl#getSystemProperties <em>System Properties</em>}</li>
 *   <li>{@link org.iworkz.qon.qonDsl.impl.QObjectImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QObjectImpl extends QRootImpl implements QObject
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected QObject type;

  /**
   * The cached value of the '{@link #getSystemProperties() <em>System Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemProperties()
   * @generated
   * @ordered
   */
  protected EList<QSystemProperty> systemProperties;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<QProperty> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QObjectImpl()
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
    return QonDslPackage.Literals.QOBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QObject getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (QObject)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QonDslPackage.QOBJECT__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QObject basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(QObject newType)
  {
    QObject oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QonDslPackage.QOBJECT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QSystemProperty> getSystemProperties()
  {
    if (systemProperties == null)
    {
      systemProperties = new EObjectContainmentEList<QSystemProperty>(QSystemProperty.class, this, QonDslPackage.QOBJECT__SYSTEM_PROPERTIES);
    }
    return systemProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<QProperty>(QProperty.class, this, QonDslPackage.QOBJECT__PROPERTIES);
    }
    return properties;
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
      case QonDslPackage.QOBJECT__SYSTEM_PROPERTIES:
        return ((InternalEList<?>)getSystemProperties()).basicRemove(otherEnd, msgs);
      case QonDslPackage.QOBJECT__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case QonDslPackage.QOBJECT__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case QonDslPackage.QOBJECT__SYSTEM_PROPERTIES:
        return getSystemProperties();
      case QonDslPackage.QOBJECT__PROPERTIES:
        return getProperties();
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
      case QonDslPackage.QOBJECT__TYPE:
        setType((QObject)newValue);
        return;
      case QonDslPackage.QOBJECT__SYSTEM_PROPERTIES:
        getSystemProperties().clear();
        getSystemProperties().addAll((Collection<? extends QSystemProperty>)newValue);
        return;
      case QonDslPackage.QOBJECT__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends QProperty>)newValue);
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
      case QonDslPackage.QOBJECT__TYPE:
        setType((QObject)null);
        return;
      case QonDslPackage.QOBJECT__SYSTEM_PROPERTIES:
        getSystemProperties().clear();
        return;
      case QonDslPackage.QOBJECT__PROPERTIES:
        getProperties().clear();
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
      case QonDslPackage.QOBJECT__TYPE:
        return type != null;
      case QonDslPackage.QOBJECT__SYSTEM_PROPERTIES:
        return systemProperties != null && !systemProperties.isEmpty();
      case QonDslPackage.QOBJECT__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //QObjectImpl
