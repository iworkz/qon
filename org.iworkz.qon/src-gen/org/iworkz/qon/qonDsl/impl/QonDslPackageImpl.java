/**
 */
package org.iworkz.qon.qonDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.iworkz.qon.qonDsl.BooleanValue;
import org.iworkz.qon.qonDsl.Import;
import org.iworkz.qon.qonDsl.ImportProperty;
import org.iworkz.qon.qonDsl.NamespaceProperty;
import org.iworkz.qon.qonDsl.QBooleanValueProperty;
import org.iworkz.qon.qonDsl.QEmptyArrayProperty;
import org.iworkz.qon.qonDsl.QLinkArrayProperty;
import org.iworkz.qon.qonDsl.QLinkObjectProperty;
import org.iworkz.qon.qonDsl.QLinkProperty;
import org.iworkz.qon.qonDsl.QNullValueProperty;
import org.iworkz.qon.qonDsl.QNumberArrayProperty;
import org.iworkz.qon.qonDsl.QNumberValueProperty;
import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QObjectArrayProperty;
import org.iworkz.qon.qonDsl.QObjectProperty;
import org.iworkz.qon.qonDsl.QProperty;
import org.iworkz.qon.qonDsl.QRoot;
import org.iworkz.qon.qonDsl.QStringArrayProperty;
import org.iworkz.qon.qonDsl.QStringValueProperty;
import org.iworkz.qon.qonDsl.QSystemProperty;
import org.iworkz.qon.qonDsl.QValueProperty;
import org.iworkz.qon.qonDsl.QonDslFactory;
import org.iworkz.qon.qonDsl.QonDslPackage;
import org.iworkz.qon.qonDsl.SchemaProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QonDslPackageImpl extends EPackageImpl implements QonDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qSystemPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespacePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemaPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qLinkPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qLinkObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qLinkArrayPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qStringValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qNumberValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qBooleanValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qNullValuePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qObjectArrayPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qStringArrayPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qNumberArrayPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qEmptyArrayPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanValueEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.iworkz.qon.qonDsl.QonDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private QonDslPackageImpl()
  {
    super(eNS_URI, QonDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link QonDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static QonDslPackage init()
  {
    if (isInited) return (QonDslPackage)EPackage.Registry.INSTANCE.getEPackage(QonDslPackage.eNS_URI);

    // Obtain or create and register package
    QonDslPackageImpl theQonDslPackage = (QonDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QonDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QonDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theQonDslPackage.createPackageContents();

    // Initialize created meta-data
    theQonDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theQonDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(QonDslPackage.eNS_URI, theQonDslPackage);
    return theQonDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQRoot()
  {
    return qRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQObject()
  {
    return qObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQObject_Type()
  {
    return (EReference)qObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQObject_SystemProperties()
  {
    return (EReference)qObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQObject_Properties()
  {
    return (EReference)qObjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQSystemProperty()
  {
    return qSystemPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespaceProperty()
  {
    return namespacePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespaceProperty_Value()
  {
    return (EAttribute)namespacePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemaProperty()
  {
    return schemaPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemaProperty_Link()
  {
    return (EReference)schemaPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportProperty()
  {
    return importPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportProperty_Values()
  {
    return (EReference)importPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQProperty()
  {
    return qPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQProperty_PropertyName()
  {
    return (EAttribute)qPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQLinkProperty()
  {
    return qLinkPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQLinkObjectProperty()
  {
    return qLinkObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQLinkObjectProperty_Link()
  {
    return (EReference)qLinkObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQLinkArrayProperty()
  {
    return qLinkArrayPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQLinkArrayProperty_Links()
  {
    return (EReference)qLinkArrayPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQValueProperty()
  {
    return qValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQObjectProperty()
  {
    return qObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQObjectProperty_Value()
  {
    return (EReference)qObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQStringValueProperty()
  {
    return qStringValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQStringValueProperty_Value()
  {
    return (EAttribute)qStringValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQNumberValueProperty()
  {
    return qNumberValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQNumberValueProperty_Value()
  {
    return (EAttribute)qNumberValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQBooleanValueProperty()
  {
    return qBooleanValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQBooleanValueProperty_Value()
  {
    return (EReference)qBooleanValuePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQNullValueProperty()
  {
    return qNullValuePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQObjectArrayProperty()
  {
    return qObjectArrayPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQObjectArrayProperty_Values()
  {
    return (EReference)qObjectArrayPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQStringArrayProperty()
  {
    return qStringArrayPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQStringArrayProperty_Values()
  {
    return (EAttribute)qStringArrayPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQNumberArrayProperty()
  {
    return qNumberArrayPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQNumberArrayProperty_Values()
  {
    return (EAttribute)qNumberArrayPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQEmptyArrayProperty()
  {
    return qEmptyArrayPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanValue()
  {
    return booleanValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanValue_True()
  {
    return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanValue_False()
  {
    return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QonDslFactory getQonDslFactory()
  {
    return (QonDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    qRootEClass = createEClass(QROOT);

    qObjectEClass = createEClass(QOBJECT);
    createEReference(qObjectEClass, QOBJECT__TYPE);
    createEReference(qObjectEClass, QOBJECT__SYSTEM_PROPERTIES);
    createEReference(qObjectEClass, QOBJECT__PROPERTIES);

    qSystemPropertyEClass = createEClass(QSYSTEM_PROPERTY);

    namespacePropertyEClass = createEClass(NAMESPACE_PROPERTY);
    createEAttribute(namespacePropertyEClass, NAMESPACE_PROPERTY__VALUE);

    schemaPropertyEClass = createEClass(SCHEMA_PROPERTY);
    createEReference(schemaPropertyEClass, SCHEMA_PROPERTY__LINK);

    importPropertyEClass = createEClass(IMPORT_PROPERTY);
    createEReference(importPropertyEClass, IMPORT_PROPERTY__VALUES);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    qPropertyEClass = createEClass(QPROPERTY);
    createEAttribute(qPropertyEClass, QPROPERTY__PROPERTY_NAME);

    qLinkPropertyEClass = createEClass(QLINK_PROPERTY);

    qLinkObjectPropertyEClass = createEClass(QLINK_OBJECT_PROPERTY);
    createEReference(qLinkObjectPropertyEClass, QLINK_OBJECT_PROPERTY__LINK);

    qLinkArrayPropertyEClass = createEClass(QLINK_ARRAY_PROPERTY);
    createEReference(qLinkArrayPropertyEClass, QLINK_ARRAY_PROPERTY__LINKS);

    qValuePropertyEClass = createEClass(QVALUE_PROPERTY);

    qObjectPropertyEClass = createEClass(QOBJECT_PROPERTY);
    createEReference(qObjectPropertyEClass, QOBJECT_PROPERTY__VALUE);

    qStringValuePropertyEClass = createEClass(QSTRING_VALUE_PROPERTY);
    createEAttribute(qStringValuePropertyEClass, QSTRING_VALUE_PROPERTY__VALUE);

    qNumberValuePropertyEClass = createEClass(QNUMBER_VALUE_PROPERTY);
    createEAttribute(qNumberValuePropertyEClass, QNUMBER_VALUE_PROPERTY__VALUE);

    qBooleanValuePropertyEClass = createEClass(QBOOLEAN_VALUE_PROPERTY);
    createEReference(qBooleanValuePropertyEClass, QBOOLEAN_VALUE_PROPERTY__VALUE);

    qNullValuePropertyEClass = createEClass(QNULL_VALUE_PROPERTY);

    qObjectArrayPropertyEClass = createEClass(QOBJECT_ARRAY_PROPERTY);
    createEReference(qObjectArrayPropertyEClass, QOBJECT_ARRAY_PROPERTY__VALUES);

    qStringArrayPropertyEClass = createEClass(QSTRING_ARRAY_PROPERTY);
    createEAttribute(qStringArrayPropertyEClass, QSTRING_ARRAY_PROPERTY__VALUES);

    qNumberArrayPropertyEClass = createEClass(QNUMBER_ARRAY_PROPERTY);
    createEAttribute(qNumberArrayPropertyEClass, QNUMBER_ARRAY_PROPERTY__VALUES);

    qEmptyArrayPropertyEClass = createEClass(QEMPTY_ARRAY_PROPERTY);

    booleanValueEClass = createEClass(BOOLEAN_VALUE);
    createEAttribute(booleanValueEClass, BOOLEAN_VALUE__TRUE);
    createEAttribute(booleanValueEClass, BOOLEAN_VALUE__FALSE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    qObjectEClass.getESuperTypes().add(this.getQRoot());
    namespacePropertyEClass.getESuperTypes().add(this.getQSystemProperty());
    schemaPropertyEClass.getESuperTypes().add(this.getQSystemProperty());
    importPropertyEClass.getESuperTypes().add(this.getQSystemProperty());
    qLinkPropertyEClass.getESuperTypes().add(this.getQProperty());
    qLinkObjectPropertyEClass.getESuperTypes().add(this.getQLinkProperty());
    qLinkArrayPropertyEClass.getESuperTypes().add(this.getQLinkProperty());
    qValuePropertyEClass.getESuperTypes().add(this.getQProperty());
    qObjectPropertyEClass.getESuperTypes().add(this.getQValueProperty());
    qStringValuePropertyEClass.getESuperTypes().add(this.getQValueProperty());
    qNumberValuePropertyEClass.getESuperTypes().add(this.getQValueProperty());
    qBooleanValuePropertyEClass.getESuperTypes().add(this.getQValueProperty());
    qNullValuePropertyEClass.getESuperTypes().add(this.getQValueProperty());
    qObjectArrayPropertyEClass.getESuperTypes().add(this.getQValueProperty());
    qStringArrayPropertyEClass.getESuperTypes().add(this.getQValueProperty());
    qNumberArrayPropertyEClass.getESuperTypes().add(this.getQValueProperty());
    qEmptyArrayPropertyEClass.getESuperTypes().add(this.getQValueProperty());

    // Initialize classes and features; add operations and parameters
    initEClass(qRootEClass, QRoot.class, "QRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qObjectEClass, QObject.class, "QObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQObject_Type(), this.getQObject(), null, "type", null, 0, 1, QObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQObject_SystemProperties(), this.getQSystemProperty(), null, "systemProperties", null, 0, -1, QObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQObject_Properties(), this.getQProperty(), null, "properties", null, 0, -1, QObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qSystemPropertyEClass, QSystemProperty.class, "QSystemProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namespacePropertyEClass, NamespaceProperty.class, "NamespaceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespaceProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, NamespaceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemaPropertyEClass, SchemaProperty.class, "SchemaProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchemaProperty_Link(), this.getQObject(), null, "link", null, 0, 1, SchemaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importPropertyEClass, ImportProperty.class, "ImportProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportProperty_Values(), this.getImport(), null, "values", null, 0, -1, ImportProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qPropertyEClass, QProperty.class, "QProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQProperty_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1, QProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qLinkPropertyEClass, QLinkProperty.class, "QLinkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qLinkObjectPropertyEClass, QLinkObjectProperty.class, "QLinkObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQLinkObjectProperty_Link(), this.getQObject(), null, "link", null, 0, 1, QLinkObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qLinkArrayPropertyEClass, QLinkArrayProperty.class, "QLinkArrayProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQLinkArrayProperty_Links(), this.getQObject(), null, "links", null, 0, -1, QLinkArrayProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qValuePropertyEClass, QValueProperty.class, "QValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qObjectPropertyEClass, QObjectProperty.class, "QObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQObjectProperty_Value(), this.getQObject(), null, "value", null, 0, 1, QObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qStringValuePropertyEClass, QStringValueProperty.class, "QStringValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQStringValueProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, QStringValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qNumberValuePropertyEClass, QNumberValueProperty.class, "QNumberValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQNumberValueProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, QNumberValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qBooleanValuePropertyEClass, QBooleanValueProperty.class, "QBooleanValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQBooleanValueProperty_Value(), this.getBooleanValue(), null, "value", null, 0, 1, QBooleanValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qNullValuePropertyEClass, QNullValueProperty.class, "QNullValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(qObjectArrayPropertyEClass, QObjectArrayProperty.class, "QObjectArrayProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQObjectArrayProperty_Values(), this.getQObject(), null, "values", null, 0, -1, QObjectArrayProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qStringArrayPropertyEClass, QStringArrayProperty.class, "QStringArrayProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQStringArrayProperty_Values(), ecorePackage.getEString(), "values", null, 0, -1, QStringArrayProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qNumberArrayPropertyEClass, QNumberArrayProperty.class, "QNumberArrayProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQNumberArrayProperty_Values(), ecorePackage.getEString(), "values", null, 0, -1, QNumberArrayProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qEmptyArrayPropertyEClass, QEmptyArrayProperty.class, "QEmptyArrayProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanValue_True(), ecorePackage.getEBoolean(), "true", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBooleanValue_False(), ecorePackage.getEBoolean(), "false", null, 0, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //QonDslPackageImpl
