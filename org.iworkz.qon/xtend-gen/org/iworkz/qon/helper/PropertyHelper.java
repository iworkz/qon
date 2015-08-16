package org.iworkz.qon.helper;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.iworkz.qon.qonDsl.QLinkObjectProperty;
import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QProperty;
import org.iworkz.qon.qonDsl.QStringValueProperty;

@Singleton
@SuppressWarnings("all")
public class PropertyHelper {
  public QObject getObjectType(final QProperty it) {
    final EObject container = it.eContainer();
    if ((container instanceof QObject)) {
      return ((QObject)container).getType();
    }
    return null;
  }
  
  public QProperty getProperty(final QObject it, final String name) {
    EList<QProperty> _properties = it.getProperties();
    for (final QProperty attr : _properties) {
      String _propertyName = attr.getPropertyName();
      boolean _equals = Objects.equal(name, _propertyName);
      if (_equals) {
        return attr;
      }
    }
    return null;
  }
  
  public String getStringProperty(final QObject it, final String name) {
    final QProperty attr = this.getProperty(it, name);
    if ((attr instanceof QStringValueProperty)) {
      return ((QStringValueProperty)attr).getValue();
    }
    return null;
  }
  
  public QObject getReferencedObjectProperty(final QObject it, final String name) {
    final QProperty attr = this.getProperty(it, name);
    if ((attr instanceof QLinkObjectProperty)) {
      return ((QLinkObjectProperty)attr).getLink();
    }
    return null;
  }
}
