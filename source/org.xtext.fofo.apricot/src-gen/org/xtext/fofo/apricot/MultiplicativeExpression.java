/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.MultiplicativeExpression#getUnaryexpression <em>Unaryexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getMultiplicativeExpression()
 * @model
 * @generated
 */
public interface MultiplicativeExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Unaryexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.UnaryExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unaryexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unaryexpression</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getMultiplicativeExpression_Unaryexpression()
   * @model containment="true"
   * @generated
   */
  EList<UnaryExpression> getUnaryexpression();

} // MultiplicativeExpression
