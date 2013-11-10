/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Switch Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSync <em>Sync</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getRecev <em>Recev</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSend <em>Send</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSourcelist <em>Sourcelist</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getDestinationlist <em>Destinationlist</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.ControlSwitchComposition#getDiscrete <em>Discrete</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition()
 * @model
 * @generated
 */
public interface ControlSwitchComposition extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Sync</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sync</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sync</em>' attribute.
   * @see #setSync(String)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Sync()
   * @model
   * @generated
   */
  String getSync();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSync <em>Sync</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sync</em>' attribute.
   * @see #getSync()
   * @generated
   */
  void setSync(String value);

  /**
   * Returns the value of the '<em><b>Recev</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recev</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recev</em>' attribute.
   * @see #setRecev(String)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Recev()
   * @model
   * @generated
   */
  String getRecev();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getRecev <em>Recev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recev</em>' attribute.
   * @see #getRecev()
   * @generated
   */
  void setRecev(String value);

  /**
   * Returns the value of the '<em><b>Send</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Send</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Send</em>' attribute.
   * @see #setSend(String)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Send()
   * @model
   * @generated
   */
  String getSend();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSend <em>Send</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Send</em>' attribute.
   * @see #getSend()
   * @generated
   */
  void setSend(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(Expression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Source()
   * @model containment="true"
   * @generated
   */
  Expression getSource();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Expression value);

  /**
   * Returns the value of the '<em><b>Sourcelist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sourcelist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sourcelist</em>' containment reference.
   * @see #setSourcelist(ExpressionList)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Sourcelist()
   * @model containment="true"
   * @generated
   */
  ExpressionList getSourcelist();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSourcelist <em>Sourcelist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sourcelist</em>' containment reference.
   * @see #getSourcelist()
   * @generated
   */
  void setSourcelist(ExpressionList value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Expression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Action()
   * @model containment="true"
   * @generated
   */
  Expression getAction();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Expression value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' containment reference.
   * @see #setDestination(Expression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Destination()
   * @model containment="true"
   * @generated
   */
  Expression getDestination();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getDestination <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' containment reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(Expression value);

  /**
   * Returns the value of the '<em><b>Destinationlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destinationlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destinationlist</em>' containment reference.
   * @see #setDestinationlist(ExpressionList)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Destinationlist()
   * @model containment="true"
   * @generated
   */
  ExpressionList getDestinationlist();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getDestinationlist <em>Destinationlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destinationlist</em>' containment reference.
   * @see #getDestinationlist()
   * @generated
   */
  void setDestinationlist(ExpressionList value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(ConditionBlock)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Condition()
   * @model containment="true"
   * @generated
   */
  ConditionBlock getCondition();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(ConditionBlock value);

  /**
   * Returns the value of the '<em><b>Discrete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Discrete</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Discrete</em>' containment reference.
   * @see #setDiscrete(DiscreteBlock)
   * @see org.xtext.fofo.apricot.ApricotPackage#getControlSwitchComposition_Discrete()
   * @model containment="true"
   * @generated
   */
  DiscreteBlock getDiscrete();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getDiscrete <em>Discrete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Discrete</em>' containment reference.
   * @see #getDiscrete()
   * @generated
   */
  void setDiscrete(DiscreteBlock value);

} // ControlSwitchComposition
