/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.CastExpression#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.CastExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getCastExpression()
 * @model
 * @generated
 */
public interface CastExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(UseType)
   * @see org.xtext.fofo.apricot.ApricotPackage#getCastExpression_Type()
   * @model containment="true"
   * @generated
   */
  UseType getType();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.CastExpression#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(UseType value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(UnaryExpressionNotPlusMinus)
   * @see org.xtext.fofo.apricot.ApricotPackage#getCastExpression_Expression()
   * @model containment="true"
   * @generated
   */
  UnaryExpressionNotPlusMinus getExpression();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.CastExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(UnaryExpressionNotPlusMinus value);

} // CastExpression
