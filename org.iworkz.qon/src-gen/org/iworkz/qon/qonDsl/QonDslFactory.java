/**
 */
package org.iworkz.qon.qonDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.iworkz.qon.qonDsl.QonDslPackage
 * @generated
 */
public interface QonDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QonDslFactory eINSTANCE = org.iworkz.qon.qonDsl.impl.QonDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>QRoot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QRoot</em>'.
   * @generated
   */
  QRoot createQRoot();

  /**
   * Returns a new object of class '<em>QObject</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QObject</em>'.
   * @generated
   */
  QObject createQObject();

  /**
   * Returns a new object of class '<em>QSystem Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QSystem Property</em>'.
   * @generated
   */
  QSystemProperty createQSystemProperty();

  /**
   * Returns a new object of class '<em>Namespace Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Property</em>'.
   * @generated
   */
  NamespaceProperty createNamespaceProperty();

  /**
   * Returns a new object of class '<em>Schema Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema Property</em>'.
   * @generated
   */
  SchemaProperty createSchemaProperty();

  /**
   * Returns a new object of class '<em>Import Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Property</em>'.
   * @generated
   */
  ImportProperty createImportProperty();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>QProperty</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QProperty</em>'.
   * @generated
   */
  QProperty createQProperty();

  /**
   * Returns a new object of class '<em>QLink Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QLink Property</em>'.
   * @generated
   */
  QLinkProperty createQLinkProperty();

  /**
   * Returns a new object of class '<em>QLink Object Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QLink Object Property</em>'.
   * @generated
   */
  QLinkObjectProperty createQLinkObjectProperty();

  /**
   * Returns a new object of class '<em>QLink Array Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QLink Array Property</em>'.
   * @generated
   */
  QLinkArrayProperty createQLinkArrayProperty();

  /**
   * Returns a new object of class '<em>QValue Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QValue Property</em>'.
   * @generated
   */
  QValueProperty createQValueProperty();

  /**
   * Returns a new object of class '<em>QObject Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QObject Property</em>'.
   * @generated
   */
  QObjectProperty createQObjectProperty();

  /**
   * Returns a new object of class '<em>QString Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QString Value Property</em>'.
   * @generated
   */
  QStringValueProperty createQStringValueProperty();

  /**
   * Returns a new object of class '<em>QNumber Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QNumber Value Property</em>'.
   * @generated
   */
  QNumberValueProperty createQNumberValueProperty();

  /**
   * Returns a new object of class '<em>QBoolean Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QBoolean Value Property</em>'.
   * @generated
   */
  QBooleanValueProperty createQBooleanValueProperty();

  /**
   * Returns a new object of class '<em>QNull Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QNull Value Property</em>'.
   * @generated
   */
  QNullValueProperty createQNullValueProperty();

  /**
   * Returns a new object of class '<em>QObject Array Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QObject Array Property</em>'.
   * @generated
   */
  QObjectArrayProperty createQObjectArrayProperty();

  /**
   * Returns a new object of class '<em>QString Array Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QString Array Property</em>'.
   * @generated
   */
  QStringArrayProperty createQStringArrayProperty();

  /**
   * Returns a new object of class '<em>QNumber Array Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QNumber Array Property</em>'.
   * @generated
   */
  QNumberArrayProperty createQNumberArrayProperty();

  /**
   * Returns a new object of class '<em>QEmpty Array Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QEmpty Array Property</em>'.
   * @generated
   */
  QEmptyArrayProperty createQEmptyArrayProperty();

  /**
   * Returns a new object of class '<em>Boolean Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Value</em>'.
   * @generated
   */
  BooleanValue createBooleanValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QonDslPackage getQonDslPackage();

} //QonDslFactory
