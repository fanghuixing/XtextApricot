/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Var Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.LocalVarDec#getVariablemodifer <em>Variablemodifer</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.LocalVarDec#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.LocalVarDec#getDim <em>Dim</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.LocalVarDec#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.LocalVarDec#getVarini <em>Varini</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getLocalVarDec()
 * @model
 * @generated
 */
public interface LocalVarDec extends LocalVarDecStatement
{
  /**
   * Returns the value of the '<em><b>Variablemodifer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variablemodifer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variablemodifer</em>' attribute.
   * @see #setVariablemodifer(String)
   * @see org.xtext.fofo.apricot.ApricotPackage#getLocalVarDec_Variablemodifer()
   * @model
   * @generated
   */
  String getVariablemodifer();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.LocalVarDec#getVariablemodifer <em>Variablemodifer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variablemodifer</em>' attribute.
   * @see #getVariablemodifer()
   * @generated
   */
  void setVariablemodifer(String value);

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
   * @see org.xtext.fofo.apricot.ApricotPackage#getLocalVarDec_Type()
   * @model containment="true"
   * @generated
   */
  UseType getType();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.LocalVarDec#getType <em>Type</em>}' containment reference.
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
   * @see org.xtext.fofo.apricot.ApricotPackage#getLocalVarDec_Dim()
   * @model unique="false"
   * @generated
   */
  EList<String> getDim();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.fofo.apricot.ApricotPackage#getLocalVarDec_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.LocalVarDec#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Varini</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varini</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varini</em>' containment reference.
   * @see #setVarini(VariableInitializer)
   * @see org.xtext.fofo.apricot.ApricotPackage#getLocalVarDec_Varini()
   * @model containment="true"
   * @generated
   */
  VariableInitializer getVarini();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.LocalVarDec#getVarini <em>Varini</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varini</em>' containment reference.
   * @see #getVarini()
   * @generated
   */
  void setVarini(VariableInitializer value);

} // LocalVarDec
