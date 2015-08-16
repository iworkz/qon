package org.iworkz.qon.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.iworkz.qon.helper.SchemaHelper;
import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QProperty;
import org.iworkz.qon.qonDsl.QStringValueProperty;

import com.google.common.base.Function;
import com.google.inject.Inject;


public class QonSimpleNameProvider implements Function<EObject, QualifiedName> {
	
	@Inject
	SchemaHelper schemaHelper;
	
	public String getName(EObject eObj) {
		if (eObj instanceof QObject) {
			return getName((QObject)eObj);
		} 
		return null;
	}
	
	protected String getName(QObject qObject) {
		if (qObject != null) {
			//String identifyingPropertyName = schemaHelper.getIdentifyingPropertyName(qObject.getType());
			String identifyingPropertyName = "name";
			for (QProperty attr : qObject.getProperties()) {
				if (identifyingPropertyName.equals(attr.getPropertyName()) && attr instanceof QStringValueProperty) {
					QStringValueProperty sva = (QStringValueProperty)attr;
					return sva.getValue();
				}
			}	
		}
		return null;
	}

	@Override
	public QualifiedName apply(EObject input) {
		return QualifiedName.create(getName(input));
	}

}
