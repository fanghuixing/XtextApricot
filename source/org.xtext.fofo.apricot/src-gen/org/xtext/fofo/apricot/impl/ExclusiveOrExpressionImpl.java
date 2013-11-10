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
import org.xtext.fofo.apricot.ExclusiveOrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusive Or Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.ExclusiveOrExpressionImpl#getEqualityexpression <em>Equalityexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExclusiveOrExpressionImpl extends MinimalEObjectImpl.Container implements ExclusiveOrExpression
{
  /**
   * The cached value of the '{@link #getEqualityexpression() <em>Equalityexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqualityexpression()
   * @generated
   * @ordered
   */
  protected EList<EqualityExpression> equalityexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExclusiveOrExpressionImpl()
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
    return ApricotPackage.Literals.EXCLUSIVE_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EqualityExpression> getEqualityexpression()
  {
    if (equalityexpression == null)
    {
      equalityexpression = new EObjectContainmentEList<EqualityExpression>(EqualityExpression.class, this, ApricotPackage.EXCLUSIVE_OR_EXPRESSION__EQUALITYEXPRESSION);
    }
    return equalityexpression;
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
      case ApricotPackage.EXCLUSIVE_OR_EXPRESSION__EQUALITYEXPRESSION:
        return ((InternalEList<?>)getEqualityexpression()).basicRemove(otherEnd, msgs);
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
      case ApricotPackage.EXCLUSIVE_OR_EXPRESSION__EQUALITYEXPRESSION:
        return getEqualityexpression();
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
      case ApricotPackage.EXCLUSIVE_OR_EXPRESSION__EQUALITYEXPRESSION:
        getEqualityexpression().clear();
        getEqualityexpression().addAll((Collection<? extends EqualityExpression>)newValue);
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
      case ApricotPackage.EXCLUSIVE_OR_EXPRESSION__EQUALITYEXPRESSION:
        getEqualityexpression().clear();
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
      case ApricotPackage.EXCLUSIVE_OR_EXPRESSION__EQUALITYEXPRESSION:
        return equalityexpression != null && !equalityexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExclusiveOrExpressionImpl
