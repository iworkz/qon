package org.iworkz.qon.ui.highlighting;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.iworkz.qon.qonDsl.BooleanValue;
import org.iworkz.qon.qonDsl.Import;
import org.iworkz.qon.qonDsl.QNullValueProperty;
import org.iworkz.qon.qonDsl.QObject;
import org.iworkz.qon.qonDsl.QProperty;
import org.iworkz.qon.qonDsl.QSystemProperty;


public class QonDslSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

		   @Override
		    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		        if (resource == null || resource.getParseResult() == null) {
		            return;
		        }
		        
		        INode root = resource.getParseResult().getRootNode();
		        for (INode node : root.getAsTreeIterable()) {
		            EObject grammarObject = node.getGrammarElement();
		            if (node instanceof HiddenLeafNode == false) {
		            	if (node.getSemanticElement() instanceof QObject) {
		            		if (grammarObject instanceof CrossReference) {
		            			/* Keyword assigned to 'type' */
		            			if (grammarObject.eContainer() instanceof Assignment) {
		            				Assignment keywordAssignment = (Assignment)grammarObject.eContainer();
		            				String feature = keywordAssignment.getFeature();
		            				if (feature.equals("type")) {
		            					highlightNode(node, QonDslHighlightingConfiguration.OBJECT_TYPE, acceptor);
		            				}
		            			}
		            		}
		            	}
		            	if (node instanceof HiddenLeafNode == false && node.getSemanticElement() instanceof QProperty) {
		            		if (grammarObject instanceof RuleCall) {
		            			/* Keyword assigned to 'attributeName' */
		            			if (grammarObject.eContainer() instanceof Assignment) {
		            				Assignment keywordAssignment = (Assignment)grammarObject.eContainer();
		            				String feature = keywordAssignment.getFeature();
		            				if (feature.equals("attributeName")) {
		            					highlightNode(node, QonDslHighlightingConfiguration.ATTRIBUTE_NAME, acceptor);
		            				}
		            			}
		            			
		            		}
		            	}
		            	if (node instanceof HiddenLeafNode == false && node.getSemanticElement() instanceof QSystemProperty) {
		            		if (grammarObject instanceof Keyword) {
		            			Keyword keyword = (Keyword)grammarObject;
		            			if (keyword.getValue().startsWith("$")) {
		            				highlightNode(node, QonDslHighlightingConfiguration.SYSTEM_ATTRIBUTE_NAME, acceptor);
		            			} else {
		            				highlightNode(node, QonDslHighlightingConfiguration.SYSTEM_ATTRIBUTE_OPERATOR, acceptor);
		            			}
		            		} else if (grammarObject instanceof RuleCall) {
		            			/* Keyword assigned to 'attributeName' */
		            			if (grammarObject.eContainer() instanceof Assignment) {
		            				Assignment keywordAssignment = (Assignment)grammarObject.eContainer();
		            				String feature = keywordAssignment.getFeature();
		            				if (feature.equals("value")) {
		            					highlightNode(node, QonDslHighlightingConfiguration.SYSTEM_ATTRIBUTE_VALUE, acceptor);
		            				}
		            			}
		            		} else if (grammarObject instanceof CrossReference) {
		            			/* Keyword assigned to 'attributeName' */
		            			if (grammarObject.eContainer() instanceof Assignment) {
		            				Assignment keywordAssignment = (Assignment)grammarObject.eContainer();
		            				String feature = keywordAssignment.getFeature();
		            				if (feature.equals("link")) {
		            					highlightNode(node, QonDslHighlightingConfiguration.SYSTEM_ATTRIBUTE_VALUE, acceptor);
		            				}
		            			}
		            		}
		            	}
		            	if (node instanceof HiddenLeafNode == false && node.getSemanticElement() instanceof Import) {
		            		if (grammarObject instanceof RuleCall) {
		            			/* Keyword assigned to 'attributeName' */
		            			if (grammarObject.eContainer() instanceof Assignment) {
		            				Assignment keywordAssignment = (Assignment)grammarObject.eContainer();
		            				String feature = keywordAssignment.getFeature();
		            				if (feature.equals("importedNamespace")) {
		            					highlightNode(node, QonDslHighlightingConfiguration.SYSTEM_ATTRIBUTE_VALUE, acceptor);
		            				}
		            			}
		            			
		            		}
		            	}
		            	if (node instanceof HiddenLeafNode == false && node.getSemanticElement() instanceof QNullValueProperty) {
		            		if (grammarObject instanceof Keyword) {
		            			highlightNode(node, QonDslHighlightingConfiguration.BOOLEAN_VALUE, acceptor);
		            		}
		            	}
		            	if (node instanceof HiddenLeafNode == false && node.getSemanticElement() instanceof BooleanValue) {
		            		highlightNode(node, QonDslHighlightingConfiguration.NULL_VALUE, acceptor);
		            	}
		            }
		        }
		   
		    }

		    protected INode findFirstEnumLiteralDeclarationNode(INode node) {
		        if (node.getGrammarElement() instanceof EnumLiteralDeclaration) {
		            return node;
		        }
		        if (node instanceof CompositeNode) {
		            CompositeNode compositeNode = (CompositeNode) node;
		            for (INode childNode : compositeNode.getChildren()) {
		                INode found = findFirstEnumLiteralDeclarationNode(childNode);
		                if (found != null) {
		                    return found;
		                }
		            }
		        }
		        return null;
		    }

		    protected INode getFirstFeatureNode(EObject semanticObject, EStructuralFeature structuralFeature) {
		        List<INode> nodesForFeature = NodeModelUtils.findNodesForFeature(semanticObject, structuralFeature);
		        return nodesForFeature.isEmpty() ? null : nodesForFeature.get(0);
		    }

		    protected void highlightNode(INode node, String id, IHighlightedPositionAcceptor acceptor) {
		        if (node == null)
		            return;
		        acceptor.addPosition(node.getOffset(), node.getLength(), id);
		    }

		    protected void highlightNodeRange(INode node, String id, IHighlightedPositionAcceptor acceptor, int start,
		            int length) {
		        if (node == null)
		            return;
		        acceptor.addPosition(node.getOffset() + start, length, id);
		    }

		    protected void highlightNodeEnd(INode node, String id, IHighlightedPositionAcceptor acceptor, int length) {
		        if (node == null)
		            return;
		        acceptor.addPosition(node.getOffset() + node.getLength() - length, length, id);
		    }

		    protected void highlightNodeBegin(INode node, String id, IHighlightedPositionAcceptor acceptor, int length) {
		        if (node == null)
		            return;
		        acceptor.addPosition(node.getOffset(), length, id);
		    }
		
	

}
