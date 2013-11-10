/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.Method#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Method#getDim <em>Dim</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Method#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Method#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Member
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
   * @see org.xtext.fofo.apricot.ApricotPackage#getMethod_Type()
   * @model containment="true"
   * @generated
   */
  UseType getType();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Method#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(UseType value);

  /**
   * Returns the value of the '<em><b>Dim</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dim</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dim</em>' attribute list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getMethod_Dim()
   * @model unique="false"
   * @generated
   */
  EList<String> getDim();

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getMethod_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(MethodBody)
   * @see org.xtext.fofo.apricot.ApricotPackage#getMethod_Body()
   * @model containment="true"
   * @generated
   */
  MethodBody getBody();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Method#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(MethodBody value);

} // Method
