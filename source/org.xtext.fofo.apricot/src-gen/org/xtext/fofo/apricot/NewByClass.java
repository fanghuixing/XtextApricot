/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New By Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.NewByClass#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.NewByClass#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getNewByClass()
 * @model
 * @generated
 */
public interface NewByClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(org.xtext.fofo.apricot.Class)
   * @see org.xtext.fofo.apricot.ApricotPackage#getNewByClass_Type()
   * @model
   * @generated
   */
  org.xtext.fofo.apricot.Class getType();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.NewByClass#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(org.xtext.fofo.apricot.Class value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getNewByClass_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // NewByClass
