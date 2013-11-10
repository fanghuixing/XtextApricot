/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.UnaryExpression#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.UnaryExpression#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(Expression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getUnaryExpression_From()
   * @model containment="true"
   * @generated
   */
  Expression getFrom();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.UnaryExpression#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Expression value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(Expression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getUnaryExpression_To()
   * @model containment="true"
   * @generated
   */
  Expression getTo();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.UnaryExpression#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Expression value);

} // UnaryExpression
