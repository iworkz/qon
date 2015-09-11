package org.iworkz.qon.naming;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.iworkz.qon.helper.SchemaHelper;
import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QProperty;
import org.iworkz.qon.qonDsl.QStringValueProperty;
import org.iworkz.qon.qonDsl.SchemaProperty;
import org.iworkz.qon.qonDsl.impl.QStringValuePropertyImpl;
import org.iworkz.qon.qonDsl.impl.QonDslPackageImpl;

import com.google.common.base.Function;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;


public class QonSimpleNameProvider implements Function<EObject, QualifiedName> {
	
	@Inject
	SchemaHelper schemaHelper;
	@Inject
	private IResourceDescriptions resourceDescriptions;
	
	public String getName(EObject eObj) {
		if (eObj instanceof QObject) {
			return getName((QObject)eObj);
		} 
		return "name";
	}
	
	protected String getName(QObject qObject) {
		if (qObject != null) {
			EObject rootContainer = EcoreUtil2.getRootContainer(qObject);
			String identifyingPropertyName = "name";
//			List<INode> rootTypeName = NodeModelUtils.findNodesForFeature(rootContainer, QonDslPackageImpl.eINSTANCE.getQObject_Type());
//			List<SchemaProperty> schemaProperties = EcoreUtil2.getAllContentsOfType(rootContainer, SchemaProperty.class);
//			if (qObject.eResource().getURI().toString().contains("QONSchema.qon") || (!rootTypeName.isEmpty() && "Schema".equals(rootTypeName.get(0).getText()))) {
//			} else if (!schemaProperties.isEmpty()) {
//				String imported = getFirstNodeText(schemaProperties.get(0), QonDslPackageImpl.eINSTANCE.getSchemaProperty_Link());
//				QualifiedName qualifiedName = QualifiedName.create(Splitter.on('.').splitToList(imported.replaceAll("\"", "")));
//				Iterable<IEObjectDescription> exportedObjects = resourceDescriptions.getExportedObjects(QonDslPackageImpl.eINSTANCE.getQObject(), qualifiedName, true);
//				IEObjectDescription objectDescription = Iterables.getFirst(exportedObjects, null);
//				if (objectDescription != null) {
//					Resource resource = qObject.eResource().getResourceSet().getResource(objectDescription.getEObjectURI().trimFragment(), true);
//					String typeName = getFirstNodeText(qObject, QonDslPackageImpl.eINSTANCE.getQObject_Type());
//					QObject schemaType = getType("ComplexType",typeName,resource);
//					identifyingPropertyName = schemaHelper.getIdentifyingPropertyName(schemaType);				
//				} else {
//					System.out.println("Object description for schema is null, schema name = '"+qualifiedName+"'");
//				}
//			}
			
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
	
	
	private QObject getType(String type, String name, Resource resource) {
		for (QObject qObject : EcoreUtil2.getAllContentsOfType(resource.getEObject("/"), QObject.class)) {
			if (type.equals(getFirstNodeText(qObject,QonDslPackageImpl.eINSTANCE.getQObject_Type()))) {
				EList<QProperty> properties = qObject.getProperties();
				for (QProperty qProperty : properties) {
					if (qProperty instanceof QStringValuePropertyImpl == false) {
						continue;
					}
					QStringValuePropertyImpl qStringValuePropertyImpl = (QStringValuePropertyImpl) qProperty;
					if (qStringValuePropertyImpl.getPropertyName().equals("name") && qStringValuePropertyImpl.getValue().equals(name)) {
						return qObject;
					}
				}
			}	
		}
		return null;
	}
	
	private String getFirstNodeText(EObject eObject, EReference eReference) {
		List<INode> list = NodeModelUtils.findNodesForFeature(eObject, eReference);
		return list.get(0).getText();
	}

}
