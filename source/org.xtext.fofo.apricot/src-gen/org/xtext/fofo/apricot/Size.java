/**
 */
package org.xtext.fofo.apricot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.Size#getBuiltInName <em>Built In Name</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Size#getEx <em>Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getSize()
 * @model
 * @generated
 */
public interface Size extends Built_In_Methods
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
   * @see org.xtext.fofo.apricot.ApricotPackage#getSize_BuiltInName()
   * @model
   * @generated
   */
  String getBuiltInName();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Size#getBuiltInName <em>Built In Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Built In Name</em>' attribute.
   * @see #getBuiltInName()
   * @generated
   */
  void setBuiltInName(String value);

  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference.
   * @see #setEx(AdditiveExpression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getSize_Ex()
   * @model containment="true"
   * @generated
   */
  AdditiveExpression getEx();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Size#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(AdditiveExpression value);

} // Size
