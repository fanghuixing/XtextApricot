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
import org.xtext.fofo.apricot.ConditionalAndExpression;
import org.xtext.fofo.apricot.ExclusiveOrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional And Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.ConditionalAndExpressionImpl#getExclusiveorexpression <em>Exclusiveorexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalAndExpressionImpl extends MinimalEObjectImpl.Container implements ConditionalAndExpression
{
  /**
   * The cached value of the '{@link #getExclusiveorexpression() <em>Exclusiveorexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusiveorexpression()
   * @generated
   * @ordered
   */
  protected EList<ExclusiveOrExpression> exclusiveorexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalAndExpressionImpl()
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
    return ApricotPackage.Literals.CONDITIONAL_AND_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExclusiveOrExpression> getExclusiveorexpression()
  {
    if (exclusiveorexpression == null)
    {
      exclusiveorexpression = new EObjectContainmentEList<ExclusiveOrExpression>(ExclusiveOrExpression.class, this, ApricotPackage.CONDITIONAL_AND_EXPRESSION__EXCLUSIVEOREXPRESSION);
    }
    return exclusiveorexpression;
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
      case ApricotPackage.CONDITIONAL_AND_EXPRESSION__EXCLUSIVEOREXPRESSION:
        return ((InternalEList<?>)getExclusiveorexpression()).basicRemove(otherEnd, msgs);
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
      case ApricotPackage.CONDITIONAL_AND_EXPRESSION__EXCLUSIVEOREXPRESSION:
        return getExclusiveorexpression();
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
      case ApricotPackage.CONDITIONAL_AND_EXPRESSION__EXCLUSIVEOREXPRESSION:
        getExclusiveorexpression().clear();
        getExclusiveorexpression().addAll((Collection<? extends ExclusiveOrExpression>)newValue);
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
      case ApricotPackage.CONDITIONAL_AND_EXPRESSION__EXCLUSIVEOREXPRESSION:
        getExclusiveorexpression().clear();
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
      case ApricotPackage.CONDITIONAL_AND_EXPRESSION__EXCLUSIVEOREXPRESSION:
        return exclusiveorexpression != null && !exclusiveorexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionalAndExpressionImpl
