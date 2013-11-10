/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.fofo.apricot.AbstractDynamicSwitch;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.RefType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Dynamic Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl#getSname <em>Sname</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl#getType2 <em>Type2</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl#getAname <em>Aname</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl#getType3 <em>Type3</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl#getDname <em>Dname</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl#getType4 <em>Type4</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl#getType5 <em>Type5</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractDynamicSwitchImpl extends MinimalEObjectImpl.Container implements AbstractDynamicSwitch
{
  /**
   * The default value of the '{@link #getSname() <em>Sname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSname()
   * @generated
   * @ordered
   */
  protected static final String SNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSname() <em>Sname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSname()
   * @generated
   * @ordered
   */
  protected String sname = SNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType1() <em>Type1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType1()
   * @generated
   * @ordered
   */
  protected RefType type1;

  /**
   * The cached value of the '{@link #getType2() <em>Type2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType2()
   * @generated
   * @ordered
   */
  protected RefType type2;

  /**
   * The default value of the '{@link #getAname() <em>Aname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAname()
   * @generated
   * @ordered
   */
  protected static final String ANAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAname() <em>Aname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAname()
   * @generated
   * @ordered
   */
  protected String aname = ANAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType3() <em>Type3</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType3()
   * @generated
   * @ordered
   */
  protected RefType type3;

  /**
   * The default value of the '{@link #getDname() <em>Dname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDname()
   * @generated
   * @ordered
   */
  protected static final String DNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDname() <em>Dname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDname()
   * @generated
   * @ordered
   */
  protected String dname = DNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType4() <em>Type4</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType4()
   * @generated
   * @ordered
   */
  protected RefType type4;

  /**
   * The cached value of the '{@link #getType5() <em>Type5</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType5()
   * @generated
   * @ordered
   */
  protected RefType type5;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractDynamicSwitchImpl()
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
    return ApricotPackage.Literals.ABSTRACT_DYNAMIC_SWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSname()
  {
    return sname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSname(String newSname)
  {
    String oldSname = sname;
    sname = newSname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__SNAME, oldSname, sname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType getType1()
  {
    if (type1 != null && type1.eIsProxy())
    {
      InternalEObject oldType1 = (InternalEObject)type1;
      type1 = (RefType)eResolveProxy(oldType1);
      if (type1 != oldType1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE1, oldType1, type1));
      }
    }
    return type1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType basicGetType1()
  {
    return type1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType1(RefType newType1)
  {
    RefType oldType1 = type1;
    type1 = newType1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE1, oldType1, type1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType getType2()
  {
    if (type2 != null && type2.eIsProxy())
    {
      InternalEObject oldType2 = (InternalEObject)type2;
      type2 = (RefType)eResolveProxy(oldType2);
      if (type2 != oldType2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE2, oldType2, type2));
      }
    }
    return type2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType basicGetType2()
  {
    return type2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType2(RefType newType2)
  {
    RefType oldType2 = type2;
    type2 = newType2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE2, oldType2, type2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAname()
  {
    return aname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAname(String newAname)
  {
    String oldAname = aname;
    aname = newAname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__ANAME, oldAname, aname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType getType3()
  {
    if (type3 != null && type3.eIsProxy())
    {
      InternalEObject oldType3 = (InternalEObject)type3;
      type3 = (RefType)eResolveProxy(oldType3);
      if (type3 != oldType3)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE3, oldType3, type3));
      }
    }
    return type3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType basicGetType3()
  {
    return type3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType3(RefType newType3)
  {
    RefType oldType3 = type3;
    type3 = newType3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE3, oldType3, type3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDname()
  {
    return dname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDname(String newDname)
  {
    String oldDname = dname;
    dname = newDname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__DNAME, oldDname, dname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType getType4()
  {
    if (type4 != null && type4.eIsProxy())
    {
      InternalEObject oldType4 = (InternalEObject)type4;
      type4 = (RefType)eResolveProxy(oldType4);
      if (type4 != oldType4)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE4, oldType4, type4));
      }
    }
    return type4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType basicGetType4()
  {
    return type4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType4(RefType newType4)
  {
    RefType oldType4 = type4;
    type4 = newType4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE4, oldType4, type4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType getType5()
  {
    if (type5 != null && type5.eIsProxy())
    {
      InternalEObject oldType5 = (InternalEObject)type5;
      type5 = (RefType)eResolveProxy(oldType5);
      if (type5 != oldType5)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE5, oldType5, type5));
      }
    }
    return type5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType basicGetType5()
  {
    return type5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType5(RefType newType5)
  {
    RefType oldType5 = type5;
    type5 = newType5;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE5, oldType5, type5));
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
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__SNAME:
        return getSname();
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE1:
        if (resolve) return getType1();
        return basicGetType1();
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE2:
        if (resolve) return getType2();
        return basicGetType2();
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__ANAME:
        return getAname();
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE3:
        if (resolve) return getType3();
        return basicGetType3();
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__DNAME:
        return getDname();
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE4:
        if (resolve) return getType4();
        return basicGetType4();
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE5:
        if (resolve) return getType5();
        return basicGetType5();
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
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__SNAME:
        setSname((String)newValue);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE1:
        setType1((RefType)newValue);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE2:
        setType2((RefType)newValue);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__ANAME:
        setAname((String)newValue);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE3:
        setType3((RefType)newValue);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__DNAME:
        setDname((String)newValue);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE4:
        setType4((RefType)newValue);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE5:
        setType5((RefType)newValue);
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
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__SNAME:
        setSname(SNAME_EDEFAULT);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE1:
        setType1((RefType)null);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE2:
        setType2((RefType)null);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__ANAME:
        setAname(ANAME_EDEFAULT);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE3:
        setType3((RefType)null);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__DNAME:
        setDname(DNAME_EDEFAULT);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE4:
        setType4((RefType)null);
        return;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE5:
        setType5((RefType)null);
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
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__SNAME:
        return SNAME_EDEFAULT == null ? sname != null : !SNAME_EDEFAULT.equals(sname);
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE1:
        return type1 != null;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE2:
        return type2 != null;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__ANAME:
        return ANAME_EDEFAULT == null ? aname != null : !ANAME_EDEFAULT.equals(aname);
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE3:
        return type3 != null;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__DNAME:
        return DNAME_EDEFAULT == null ? dname != null : !DNAME_EDEFAULT.equals(dname);
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE4:
        return type4 != null;
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH__TYPE5:
        return type5 != null;
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
    result.append(" (sname: ");
    result.append(sname);
    result.append(", aname: ");
    result.append(aname);
    result.append(", dname: ");
    result.append(dname);
    result.append(')');
    return result.toString();
  }

} //AbstractDynamicSwitchImpl
