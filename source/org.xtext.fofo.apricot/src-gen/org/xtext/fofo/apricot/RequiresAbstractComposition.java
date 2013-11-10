/**
 */
package org.xtext.fofo.apricot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires Abstract Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.RequiresAbstractComposition#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.RequiresAbstractComposition#getAbstract_dynamic_switch <em>Abstract dynamic switch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getRequiresAbstractComposition()
 * @model
 * @generated
 */
public interface RequiresAbstractComposition extends AbstractMethodBody
{
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
   * @see org.xtext.fofo.apricot.ApricotPackage#getRequiresAbstractComposition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.RequiresAbstractComposition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Abstract dynamic switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract dynamic switch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract dynamic switch</em>' containment reference.
   * @see #setAbstract_dynamic_switch(AbstractDynamicSwitch)
   * @see org.xtext.fofo.apricot.ApricotPackage#getRequiresAbstractComposition_Abstract_dynamic_switch()
   * @model containment="true"
   * @generated
   */
  AbstractDynamicSwitch getAbstract_dynamic_switch();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.RequiresAbstractComposition#getAbstract_dynamic_switch <em>Abstract dynamic switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract dynamic switch</em>' containment reference.
   * @see #getAbstract_dynamic_switch()
   * @generated
   */
  void setAbstract_dynamic_switch(AbstractDynamicSwitch value);

} // RequiresAbstractComposition
