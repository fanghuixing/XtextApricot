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

import org.xtext.fofo.apricot.AdditiveExpression;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.MultiplicativeExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.AdditiveExpressionImpl#getMultiplicativeexpression <em>Multiplicativeexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditiveExpressionImpl extends MinimalEObjectImpl.Container implements AdditiveExpression
{
  /**
   * The cached value of the '{@link #getMultiplicativeexpression() <em>Multiplicativeexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicativeexpression()
   * @generated
   * @ordered
   */
  protected EList<MultiplicativeExpression> multiplicativeexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdditiveExpressionImpl()
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
    return ApricotPackage.Literals.ADDITIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MultiplicativeExpression> getMultiplicativeexpression()
  {
    if (multiplicativeexpression == null)
    {
      multiplicativeexpression = new EObjectContainmentEList<MultiplicativeExpression>(MultiplicativeExpression.class, this, ApricotPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION);
    }
    return multiplicativeexpression;
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
      case ApricotPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        return ((InternalEList<?>)getMultiplicativeexpression()).basicRemove(otherEnd, msgs);
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
      case ApricotPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        return getMultiplicativeexpression();
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
      case ApricotPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        getMultiplicativeexpression().clear();
        getMultiplicativeexpression().addAll((Collection<? extends MultiplicativeExpression>)newValue);
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
      case ApricotPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        getMultiplicativeexpression().clear();
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
      case ApricotPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION:
        return multiplicativeexpression != null && !multiplicativeexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AdditiveExpressionImpl
