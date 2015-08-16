package org.iworkz.qon.helper


class CommonHelper {
	
	def<T> Iterable<T> nullSafeIterable(Iterable<T> iterable) {
		if (iterable == null) {
			return emptySet
		} else {
			return iterable
		}
	}
	
}