/**
 */
package org.xtext.fofo.apricot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Composition Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.AbstractCompositionMethod#getRac <em>Rac</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getAbstractCompositionMethod()
 * @model
 * @generated
 */
public interface AbstractCompositionMethod extends AbstractMethod
{
  /**
   * Returns the value of the '<em><b>Rac</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rac</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rac</em>' containment reference.
   * @see #setRac(RequiresAbstractComposition)
   * @see org.xtext.fofo.apricot.ApricotPackage#getAbstractCompositionMethod_Rac()
   * @model containment="true"
   * @generated
   */
  RequiresAbstractComposition getRac();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.AbstractCompositionMethod#getRac <em>Rac</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rac</em>' containment reference.
   * @see #getRac()
   * @generated
   */
  void setRac(RequiresAbstractComposition value);

} // AbstractCompositionMethod
