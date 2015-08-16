/**
 */
package org.iworkz.qon.qonDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QObject Array Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.QObjectArrayProperty#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iworkz.qon.qonDsl.QonDslPackage#getQObjectArrayProperty()
 * @model
 * @generated
 */
public interface QObjectArrayProperty extends QValueProperty
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.iworkz.qon.qonDsl.QObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getQObjectArrayProperty_Values()
   * @model containment="true"
   * @generated
   */
  EList<QObject> getValues();

} // QObjectArrayProperty
