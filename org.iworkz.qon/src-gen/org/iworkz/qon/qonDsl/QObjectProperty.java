/**
 */
package org.iworkz.qon.qonDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QObject Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.QObjectProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.iworkz.qon.qonDsl.QonDslPackage#getQObjectProperty()
 * @model
 * @generated
 */
public interface QObjectProperty extends QValueProperty
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
   * @see #setValue(QObject)
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getQObjectProperty_Value()
   * @model containment="true"
   * @generated
   */
  QObject getValue();

  /**
   * Sets the value of the '{@link org.iworkz.qon.qonDsl.QObjectProperty#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(QObject value);

} // QObjectProperty
