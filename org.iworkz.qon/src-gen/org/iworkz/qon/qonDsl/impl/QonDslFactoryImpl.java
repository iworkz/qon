/**
 */
package org.iworkz.qon.qonDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.iworkz.qon.qonDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QonDslFactoryImpl extends EFactoryImpl implements QonDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QonDslFactory init()
  {
    try
    {
      QonDslFactory theQonDslFactory = (QonDslFactory)EPackage.Registry.INSTANCE.getEFactory(QonDslPackage.eNS_URI);
      if (theQonDslFactory != null)
      {
        return theQonDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QonDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QonDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QonDslPackage.QROOT: return createQRoot();
      case QonDslPackage.QOBJECT: return createQObject();
      case QonDslPackage.QSYSTEM_PROPERTY: return createQSystemProperty();
      case QonDslPackage.NAMESPACE_PROPERTY: return createNamespaceProperty();
      case QonDslPackage.SCHEMA_PROPERTY: return createSchemaProperty();
      case QonDslPackage.IMPORT_PROPERTY: return createImportProperty();
      case QonDslPackage.IMPORT: return createImport();
      case QonDslPackage.QPROPERTY: return createQProperty();
      case QonDslPackage.QLINK_PROPERTY: return createQLinkProperty();
      case QonDslPackage.QLINK_OBJECT_PROPERTY: return createQLinkObjectProperty();
      case QonDslPackage.QLINK_ARRAY_PROPERTY: return createQLinkArrayProperty();
      case QonDslPackage.QVALUE_PROPERTY: return createQValueProperty();
      case QonDslPackage.QOBJECT_PROPERTY: return createQObjectProperty();
      case QonDslPackage.QSTRING_VALUE_PROPERTY: return createQStringValueProperty();
      case QonDslPackage.QNUMBER_VALUE_PROPERTY: return createQNumberValueProperty();
      case QonDslPackage.QBOOLEAN_VALUE_PROPERTY: return createQBooleanValueProperty();
      case QonDslPackage.QNULL_VALUE_PROPERTY: return createQNullValueProperty();
      case QonDslPackage.QOBJECT_ARRAY_PROPERTY: return createQObjectArrayProperty();
      case QonDslPackage.QSTRING_ARRAY_PROPERTY: return createQStringArrayProperty();
      case QonDslPackage.QNUMBER_ARRAY_PROPERTY: return createQNumberArrayProperty();
      case QonDslPackage.QEMPTY_ARRAY_PROPERTY: return createQEmptyArrayProperty();
      case QonDslPackage.BOOLEAN_VALUE: return createBooleanValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QRoot createQRoot()
  {
    QRootImpl qRoot = new QRootImpl();
    return qRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QObject createQObject()
  {
    QObjectImpl qObject = new QObjectImpl();
    return qObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QSystemProperty createQSystemProperty()
  {
    QSystemPropertyImpl qSystemProperty = new QSystemPropertyImpl();
    return qSystemProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceProperty createNamespaceProperty()
  {
    NamespacePropertyImpl namespaceProperty = new NamespacePropertyImpl();
    return namespaceProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaProperty createSchemaProperty()
  {
    SchemaPropertyImpl schemaProperty = new SchemaPropertyImpl();
    return schemaProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportProperty createImportProperty()
  {
    ImportPropertyImpl importProperty = new ImportPropertyImpl();
    return importProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QProperty createQProperty()
  {
    QPropertyImpl qProperty = new QPropertyImpl();
    return qProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QLinkProperty createQLinkProperty()
  {
    QLinkPropertyImpl qLinkProperty = new QLinkPropertyImpl();
    return qLinkProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QLinkObjectProperty createQLinkObjectProperty()
  {
    QLinkObjectPropertyImpl qLinkObjectProperty = new QLinkObjectPropertyImpl();
    return qLinkObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QLinkArrayProperty createQLinkArrayProperty()
  {
    QLinkArrayPropertyImpl qLinkArrayProperty = new QLinkArrayPropertyImpl();
    return qLinkArrayProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QValueProperty createQValueProperty()
  {
    QValuePropertyImpl qValueProperty = new QValuePropertyImpl();
    return qValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QObjectProperty createQObjectProperty()
  {
    QObjectPropertyImpl qObjectProperty = new QObjectPropertyImpl();
    return qObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QStringValueProperty createQStringValueProperty()
  {
    QStringValuePropertyImpl qStringValueProperty = new QStringValuePropertyImpl();
    return qStringValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QNumberValueProperty createQNumberValueProperty()
  {
    QNumberValuePropertyImpl qNumberValueProperty = new QNumberValuePropertyImpl();
    return qNumberValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QBooleanValueProperty createQBooleanValueProperty()
  {
    QBooleanValuePropertyImpl qBooleanValueProperty = new QBooleanValuePropertyImpl();
    return qBooleanValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QNullValueProperty createQNullValueProperty()
  {
    QNullValuePropertyImpl qNullValueProperty = new QNullValuePropertyImpl();
    return qNullValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QObjectArrayProperty createQObjectArrayProperty()
  {
    QObjectArrayPropertyImpl qObjectArrayProperty = new QObjectArrayPropertyImpl();
    return qObjectArrayProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QStringArrayProperty createQStringArrayProperty()
  {
    QStringArrayPropertyImpl qStringArrayProperty = new QStringArrayPropertyImpl();
    return qStringArrayProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QNumberArrayProperty createQNumberArrayProperty()
  {
    QNumberArrayPropertyImpl qNumberArrayProperty = new QNumberArrayPropertyImpl();
    return qNumberArrayProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QEmptyArrayProperty createQEmptyArrayProperty()
  {
    QEmptyArrayPropertyImpl qEmptyArrayProperty = new QEmptyArrayPropertyImpl();
    return qEmptyArrayProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValue()
  {
    BooleanValueImpl booleanValue = new BooleanValueImpl();
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QonDslPackage getQonDslPackage()
  {
    return (QonDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QonDslPackage getPackage()
  {
    return QonDslPackage.eINSTANCE;
  }

} //QonDslFactoryImpl
