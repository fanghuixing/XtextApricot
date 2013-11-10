/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.DiscreteBlock#getBuiltInName <em>Built In Name</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.DiscreteBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getDiscreteBlock()
 * @model
 * @generated
 */
public interface DiscreteBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Built In Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Built In Name</em>' attribute.
   * @see #setBuiltInName(String)
   * @see org.xtext.fofo.apricot.ApricotPackage#getDiscreteBlock_BuiltInName()
   * @model
   * @generated
   */
  String getBuiltInName();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.DiscreteBlock#getBuiltInName <em>Built In Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Built In Name</em>' attribute.
   * @see #getBuiltInName()
   * @generated
   */
  void setBuiltInName(String value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.BlockStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getDiscreteBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<BlockStatement> getStatements();

} // DiscreteBlock
