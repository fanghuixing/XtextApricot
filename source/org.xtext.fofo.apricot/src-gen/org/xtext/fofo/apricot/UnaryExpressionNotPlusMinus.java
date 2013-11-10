/**
 */
package org.xtext.fofo.apricot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression Not Plus Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getUnaryexpression <em>Unaryexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getCastexpression <em>Castexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getUnaryExpressionNotPlusMinus()
 * @model
 * @generated
 */
public interface UnaryExpressionNotPlusMinus extends UnaryExpression
{
  /**
   * Returns the value of the '<em><b>Unaryexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unaryexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unaryexpression</em>' containment reference.
   * @see #setUnaryexpression(UnaryExpression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getUnaryExpressionNotPlusMinus_Unaryexpression()
   * @model containment="true"
   * @generated
   */
  UnaryExpression getUnaryexpression();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getUnaryexpression <em>Unaryexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unaryexpression</em>' containment reference.
   * @see #getUnaryexpression()
   * @generated
   */
  void setUnaryexpression(UnaryExpression value);

  /**
   * Returns the value of the '<em><b>Castexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Castexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Castexpression</em>' containment reference.
   * @see #setCastexpression(CastExpression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getUnaryExpressionNotPlusMinus_Castexpression()
   * @model containment="true"
   * @generated
   */
  CastExpression getCastexpression();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getCastexpression <em>Castexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Castexpression</em>' containment reference.
   * @see #getCastexpression()
   * @generated
   */
  void setCastexpression(CastExpression value);

  /**
   * Returns the value of the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary</em>' containment reference.
   * @see #setPrimary(Primary)
   * @see org.xtext.fofo.apricot.ApricotPackage#getUnaryExpressionNotPlusMinus_Primary()
   * @model containment="true"
   * @generated
   */
  Primary getPrimary();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getPrimary <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' containment reference.
   * @see #getPrimary()
   * @generated
   */
  void setPrimary(Primary value);

  /**
   * Returns the value of the '<em><b>Builtin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builtin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builtin</em>' containment reference.
   * @see #setBuiltin(Built_In_Methods)
   * @see org.xtext.fofo.apricot.ApricotPackage#getUnaryExpressionNotPlusMinus_Builtin()
   * @model containment="true"
   * @generated
   */
  Built_In_Methods getBuiltin();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getBuiltin <em>Builtin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Builtin</em>' containment reference.
   * @see #getBuiltin()
   * @generated
   */
  void setBuiltin(Built_In_Methods value);

} // UnaryExpressionNotPlusMinus
