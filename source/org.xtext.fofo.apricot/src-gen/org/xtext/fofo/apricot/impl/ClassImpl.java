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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.Interface;
import org.xtext.fofo.apricot.Member;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.ClassImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ClassImpl#getInterfaceclass <em>Interfaceclass</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.ClassImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends RefTypeImpl implements org.xtext.fofo.apricot.Class
{
  /**
   * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperclass()
   * @generated
   * @ordered
   */
  protected org.xtext.fofo.apricot.Class superclass;

  /**
   * The cached value of the '{@link #getInterfaceclass() <em>Interfaceclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceclass()
   * @generated
   * @ordered
   */
  protected Interface interfaceclass;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Member> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return ApricotPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.fofo.apricot.Class getSuperclass()
  {
    if (superclass != null && superclass.eIsProxy())
    {
      InternalEObject oldSuperclass = (InternalEObject)superclass;
      superclass = (org.xtext.fofo.apricot.Class)eResolveProxy(oldSuperclass);
      if (superclass != oldSuperclass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApricotPackage.CLASS__SUPERCLASS, oldSuperclass, superclass));
      }
    }
    return superclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.fofo.apricot.Class basicGetSuperclass()
  {
    return superclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperclass(org.xtext.fofo.apricot.Class newSuperclass)
  {
    org.xtext.fofo.apricot.Class oldSuperclass = superclass;
    superclass = newSuperclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CLASS__SUPERCLASS, oldSuperclass, superclass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInterfaceclass()
  {
    if (interfaceclass != null && interfaceclass.eIsProxy())
    {
      InternalEObject oldInterfaceclass = (InternalEObject)interfaceclass;
      interfaceclass = (Interface)eResolveProxy(oldInterfaceclass);
      if (interfaceclass != oldInterfaceclass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApricotPackage.CLASS__INTERFACECLASS, oldInterfaceclass, interfaceclass));
      }
    }
    return interfaceclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetInterfaceclass()
  {
    return interfaceclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceclass(Interface newInterfaceclass)
  {
    Interface oldInterfaceclass = interfaceclass;
    interfaceclass = newInterfaceclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.CLASS__INTERFACECLASS, oldInterfaceclass, interfaceclass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Member> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<Member>(Member.class, this, ApricotPackage.CLASS__MEMBERS);
    }
    return members;
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
      case ApricotPackage.CLASS__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case ApricotPackage.CLASS__SUPERCLASS:
        if (resolve) return getSuperclass();
        return basicGetSuperclass();
      case ApricotPackage.CLASS__INTERFACECLASS:
        if (resolve) return getInterfaceclass();
        return basicGetInterfaceclass();
      case ApricotPackage.CLASS__MEMBERS:
        return getMembers();
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
      case ApricotPackage.CLASS__SUPERCLASS:
        setSuperclass((org.xtext.fofo.apricot.Class)newValue);
        return;
      case ApricotPackage.CLASS__INTERFACECLASS:
        setInterfaceclass((Interface)newValue);
        return;
      case ApricotPackage.CLASS__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Member>)newValue);
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
      case ApricotPackage.CLASS__SUPERCLASS:
        setSuperclass((org.xtext.fofo.apricot.Class)null);
        return;
      case ApricotPackage.CLASS__INTERFACECLASS:
        setInterfaceclass((Interface)null);
        return;
      case ApricotPackage.CLASS__MEMBERS:
        getMembers().clear();
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
      case ApricotPackage.CLASS__SUPERCLASS:
        return superclass != null;
      case ApricotPackage.CLASS__INTERFACECLASS:
        return interfaceclass != null;
      case ApricotPackage.CLASS__MEMBERS:
        return members != null && !members.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassImpl
