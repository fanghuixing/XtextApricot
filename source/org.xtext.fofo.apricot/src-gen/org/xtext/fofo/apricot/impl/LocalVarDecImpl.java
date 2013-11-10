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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.LocalVarDec;
import org.xtext.fofo.apricot.UseType;
import org.xtext.fofo.apricot.VariableInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Var Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.LocalVarDecImpl#getVariablemodifer <em>Variablemodifer</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.LocalVarDecImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.LocalVarDecImpl#getDim <em>Dim</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.LocalVarDecImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.LocalVarDecImpl#getVarini <em>Varini</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalVarDecImpl extends LocalVarDecStatementImpl implements LocalVarDec
{
  /**
   * The default value of the '{@link #getVariablemodifer() <em>Variablemodifer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablemodifer()
   * @generated
   * @ordered
   */
  protected static final String VARIABLEMODIFER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariablemodifer() <em>Variablemodifer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablemodifer()
   * @generated
   * @ordered
   */
  protected String variablemodifer = VARIABLEMODIFER_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected UseType type;

  /**
   * The cached value of the '{@link #getDim() <em>Dim</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDim()
   * @generated
   * @ordered
   */
  protected EList<String> dim;

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
   * The cached value of the '{@link #getVarini() <em>Varini</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarini()
   * @generated
   * @ordered
   */
  protected VariableInitializer varini;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalVarDecImpl()
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
    return ApricotPackage.Literals.LOCAL_VAR_DEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariablemodifer()
  {
    return variablemodifer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariablemodifer(String newVariablemodifer)
  {
    String oldVariablemodifer = variablemodifer;
    variablemodifer = newVariablemodifer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.LOCAL_VAR_DEC__VARIABLEMODIFER, oldVariablemodifer, variablemodifer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(UseType newType, NotificationChain msgs)
  {
    UseType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.LOCAL_VAR_DEC__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(UseType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.LOCAL_VAR_DEC__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.LOCAL_VAR_DEC__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.LOCAL_VAR_DEC__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDim()
  {
    if (dim == null)
    {
      dim = new EDataTypeEList<String>(String.class, this, ApricotPackage.LOCAL_VAR_DEC__DIM);
    }
    return dim;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.LOCAL_VAR_DEC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableInitializer getVarini()
  {
    return varini;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarini(VariableInitializer newVarini, NotificationChain msgs)
  {
    VariableInitializer oldVarini = varini;
    varini = newVarini;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.LOCAL_VAR_DEC__VARINI, oldVarini, newVarini);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarini(VariableInitializer newVarini)
  {
    if (newVarini != varini)
    {
      NotificationChain msgs = null;
      if (varini != null)
        msgs = ((InternalEObject)varini).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.LOCAL_VAR_DEC__VARINI, null, msgs);
      if (newVarini != null)
        msgs = ((InternalEObject)newVarini).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.LOCAL_VAR_DEC__VARINI, null, msgs);
      msgs = basicSetVarini(newVarini, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.LOCAL_VAR_DEC__VARINI, newVarini, newVarini));
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
      case ApricotPackage.LOCAL_VAR_DEC__TYPE:
        return basicSetType(null, msgs);
      case ApricotPackage.LOCAL_VAR_DEC__VARINI:
        return basicSetVarini(null, msgs);
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
      case ApricotPackage.LOCAL_VAR_DEC__VARIABLEMODIFER:
        return getVariablemodifer();
      case ApricotPackage.LOCAL_VAR_DEC__TYPE:
        return getType();
      case ApricotPackage.LOCAL_VAR_DEC__DIM:
        return getDim();
      case ApricotPackage.LOCAL_VAR_DEC__NAME:
        return getName();
      case ApricotPackage.LOCAL_VAR_DEC__VARINI:
        return getVarini();
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
      case ApricotPackage.LOCAL_VAR_DEC__VARIABLEMODIFER:
        setVariablemodifer((String)newValue);
        return;
      case ApricotPackage.LOCAL_VAR_DEC__TYPE:
        setType((UseType)newValue);
        return;
      case ApricotPackage.LOCAL_VAR_DEC__DIM:
        getDim().clear();
        getDim().addAll((Collection<? extends String>)newValue);
        return;
      case ApricotPackage.LOCAL_VAR_DEC__NAME:
        setName((String)newValue);
        return;
      case ApricotPackage.LOCAL_VAR_DEC__VARINI:
        setVarini((VariableInitializer)newValue);
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
      case ApricotPackage.LOCAL_VAR_DEC__VARIABLEMODIFER:
        setVariablemodifer(VARIABLEMODIFER_EDEFAULT);
        return;
      case ApricotPackage.LOCAL_VAR_DEC__TYPE:
        setType((UseType)null);
        return;
      case ApricotPackage.LOCAL_VAR_DEC__DIM:
        getDim().clear();
        return;
      case ApricotPackage.LOCAL_VAR_DEC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ApricotPackage.LOCAL_VAR_DEC__VARINI:
        setVarini((VariableInitializer)null);
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
      case ApricotPackage.LOCAL_VAR_DEC__VARIABLEMODIFER:
        return VARIABLEMODIFER_EDEFAULT == null ? variablemodifer != null : !VARIABLEMODIFER_EDEFAULT.equals(variablemodifer);
      case ApricotPackage.LOCAL_VAR_DEC__TYPE:
        return type != null;
      case ApricotPackage.LOCAL_VAR_DEC__DIM:
        return dim != null && !dim.isEmpty();
      case ApricotPackage.LOCAL_VAR_DEC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ApricotPackage.LOCAL_VAR_DEC__VARINI:
        return varini != null;
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
    result.append(" (variablemodifer: ");
    result.append(variablemodifer);
    result.append(", dim: ");
    result.append(dim);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LocalVarDecImpl
