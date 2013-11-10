/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.ForControl#getEnhancedforcontrol <em>Enhancedforcontrol</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ForControl#getForinit <em>Forinit</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ForControl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ForControl#getForupdate <em>Forupdate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getForControl()
 * @model
 * @generated
 */
public interface ForControl extends EObject
{
  /**
   * Returns the value of the '<em><b>Enhancedforcontrol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enhancedforcontrol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enhancedforcontrol</em>' containment reference.
   * @see #setEnhancedforcontrol(EnhancedForControl)
   * @see org.xtext.fofo.apricot.ApricotPackage#getForControl_Enhancedforcontrol()
   * @model containment="true"
   * @generated
   */
  EnhancedForControl getEnhancedforcontrol();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ForControl#getEnhancedforcontrol <em>Enhancedforcontrol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enhancedforcontrol</em>' containment reference.
   * @see #getEnhancedforcontrol()
   * @generated
   */
  void setEnhancedforcontrol(EnhancedForControl value);

  /**
   * Returns the value of the '<em><b>Forinit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forinit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forinit</em>' containment reference.
   * @see #setForinit(ForInit)
   * @see org.xtext.fofo.apricot.ApricotPackage#getForControl_Forinit()
   * @model containment="true"
   * @generated
   */
  ForInit getForinit();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ForControl#getForinit <em>Forinit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forinit</em>' containment reference.
   * @see #getForinit()
   * @generated
   */
  void setForinit(ForInit value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getForControl_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ForControl#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Forupdate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forupdate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forupdate</em>' containment reference.
   * @see #setForupdate(ForUpdate)
   * @see org.xtext.fofo.apricot.ApricotPackage#getForControl_Forupdate()
   * @model containment="true"
   * @generated
   */
  ForUpdate getForupdate();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ForControl#getForupdate <em>Forupdate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forupdate</em>' containment reference.
   * @see #getForupdate()
   * @generated
   */
  void setForupdate(ForUpdate value);

} // ForControl
