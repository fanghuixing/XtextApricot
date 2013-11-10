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
import org.xtext.fofo.apricot.ConditionalOrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Or Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.ConditionalOrExpressionImpl#getConditionalandexpression <em>Conditionalandexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalOrExpressionImpl extends MinimalEObjectImpl.Container implements ConditionalOrExpression
{
  /**
   * The cached value of the '{@link #getConditionalandexpression() <em>Conditionalandexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalandexpression()
   * @generated
   * @ordered
   */
  protected EList<ConditionalAndExpression> conditionalandexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionalOrExpressionImpl()
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
    return ApricotPackage.Literals.CONDITIONAL_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionalAndExpression> getConditionalandexpression()
  {
    if (conditionalandexpression == null)
    {
      conditionalandexpression = new EObjectContainmentEList<ConditionalAndExpression>(ConditionalAndExpression.class, this, ApricotPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION);
    }
    return conditionalandexpression;
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
      case ApricotPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        return ((InternalEList<?>)getConditionalandexpression()).basicRemove(otherEnd, msgs);
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
      case ApricotPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        return getConditionalandexpression();
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
      case ApricotPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        getConditionalandexpression().clear();
        getConditionalandexpression().addAll((Collection<? extends ConditionalAndExpression>)newValue);
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
      case ApricotPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        getConditionalandexpression().clear();
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
      case ApricotPackage.CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION:
        return conditionalandexpression != null && !conditionalandexpression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConditionalOrExpressionImpl
