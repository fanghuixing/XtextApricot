/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.ConditionalAndExpression#getExclusiveorexpression <em>Exclusiveorexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getConditionalAndExpression()
 * @model
 * @generated
 */
public interface ConditionalAndExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Exclusiveorexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.ExclusiveOrExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclusiveorexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclusiveorexpression</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getConditionalAndExpression_Exclusiveorexpression()
   * @model containment="true"
   * @generated
   */
  EList<ExclusiveOrExpression> getExclusiveorexpression();

} // ConditionalAndExpression
