package org.iworkz.qon.helper;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.iworkz.qon.helper.CommonHelper;
import org.iworkz.qon.helper.PropertyHelper;
import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QObjectArrayProperty;
import org.iworkz.qon.qonDsl.QProperty;
import org.iworkz.qon.qonDsl.QSystemProperty;
import org.iworkz.qon.qonDsl.SchemaProperty;

@SuppressWarnings("all")
public class SchemaHelper {
  @Inject
  @Extension
  private CommonHelper _commonHelper;
  
  @Inject
  @Extension
  private PropertyHelper _propertyHelper;
  
  public EList<QObject> getSchemaProperties(final QObject it) {
    final QProperty properties = this._propertyHelper.getProperty(it, "properties");
    if ((properties instanceof QObjectArrayProperty)) {
      return ((QObjectArrayProperty)properties).getValues();
    }
    return null;
  }
  
  public QObject getSchemaProperty(final QObject it, final String propertyName) {
    EList<QObject> _schemaProperties = this.getSchemaProperties(it);
    Iterable<QObject> _nullSafeIterable = this._commonHelper.<QObject>nullSafeIterable(_schemaProperties);
    for (final QObject property : _nullSafeIterable) {
      String _stringProperty = this._propertyHelper.getStringProperty(property, "name");
      boolean _equals = Objects.equal(_stringProperty, propertyName);
      if (_equals) {
        return property;
      }
    }
    return null;
  }
  
  public QProperty getSchemaPropertyType(final QObject it, final String propertyName) {
    final QObject schemaProperty = this.getSchemaProperty(it, propertyName);
    QProperty _property = null;
    if (schemaProperty!=null) {
      _property=this._propertyHelper.getProperty(schemaProperty, "type");
    }
    return _property;
  }
  
  public boolean hasSchemaPropertyWithName(final QObject it, final String nameToCheck) {
    boolean _notEquals = (!Objects.equal(it, null));
    if (_notEquals) {
      final EList<QObject> properties = this.getSchemaProperties(it);
      boolean _notEquals_1 = (!Objects.equal(properties, null));
      if (_notEquals_1) {
        for (final QObject prop : properties) {
          {
            final String nameAttribute = this._propertyHelper.getStringProperty(prop, "name");
            boolean _and = false;
            boolean _notEquals_2 = (!Objects.equal(nameAttribute, null));
            if (!_notEquals_2) {
              _and = false;
            } else {
              boolean _equals = Objects.equal(nameAttribute, nameToCheck);
              _and = _equals;
            }
            if (_and) {
              return true;
            }
          }
        }
      }
      final QObject superType = this._propertyHelper.getReferencedObjectProperty(it, "extends");
      return this.hasSchemaPropertyWithName(superType, nameToCheck);
    }
    return false;
  }
  
  public QObject getSchemaObject(final EObject it) {
    final EObject container = it.eContainer();
    boolean _notEquals = (!Objects.equal(container, null));
    if (_notEquals) {
      return this.getSchemaObject(container);
    }
    if ((it instanceof QObject)) {
      return this.getSchema(((QObject)it));
    }
    return null;
  }
  
  public QObject getSchema(final QObject qRootObject) {
    Object _xifexpression = null;
    boolean _notEquals = (!Objects.equal(qRootObject, null));
    if (_notEquals) {
      EList<QSystemProperty> _systemProperties = qRootObject.getSystemProperties();
      for (final QSystemProperty attr : _systemProperties) {
        if ((attr instanceof SchemaProperty)) {
          return ((SchemaProperty)attr).getLink();
        }
      }
    }
    return ((QObject)_xifexpression);
  }
  
  public String getIdentifyingPropertyName(final QObject type) {
    boolean _notEquals = (!Objects.equal(type, null));
    if (_notEquals) {
      final EList<QObject> schemaProperties = this.getSchemaProperties(type);
      Iterable<QObject> _nullSafeIterable = this._commonHelper.<QObject>nullSafeIterable(schemaProperties);
      for (final QObject schemaProperty : _nullSafeIterable) {
        String _stringProperty = this._propertyHelper.getStringProperty(schemaProperty, "isIdentifier");
        boolean _notEquals_1 = (!Objects.equal(_stringProperty, null));
        if (_notEquals_1) {
          final String identifierName = this._propertyHelper.getStringProperty(type, "name");
          boolean _notEquals_2 = (!Objects.equal(identifierName, null));
          if (_notEquals_2) {
            return identifierName;
          }
        }
      }
    }
    return "name";
  }
}
