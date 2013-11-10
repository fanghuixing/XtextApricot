/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.ExclusiveOrExpression#getEqualityexpression <em>Equalityexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getExclusiveOrExpression()
 * @model
 * @generated
 */
public interface ExclusiveOrExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Equalityexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.EqualityExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equalityexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equalityexpression</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getExclusiveOrExpression_Equalityexpression()
   * @model containment="true"
   * @generated
   */
  EList<EqualityExpression> getEqualityexpression();

} // ExclusiveOrExpression
