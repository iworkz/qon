package org.iworkz.qon.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.iworkz.qon.qonDsl.NamespaceProperty;
import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QSystemProperty;

import com.google.inject.Inject;


public class QonQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	@Inject
	private QonSimpleNameProvider simpleNameProvider;
	

	/**
	 * Creates the namespace for the root object.
	 * 
	 * @param lObj
	 * @return
	 */
	protected QualifiedName qualifiedName(QObject lObj) {
		if (lObj.eContainer() == null) {
			String namespace = getNamespace(lObj);
			if (namespace != null) {
				QualifiedName qualifiedNameForNamespace = QualifiedName.create(namespace.split("\\."));
				String simpleName = simpleNameProvider.getName(lObj);
				if (simpleName != null) {
					return qualifiedNameForNamespace.append(simpleName);
				} else {
					return qualifiedNameForNamespace;
				}
			}
		} else {
			return internalQualifiedName(lObj);
		}
		return null;
	}
	
	/**
	 * Creates the fully qualified name for eObj which have simple names.
	 * 
	 * @param eObj
	 * @return
	 */
	protected QualifiedName internalQualifiedName(EObject eObj) {
		String simpleName = simpleNameProvider.getName(eObj);
		if (simpleName != null) {
			QualifiedName qualifier = getQualifier(eObj);
			if (qualifier != null) {
				return qualifier.append(simpleName);
			}
			return QualifiedName.create(simpleName);
		}
		return null;
	}
	
	/**
	 * Get the qualifier for the name of oObj.
	 * 
	 * @param eObj
	 * @return
	 */
	protected QualifiedName getQualifier(EObject eObj) {
		if (eObj != null) {
			EObject container = eObj.eContainer();
			if (container != null) {
				QualifiedName qualifiedNameOfContainer = getFullyQualifiedName(container);
				if (qualifiedNameOfContainer != null && qualifiedNameOfContainer != QualifiedName.EMPTY) {
					return qualifiedNameOfContainer;
				}
				/* Not defined for this container, try with next container */
				return getQualifier(container);
			}
		}
		return null;
	}
	
	public String getNamespace(QObject qRootObject) {
		if (qRootObject != null) {
			for (QSystemProperty attr : qRootObject.getSystemProperties()) {
				if (attr instanceof NamespaceProperty) {
					NamespaceProperty namespaceAttr = (NamespaceProperty)attr;
					return namespaceAttr.getValue();
				}
			}	
		}
		return null;
	}

}
