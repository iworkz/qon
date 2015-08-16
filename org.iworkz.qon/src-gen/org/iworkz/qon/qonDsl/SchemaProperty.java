/**
 */
package org.iworkz.qon.qonDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.SchemaProperty#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iworkz.qon.qonDsl.QonDslPackage#getSchemaProperty()
 * @model
 * @generated
 */
public interface SchemaProperty extends QSystemProperty
{
  /**
   * Returns the value of the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' reference.
   * @see #setLink(QObject)
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getSchemaProperty_Link()
   * @model
   * @generated
   */
  QObject getLink();

  /**
   * Sets the value of the '{@link org.iworkz.qon.qonDsl.SchemaProperty#getLink <em>Link</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' reference.
   * @see #getLink()
   * @generated
   */
  void setLink(QObject value);

} // SchemaProperty
