/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Suffix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.IdentifierSuffix#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.IdentifierSuffix#getGetvalue <em>Getvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getIdentifierSuffix()
 * @model
 * @generated
 */
public interface IdentifierSuffix extends EObject
{
  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(Arguments)
   * @see org.xtext.fofo.apricot.ApricotPackage#getIdentifierSuffix_Arguments()
   * @model containment="true"
   * @generated
   */
  Arguments getArguments();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.IdentifierSuffix#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(Arguments value);

  /**
   * Returns the value of the '<em><b>Getvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Getvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getvalue</em>' attribute.
   * @see #setGetvalue(String)
   * @see org.xtext.fofo.apricot.ApricotPackage#getIdentifierSuffix_Getvalue()
   * @model
   * @generated
   */
  String getGetvalue();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.IdentifierSuffix#getGetvalue <em>Getvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Getvalue</em>' attribute.
   * @see #getGetvalue()
   * @generated
   */
  void setGetvalue(String value);

} // IdentifierSuffix
