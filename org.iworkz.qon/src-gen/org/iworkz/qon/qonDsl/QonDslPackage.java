/**
 */
package org.iworkz.qon.qonDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.iworkz.qon.qonDsl.QonDslFactory
 * @model kind="package"
 * @generated
 */
public interface QonDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "qonDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.iworkz.org/qon/QonDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "qonDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QonDslPackage eINSTANCE = org.iworkz.qon.qonDsl.impl.QonDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QRootImpl <em>QRoot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QRootImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQRoot()
   * @generated
   */
  int QROOT = 0;

  /**
   * The number of structural features of the '<em>QRoot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QROOT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QObjectImpl <em>QObject</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QObjectImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQObject()
   * @generated
   */
  int QOBJECT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT__TYPE = QROOT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>System Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT__SYSTEM_PROPERTIES = QROOT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT__PROPERTIES = QROOT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>QObject</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT_FEATURE_COUNT = QROOT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QSystemPropertyImpl <em>QSystem Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QSystemPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQSystemProperty()
   * @generated
   */
  int QSYSTEM_PROPERTY = 2;

  /**
   * The number of structural features of the '<em>QSystem Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QSYSTEM_PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.NamespacePropertyImpl <em>Namespace Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.NamespacePropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getNamespaceProperty()
   * @generated
   */
  int NAMESPACE_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_PROPERTY__VALUE = QSYSTEM_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Namespace Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_PROPERTY_FEATURE_COUNT = QSYSTEM_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.SchemaPropertyImpl <em>Schema Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.SchemaPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getSchemaProperty()
   * @generated
   */
  int SCHEMA_PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_PROPERTY__LINK = QSYSTEM_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Schema Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_PROPERTY_FEATURE_COUNT = QSYSTEM_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.ImportPropertyImpl <em>Import Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.ImportPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getImportProperty()
   * @generated
   */
  int IMPORT_PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_PROPERTY__VALUES = QSYSTEM_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_PROPERTY_FEATURE_COUNT = QSYSTEM_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.ImportImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 6;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QPropertyImpl <em>QProperty</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQProperty()
   * @generated
   */
  int QPROPERTY = 7;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QPROPERTY__PROPERTY_NAME = 0;

  /**
   * The number of structural features of the '<em>QProperty</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QPROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QLinkPropertyImpl <em>QLink Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QLinkPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQLinkProperty()
   * @generated
   */
  int QLINK_PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QLINK_PROPERTY__PROPERTY_NAME = QPROPERTY__PROPERTY_NAME;

  /**
   * The number of structural features of the '<em>QLink Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QLINK_PROPERTY_FEATURE_COUNT = QPROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QLinkObjectPropertyImpl <em>QLink Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QLinkObjectPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQLinkObjectProperty()
   * @generated
   */
  int QLINK_OBJECT_PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QLINK_OBJECT_PROPERTY__PROPERTY_NAME = QLINK_PROPERTY__PROPERTY_NAME;

  /**
   * The feature id for the '<em><b>Link</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QLINK_OBJECT_PROPERTY__LINK = QLINK_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QLink Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QLINK_OBJECT_PROPERTY_FEATURE_COUNT = QLINK_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QLinkArrayPropertyImpl <em>QLink Array Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QLinkArrayPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQLinkArrayProperty()
   * @generated
   */
  int QLINK_ARRAY_PROPERTY = 10;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QLINK_ARRAY_PROPERTY__PROPERTY_NAME = QLINK_PROPERTY__PROPERTY_NAME;

  /**
   * The feature id for the '<em><b>Links</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QLINK_ARRAY_PROPERTY__LINKS = QLINK_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QLink Array Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QLINK_ARRAY_PROPERTY_FEATURE_COUNT = QLINK_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QValuePropertyImpl <em>QValue Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QValuePropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQValueProperty()
   * @generated
   */
  int QVALUE_PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QVALUE_PROPERTY__PROPERTY_NAME = QPROPERTY__PROPERTY_NAME;

  /**
   * The number of structural features of the '<em>QValue Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QVALUE_PROPERTY_FEATURE_COUNT = QPROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QObjectPropertyImpl <em>QObject Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QObjectPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQObjectProperty()
   * @generated
   */
  int QOBJECT_PROPERTY = 12;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT_PROPERTY__PROPERTY_NAME = QVALUE_PROPERTY__PROPERTY_NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT_PROPERTY__VALUE = QVALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QObject Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT_PROPERTY_FEATURE_COUNT = QVALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QStringValuePropertyImpl <em>QString Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QStringValuePropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQStringValueProperty()
   * @generated
   */
  int QSTRING_VALUE_PROPERTY = 13;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QSTRING_VALUE_PROPERTY__PROPERTY_NAME = QVALUE_PROPERTY__PROPERTY_NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QSTRING_VALUE_PROPERTY__VALUE = QVALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QString Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QSTRING_VALUE_PROPERTY_FEATURE_COUNT = QVALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QNumberValuePropertyImpl <em>QNumber Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QNumberValuePropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQNumberValueProperty()
   * @generated
   */
  int QNUMBER_VALUE_PROPERTY = 14;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNUMBER_VALUE_PROPERTY__PROPERTY_NAME = QVALUE_PROPERTY__PROPERTY_NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNUMBER_VALUE_PROPERTY__VALUE = QVALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QNumber Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNUMBER_VALUE_PROPERTY_FEATURE_COUNT = QVALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QBooleanValuePropertyImpl <em>QBoolean Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QBooleanValuePropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQBooleanValueProperty()
   * @generated
   */
  int QBOOLEAN_VALUE_PROPERTY = 15;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QBOOLEAN_VALUE_PROPERTY__PROPERTY_NAME = QVALUE_PROPERTY__PROPERTY_NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QBOOLEAN_VALUE_PROPERTY__VALUE = QVALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QBoolean Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QBOOLEAN_VALUE_PROPERTY_FEATURE_COUNT = QVALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QNullValuePropertyImpl <em>QNull Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QNullValuePropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQNullValueProperty()
   * @generated
   */
  int QNULL_VALUE_PROPERTY = 16;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNULL_VALUE_PROPERTY__PROPERTY_NAME = QVALUE_PROPERTY__PROPERTY_NAME;

  /**
   * The number of structural features of the '<em>QNull Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNULL_VALUE_PROPERTY_FEATURE_COUNT = QVALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QObjectArrayPropertyImpl <em>QObject Array Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QObjectArrayPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQObjectArrayProperty()
   * @generated
   */
  int QOBJECT_ARRAY_PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT_ARRAY_PROPERTY__PROPERTY_NAME = QVALUE_PROPERTY__PROPERTY_NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT_ARRAY_PROPERTY__VALUES = QVALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QObject Array Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QOBJECT_ARRAY_PROPERTY_FEATURE_COUNT = QVALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QStringArrayPropertyImpl <em>QString Array Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QStringArrayPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQStringArrayProperty()
   * @generated
   */
  int QSTRING_ARRAY_PROPERTY = 18;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QSTRING_ARRAY_PROPERTY__PROPERTY_NAME = QVALUE_PROPERTY__PROPERTY_NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QSTRING_ARRAY_PROPERTY__VALUES = QVALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QString Array Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QSTRING_ARRAY_PROPERTY_FEATURE_COUNT = QVALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QNumberArrayPropertyImpl <em>QNumber Array Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QNumberArrayPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQNumberArrayProperty()
   * @generated
   */
  int QNUMBER_ARRAY_PROPERTY = 19;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNUMBER_ARRAY_PROPERTY__PROPERTY_NAME = QVALUE_PROPERTY__PROPERTY_NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNUMBER_ARRAY_PROPERTY__VALUES = QVALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>QNumber Array Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QNUMBER_ARRAY_PROPERTY_FEATURE_COUNT = QVALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.QEmptyArrayPropertyImpl <em>QEmpty Array Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.QEmptyArrayPropertyImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQEmptyArrayProperty()
   * @generated
   */
  int QEMPTY_ARRAY_PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QEMPTY_ARRAY_PROPERTY__PROPERTY_NAME = QVALUE_PROPERTY__PROPERTY_NAME;

  /**
   * The number of structural features of the '<em>QEmpty Array Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QEMPTY_ARRAY_PROPERTY_FEATURE_COUNT = QVALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.iworkz.qon.qonDsl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iworkz.qon.qonDsl.impl.BooleanValueImpl
   * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 21;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__TRUE = 0;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__FALSE = 1;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QRoot <em>QRoot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QRoot</em>'.
   * @see org.iworkz.qon.qonDsl.QRoot
   * @generated
   */
  EClass getQRoot();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QObject <em>QObject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QObject</em>'.
   * @see org.iworkz.qon.qonDsl.QObject
   * @generated
   */
  EClass getQObject();

  /**
   * Returns the meta object for the reference '{@link org.iworkz.qon.qonDsl.QObject#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.iworkz.qon.qonDsl.QObject#getType()
   * @see #getQObject()
   * @generated
   */
  EReference getQObject_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.iworkz.qon.qonDsl.QObject#getSystemProperties <em>System Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>System Properties</em>'.
   * @see org.iworkz.qon.qonDsl.QObject#getSystemProperties()
   * @see #getQObject()
   * @generated
   */
  EReference getQObject_SystemProperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.iworkz.qon.qonDsl.QObject#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.iworkz.qon.qonDsl.QObject#getProperties()
   * @see #getQObject()
   * @generated
   */
  EReference getQObject_Properties();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QSystemProperty <em>QSystem Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QSystem Property</em>'.
   * @see org.iworkz.qon.qonDsl.QSystemProperty
   * @generated
   */
  EClass getQSystemProperty();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.NamespaceProperty <em>Namespace Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Property</em>'.
   * @see org.iworkz.qon.qonDsl.NamespaceProperty
   * @generated
   */
  EClass getNamespaceProperty();

  /**
   * Returns the meta object for the attribute '{@link org.iworkz.qon.qonDsl.NamespaceProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.iworkz.qon.qonDsl.NamespaceProperty#getValue()
   * @see #getNamespaceProperty()
   * @generated
   */
  EAttribute getNamespaceProperty_Value();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.SchemaProperty <em>Schema Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Property</em>'.
   * @see org.iworkz.qon.qonDsl.SchemaProperty
   * @generated
   */
  EClass getSchemaProperty();

  /**
   * Returns the meta object for the reference '{@link org.iworkz.qon.qonDsl.SchemaProperty#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see org.iworkz.qon.qonDsl.SchemaProperty#getLink()
   * @see #getSchemaProperty()
   * @generated
   */
  EReference getSchemaProperty_Link();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.ImportProperty <em>Import Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Property</em>'.
   * @see org.iworkz.qon.qonDsl.ImportProperty
   * @generated
   */
  EClass getImportProperty();

  /**
   * Returns the meta object for the containment reference list '{@link org.iworkz.qon.qonDsl.ImportProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.iworkz.qon.qonDsl.ImportProperty#getValues()
   * @see #getImportProperty()
   * @generated
   */
  EReference getImportProperty_Values();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.iworkz.qon.qonDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.iworkz.qon.qonDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.iworkz.qon.qonDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QProperty <em>QProperty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QProperty</em>'.
   * @see org.iworkz.qon.qonDsl.QProperty
   * @generated
   */
  EClass getQProperty();

  /**
   * Returns the meta object for the attribute '{@link org.iworkz.qon.qonDsl.QProperty#getPropertyName <em>Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Name</em>'.
   * @see org.iworkz.qon.qonDsl.QProperty#getPropertyName()
   * @see #getQProperty()
   * @generated
   */
  EAttribute getQProperty_PropertyName();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QLinkProperty <em>QLink Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QLink Property</em>'.
   * @see org.iworkz.qon.qonDsl.QLinkProperty
   * @generated
   */
  EClass getQLinkProperty();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QLinkObjectProperty <em>QLink Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QLink Object Property</em>'.
   * @see org.iworkz.qon.qonDsl.QLinkObjectProperty
   * @generated
   */
  EClass getQLinkObjectProperty();

  /**
   * Returns the meta object for the reference '{@link org.iworkz.qon.qonDsl.QLinkObjectProperty#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Link</em>'.
   * @see org.iworkz.qon.qonDsl.QLinkObjectProperty#getLink()
   * @see #getQLinkObjectProperty()
   * @generated
   */
  EReference getQLinkObjectProperty_Link();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QLinkArrayProperty <em>QLink Array Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QLink Array Property</em>'.
   * @see org.iworkz.qon.qonDsl.QLinkArrayProperty
   * @generated
   */
  EClass getQLinkArrayProperty();

  /**
   * Returns the meta object for the reference list '{@link org.iworkz.qon.qonDsl.QLinkArrayProperty#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Links</em>'.
   * @see org.iworkz.qon.qonDsl.QLinkArrayProperty#getLinks()
   * @see #getQLinkArrayProperty()
   * @generated
   */
  EReference getQLinkArrayProperty_Links();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QValueProperty <em>QValue Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QValue Property</em>'.
   * @see org.iworkz.qon.qonDsl.QValueProperty
   * @generated
   */
  EClass getQValueProperty();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QObjectProperty <em>QObject Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QObject Property</em>'.
   * @see org.iworkz.qon.qonDsl.QObjectProperty
   * @generated
   */
  EClass getQObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.iworkz.qon.qonDsl.QObjectProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.iworkz.qon.qonDsl.QObjectProperty#getValue()
   * @see #getQObjectProperty()
   * @generated
   */
  EReference getQObjectProperty_Value();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QStringValueProperty <em>QString Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QString Value Property</em>'.
   * @see org.iworkz.qon.qonDsl.QStringValueProperty
   * @generated
   */
  EClass getQStringValueProperty();

  /**
   * Returns the meta object for the attribute '{@link org.iworkz.qon.qonDsl.QStringValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.iworkz.qon.qonDsl.QStringValueProperty#getValue()
   * @see #getQStringValueProperty()
   * @generated
   */
  EAttribute getQStringValueProperty_Value();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QNumberValueProperty <em>QNumber Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QNumber Value Property</em>'.
   * @see org.iworkz.qon.qonDsl.QNumberValueProperty
   * @generated
   */
  EClass getQNumberValueProperty();

  /**
   * Returns the meta object for the attribute '{@link org.iworkz.qon.qonDsl.QNumberValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.iworkz.qon.qonDsl.QNumberValueProperty#getValue()
   * @see #getQNumberValueProperty()
   * @generated
   */
  EAttribute getQNumberValueProperty_Value();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QBooleanValueProperty <em>QBoolean Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QBoolean Value Property</em>'.
   * @see org.iworkz.qon.qonDsl.QBooleanValueProperty
   * @generated
   */
  EClass getQBooleanValueProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.iworkz.qon.qonDsl.QBooleanValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.iworkz.qon.qonDsl.QBooleanValueProperty#getValue()
   * @see #getQBooleanValueProperty()
   * @generated
   */
  EReference getQBooleanValueProperty_Value();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QNullValueProperty <em>QNull Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QNull Value Property</em>'.
   * @see org.iworkz.qon.qonDsl.QNullValueProperty
   * @generated
   */
  EClass getQNullValueProperty();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QObjectArrayProperty <em>QObject Array Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QObject Array Property</em>'.
   * @see org.iworkz.qon.qonDsl.QObjectArrayProperty
   * @generated
   */
  EClass getQObjectArrayProperty();

  /**
   * Returns the meta object for the containment reference list '{@link org.iworkz.qon.qonDsl.QObjectArrayProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.iworkz.qon.qonDsl.QObjectArrayProperty#getValues()
   * @see #getQObjectArrayProperty()
   * @generated
   */
  EReference getQObjectArrayProperty_Values();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QStringArrayProperty <em>QString Array Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QString Array Property</em>'.
   * @see org.iworkz.qon.qonDsl.QStringArrayProperty
   * @generated
   */
  EClass getQStringArrayProperty();

  /**
   * Returns the meta object for the attribute list '{@link org.iworkz.qon.qonDsl.QStringArrayProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.iworkz.qon.qonDsl.QStringArrayProperty#getValues()
   * @see #getQStringArrayProperty()
   * @generated
   */
  EAttribute getQStringArrayProperty_Values();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QNumberArrayProperty <em>QNumber Array Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QNumber Array Property</em>'.
   * @see org.iworkz.qon.qonDsl.QNumberArrayProperty
   * @generated
   */
  EClass getQNumberArrayProperty();

  /**
   * Returns the meta object for the attribute list '{@link org.iworkz.qon.qonDsl.QNumberArrayProperty#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.iworkz.qon.qonDsl.QNumberArrayProperty#getValues()
   * @see #getQNumberArrayProperty()
   * @generated
   */
  EAttribute getQNumberArrayProperty_Values();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.QEmptyArrayProperty <em>QEmpty Array Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>QEmpty Array Property</em>'.
   * @see org.iworkz.qon.qonDsl.QEmptyArrayProperty
   * @generated
   */
  EClass getQEmptyArrayProperty();

  /**
   * Returns the meta object for class '{@link org.iworkz.qon.qonDsl.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.iworkz.qon.qonDsl.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.iworkz.qon.qonDsl.BooleanValue#isTrue <em>True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>True</em>'.
   * @see org.iworkz.qon.qonDsl.BooleanValue#isTrue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_True();

  /**
   * Returns the meta object for the attribute '{@link org.iworkz.qon.qonDsl.BooleanValue#isFalse <em>False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>False</em>'.
   * @see org.iworkz.qon.qonDsl.BooleanValue#isFalse()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_False();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QonDslFactory getQonDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QRootImpl <em>QRoot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QRootImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQRoot()
     * @generated
     */
    EClass QROOT = eINSTANCE.getQRoot();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QObjectImpl <em>QObject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QObjectImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQObject()
     * @generated
     */
    EClass QOBJECT = eINSTANCE.getQObject();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QOBJECT__TYPE = eINSTANCE.getQObject_Type();

    /**
     * The meta object literal for the '<em><b>System Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QOBJECT__SYSTEM_PROPERTIES = eINSTANCE.getQObject_SystemProperties();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QOBJECT__PROPERTIES = eINSTANCE.getQObject_Properties();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QSystemPropertyImpl <em>QSystem Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QSystemPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQSystemProperty()
     * @generated
     */
    EClass QSYSTEM_PROPERTY = eINSTANCE.getQSystemProperty();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.NamespacePropertyImpl <em>Namespace Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.NamespacePropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getNamespaceProperty()
     * @generated
     */
    EClass NAMESPACE_PROPERTY = eINSTANCE.getNamespaceProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_PROPERTY__VALUE = eINSTANCE.getNamespaceProperty_Value();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.SchemaPropertyImpl <em>Schema Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.SchemaPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getSchemaProperty()
     * @generated
     */
    EClass SCHEMA_PROPERTY = eINSTANCE.getSchemaProperty();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_PROPERTY__LINK = eINSTANCE.getSchemaProperty_Link();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.ImportPropertyImpl <em>Import Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.ImportPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getImportProperty()
     * @generated
     */
    EClass IMPORT_PROPERTY = eINSTANCE.getImportProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_PROPERTY__VALUES = eINSTANCE.getImportProperty_Values();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.ImportImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QPropertyImpl <em>QProperty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQProperty()
     * @generated
     */
    EClass QPROPERTY = eINSTANCE.getQProperty();

    /**
     * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QPROPERTY__PROPERTY_NAME = eINSTANCE.getQProperty_PropertyName();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QLinkPropertyImpl <em>QLink Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QLinkPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQLinkProperty()
     * @generated
     */
    EClass QLINK_PROPERTY = eINSTANCE.getQLinkProperty();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QLinkObjectPropertyImpl <em>QLink Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QLinkObjectPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQLinkObjectProperty()
     * @generated
     */
    EClass QLINK_OBJECT_PROPERTY = eINSTANCE.getQLinkObjectProperty();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QLINK_OBJECT_PROPERTY__LINK = eINSTANCE.getQLinkObjectProperty_Link();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QLinkArrayPropertyImpl <em>QLink Array Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QLinkArrayPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQLinkArrayProperty()
     * @generated
     */
    EClass QLINK_ARRAY_PROPERTY = eINSTANCE.getQLinkArrayProperty();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QLINK_ARRAY_PROPERTY__LINKS = eINSTANCE.getQLinkArrayProperty_Links();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QValuePropertyImpl <em>QValue Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QValuePropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQValueProperty()
     * @generated
     */
    EClass QVALUE_PROPERTY = eINSTANCE.getQValueProperty();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QObjectPropertyImpl <em>QObject Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QObjectPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQObjectProperty()
     * @generated
     */
    EClass QOBJECT_PROPERTY = eINSTANCE.getQObjectProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QOBJECT_PROPERTY__VALUE = eINSTANCE.getQObjectProperty_Value();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QStringValuePropertyImpl <em>QString Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QStringValuePropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQStringValueProperty()
     * @generated
     */
    EClass QSTRING_VALUE_PROPERTY = eINSTANCE.getQStringValueProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QSTRING_VALUE_PROPERTY__VALUE = eINSTANCE.getQStringValueProperty_Value();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QNumberValuePropertyImpl <em>QNumber Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QNumberValuePropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQNumberValueProperty()
     * @generated
     */
    EClass QNUMBER_VALUE_PROPERTY = eINSTANCE.getQNumberValueProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QNUMBER_VALUE_PROPERTY__VALUE = eINSTANCE.getQNumberValueProperty_Value();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QBooleanValuePropertyImpl <em>QBoolean Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QBooleanValuePropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQBooleanValueProperty()
     * @generated
     */
    EClass QBOOLEAN_VALUE_PROPERTY = eINSTANCE.getQBooleanValueProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QBOOLEAN_VALUE_PROPERTY__VALUE = eINSTANCE.getQBooleanValueProperty_Value();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QNullValuePropertyImpl <em>QNull Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QNullValuePropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQNullValueProperty()
     * @generated
     */
    EClass QNULL_VALUE_PROPERTY = eINSTANCE.getQNullValueProperty();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QObjectArrayPropertyImpl <em>QObject Array Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QObjectArrayPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQObjectArrayProperty()
     * @generated
     */
    EClass QOBJECT_ARRAY_PROPERTY = eINSTANCE.getQObjectArrayProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QOBJECT_ARRAY_PROPERTY__VALUES = eINSTANCE.getQObjectArrayProperty_Values();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QStringArrayPropertyImpl <em>QString Array Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QStringArrayPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQStringArrayProperty()
     * @generated
     */
    EClass QSTRING_ARRAY_PROPERTY = eINSTANCE.getQStringArrayProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QSTRING_ARRAY_PROPERTY__VALUES = eINSTANCE.getQStringArrayProperty_Values();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QNumberArrayPropertyImpl <em>QNumber Array Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QNumberArrayPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQNumberArrayProperty()
     * @generated
     */
    EClass QNUMBER_ARRAY_PROPERTY = eINSTANCE.getQNumberArrayProperty();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QNUMBER_ARRAY_PROPERTY__VALUES = eINSTANCE.getQNumberArrayProperty_Values();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.QEmptyArrayPropertyImpl <em>QEmpty Array Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.QEmptyArrayPropertyImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getQEmptyArrayProperty()
     * @generated
     */
    EClass QEMPTY_ARRAY_PROPERTY = eINSTANCE.getQEmptyArrayProperty();

    /**
     * The meta object literal for the '{@link org.iworkz.qon.qonDsl.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iworkz.qon.qonDsl.impl.BooleanValueImpl
     * @see org.iworkz.qon.qonDsl.impl.QonDslPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__TRUE = eINSTANCE.getBooleanValue_True();

    /**
     * The meta object literal for the '<em><b>False</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__FALSE = eINSTANCE.getBooleanValue_False();

  }

} //QonDslPackage
