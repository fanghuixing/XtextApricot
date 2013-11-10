/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.ConditionalOrExpression#getConditionalandexpression <em>Conditionalandexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getConditionalOrExpression()
 * @model
 * @generated
 */
public interface ConditionalOrExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditionalandexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.ConditionalAndExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditionalandexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditionalandexpression</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getConditionalOrExpression_Conditionalandexpression()
   * @model containment="true"
   * @generated
   */
  EList<ConditionalAndExpression> getConditionalandexpression();

} // ConditionalOrExpression
