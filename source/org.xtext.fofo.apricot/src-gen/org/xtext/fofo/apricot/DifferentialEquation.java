/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Differential Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.DifferentialEquation#getLHS <em>LHS</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.DifferentialEquation#getRHS <em>RHS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getDifferentialEquation()
 * @model
 * @generated
 */
public interface DifferentialEquation extends EObject
{
  /**
   * Returns the value of the '<em><b>LHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LHS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LHS</em>' containment reference.
   * @see #setLHS(DE_LHS)
   * @see org.xtext.fofo.apricot.ApricotPackage#getDifferentialEquation_LHS()
   * @model containment="true"
   * @generated
   */
  DE_LHS getLHS();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.DifferentialEquation#getLHS <em>LHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LHS</em>' containment reference.
   * @see #getLHS()
   * @generated
   */
  void setLHS(DE_LHS value);

  /**
   * Returns the value of the '<em><b>RHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RHS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RHS</em>' containment reference.
   * @see #setRHS(AdditiveExpression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getDifferentialEquation_RHS()
   * @model containment="true"
   * @generated
   */
  AdditiveExpression getRHS();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.DifferentialEquation#getRHS <em>RHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RHS</em>' containment reference.
   * @see #getRHS()
   * @generated
   */
  void setRHS(AdditiveExpression value);

} // DifferentialEquation
