/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.fofo.apricot.AdditiveExpression;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.DE_LHS;
import org.xtext.fofo.apricot.DifferentialEquation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Differential Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.DifferentialEquationImpl#getLHS <em>LHS</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.DifferentialEquationImpl#getRHS <em>RHS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DifferentialEquationImpl extends MinimalEObjectImpl.Container implements DifferentialEquation
{
  /**
   * The cached value of the '{@link #getLHS() <em>LHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLHS()
   * @generated
   * @ordered
   */
  protected DE_LHS lhs;

  /**
   * The cached value of the '{@link #getRHS() <em>RHS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRHS()
   * @generated
   * @ordered
   */
  protected AdditiveExpression rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DifferentialEquationImpl()
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
    return ApricotPackage.Literals.DIFFERENTIAL_EQUATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DE_LHS getLHS()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLHS(DE_LHS newLHS, NotificationChain msgs)
  {
    DE_LHS oldLHS = lhs;
    lhs = newLHS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.DIFFERENTIAL_EQUATION__LHS, oldLHS, newLHS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLHS(DE_LHS newLHS)
  {
    if (newLHS != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.DIFFERENTIAL_EQUATION__LHS, null, msgs);
      if (newLHS != null)
        msgs = ((InternalEObject)newLHS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.DIFFERENTIAL_EQUATION__LHS, null, msgs);
      msgs = basicSetLHS(newLHS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.DIFFERENTIAL_EQUATION__LHS, newLHS, newLHS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression getRHS()
  {
    return rhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRHS(AdditiveExpression newRHS, NotificationChain msgs)
  {
    AdditiveExpression oldRHS = rhs;
    rhs = newRHS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.DIFFERENTIAL_EQUATION__RHS, oldRHS, newRHS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRHS(AdditiveExpression newRHS)
  {
    if (newRHS != rhs)
    {
      NotificationChain msgs = null;
      if (rhs != null)
        msgs = ((InternalEObject)rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.DIFFERENTIAL_EQUATION__RHS, null, msgs);
      if (newRHS != null)
        msgs = ((InternalEObject)newRHS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.DIFFERENTIAL_EQUATION__RHS, null, msgs);
      msgs = basicSetRHS(newRHS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.DIFFERENTIAL_EQUATION__RHS, newRHS, newRHS));
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
      case ApricotPackage.DIFFERENTIAL_EQUATION__LHS:
        return basicSetLHS(null, msgs);
      case ApricotPackage.DIFFERENTIAL_EQUATION__RHS:
        return basicSetRHS(null, msgs);
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
      case ApricotPackage.DIFFERENTIAL_EQUATION__LHS:
        return getLHS();
      case ApricotPackage.DIFFERENTIAL_EQUATION__RHS:
        return getRHS();
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
      case ApricotPackage.DIFFERENTIAL_EQUATION__LHS:
        setLHS((DE_LHS)newValue);
        return;
      case ApricotPackage.DIFFERENTIAL_EQUATION__RHS:
        setRHS((AdditiveExpression)newValue);
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
      case ApricotPackage.DIFFERENTIAL_EQUATION__LHS:
        setLHS((DE_LHS)null);
        return;
      case ApricotPackage.DIFFERENTIAL_EQUATION__RHS:
        setRHS((AdditiveExpression)null);
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
      case ApricotPackage.DIFFERENTIAL_EQUATION__LHS:
        return lhs != null;
      case ApricotPackage.DIFFERENTIAL_EQUATION__RHS:
        return rhs != null;
    }
    return super.eIsSet(featureID);
  }

} //DifferentialEquationImpl
