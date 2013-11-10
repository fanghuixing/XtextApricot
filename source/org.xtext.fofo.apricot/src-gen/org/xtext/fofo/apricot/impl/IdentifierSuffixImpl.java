/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.Arguments;
import org.xtext.fofo.apricot.IdentifierSuffix;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Suffix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.IdentifierSuffixImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.IdentifierSuffixImpl#getGetvalue <em>Getvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentifierSuffixImpl extends MinimalEObjectImpl.Container implements IdentifierSuffix
{
  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected Arguments arguments;

  /**
   * The default value of the '{@link #getGetvalue() <em>Getvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetvalue()
   * @generated
   * @ordered
   */
  protected static final String GETVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGetvalue() <em>Getvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetvalue()
   * @generated
   * @ordered
   */
  protected String getvalue = GETVALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentifierSuffixImpl()
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
    return ApricotPackage.Literals.IDENTIFIER_SUFFIX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arguments getArguments()
  {
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArguments(Arguments newArguments, NotificationChain msgs)
  {
    Arguments oldArguments = arguments;
    arguments = newArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.IDENTIFIER_SUFFIX__ARGUMENTS, oldArguments, newArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArguments(Arguments newArguments)
  {
    if (newArguments != arguments)
    {
      NotificationChain msgs = null;
      if (arguments != null)
        msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.IDENTIFIER_SUFFIX__ARGUMENTS, null, msgs);
      if (newArguments != null)
        msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.IDENTIFIER_SUFFIX__ARGUMENTS, null, msgs);
      msgs = basicSetArguments(newArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.IDENTIFIER_SUFFIX__ARGUMENTS, newArguments, newArguments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGetvalue()
  {
    return getvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetvalue(String newGetvalue)
  {
    String oldGetvalue = getvalue;
    getvalue = newGetvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.IDENTIFIER_SUFFIX__GETVALUE, oldGetvalue, getvalue));
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
      case ApricotPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        return basicSetArguments(null, msgs);
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
      case ApricotPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        return getArguments();
      case ApricotPackage.IDENTIFIER_SUFFIX__GETVALUE:
        return getGetvalue();
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
      case ApricotPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        setArguments((Arguments)newValue);
        return;
      case ApricotPackage.IDENTIFIER_SUFFIX__GETVALUE:
        setGetvalue((String)newValue);
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
      case ApricotPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        setArguments((Arguments)null);
        return;
      case ApricotPackage.IDENTIFIER_SUFFIX__GETVALUE:
        setGetvalue(GETVALUE_EDEFAULT);
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
      case ApricotPackage.IDENTIFIER_SUFFIX__ARGUMENTS:
        return arguments != null;
      case ApricotPackage.IDENTIFIER_SUFFIX__GETVALUE:
        return GETVALUE_EDEFAULT == null ? getvalue != null : !GETVALUE_EDEFAULT.equals(getvalue);
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
    result.append(" (getvalue: ");
    result.append(getvalue);
    result.append(')');
    return result.toString();
  }

} //IdentifierSuffixImpl
