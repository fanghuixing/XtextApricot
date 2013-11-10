/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Par Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.ParExpression#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ParExpression#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getParExpression()
 * @model
 * @generated
 */
public interface ParExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression1</em>' containment reference.
   * @see #setExpression1(Expression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getParExpression_Expression1()
   * @model containment="true"
   * @generated
   */
  Expression getExpression1();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ParExpression#getExpression1 <em>Expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression1</em>' containment reference.
   * @see #getExpression1()
   * @generated
   */
  void setExpression1(Expression value);

  /**
   * Returns the value of the '<em><b>Expression2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression2</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getParExpression_Expression2()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression2();

} // ParExpression
