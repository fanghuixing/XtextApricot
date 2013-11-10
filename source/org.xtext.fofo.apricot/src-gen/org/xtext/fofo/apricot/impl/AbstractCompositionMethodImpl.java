/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fofo.apricot.AbstractCompositionMethod;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.RequiresAbstractComposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Composition Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.AbstractCompositionMethodImpl#getRac <em>Rac</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractCompositionMethodImpl extends AbstractMethodImpl implements AbstractCompositionMethod
{
  /**
   * The cached value of the '{@link #getRac() <em>Rac</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRac()
   * @generated
   * @ordered
   */
  protected RequiresAbstractComposition rac;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractCompositionMethodImpl()
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
    return ApricotPackage.Literals.ABSTRACT_COMPOSITION_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiresAbstractComposition getRac()
  {
    return rac;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRac(RequiresAbstractComposition newRac, NotificationChain msgs)
  {
    RequiresAbstractComposition oldRac = rac;
    rac = newRac;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_COMPOSITION_METHOD__RAC, oldRac, newRac);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRac(RequiresAbstractComposition newRac)
  {
    if (newRac != rac)
    {
      NotificationChain msgs = null;
      if (rac != null)
        msgs = ((InternalEObject)rac).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.ABSTRACT_COMPOSITION_METHOD__RAC, null, msgs);
      if (newRac != null)
        msgs = ((InternalEObject)newRac).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.ABSTRACT_COMPOSITION_METHOD__RAC, null, msgs);
      msgs = basicSetRac(newRac, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_COMPOSITION_METHOD__RAC, newRac, newRac));
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
      case ApricotPackage.ABSTRACT_COMPOSITION_METHOD__RAC:
        return basicSetRac(null, msgs);
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
      case ApricotPackage.ABSTRACT_COMPOSITION_METHOD__RAC:
        return getRac();
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
      case ApricotPackage.ABSTRACT_COMPOSITION_METHOD__RAC:
        setRac((RequiresAbstractComposition)newValue);
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
      case ApricotPackage.ABSTRACT_COMPOSITION_METHOD__RAC:
        setRac((RequiresAbstractComposition)null);
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
      case ApricotPackage.ABSTRACT_COMPOSITION_METHOD__RAC:
        return rac != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractCompositionMethodImpl
