/**
 */
package org.xtext.fofo.apricot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.fofo.apricot.AdditiveExpression;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.RelationalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.RelationalExpressionImpl#getAdditiveexpression <em>Additiveexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.RelationalExpressionImpl#getRelationalop <em>Relationalop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalExpressionImpl extends MinimalEObjectImpl.Container implements RelationalExpression
{
  /**
   * The cached value of the '{@link #getAdditiveexpression() <em>Additiveexpression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditiveexpression()
   * @generated
   * @ordered
   */
  protected EList<AdditiveExpression> additiveexpression;

  /**
   * The cached value of the '{@link #getRelationalop() <em>Relationalop</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationalop()
   * @generated
   * @ordered
   */
  protected EList<String> relationalop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationalExpressionImpl()
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
    return ApricotPackage.Literals.RELATIONAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AdditiveExpression> getAdditiveexpression()
  {
    if (additiveexpression == null)
    {
      additiveexpression = new EObjectContainmentEList<AdditiveExpression>(AdditiveExpression.class, this, ApricotPackage.RELATIONAL_EXPRESSION__ADDITIVEEXPRESSION);
    }
    return additiveexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRelationalop()
  {
    if (relationalop == null)
    {
      relationalop = new EDataTypeEList<String>(String.class, this, ApricotPackage.RELATIONAL_EXPRESSION__RELATIONALOP);
    }
    return relationalop;
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
      case ApricotPackage.RELATIONAL_EXPRESSION__ADDITIVEEXPRESSION:
        return ((InternalEList<?>)getAdditiveexpression()).basicRemove(otherEnd, msgs);
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
      case ApricotPackage.RELATIONAL_EXPRESSION__ADDITIVEEXPRESSION:
        return getAdditiveexpression();
      case ApricotPackage.RELATIONAL_EXPRESSION__RELATIONALOP:
        return getRelationalop();
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
      case ApricotPackage.RELATIONAL_EXPRESSION__ADDITIVEEXPRESSION:
        getAdditiveexpression().clear();
        getAdditiveexpression().addAll((Collection<? extends AdditiveExpression>)newValue);
        return;
      case ApricotPackage.RELATIONAL_EXPRESSION__RELATIONALOP:
        getRelationalop().clear();
        getRelationalop().addAll((Collection<? extends String>)newValue);
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
      case ApricotPackage.RELATIONAL_EXPRESSION__ADDITIVEEXPRESSION:
        getAdditiveexpression().clear();
        return;
      case ApricotPackage.RELATIONAL_EXPRESSION__RELATIONALOP:
        getRelationalop().clear();
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
      case ApricotPackage.RELATIONAL_EXPRESSION__ADDITIVEEXPRESSION:
        return additiveexpression != null && !additiveexpression.isEmpty();
      case ApricotPackage.RELATIONAL_EXPRESSION__RELATIONALOP:
        return relationalop != null && !relationalop.isEmpty();
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
    result.append(" (relationalop: ");
    result.append(relationalop);
    result.append(')');
    return result.toString();
  }

} //RelationalExpressionImpl
