/**
 */
package org.iworkz.qon.qonDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QString Array Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.QStringArrayProperty#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.iworkz.qon.qonDsl.QonDslPackage#getQStringArrayProperty()
 * @model
 * @generated
 */
public interface QStringArrayProperty extends QValueProperty
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getQStringArrayProperty_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // QStringArrayProperty
