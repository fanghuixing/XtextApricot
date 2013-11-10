/**
 */
package org.xtext.fofo.apricot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.ContinuousMethod;
import org.xtext.fofo.apricot.DifferentialEquation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.ContinuousMethodImpl#getDES <em>DES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuousMethodImpl extends MemberImpl implements ContinuousMethod
{
  /**
   * The cached value of the '{@link #getDES() <em>DES</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDES()
   * @generated
   * @ordered
   */
  protected EList<DifferentialEquation> des;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContinuousMethodImpl()
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
    return ApricotPackage.Literals.CONTINUOUS_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DifferentialEquation> getDES()
  {
    if (des == null)
    {
      des = new EObjectContainmentEList<DifferentialEquation>(DifferentialEquation.class, this, ApricotPackage.CONTINUOUS_METHOD__DES);
    }
    return des;
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
      case ApricotPackage.CONTINUOUS_METHOD__DES:
        return ((InternalEList<?>)getDES()).basicRemove(otherEnd, msgs);
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
      case ApricotPackage.CONTINUOUS_METHOD__DES:
        return getDES();
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
      case ApricotPackage.CONTINUOUS_METHOD__DES:
        getDES().clear();
        getDES().addAll((Collection<? extends DifferentialEquation>)newValue);
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
      case ApricotPackage.CONTINUOUS_METHOD__DES:
        getDES().clear();
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
      case ApricotPackage.CONTINUOUS_METHOD__DES:
        return des != null && !des.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ContinuousMethodImpl
