/**
 */
package org.iworkz.qon.qonDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.QObject#getType <em>Type</em>}</li>
 *   <li>{@link org.iworkz.qon.qonDsl.QObject#getSystemProperties <em>System Properties</em>}</li>
 *   <li>{@link org.iworkz.qon.qonDsl.QObject#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.iworkz.qon.qonDsl.QonDslPackage#getQObject()
 * @model
 * @generated
 */
public interface QObject extends QRoot
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(QObject)
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getQObject_Type()
   * @model
   * @generated
   */
  QObject getType();

  /**
   * Sets the value of the '{@link org.iworkz.qon.qonDsl.QObject#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(QObject value);

  /**
   * Returns the value of the '<em><b>System Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.iworkz.qon.qonDsl.QSystemProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Properties</em>' containment reference list.
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getQObject_SystemProperties()
   * @model containment="true"
   * @generated
   */
  EList<QSystemProperty> getSystemProperties();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.iworkz.qon.qonDsl.QProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getQObject_Properties()
   * @model containment="true"
   * @generated
   */
  EList<QProperty> getProperties();

} // QObject
