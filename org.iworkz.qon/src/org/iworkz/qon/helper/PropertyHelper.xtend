package org.iworkz.qon.helper

import com.google.inject.Singleton
import org.iworkz.qon.qonDsl.QObject
import org.iworkz.qon.qonDsl.QProperty
import org.iworkz.qon.qonDsl.QStringValueProperty
import org.iworkz.qon.qonDsl.QLinkObjectProperty


@Singleton
class PropertyHelper {
	
	def getObjectType(QProperty it) {
		val container = eContainer
		if (container instanceof QObject) {
			return container.type
		}
	}
	
	def getProperty(QObject it, String name) {
		for (attr : properties) {
			if (name == attr.propertyName) {
				return attr
			}
		}
	}
	
	def getStringProperty(QObject it, String name) {
		val attr = getProperty(name)
		if (attr instanceof QStringValueProperty) {
			return attr.value				
		}
	}
	
	def getReferencedObjectProperty(QObject it, String name) {
		val attr = getProperty(name)
		if (attr instanceof QLinkObjectProperty) {
			return attr.link				
		}
	}

}