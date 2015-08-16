/**
 * generated by Xtext
 */
package org.iworkz.qon.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Extension;
import org.iworkz.qon.helper.PropertyHelper;
import org.iworkz.qon.helper.SchemaHelper;
import org.iworkz.qon.qonDsl.QLinkObjectProperty;
import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QObjectArrayProperty;
import org.iworkz.qon.qonDsl.QObjectProperty;
import org.iworkz.qon.qonDsl.QProperty;
import org.iworkz.qon.qonDsl.QonDslPackage;
import org.iworkz.qon.validation.AbstractQonDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class QonDslValidator extends AbstractQonDslValidator {
  @Inject
  @Extension
  private PropertyHelper _propertyHelper;
  
  @Inject
  @Extension
  private SchemaHelper _schemaHelper;
  
  @Check
  public void checkPropertyName(final QProperty it) {
    final String nameToCheck = it.getPropertyName();
    final QObject objectType = this._propertyHelper.getObjectType(it);
    boolean _notEquals = (!Objects.equal(objectType, null));
    if (_notEquals) {
      final EList<QObject> properties = this._schemaHelper.getSchemaProperties(objectType);
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
              return;
            }
          }
        }
      }
      this.error("Invalid property name", it, 
        QonDslPackage.Literals.QPROPERTY__PROPERTY_NAME);
    }
  }
  
  @Check
  public void checkLinkPropertyType(final QProperty it) {
    if ((it instanceof QLinkObjectProperty)) {
      final QObject objectType = this._propertyHelper.getObjectType(it);
      boolean _notEquals = (!Objects.equal(objectType, null));
      if (_notEquals) {
        String _propertyName = ((QLinkObjectProperty)it).getPropertyName();
        final QProperty schemaPropertyType = this._schemaHelper.getSchemaPropertyType(objectType, _propertyName);
        if ((schemaPropertyType instanceof QLinkObjectProperty)) {
          QObject _link = ((QLinkObjectProperty)it).getLink();
          QObject _type = _link.getType();
          QObject _link_1 = ((QLinkObjectProperty)schemaPropertyType).getLink();
          boolean _isObjectInstanceOf = this.isObjectInstanceOf(_type, _link_1);
          if (_isObjectInstanceOf) {
            return;
          } else {
            this.error("Invalid property type", it, 
              QonDslPackage.Literals.QPROPERTY__PROPERTY_NAME);
          }
        }
      }
    }
  }
  
  @Check
  public void checkObjectPropertyType(final QProperty it) {
    if ((it instanceof QObjectProperty)) {
      final QObject objectType = this._propertyHelper.getObjectType(it);
      boolean _notEquals = (!Objects.equal(objectType, null));
      if (_notEquals) {
        String _propertyName = ((QObjectProperty)it).getPropertyName();
        final QProperty schemaPropertyType = this._schemaHelper.getSchemaPropertyType(objectType, _propertyName);
        if ((schemaPropertyType instanceof QLinkObjectProperty)) {
          QObject _value = ((QObjectProperty)it).getValue();
          QObject _type = _value.getType();
          QObject _link = ((QLinkObjectProperty)schemaPropertyType).getLink();
          boolean _isObjectInstanceOf = this.isObjectInstanceOf(_type, _link);
          if (_isObjectInstanceOf) {
            return;
          } else {
            this.error("Invalid property type", it, 
              QonDslPackage.Literals.QPROPERTY__PROPERTY_NAME);
          }
        }
      }
    }
  }
  
  @Check
  public void checkObjectArrayPropertyType(final QProperty it) {
    if ((it instanceof QObjectArrayProperty)) {
      final QObject objectType = this._propertyHelper.getObjectType(it);
      boolean _notEquals = (!Objects.equal(objectType, null));
      if (_notEquals) {
        String _propertyName = ((QObjectArrayProperty)it).getPropertyName();
        final QProperty schemaPropertyType = this._schemaHelper.getSchemaPropertyType(objectType, _propertyName);
        if ((schemaPropertyType instanceof QLinkObjectProperty)) {
          EList<QObject> _values = ((QObjectArrayProperty)it).getValues();
          for (final QObject value : _values) {
            QObject _type = value.getType();
            QObject _link = ((QLinkObjectProperty)schemaPropertyType).getLink();
            boolean _isObjectInstanceOf = this.isObjectInstanceOf(_type, _link);
            boolean _equals = (_isObjectInstanceOf == false);
            if (_equals) {
              this.error("Invalid object type", value, 
                QonDslPackage.Literals.QOBJECT__TYPE);
            }
          }
        }
      }
    }
  }
  
  public boolean isObjectInstanceOf(final QObject it, final QObject type) {
    boolean _equals = it.equals(type);
    if (_equals) {
      return true;
    }
    final QObject baseType = this._propertyHelper.getReferencedObjectProperty(it, "extends");
    boolean _notEquals = (!Objects.equal(baseType, null));
    if (_notEquals) {
      return this.isObjectInstanceOf(baseType, type);
    }
    return false;
  }
}
