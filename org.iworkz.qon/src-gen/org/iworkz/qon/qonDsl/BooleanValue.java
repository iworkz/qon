/**
 */
package org.iworkz.qon.qonDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.BooleanValue#isTrue <em>True</em>}</li>
 *   <li>{@link org.iworkz.qon.qonDsl.BooleanValue#isFalse <em>False</em>}</li>
 * </ul>
 *
 * @see org.iworkz.qon.qonDsl.QonDslPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends EObject
{
  /**
   * Returns the value of the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True</em>' attribute.
   * @see #setTrue(boolean)
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getBooleanValue_True()
   * @model
   * @generated
   */
  boolean isTrue();

  /**
   * Sets the value of the '{@link org.iworkz.qon.qonDsl.BooleanValue#isTrue <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True</em>' attribute.
   * @see #isTrue()
   * @generated
   */
  void setTrue(boolean value);

  /**
   * Returns the value of the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False</em>' attribute.
   * @see #setFalse(boolean)
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getBooleanValue_False()
   * @model
   * @generated
   */
  boolean isFalse();

  /**
   * Sets the value of the '{@link org.iworkz.qon.qonDsl.BooleanValue#isFalse <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False</em>' attribute.
   * @see #isFalse()
   * @generated
   */
  void setFalse(boolean value);

} // BooleanValue
