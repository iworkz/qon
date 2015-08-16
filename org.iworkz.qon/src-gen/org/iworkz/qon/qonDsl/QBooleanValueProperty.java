/**
 */
package org.iworkz.qon.qonDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QBoolean Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.QBooleanValueProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iworkz.qon.qonDsl.QonDslPackage#getQBooleanValueProperty()
 * @model
 * @generated
 */
public interface QBooleanValueProperty extends QValueProperty
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(BooleanValue)
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getQBooleanValueProperty_Value()
   * @model containment="true"
   * @generated
   */
  BooleanValue getValue();

  /**
   * Sets the value of the '{@link org.iworkz.qon.qonDsl.QBooleanValueProperty#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(BooleanValue value);

} // QBooleanValueProperty
