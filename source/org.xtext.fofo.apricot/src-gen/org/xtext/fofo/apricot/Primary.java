/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.Primary#getParexpression <em>Parexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Primary#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Primary#getNewobject <em>Newobject</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Primary#getNewarray <em>Newarray</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Primary#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Primary#getDimer <em>Dimer</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Primary#getIdentifiersuffix <em>Identifiersuffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getPrimary()
 * @model
 * @generated
 */
public interface Primary extends EObject
{
  /**
   * Returns the value of the '<em><b>Parexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parexpression</em>' containment reference.
   * @see #setParexpression(ParExpression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getPrimary_Parexpression()
   * @model containment="true"
   * @generated
   */
  ParExpression getParexpression();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Primary#getParexpression <em>Parexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parexpression</em>' containment reference.
   * @see #getParexpression()
   * @generated
   */
  void setParexpression(ParExpression value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(Expression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getPrimary_Literal()
   * @model containment="true"
   * @generated
   */
  Expression getLiteral();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Primary#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(Expression value);

  /**
   * Returns the value of the '<em><b>Newobject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Newobject</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Newobject</em>' containment reference.
   * @see #setNewobject(NewByClass)
   * @see org.xtext.fofo.apricot.ApricotPackage#getPrimary_Newobject()
   * @model containment="true"
   * @generated
   */
  NewByClass getNewobject();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Primary#getNewobject <em>Newobject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Newobject</em>' containment reference.
   * @see #getNewobject()
   * @generated
   */
  void setNewobject(NewByClass value);

  /**
   * Returns the value of the '<em><b>Newarray</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Newarray</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Newarray</em>' containment reference.
   * @see #setNewarray(NewArray)
   * @see org.xtext.fofo.apricot.ApricotPackage#getPrimary_Newarray()
   * @model containment="true"
   * @generated
   */
  NewArray getNewarray();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Primary#getNewarray <em>Newarray</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Newarray</em>' containment reference.
   * @see #getNewarray()
   * @generated
   */
  void setNewarray(NewArray value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getPrimary_Identifier()
   * @model unique="false"
   * @generated
   */
  EList<String> getIdentifier();

  /**
   * Returns the value of the '<em><b>Dimer</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fofo.apricot.DimExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimer</em>' containment reference list.
   * @see org.xtext.fofo.apricot.ApricotPackage#getPrimary_Dimer()
   * @model containment="true"
   * @generated
   */
  EList<DimExpr> getDimer();

  /**
   * Returns the value of the '<em><b>Identifiersuffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifiersuffix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifiersuffix</em>' containment reference.
   * @see #setIdentifiersuffix(IdentifierSuffix)
   * @see org.xtext.fofo.apricot.ApricotPackage#getPrimary_Identifiersuffix()
   * @model containment="true"
   * @generated
   */
  IdentifierSuffix getIdentifiersuffix();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Primary#getIdentifiersuffix <em>Identifiersuffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifiersuffix</em>' containment reference.
   * @see #getIdentifiersuffix()
   * @generated
   */
  void setIdentifiersuffix(IdentifierSuffix value);

} // Primary
