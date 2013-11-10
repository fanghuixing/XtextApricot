/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.UseType#getReftype <em>Reftype</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.UseType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getUseType()
 * @model
 * @generated
 */
public interface UseType extends EObject
{
  /**
   * Returns the value of the '<em><b>Reftype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reftype</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reftype</em>' reference.
   * @see #setReftype(RefType)
   * @see org.xtext.fofo.apricot.ApricotPackage#getUseType_Reftype()
   * @model
   * @generated
   */
  RefType getReftype();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.UseType#getReftype <em>Reftype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reftype</em>' reference.
   * @see #getReftype()
   * @generated
   */
  void setReftype(RefType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(NonRefType)
   * @see org.xtext.fofo.apricot.ApricotPackage#getUseType_Type()
   * @model containment="true"
   * @generated
   */
  NonRefType getType();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.UseType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(NonRefType value);

} // UseType
