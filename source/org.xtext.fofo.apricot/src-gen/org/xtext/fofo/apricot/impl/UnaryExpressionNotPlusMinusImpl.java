/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.Built_In_Methods;
import org.xtext.fofo.apricot.CastExpression;
import org.xtext.fofo.apricot.Primary;
import org.xtext.fofo.apricot.UnaryExpression;
import org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression Not Plus Minus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.UnaryExpressionNotPlusMinusImpl#getUnaryexpression <em>Unaryexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.UnaryExpressionNotPlusMinusImpl#getCastexpression <em>Castexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.UnaryExpressionNotPlusMinusImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.UnaryExpressionNotPlusMinusImpl#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryExpressionNotPlusMinusImpl extends UnaryExpressionImpl implements UnaryExpressionNotPlusMinus
{
  /**
   * The cached value of the '{@link #getUnaryexpression() <em>Unaryexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryexpression()
   * @generated
   * @ordered
   */
  protected UnaryExpression unaryexpression;

  /**
   * The cached value of the '{@link #getCastexpression() <em>Castexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastexpression()
   * @generated
   * @ordered
   */
  protected CastExpression castexpression;

  /**
   * The cached value of the '{@link #getPrimary() <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
  protected Primary primary;

  /**
   * The cached value of the '{@link #getBuiltin() <em>Builtin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected Built_In_Methods builtin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryExpressionNotPlusMinusImpl()
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
    return ApricotPackage.Literals.UNARY_EXPRESSION_NOT_PLUS_MINUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression getUnaryexpression()
  {
    return unaryexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryexpression(UnaryExpression newUnaryexpression, NotificationChain msgs)
  {
    UnaryExpression oldUnaryexpression = unaryexpression;
    unaryexpression = newUnaryexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION, oldUnaryexpression, newUnaryexpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryexpression(UnaryExpression newUnaryexpression)
  {
    if (newUnaryexpression != unaryexpression)
    {
      NotificationChain msgs = null;
      if (unaryexpression != null)
        msgs = ((InternalEObject)unaryexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION, null, msgs);
      if (newUnaryexpression != null)
        msgs = ((InternalEObject)newUnaryexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION, null, msgs);
      msgs = basicSetUnaryexpression(newUnaryexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION, newUnaryexpression, newUnaryexpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression getCastexpression()
  {
    return castexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCastexpression(CastExpression newCastexpression, NotificationChain msgs)
  {
    CastExpression oldCastexpression = castexpression;
    castexpression = newCastexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION, oldCastexpression, newCastexpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastexpression(CastExpression newCastexpression)
  {
    if (newCastexpression != castexpression)
    {
      NotificationChain msgs = null;
      if (castexpression != null)
        msgs = ((InternalEObject)castexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION, null, msgs);
      if (newCastexpression != null)
        msgs = ((InternalEObject)newCastexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION, null, msgs);
      msgs = basicSetCastexpression(newCastexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION, newCastexpression, newCastexpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary getPrimary()
  {
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimary(Primary newPrimary, NotificationChain msgs)
  {
    Primary oldPrimary = primary;
    primary = newPrimary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY, oldPrimary, newPrimary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary(Primary newPrimary)
  {
    if (newPrimary != primary)
    {
      NotificationChain msgs = null;
      if (primary != null)
        msgs = ((InternalEObject)primary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY, null, msgs);
      if (newPrimary != null)
        msgs = ((InternalEObject)newPrimary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY, null, msgs);
      msgs = basicSetPrimary(newPrimary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY, newPrimary, newPrimary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Built_In_Methods getBuiltin()
  {
    return builtin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBuiltin(Built_In_Methods newBuiltin, NotificationChain msgs)
  {
    Built_In_Methods oldBuiltin = builtin;
    builtin = newBuiltin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN, oldBuiltin, newBuiltin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuiltin(Built_In_Methods newBuiltin)
  {
    if (newBuiltin != builtin)
    {
      NotificationChain msgs = null;
      if (builtin != null)
        msgs = ((InternalEObject)builtin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN, null, msgs);
      if (newBuiltin != null)
        msgs = ((InternalEObject)newBuiltin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN, null, msgs);
      msgs = basicSetBuiltin(newBuiltin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN, newBuiltin, newBuiltin));
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
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        return basicSetUnaryexpression(null, msgs);
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        return basicSetCastexpression(null, msgs);
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        return basicSetPrimary(null, msgs);
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN:
        return basicSetBuiltin(null, msgs);
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
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        return getUnaryexpression();
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        return getCastexpression();
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        return getPrimary();
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN:
        return getBuiltin();
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
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        setUnaryexpression((UnaryExpression)newValue);
        return;
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        setCastexpression((CastExpression)newValue);
        return;
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        setPrimary((Primary)newValue);
        return;
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN:
        setBuiltin((Built_In_Methods)newValue);
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
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        setUnaryexpression((UnaryExpression)null);
        return;
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        setCastexpression((CastExpression)null);
        return;
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        setPrimary((Primary)null);
        return;
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN:
        setBuiltin((Built_In_Methods)null);
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
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION:
        return unaryexpression != null;
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION:
        return castexpression != null;
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY:
        return primary != null;
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN:
        return builtin != null;
    }
    return super.eIsSet(featureID);
  }

} //UnaryExpressionNotPlusMinusImpl
