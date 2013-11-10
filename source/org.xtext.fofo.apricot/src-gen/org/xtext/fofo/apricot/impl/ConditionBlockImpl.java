/**
 */
package org.xtext.fofo.apricot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.ConditionBlock;
import org.xtext.fofo.apricot.ConditionalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.ConditionBlockImpl#getBuiltInName <em>Built In Name</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ConditionBlockImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionBlockImpl extends MinimalEObjectImpl.Container implements ConditionBlock
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
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected EList<ConditionalExpression> conditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionBlockImpl()
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
    return ApricotPackage.Literals.CONDITION_BLOCK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CONDITION_BLOCK__BUILT_IN_NAME, oldBuiltInName, builtInName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConditionalExpression> getConditions()
  {
    if (conditions == null)
    {
      conditions = new EObjectContainmentEList<ConditionalExpression>(ConditionalExpression.class, this, ApricotPackage.CONDITION_BLOCK__CONDITIONS);
    }
    return conditions;
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
      case ApricotPackage.CONDITION_BLOCK__CONDITIONS:
        return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
      case ApricotPackage.CONDITION_BLOCK__BUILT_IN_NAME:
        return getBuiltInName();
      case ApricotPackage.CONDITION_BLOCK__CONDITIONS:
        return getConditions();
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
      case ApricotPackage.CONDITION_BLOCK__BUILT_IN_NAME:
        setBuiltInName((String)newValue);
        return;
      case ApricotPackage.CONDITION_BLOCK__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends ConditionalExpression>)newValue);
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
      case ApricotPackage.CONDITION_BLOCK__BUILT_IN_NAME:
        setBuiltInName(BUILT_IN_NAME_EDEFAULT);
        return;
      case ApricotPackage.CONDITION_BLOCK__CONDITIONS:
        getConditions().clear();
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
      case ApricotPackage.CONDITION_BLOCK__BUILT_IN_NAME:
        return BUILT_IN_NAME_EDEFAULT == null ? builtInName != null : !BUILT_IN_NAME_EDEFAULT.equals(builtInName);
      case ApricotPackage.CONDITION_BLOCK__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
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

} //ConditionBlockImpl
