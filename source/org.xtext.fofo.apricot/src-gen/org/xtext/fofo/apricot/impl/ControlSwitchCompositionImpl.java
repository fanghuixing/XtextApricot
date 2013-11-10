/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.ConditionBlock;
import org.xtext.fofo.apricot.ControlSwitchComposition;
import org.xtext.fofo.apricot.DiscreteBlock;
import org.xtext.fofo.apricot.Expression;
import org.xtext.fofo.apricot.ExpressionList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Switch Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getSync <em>Sync</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getRecev <em>Recev</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getSend <em>Send</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getSourcelist <em>Sourcelist</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getDestinationlist <em>Destinationlist</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl#getDiscrete <em>Discrete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlSwitchCompositionImpl extends MinimalEObjectImpl.Container implements ControlSwitchComposition
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getSync() <em>Sync</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSync()
   * @generated
   * @ordered
   */
  protected static final String SYNC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSync() <em>Sync</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSync()
   * @generated
   * @ordered
   */
  protected String sync = SYNC_EDEFAULT;

  /**
   * The default value of the '{@link #getRecev() <em>Recev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecev()
   * @generated
   * @ordered
   */
  protected static final String RECEV_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecev() <em>Recev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecev()
   * @generated
   * @ordered
   */
  protected String recev = RECEV_EDEFAULT;

  /**
   * The default value of the '{@link #getSend() <em>Send</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSend()
   * @generated
   * @ordered
   */
  protected static final String SEND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSend() <em>Send</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSend()
   * @generated
   * @ordered
   */
  protected String send = SEND_EDEFAULT;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Expression source;

  /**
   * The cached value of the '{@link #getSourcelist() <em>Sourcelist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcelist()
   * @generated
   * @ordered
   */
  protected ExpressionList sourcelist;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Expression action;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected Expression destination;

  /**
   * The cached value of the '{@link #getDestinationlist() <em>Destinationlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationlist()
   * @generated
   * @ordered
   */
  protected ExpressionList destinationlist;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected ConditionBlock condition;

  /**
   * The cached value of the '{@link #getDiscrete() <em>Discrete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiscrete()
   * @generated
   * @ordered
   */
  protected DiscreteBlock discrete;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlSwitchCompositionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ApricotPackage.Literals.CONTROL_SWITCH_COMPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSync()
  {
    return sync;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSync(String newSync)
  {
    String oldSync = sync;
    sync = newSync;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__SYNC, oldSync, sync));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecev()
  {
    return recev;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecev(String newRecev)
  {
    String oldRecev = recev;
    recev = newRecev;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__RECEV, oldRecev, recev));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSend()
  {
    return send;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSend(String newSend)
  {
    String oldSend = send;
    send = newSend;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__SEND, oldSend, send));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(Expression newSource, NotificationChain msgs)
  {
    Expression oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Expression newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getSourcelist()
  {
    return sourcelist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourcelist(ExpressionList newSourcelist, NotificationChain msgs)
  {
    ExpressionList oldSourcelist = sourcelist;
    sourcelist = newSourcelist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCELIST, oldSourcelist, newSourcelist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcelist(ExpressionList newSourcelist)
  {
    if (newSourcelist != sourcelist)
    {
      NotificationChain msgs = null;
      if (sourcelist != null)
        msgs = ((InternalEObject)sourcelist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCELIST, null, msgs);
      if (newSourcelist != null)
        msgs = ((InternalEObject)newSourcelist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCELIST, null, msgs);
      msgs = basicSetSourcelist(newSourcelist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCELIST, newSourcelist, newSourcelist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Expression newAction, NotificationChain msgs)
  {
    Expression oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Expression newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__ACTION, newAction, newAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestination(Expression newDestination, NotificationChain msgs)
  {
    Expression oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATION, oldDestination, newDestination);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(Expression newDestination)
  {
    if (newDestination != destination)
    {
      NotificationChain msgs = null;
      if (destination != null)
        msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATION, null, msgs);
      if (newDestination != null)
        msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATION, null, msgs);
      msgs = basicSetDestination(newDestination, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATION, newDestination, newDestination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getDestinationlist()
  {
    return destinationlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestinationlist(ExpressionList newDestinationlist, NotificationChain msgs)
  {
    ExpressionList oldDestinationlist = destinationlist;
    destinationlist = newDestinationlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST, oldDestinationlist, newDestinationlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestinationlist(ExpressionList newDestinationlist)
  {
    if (newDestinationlist != destinationlist)
    {
      NotificationChain msgs = null;
      if (destinationlist != null)
        msgs = ((InternalEObject)destinationlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST, null, msgs);
      if (newDestinationlist != null)
        msgs = ((InternalEObject)newDestinationlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST, null, msgs);
      msgs = basicSetDestinationlist(newDestinationlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST, newDestinationlist, newDestinationlist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionBlock getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(ConditionBlock newCondition, NotificationChain msgs)
  {
    ConditionBlock oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(ConditionBlock newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteBlock getDiscrete()
  {
    return discrete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiscrete(DiscreteBlock newDiscrete, NotificationChain msgs)
  {
    DiscreteBlock oldDiscrete = discrete;
    discrete = newDiscrete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__DISCRETE, oldDiscrete, newDiscrete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiscrete(DiscreteBlock newDiscrete)
  {
    if (newDiscrete != discrete)
    {
      NotificationChain msgs = null;
      if (discrete != null)
        msgs = ((InternalEObject)discrete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__DISCRETE, null, msgs);
      if (newDiscrete != null)
        msgs = ((InternalEObject)newDiscrete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.CONTROL_SWITCH_COMPOSITION__DISCRETE, null, msgs);
      msgs = basicSetDiscrete(newDiscrete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONTROL_SWITCH_COMPOSITION__DISCRETE, newDiscrete, newDiscrete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCE:
        return basicSetSource(null, msgs);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCELIST:
        return basicSetSourcelist(null, msgs);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__ACTION:
        return basicSetAction(null, msgs);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATION:
        return basicSetDestination(null, msgs);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST:
        return basicSetDestinationlist(null, msgs);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__CONDITION:
        return basicSetCondition(null, msgs);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DISCRETE:
        return basicSetDiscrete(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__ID:
        return getId();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SYNC:
        return getSync();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__RECEV:
        return getRecev();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SEND:
        return getSend();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCE:
        return getSource();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCELIST:
        return getSourcelist();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__ACTION:
        return getAction();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATION:
        return getDestination();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST:
        return getDestinationlist();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__CONDITION:
        return getCondition();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DISCRETE:
        return getDiscrete();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__ID:
        setId((String)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SYNC:
        setSync((String)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__RECEV:
        setRecev((String)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SEND:
        setSend((String)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCE:
        setSource((Expression)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCELIST:
        setSourcelist((ExpressionList)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__ACTION:
        setAction((Expression)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATION:
        setDestination((Expression)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST:
        setDestinationlist((ExpressionList)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__CONDITION:
        setCondition((ConditionBlock)newValue);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DISCRETE:
        setDiscrete((DiscreteBlock)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__ID:
        setId(ID_EDEFAULT);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SYNC:
        setSync(SYNC_EDEFAULT);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__RECEV:
        setRecev(RECEV_EDEFAULT);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SEND:
        setSend(SEND_EDEFAULT);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCE:
        setSource((Expression)null);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCELIST:
        setSourcelist((ExpressionList)null);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__ACTION:
        setAction((Expression)null);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATION:
        setDestination((Expression)null);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST:
        setDestinationlist((ExpressionList)null);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__CONDITION:
        setCondition((ConditionBlock)null);
        return;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DISCRETE:
        setDiscrete((DiscreteBlock)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SYNC:
        return SYNC_EDEFAULT == null ? sync != null : !SYNC_EDEFAULT.equals(sync);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__RECEV:
        return RECEV_EDEFAULT == null ? recev != null : !RECEV_EDEFAULT.equals(recev);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SEND:
        return SEND_EDEFAULT == null ? send != null : !SEND_EDEFAULT.equals(send);
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCE:
        return source != null;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__SOURCELIST:
        return sourcelist != null;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__ACTION:
        return action != null;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATION:
        return destination != null;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST:
        return destinationlist != null;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__CONDITION:
        return condition != null;
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION__DISCRETE:
        return discrete != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", sync: ");
    result.append(sync);
    result.append(", recev: ");
    result.append(recev);
    result.append(", send: ");
    result.append(send);
    result.append(')');
    return result.toString();
  }

} //ControlSwitchCompositionImpl
