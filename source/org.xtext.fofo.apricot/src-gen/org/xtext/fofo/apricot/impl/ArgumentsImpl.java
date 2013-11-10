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
import org.xtext.fofo.apricot.Arguments;
import org.xtext.fofo.apricot.ExpressionList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arguments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.ArgumentsImpl#getExpressionlist <em>Expressionlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentsImpl extends MinimalEObjectImpl.Container implements Arguments
{
  /**
   * The cached value of the '{@link #getExpressionlist() <em>Expressionlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionlist()
   * @generated
   * @ordered
   */
  protected ExpressionList expressionlist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentsImpl()
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
    return ApricotPackage.Literals.ARGUMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getExpressionlist()
  {
    return expressionlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionlist(ExpressionList newExpressionlist, NotificationChain msgs)
  {
    ExpressionList oldExpressionlist = expressionlist;
    expressionlist = newExpressionlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.ARGUMENTS__EXPRESSIONLIST, oldExpressionlist, newExpressionlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionlist(ExpressionList newExpressionlist)
  {
    if (newExpressionlist != expressionlist)
    {
      NotificationChain msgs = null;
      if (expressionlist != null)
        msgs = ((InternalEObject)expressionlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.ARGUMENTS__EXPRESSIONLIST, null, msgs);
      if (newExpressionlist != null)
        msgs = ((InternalEObject)newExpressionlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.ARGUMENTS__EXPRESSIONLIST, null, msgs);
      msgs = basicSetExpressionlist(newExpressionlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ARGUMENTS__EXPRESSIONLIST, newExpressionlist, newExpressionlist));
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
      case ApricotPackage.ARGUMENTS__EXPRESSIONLIST:
        return basicSetExpressionlist(null, msgs);
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
      case ApricotPackage.ARGUMENTS__EXPRESSIONLIST:
        return getExpressionlist();
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
      case ApricotPackage.ARGUMENTS__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)newValue);
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
      case ApricotPackage.ARGUMENTS__EXPRESSIONLIST:
        setExpressionlist((ExpressionList)null);
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
      case ApricotPackage.ARGUMENTS__EXPRESSIONLIST:
        return expressionlist != null;
    }
    return super.eIsSet(featureID);
  }

} //ArgumentsImpl
