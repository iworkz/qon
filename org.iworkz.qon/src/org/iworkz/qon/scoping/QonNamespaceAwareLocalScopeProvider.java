package org.iworkz.qon.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.iworkz.qon.qonDsl.Import;
import org.iworkz.qon.qonDsl.ImportProperty;
import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QSystemProperty;

import com.google.common.collect.Lists;


public class QonNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	
	protected ImportProperty getImportAttribute(EObject context) {
		 if (context instanceof QObject) {
			 QObject model = (QObject) context;
	        	List<QSystemProperty> systemAttributes = model.getSystemProperties(); 
	            if (systemAttributes != null && systemAttributes.size() > 0) {
	            	for (QSystemProperty sa : systemAttributes) {
	            		if (sa instanceof ImportProperty) {
	            			return (ImportProperty)sa;
	            		}
	            	}
	            }
		 }
		 return null;
	}
	
	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, boolean ignoreCase) {
		List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList();
		ImportProperty importAttribute = getImportAttribute(context);
		if (importAttribute != null) {
			for (Import imp : importAttribute.getValues()) {
				String value = getImportedNamespace(imp);
				ImportNormalizer resolver = createImportedNamespaceResolver(value, ignoreCase);
				if (resolver != null)
					importedNamespaceResolvers.add(resolver);
			}
		}
		return importedNamespaceResolvers;
	}

}
