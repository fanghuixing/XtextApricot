/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.AdditiveExpression#getMultiplicativeexpression <em>Multiplicativeexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getAdditiveExpression()
 * @model
 * @generated
 */
public interface AdditiveExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Multiplicativeexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.MultiplicativeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicativeexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicativeexpression</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getAdditiveExpression_Multiplicativeexpression()
   * @model containment="true"
   * @generated
   */
  EList<MultiplicativeExpression> getMultiplicativeexpression();

} // AdditiveExpression
