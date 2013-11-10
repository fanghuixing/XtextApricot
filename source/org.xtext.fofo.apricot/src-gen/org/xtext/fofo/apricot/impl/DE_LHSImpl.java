/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.DE_LHS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DE LHS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.DE_LHSImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.DE_LHSImpl#getVar2 <em>Var2</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.DE_LHSImpl#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DE_LHSImpl extends Built_In_MethodsImpl implements DE_LHS
{
  /**
   * The default value of the '{@link #getVar1() <em>Var1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected static final String VAR1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar1() <em>Var1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected String var1 = VAR1_EDEFAULT;

  /**
   * The default value of the '{@link #getVar2() <em>Var2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected static final String VAR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar2() <em>Var2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected String var2 = VAR2_EDEFAULT;

  /**
   * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected static final String ORDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected String order = ORDER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DE_LHSImpl()
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
    return ApricotPackage.Literals.DE_LHS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar1()
  {
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar1(String newVar1)
  {
    String oldVar1 = var1;
    var1 = newVar1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.DE_LHS__VAR1, oldVar1, var1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVar2()
  {
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar2(String newVar2)
  {
    String oldVar2 = var2;
    var2 = newVar2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.DE_LHS__VAR2, oldVar2, var2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrder(String newOrder)
  {
    String oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.DE_LHS__ORDER, oldOrder, order));
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
      case ApricotPackage.DE_LHS__VAR1:
        return getVar1();
      case ApricotPackage.DE_LHS__VAR2:
        return getVar2();
      case ApricotPackage.DE_LHS__ORDER:
        return getOrder();
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
      case ApricotPackage.DE_LHS__VAR1:
        setVar1((String)newValue);
        return;
      case ApricotPackage.DE_LHS__VAR2:
        setVar2((String)newValue);
        return;
      case ApricotPackage.DE_LHS__ORDER:
        setOrder((String)newValue);
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
      case ApricotPackage.DE_LHS__VAR1:
        setVar1(VAR1_EDEFAULT);
        return;
      case ApricotPackage.DE_LHS__VAR2:
        setVar2(VAR2_EDEFAULT);
        return;
      case ApricotPackage.DE_LHS__ORDER:
        setOrder(ORDER_EDEFAULT);
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
      case ApricotPackage.DE_LHS__VAR1:
        return VAR1_EDEFAULT == null ? var1 != null : !VAR1_EDEFAULT.equals(var1);
      case ApricotPackage.DE_LHS__VAR2:
        return VAR2_EDEFAULT == null ? var2 != null : !VAR2_EDEFAULT.equals(var2);
      case ApricotPackage.DE_LHS__ORDER:
        return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
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
    result.append(" (var1: ");
    result.append(var1);
    result.append(", var2: ");
    result.append(var2);
    result.append(", order: ");
    result.append(order);
    result.append(')');
    return result.toString();
  }

} //DE_LHSImpl
