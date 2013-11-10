/**
 */
package org.xtext.fofo.apricot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.EqualityExpression;
import org.xtext.fofo.apricot.InstanceOfExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equality Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.EqualityExpressionImpl#getInstanceofexpression <em>Instanceofexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EqualityExpressionImpl extends MinimalEObjectImpl.Container implements EqualityExpression
{
  /**
   * The cached value of the '{@link #getInstanceofexpression() <em>Instanceofexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstanceofexpression()
   * @generated
   * @ordered
   */
  protected EList<InstanceOfExpression> instanceofexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EqualityExpressionImpl()
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
    return ApricotPackage.Literals.EQUALITY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InstanceOfExpression> getInstanceofexpression()
  {
    if (instanceofexpression == null)
    {
      instanceofexpression = new EObjectContainmentEList<InstanceOfExpression>(InstanceOfExpression.class, this, ApricotPackage.EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION);
    }
    return instanceofexpression;
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
      case ApricotPackage.EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION:
        return ((InternalEList<?>)getInstanceofexpression()).basicRemove(otherEnd, msgs);
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
      case ApricotPackage.EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION:
        return getInstanceofexpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ApricotPackage.EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION:
        getInstanceofexpression().clear();
        getInstanceofexpression().addAll((Collection<? extends InstanceOfExpression>)newValue);
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
      case ApricotPackage.EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION:
        getInstanceofexpression().clear();
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
      case ApricotPackage.EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION:
        return instanceofexpression != null && !instanceofexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EqualityExpressionImpl
