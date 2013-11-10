/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Of Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.InstanceOfExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.InstanceOfExpression#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getInstanceOfExpression()
 * @model
 * @generated
 */
public interface InstanceOfExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(RelationalExpression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getInstanceOfExpression_Left()
   * @model containment="true"
   * @generated
   */
  RelationalExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.InstanceOfExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(RelationalExpression value);

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
   * @see org.xtext.fofo.apricot.ApricotPackage#getInstanceOfExpression_Type()
   * @model containment="true"
   * @generated
   */
  UseType getType();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.InstanceOfExpression#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(UseType value);

} // InstanceOfExpression
