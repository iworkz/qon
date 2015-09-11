/**
 */
package org.iworkz.qon.qonDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QLink Array Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.iworkz.qon.qonDsl.QLinkArrayProperty#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see org.iworkz.qon.qonDsl.QonDslPackage#getQLinkArrayProperty()
 * @model
 * @generated
 */
public interface QLinkArrayProperty extends QLinkProperty
{
  /**
   * Returns the value of the '<em><b>Links</b></em>' reference list.
   * The list contents are of type {@link org.iworkz.qon.qonDsl.QObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Links</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' reference list.
   * @see org.iworkz.qon.qonDsl.QonDslPackage#getQLinkArrayProperty_Links()
   * @model
   * @generated
   */
  EList<QObject> getLinks();

} // QLinkArrayProperty
