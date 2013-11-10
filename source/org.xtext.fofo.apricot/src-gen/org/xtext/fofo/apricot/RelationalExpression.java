/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.RelationalExpression#getAdditiveexpression <em>Additiveexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.RelationalExpression#getRelationalop <em>Relationalop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getRelationalExpression()
 * @model
 * @generated
 */
public interface RelationalExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Additiveexpression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.AdditiveExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additiveexpression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additiveexpression</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getRelationalExpression_Additiveexpression()
   * @model containment="true"
   * @generated
   */
  EList<AdditiveExpression> getAdditiveexpression();

  /**
   * Returns the value of the '<em><b>Relationalop</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationalop</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationalop</em>' attribute list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getRelationalExpression_Relationalop()
   * @model unique="false"
   * @generated
   */
  EList<String> getRelationalop();

} // RelationalExpression
