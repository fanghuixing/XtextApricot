/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.Arguments#getExpressionlist <em>Expressionlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getArguments()
 * @model
 * @generated
 */
public interface Arguments extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressionlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressionlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressionlist</em>' containment reference.
   * @see #setExpressionlist(ExpressionList)
   * @see org.xtext.fofo.apricot.ApricotPackage#getArguments_Expressionlist()
   * @model containment="true"
   * @generated
   */
  ExpressionList getExpressionlist();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Arguments#getExpressionlist <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressionlist</em>' containment reference.
   * @see #getExpressionlist()
   * @generated
   */
  void setExpressionlist(ExpressionList value);

} // Arguments
