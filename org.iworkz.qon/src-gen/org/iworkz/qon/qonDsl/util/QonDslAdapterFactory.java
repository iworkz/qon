/**
 */
package org.iworkz.qon.qonDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.iworkz.qon.qonDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.iworkz.qon.qonDsl.QonDslPackage
 * @generated
 */
public class QonDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QonDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QonDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = QonDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QonDslSwitch<Adapter> modelSwitch =
    new QonDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseQRoot(QRoot object)
      {
        return createQRootAdapter();
      }
      @Override
      public Adapter caseQObject(QObject object)
      {
        return createQObjectAdapter();
      }
      @Override
      public Adapter caseQSystemProperty(QSystemProperty object)
      {
        return createQSystemPropertyAdapter();
      }
      @Override
      public Adapter caseNamespaceProperty(NamespaceProperty object)
      {
        return createNamespacePropertyAdapter();
      }
      @Override
      public Adapter caseSchemaProperty(SchemaProperty object)
      {
        return createSchemaPropertyAdapter();
      }
      @Override
      public Adapter caseImportProperty(ImportProperty object)
      {
        return createImportPropertyAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseQProperty(QProperty object)
      {
        return createQPropertyAdapter();
      }
      @Override
      public Adapter caseQLinkProperty(QLinkProperty object)
      {
        return createQLinkPropertyAdapter();
      }
      @Override
      public Adapter caseQLinkObjectProperty(QLinkObjectProperty object)
      {
        return createQLinkObjectPropertyAdapter();
      }
      @Override
      public Adapter caseQLinkArrayProperty(QLinkArrayProperty object)
      {
        return createQLinkArrayPropertyAdapter();
      }
      @Override
      public Adapter caseQValueProperty(QValueProperty object)
      {
        return createQValuePropertyAdapter();
      }
      @Override
      public Adapter caseQObjectProperty(QObjectProperty object)
      {
        return createQObjectPropertyAdapter();
      }
      @Override
      public Adapter caseQStringValueProperty(QStringValueProperty object)
      {
        return createQStringValuePropertyAdapter();
      }
      @Override
      public Adapter caseQNumberValueProperty(QNumberValueProperty object)
      {
        return createQNumberValuePropertyAdapter();
      }
      @Override
      public Adapter caseQBooleanValueProperty(QBooleanValueProperty object)
      {
        return createQBooleanValuePropertyAdapter();
      }
      @Override
      public Adapter caseQNullValueProperty(QNullValueProperty object)
      {
        return createQNullValuePropertyAdapter();
      }
      @Override
      public Adapter caseQObjectArrayProperty(QObjectArrayProperty object)
      {
        return createQObjectArrayPropertyAdapter();
      }
      @Override
      public Adapter caseQStringArrayProperty(QStringArrayProperty object)
      {
        return createQStringArrayPropertyAdapter();
      }
      @Override
      public Adapter caseQNumberArrayProperty(QNumberArrayProperty object)
      {
        return createQNumberArrayPropertyAdapter();
      }
      @Override
      public Adapter caseQEmptyArrayProperty(QEmptyArrayProperty object)
      {
        return createQEmptyArrayPropertyAdapter();
      }
      @Override
      public Adapter caseBooleanValue(BooleanValue object)
      {
        return createBooleanValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QRoot <em>QRoot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QRoot
   * @generated
   */
  public Adapter createQRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QObject <em>QObject</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QObject
   * @generated
   */
  public Adapter createQObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QSystemProperty <em>QSystem Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QSystemProperty
   * @generated
   */
  public Adapter createQSystemPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.NamespaceProperty <em>Namespace Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.NamespaceProperty
   * @generated
   */
  public Adapter createNamespacePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.SchemaProperty <em>Schema Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.SchemaProperty
   * @generated
   */
  public Adapter createSchemaPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.ImportProperty <em>Import Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.ImportProperty
   * @generated
   */
  public Adapter createImportPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QProperty <em>QProperty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QProperty
   * @generated
   */
  public Adapter createQPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QLinkProperty <em>QLink Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QLinkProperty
   * @generated
   */
  public Adapter createQLinkPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QLinkObjectProperty <em>QLink Object Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QLinkObjectProperty
   * @generated
   */
  public Adapter createQLinkObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QLinkArrayProperty <em>QLink Array Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QLinkArrayProperty
   * @generated
   */
  public Adapter createQLinkArrayPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QValueProperty <em>QValue Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QValueProperty
   * @generated
   */
  public Adapter createQValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QObjectProperty <em>QObject Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QObjectProperty
   * @generated
   */
  public Adapter createQObjectPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QStringValueProperty <em>QString Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QStringValueProperty
   * @generated
   */
  public Adapter createQStringValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QNumberValueProperty <em>QNumber Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QNumberValueProperty
   * @generated
   */
  public Adapter createQNumberValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QBooleanValueProperty <em>QBoolean Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QBooleanValueProperty
   * @generated
   */
  public Adapter createQBooleanValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QNullValueProperty <em>QNull Value Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QNullValueProperty
   * @generated
   */
  public Adapter createQNullValuePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QObjectArrayProperty <em>QObject Array Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QObjectArrayProperty
   * @generated
   */
  public Adapter createQObjectArrayPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QStringArrayProperty <em>QString Array Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QStringArrayProperty
   * @generated
   */
  public Adapter createQStringArrayPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QNumberArrayProperty <em>QNumber Array Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QNumberArrayProperty
   * @generated
   */
  public Adapter createQNumberArrayPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.QEmptyArrayProperty <em>QEmpty Array Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.QEmptyArrayProperty
   * @generated
   */
  public Adapter createQEmptyArrayPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.iworkz.qon.qonDsl.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.iworkz.qon.qonDsl.BooleanValue
   * @generated
   */
  public Adapter createBooleanValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //QonDslAdapterFactory
