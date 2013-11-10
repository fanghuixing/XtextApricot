/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.ContinuousMethod#getDES <em>DES</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getContinuousMethod()
 * @model
 * @generated
 */
public interface ContinuousMethod extends Member
{
  /**
   * Returns the value of the '<em><b>DES</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.DifferentialEquation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DES</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DES</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getContinuousMethod_DES()
   * @model containment="true"
   * @generated
   */
  EList<DifferentialEquation> getDES();

} // ContinuousMethod
