/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.InvariantBlock#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getInvariantBlock()
 * @model
 * @generated
 */
public interface InvariantBlock extends Member
{
  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.ConditionalExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getInvariantBlock_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<ConditionalExpression> getConditions();

} // InvariantBlock
