/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.Class#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Class#getInterfaceclass <em>Interfaceclass</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Class#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends RefType
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
   * @see #setSuperclass(Class)
   * @see org.xtext.fofo.apricot.ApricotPackage#getClass_Superclass()
   * @model
   * @generated
   */
  Class getSuperclass();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Class#getSuperclass <em>Superclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Superclass</em>' reference.
   * @see #getSuperclass()
   * @generated
   */
  void setSuperclass(Class value);

  /**
   * Returns the value of the '<em><b>Interfaceclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaceclass</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaceclass</em>' reference.
   * @see #setInterfaceclass(Interface)
   * @see org.xtext.fofo.apricot.ApricotPackage#getClass_Interfaceclass()
   * @model
   * @generated
   */
  Interface getInterfaceclass();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Class#getInterfaceclass <em>Interfaceclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interfaceclass</em>' reference.
   * @see #getInterfaceclass()
   * @generated
   */
  void setInterfaceclass(Interface value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getClass_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // Class
