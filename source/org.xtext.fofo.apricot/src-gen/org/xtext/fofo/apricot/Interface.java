/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.Interface#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Interface#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends RefType
{
  /**
   * Returns the value of the '<em><b>Superclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Superclass</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Superclass</em>' reference.
   * @see #setSuperclass(Interface)
   * @see org.xtext.fofo.apricot.ApricotPackage#getInterface_Superclass()
   * @model
   * @generated
   */
  Interface getSuperclass();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Interface#getSuperclass <em>Superclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Superclass</em>' reference.
   * @see #getSuperclass()
   * @generated
   */
  void setSuperclass(Interface value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.AbstractInterfaceElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getInterface_Members()
   * @model containment="true"
   * @generated
   */
  EList<AbstractInterfaceElement> getMembers();

} // Interface
