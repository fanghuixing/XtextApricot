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
import org.xtext.fofo.apricot.EnhancedForControl;
import org.xtext.fofo.apricot.Expression;
import org.xtext.fofo.apricot.ForControl;
import org.xtext.fofo.apricot.ForInit;
import org.xtext.fofo.apricot.ForUpdate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.ForControlImpl#getEnhancedforcontrol <em>Enhancedforcontrol</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ForControlImpl#getForinit <em>Forinit</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ForControlImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ForControlImpl#getForupdate <em>Forupdate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForControlImpl extends MinimalEObjectImpl.Container implements ForControl
{
  /**
   * The cached value of the '{@link #getEnhancedforcontrol() <em>Enhancedforcontrol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnhancedforcontrol()
   * @generated
   * @ordered
   */
  protected EnhancedForControl enhancedforcontrol;

  /**
   * The cached value of the '{@link #getForinit() <em>Forinit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForinit()
   * @generated
   * @ordered
   */
  protected ForInit forinit;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getForupdate() <em>Forupdate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForupdate()
   * @generated
   * @ordered
   */
  protected ForUpdate forupdate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForControlImpl()
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
    return ApricotPackage.Literals.FOR_CONTROL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnhancedForControl getEnhancedforcontrol()
  {
    return enhancedforcontrol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnhancedforcontrol(EnhancedForControl newEnhancedforcontrol, NotificationChain msgs)
  {
    EnhancedForControl oldEnhancedforcontrol = enhancedforcontrol;
    enhancedforcontrol = newEnhancedforcontrol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.FOR_CONTROL__ENHANCEDFORCONTROL, oldEnhancedforcontrol, newEnhancedforcontrol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnhancedforcontrol(EnhancedForControl newEnhancedforcontrol)
  {
    if (newEnhancedforcontrol != enhancedforcontrol)
    {
      NotificationChain msgs = null;
      if (enhancedforcontrol != null)
        msgs = ((InternalEObject)enhancedforcontrol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.FOR_CONTROL__ENHANCEDFORCONTROL, null, msgs);
      if (newEnhancedforcontrol != null)
        msgs = ((InternalEObject)newEnhancedforcontrol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.FOR_CONTROL__ENHANCEDFORCONTROL, null, msgs);
      msgs = basicSetEnhancedforcontrol(newEnhancedforcontrol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.FOR_CONTROL__ENHANCEDFORCONTROL, newEnhancedforcontrol, newEnhancedforcontrol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForInit getForinit()
  {
    return forinit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForinit(ForInit newForinit, NotificationChain msgs)
  {
    ForInit oldForinit = forinit;
    forinit = newForinit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.FOR_CONTROL__FORINIT, oldForinit, newForinit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForinit(ForInit newForinit)
  {
    if (newForinit != forinit)
    {
      NotificationChain msgs = null;
      if (forinit != null)
        msgs = ((InternalEObject)forinit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.FOR_CONTROL__FORINIT, null, msgs);
      if (newForinit != null)
        msgs = ((InternalEObject)newForinit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.FOR_CONTROL__FORINIT, null, msgs);
      msgs = basicSetForinit(newForinit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.FOR_CONTROL__FORINIT, newForinit, newForinit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.FOR_CONTROL__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.FOR_CONTROL__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.FOR_CONTROL__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.FOR_CONTROL__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForUpdate getForupdate()
  {
    return forupdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForupdate(ForUpdate newForupdate, NotificationChain msgs)
  {
    ForUpdate oldForupdate = forupdate;
    forupdate = newForupdate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.FOR_CONTROL__FORUPDATE, oldForupdate, newForupdate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForupdate(ForUpdate newForupdate)
  {
    if (newForupdate != forupdate)
    {
      NotificationChain msgs = null;
      if (forupdate != null)
        msgs = ((InternalEObject)forupdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.FOR_CONTROL__FORUPDATE, null, msgs);
      if (newForupdate != null)
        msgs = ((InternalEObject)newForupdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.FOR_CONTROL__FORUPDATE, null, msgs);
      msgs = basicSetForupdate(newForupdate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.FOR_CONTROL__FORUPDATE, newForupdate, newForupdate));
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
      case ApricotPackage.FOR_CONTROL__ENHANCEDFORCONTROL:
        return basicSetEnhancedforcontrol(null, msgs);
      case ApricotPackage.FOR_CONTROL__FORINIT:
        return basicSetForinit(null, msgs);
      case ApricotPackage.FOR_CONTROL__EXPRESSION:
        return basicSetExpression(null, msgs);
      case ApricotPackage.FOR_CONTROL__FORUPDATE:
        return basicSetForupdate(null, msgs);
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
      case ApricotPackage.FOR_CONTROL__ENHANCEDFORCONTROL:
        return getEnhancedforcontrol();
      case ApricotPackage.FOR_CONTROL__FORINIT:
        return getForinit();
      case ApricotPackage.FOR_CONTROL__EXPRESSION:
        return getExpression();
      case ApricotPackage.FOR_CONTROL__FORUPDATE:
        return getForupdate();
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
      case ApricotPackage.FOR_CONTROL__ENHANCEDFORCONTROL:
        setEnhancedforcontrol((EnhancedForControl)newValue);
        return;
      case ApricotPackage.FOR_CONTROL__FORINIT:
        setForinit((ForInit)newValue);
        return;
      case ApricotPackage.FOR_CONTROL__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case ApricotPackage.FOR_CONTROL__FORUPDATE:
        setForupdate((ForUpdate)newValue);
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
      case ApricotPackage.FOR_CONTROL__ENHANCEDFORCONTROL:
        setEnhancedforcontrol((EnhancedForControl)null);
        return;
      case ApricotPackage.FOR_CONTROL__FORINIT:
        setForinit((ForInit)null);
        return;
      case ApricotPackage.FOR_CONTROL__EXPRESSION:
        setExpression((Expression)null);
        return;
      case ApricotPackage.FOR_CONTROL__FORUPDATE:
        setForupdate((ForUpdate)null);
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
      case ApricotPackage.FOR_CONTROL__ENHANCEDFORCONTROL:
        return enhancedforcontrol != null;
      case ApricotPackage.FOR_CONTROL__FORINIT:
        return forinit != null;
      case ApricotPackage.FOR_CONTROL__EXPRESSION:
        return expression != null;
      case ApricotPackage.FOR_CONTROL__FORUPDATE:
        return forupdate != null;
    }
    return super.eIsSet(featureID);
  }

} //ForControlImpl
