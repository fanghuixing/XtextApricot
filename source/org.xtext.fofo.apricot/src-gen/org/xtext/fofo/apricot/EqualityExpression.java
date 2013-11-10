/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.EqualityExpression#getInstanceofexpression <em>Instanceofexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getEqualityExpression()
 * @model
 * @generated
 */
public interface EqualityExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Instanceofexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.InstanceOfExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instanceofexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instanceofexpression</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getEqualityExpression_Instanceofexpression()
   * @model containment="true"
   * @generated
   */
  EList<InstanceOfExpression> getInstanceofexpression();

} // EqualityExpression
