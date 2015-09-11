/**
 */
package org.iworkz.qon.qonDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.iworkz.qon.qonDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.iworkz.qon.qonDsl.QonDslPackage
 * @generated
 */
public class QonDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QonDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QonDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = QonDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case QonDslPackage.QROOT:
      {
        QRoot qRoot = (QRoot)theEObject;
        T result = caseQRoot(qRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QOBJECT:
      {
        QObject qObject = (QObject)theEObject;
        T result = caseQObject(qObject);
        if (result == null) result = caseQRoot(qObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QSYSTEM_PROPERTY:
      {
        QSystemProperty qSystemProperty = (QSystemProperty)theEObject;
        T result = caseQSystemProperty(qSystemProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.NAMESPACE_PROPERTY:
      {
        NamespaceProperty namespaceProperty = (NamespaceProperty)theEObject;
        T result = caseNamespaceProperty(namespaceProperty);
        if (result == null) result = caseQSystemProperty(namespaceProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.SCHEMA_PROPERTY:
      {
        SchemaProperty schemaProperty = (SchemaProperty)theEObject;
        T result = caseSchemaProperty(schemaProperty);
        if (result == null) result = caseQSystemProperty(schemaProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.IMPORT_PROPERTY:
      {
        ImportProperty importProperty = (ImportProperty)theEObject;
        T result = caseImportProperty(importProperty);
        if (result == null) result = caseQSystemProperty(importProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QPROPERTY:
      {
        QProperty qProperty = (QProperty)theEObject;
        T result = caseQProperty(qProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QLINK_PROPERTY:
      {
        QLinkProperty qLinkProperty = (QLinkProperty)theEObject;
        T result = caseQLinkProperty(qLinkProperty);
        if (result == null) result = caseQProperty(qLinkProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QLINK_OBJECT_PROPERTY:
      {
        QLinkObjectProperty qLinkObjectProperty = (QLinkObjectProperty)theEObject;
        T result = caseQLinkObjectProperty(qLinkObjectProperty);
        if (result == null) result = caseQLinkProperty(qLinkObjectProperty);
        if (result == null) result = caseQProperty(qLinkObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QLINK_ARRAY_PROPERTY:
      {
        QLinkArrayProperty qLinkArrayProperty = (QLinkArrayProperty)theEObject;
        T result = caseQLinkArrayProperty(qLinkArrayProperty);
        if (result == null) result = caseQLinkProperty(qLinkArrayProperty);
        if (result == null) result = caseQProperty(qLinkArrayProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QVALUE_PROPERTY:
      {
        QValueProperty qValueProperty = (QValueProperty)theEObject;
        T result = caseQValueProperty(qValueProperty);
        if (result == null) result = caseQProperty(qValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QOBJECT_PROPERTY:
      {
        QObjectProperty qObjectProperty = (QObjectProperty)theEObject;
        T result = caseQObjectProperty(qObjectProperty);
        if (result == null) result = caseQValueProperty(qObjectProperty);
        if (result == null) result = caseQProperty(qObjectProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QSTRING_VALUE_PROPERTY:
      {
        QStringValueProperty qStringValueProperty = (QStringValueProperty)theEObject;
        T result = caseQStringValueProperty(qStringValueProperty);
        if (result == null) result = caseQValueProperty(qStringValueProperty);
        if (result == null) result = caseQProperty(qStringValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QNUMBER_VALUE_PROPERTY:
      {
        QNumberValueProperty qNumberValueProperty = (QNumberValueProperty)theEObject;
        T result = caseQNumberValueProperty(qNumberValueProperty);
        if (result == null) result = caseQValueProperty(qNumberValueProperty);
        if (result == null) result = caseQProperty(qNumberValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QBOOLEAN_VALUE_PROPERTY:
      {
        QBooleanValueProperty qBooleanValueProperty = (QBooleanValueProperty)theEObject;
        T result = caseQBooleanValueProperty(qBooleanValueProperty);
        if (result == null) result = caseQValueProperty(qBooleanValueProperty);
        if (result == null) result = caseQProperty(qBooleanValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QNULL_VALUE_PROPERTY:
      {
        QNullValueProperty qNullValueProperty = (QNullValueProperty)theEObject;
        T result = caseQNullValueProperty(qNullValueProperty);
        if (result == null) result = caseQValueProperty(qNullValueProperty);
        if (result == null) result = caseQProperty(qNullValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QOBJECT_ARRAY_PROPERTY:
      {
        QObjectArrayProperty qObjectArrayProperty = (QObjectArrayProperty)theEObject;
        T result = caseQObjectArrayProperty(qObjectArrayProperty);
        if (result == null) result = caseQValueProperty(qObjectArrayProperty);
        if (result == null) result = caseQProperty(qObjectArrayProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QSTRING_ARRAY_PROPERTY:
      {
        QStringArrayProperty qStringArrayProperty = (QStringArrayProperty)theEObject;
        T result = caseQStringArrayProperty(qStringArrayProperty);
        if (result == null) result = caseQValueProperty(qStringArrayProperty);
        if (result == null) result = caseQProperty(qStringArrayProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QNUMBER_ARRAY_PROPERTY:
      {
        QNumberArrayProperty qNumberArrayProperty = (QNumberArrayProperty)theEObject;
        T result = caseQNumberArrayProperty(qNumberArrayProperty);
        if (result == null) result = caseQValueProperty(qNumberArrayProperty);
        if (result == null) result = caseQProperty(qNumberArrayProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.QEMPTY_ARRAY_PROPERTY:
      {
        QEmptyArrayProperty qEmptyArrayProperty = (QEmptyArrayProperty)theEObject;
        T result = caseQEmptyArrayProperty(qEmptyArrayProperty);
        if (result == null) result = caseQValueProperty(qEmptyArrayProperty);
        if (result == null) result = caseQProperty(qEmptyArrayProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QonDslPackage.BOOLEAN_VALUE:
      {
        BooleanValue booleanValue = (BooleanValue)theEObject;
        T result = caseBooleanValue(booleanValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QRoot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QRoot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQRoot(QRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQObject(QObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QSystem Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QSystem Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQSystemProperty(QSystemProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespaceProperty(NamespaceProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemaProperty(SchemaProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportProperty(ImportProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QProperty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QProperty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQProperty(QProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QLink Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QLink Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQLinkProperty(QLinkProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QLink Object Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QLink Object Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQLinkObjectProperty(QLinkObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QLink Array Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QLink Array Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQLinkArrayProperty(QLinkArrayProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QValue Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QValue Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQValueProperty(QValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QObject Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QObject Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQObjectProperty(QObjectProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QString Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QString Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQStringValueProperty(QStringValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QNumber Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QNumber Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQNumberValueProperty(QNumberValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QBoolean Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QBoolean Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQBooleanValueProperty(QBooleanValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QNull Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QNull Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQNullValueProperty(QNullValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QObject Array Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QObject Array Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQObjectArrayProperty(QObjectArrayProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QString Array Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QString Array Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQStringArrayProperty(QStringArrayProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QNumber Array Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QNumber Array Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQNumberArrayProperty(QNumberArrayProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QEmpty Array Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QEmpty Array Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQEmptyArrayProperty(QEmptyArrayProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanValue(BooleanValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //QonDslSwitch
