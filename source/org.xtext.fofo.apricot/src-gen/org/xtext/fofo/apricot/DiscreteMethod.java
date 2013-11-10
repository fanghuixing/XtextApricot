/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.DiscreteMethod#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.DiscreteMethod#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getDiscreteMethod()
 * @model
 * @generated
 */
public interface DiscreteMethod extends Member
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getDiscreteMethod_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.BlockStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getDiscreteMethod_Statements()
   * @model containment="true"
   * @generated
   */
  EList<BlockStatement> getStatements();

} // DiscreteMethod
