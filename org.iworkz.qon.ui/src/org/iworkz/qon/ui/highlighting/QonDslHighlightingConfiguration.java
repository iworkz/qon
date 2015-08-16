package org.iworkz.qon.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;


public class QonDslHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String OBJECT_TYPE = "objectType";
	public static final String ATTRIBUTE_NAME = "attributeName";
	public static final String SYSTEM_ATTRIBUTE_NAME = "systemAttributeName";
	public static final String SYSTEM_ATTRIBUTE_VALUE = "systemAttributeString";
	public static final String SYSTEM_ATTRIBUTE_OPERATOR = "systemAttributeOperater";
	public static final String BOOLEAN_VALUE = "booleanValue";
	public static final String NULL_VALUE = "nullValue";
	public static final String CROSS_REFERENCE = "crossReference";

	public void configure(IHighlightingConfigurationAcceptor acceptor) { 
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(OBJECT_TYPE, "Object type", objectTypeTextStyle());
		acceptor.acceptDefaultHighlighting(ATTRIBUTE_NAME, "Attribute name", attributeNameTextStyle());
		acceptor.acceptDefaultHighlighting(SYSTEM_ATTRIBUTE_NAME, "System attribute name", systemAttributeNameTextStyle());
		acceptor.acceptDefaultHighlighting(SYSTEM_ATTRIBUTE_VALUE, "System attribute value", systemAttributeValueTextStyle());
		acceptor.acceptDefaultHighlighting(SYSTEM_ATTRIBUTE_OPERATOR, "System attribute operators", systemAttributeOperatorTextStyle());
		acceptor.acceptDefaultHighlighting(BOOLEAN_VALUE, "Boolean value", booleanValueTextStyle());
		acceptor.acceptDefaultHighlighting(NULL_VALUE, "Null value", nullValueTextStyle());
		acceptor.acceptDefaultHighlighting(CROSS_REFERENCE, "Cross reference", crossReferenceTextStyle());
	}

	public TextStyle objectTypeTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(35, 35, 150));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle attributeNameTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 85));
		//textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle systemAttributeNameTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
//		textStyle.setColor(new RGB(170, 100, 145));
		textStyle.setColor(new RGB(130, 130, 130));
		return textStyle;
	}
	
	public TextStyle systemAttributeValueTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(60, 150, 250));
		return textStyle;
	}
	
	public TextStyle systemAttributeOperatorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(150, 150, 150));
		return textStyle;
	}

	public TextStyle booleanValueTextStyle() {
		TextStyle textStyle = numberTextStyle().copy();
		return textStyle;
	}
	
	public TextStyle nullValueTextStyle() {
		TextStyle textStyle = numberTextStyle().copy();
		return textStyle;
	}
	
	public TextStyle crossReferenceTextStyle() {
		TextStyle textStyle = stringTextStyle().copy();
		//textStyle.setColor(new RGB(0, 100, 100));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

}
