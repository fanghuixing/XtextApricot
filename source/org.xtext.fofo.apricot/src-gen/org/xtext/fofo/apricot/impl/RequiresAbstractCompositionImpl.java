/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fofo.apricot.AbstractDynamicSwitch;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.RequiresAbstractComposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires Abstract Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.RequiresAbstractCompositionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.RequiresAbstractCompositionImpl#getAbstract_dynamic_switch <em>Abstract dynamic switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiresAbstractCompositionImpl extends AbstractMethodBodyImpl implements RequiresAbstractComposition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAbstract_dynamic_switch() <em>Abstract dynamic switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract_dynamic_switch()
   * @generated
   * @ordered
   */
  protected AbstractDynamicSwitch abstract_dynamic_switch;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequiresAbstractCompositionImpl()
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
    return ApricotPackage.Literals.REQUIRES_ABSTRACT_COMPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDynamicSwitch getAbstract_dynamic_switch()
  {
    return abstract_dynamic_switch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstract_dynamic_switch(AbstractDynamicSwitch newAbstract_dynamic_switch, NotificationChain msgs)
  {
    AbstractDynamicSwitch oldAbstract_dynamic_switch = abstract_dynamic_switch;
    abstract_dynamic_switch = newAbstract_dynamic_switch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH, oldAbstract_dynamic_switch, newAbstract_dynamic_switch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract_dynamic_switch(AbstractDynamicSwitch newAbstract_dynamic_switch)
  {
    if (newAbstract_dynamic_switch != abstract_dynamic_switch)
    {
      NotificationChain msgs = null;
      if (abstract_dynamic_switch != null)
        msgs = ((InternalEObject)abstract_dynamic_switch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH, null, msgs);
      if (newAbstract_dynamic_switch != null)
        msgs = ((InternalEObject)newAbstract_dynamic_switch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH, null, msgs);
      msgs = basicSetAbstract_dynamic_switch(newAbstract_dynamic_switch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH, newAbstract_dynamic_switch, newAbstract_dynamic_switch));
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
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH:
        return basicSetAbstract_dynamic_switch(null, msgs);
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
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__NAME:
        return getName();
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH:
        return getAbstract_dynamic_switch();
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
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__NAME:
        setName((String)newValue);
        return;
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH:
        setAbstract_dynamic_switch((AbstractDynamicSwitch)newValue);
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
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH:
        setAbstract_dynamic_switch((AbstractDynamicSwitch)null);
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
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH:
        return abstract_dynamic_switch != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RequiresAbstractCompositionImpl
