package org.iworkz.qon.helper

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.iworkz.qon.qonDsl.QObject
import org.iworkz.qon.qonDsl.QObjectArrayProperty
import org.iworkz.qon.qonDsl.QSystemProperty
import org.iworkz.qon.qonDsl.SchemaProperty


class SchemaHelper {
	
	@Inject
	var extension CommonHelper
	
	@Inject
	var extension PropertyHelper

	def getSchemaProperties(QObject it) {
		val properties = getProperty("properties")
		if (properties instanceof QObjectArrayProperty) {
			return properties.values
		}
	}

	def getSchemaProperty(QObject it, String propertyName) {
		for (property : nullSafeIterable(schemaProperties)) {
			if (property.getStringProperty('name') == propertyName) {
				return property
			}
		}
	}
	
	def getSchemaPropertyType(QObject it, String propertyName) {
		val schemaProperty = getSchemaProperty(propertyName)
		return schemaProperty?.getProperty('type')
	}
	
	def QObject getSchemaObject(EObject it) {
		val container = eContainer
		if (container != null) {
			return container.schemaObject
		}
		if (it instanceof QObject) {
			return schema
		}
	}
	
	def QObject getSchema(QObject qRootObject) {
		if (qRootObject != null) {
			for (QSystemProperty attr : qRootObject.getSystemProperties()) {
				if (attr instanceof SchemaProperty) {
					return attr.link
				}
			}	
		}
	}
	
	def String getIdentifyingPropertyName(QObject type) {
		if (type != null) {
			val schemaProperties = type.schemaProperties
			for (schemaProperty : nullSafeIterable(schemaProperties)) {
				if (schemaProperty.getStringProperty('isIdentifier') != null) {
					val identifierName = type.getStringProperty('name')
					if (identifierName != null) {
						return identifierName
					}
				}
			}	
		}
		return 'name'
	}

}