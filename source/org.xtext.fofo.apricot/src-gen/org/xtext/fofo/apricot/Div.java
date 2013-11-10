/**
 */
package org.xtext.fofo.apricot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.Div#getBuiltInName <em>Built In Name</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Div#getE1 <em>E1</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Div#getE2 <em>E2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getDiv()
 * @model
 * @generated
 */
public interface Div extends Built_In_Methods
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
   * @see org.xtext.fofo.apricot.ApricotPackage#getDiv_BuiltInName()
   * @model
   * @generated
   */
  String getBuiltInName();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Div#getBuiltInName <em>Built In Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Built In Name</em>' attribute.
   * @see #getBuiltInName()
   * @generated
   */
  void setBuiltInName(String value);

  /**
   * Returns the value of the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1</em>' containment reference.
   * @see #setE1(AdditiveExpression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getDiv_E1()
   * @model containment="true"
   * @generated
   */
  AdditiveExpression getE1();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Div#getE1 <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' containment reference.
   * @see #getE1()
   * @generated
   */
  void setE1(AdditiveExpression value);

  /**
   * Returns the value of the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E2</em>' containment reference.
   * @see #setE2(AdditiveExpression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getDiv_E2()
   * @model containment="true"
   * @generated
   */
  AdditiveExpression getE2();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Div#getE2 <em>E2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E2</em>' containment reference.
   * @see #getE2()
   * @generated
   */
  void setE2(AdditiveExpression value);

} // Div
