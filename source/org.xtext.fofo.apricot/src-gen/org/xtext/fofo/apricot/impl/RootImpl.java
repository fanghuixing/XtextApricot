/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fofo.apricot.AdditiveExpression;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.Root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.RootImpl#getBuiltInName <em>Built In Name</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.RootImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.RootImpl#getE2 <em>E2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends Built_In_MethodsImpl implements Root
{
  /**
   * The default value of the '{@link #getBuiltInName() <em>Built In Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltInName()
   * @generated
   * @ordered
   */
  protected static final String BUILT_IN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuiltInName() <em>Built In Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltInName()
   * @generated
   * @ordered
   */
  protected String builtInName = BUILT_IN_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getE1() <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE1()
   * @generated
   * @ordered
   */
  protected AdditiveExpression e1;

  /**
   * The cached value of the '{@link #getE2() <em>E2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE2()
   * @generated
   * @ordered
   */
  protected AdditiveExpression e2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RootImpl()
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
    return ApricotPackage.Literals.ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuiltInName()
  {
    return builtInName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuiltInName(String newBuiltInName)
  {
    String oldBuiltInName = builtInName;
    builtInName = newBuiltInName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ROOT__BUILT_IN_NAME, oldBuiltInName, builtInName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression getE1()
  {
    return e1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE1(AdditiveExpression newE1, NotificationChain msgs)
  {
    AdditiveExpression oldE1 = e1;
    e1 = newE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.ROOT__E1, oldE1, newE1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE1(AdditiveExpression newE1)
  {
    if (newE1 != e1)
    {
      NotificationChain msgs = null;
      if (e1 != null)
        msgs = ((InternalEObject)e1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.ROOT__E1, null, msgs);
      if (newE1 != null)
        msgs = ((InternalEObject)newE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.ROOT__E1, null, msgs);
      msgs = basicSetE1(newE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ROOT__E1, newE1, newE1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression getE2()
  {
    return e2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE2(AdditiveExpression newE2, NotificationChain msgs)
  {
    AdditiveExpression oldE2 = e2;
    e2 = newE2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.ROOT__E2, oldE2, newE2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE2(AdditiveExpression newE2)
  {
    if (newE2 != e2)
    {
      NotificationChain msgs = null;
      if (e2 != null)
        msgs = ((InternalEObject)e2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.ROOT__E2, null, msgs);
      if (newE2 != null)
        msgs = ((InternalEObject)newE2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.ROOT__E2, null, msgs);
      msgs = basicSetE2(newE2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ROOT__E2, newE2, newE2));
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
      case ApricotPackage.ROOT__E1:
        return basicSetE1(null, msgs);
      case ApricotPackage.ROOT__E2:
        return basicSetE2(null, msgs);
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
      case ApricotPackage.ROOT__BUILT_IN_NAME:
        return getBuiltInName();
      case ApricotPackage.ROOT__E1:
        return getE1();
      case ApricotPackage.ROOT__E2:
        return getE2();
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
      case ApricotPackage.ROOT__BUILT_IN_NAME:
        setBuiltInName((String)newValue);
        return;
      case ApricotPackage.ROOT__E1:
        setE1((AdditiveExpression)newValue);
        return;
      case ApricotPackage.ROOT__E2:
        setE2((AdditiveExpression)newValue);
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
      case ApricotPackage.ROOT__BUILT_IN_NAME:
        setBuiltInName(BUILT_IN_NAME_EDEFAULT);
        return;
      case ApricotPackage.ROOT__E1:
        setE1((AdditiveExpression)null);
        return;
      case ApricotPackage.ROOT__E2:
        setE2((AdditiveExpression)null);
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
      case ApricotPackage.ROOT__BUILT_IN_NAME:
        return BUILT_IN_NAME_EDEFAULT == null ? builtInName != null : !BUILT_IN_NAME_EDEFAULT.equals(builtInName);
      case ApricotPackage.ROOT__E1:
        return e1 != null;
      case ApricotPackage.ROOT__E2:
        return e2 != null;
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
    result.append(" (BuiltInName: ");
    result.append(builtInName);
    result.append(')');
    return result.toString();
  }

} //RootImpl
