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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.DimExpr;
import org.xtext.fofo.apricot.Expression;
import org.xtext.fofo.apricot.IdentifierSuffix;
import org.xtext.fofo.apricot.NewArray;
import org.xtext.fofo.apricot.NewByClass;
import org.xtext.fofo.apricot.ParExpression;
import org.xtext.fofo.apricot.Primary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.PrimaryImpl#getParexpression <em>Parexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.PrimaryImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.PrimaryImpl#getNewobject <em>Newobject</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.PrimaryImpl#getNewarray <em>Newarray</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.PrimaryImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.PrimaryImpl#getDimer <em>Dimer</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.PrimaryImpl#getIdentifiersuffix <em>Identifiersuffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryImpl extends MinimalEObjectImpl.Container implements Primary
{
  /**
   * The cached value of the '{@link #getParexpression() <em>Parexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParexpression()
   * @generated
   * @ordered
   */
  protected ParExpression parexpression;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected Expression literal;

  /**
   * The cached value of the '{@link #getNewobject() <em>Newobject</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewobject()
   * @generated
   * @ordered
   */
  protected NewByClass newobject;

  /**
   * The cached value of the '{@link #getNewarray() <em>Newarray</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewarray()
   * @generated
   * @ordered
   */
  protected NewArray newarray;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected EList<String> identifier;

  /**
   * The cached value of the '{@link #getDimer() <em>Dimer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimer()
   * @generated
   * @ordered
   */
  protected EList<DimExpr> dimer;

  /**
   * The cached value of the '{@link #getIdentifiersuffix() <em>Identifiersuffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifiersuffix()
   * @generated
   * @ordered
   */
  protected IdentifierSuffix identifiersuffix;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryImpl()
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
    return ApricotPackage.Literals.PRIMARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParExpression getParexpression()
  {
    return parexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParexpression(ParExpression newParexpression, NotificationChain msgs)
  {
    ParExpression oldParexpression = parexpression;
    parexpression = newParexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__PAREXPRESSION, oldParexpression, newParexpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParexpression(ParExpression newParexpression)
  {
    if (newParexpression != parexpression)
    {
      NotificationChain msgs = null;
      if (parexpression != null)
        msgs = ((InternalEObject)parexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__PAREXPRESSION, null, msgs);
      if (newParexpression != null)
        msgs = ((InternalEObject)newParexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__PAREXPRESSION, null, msgs);
      msgs = basicSetParexpression(newParexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__PAREXPRESSION, newParexpression, newParexpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteral(Expression newLiteral, NotificationChain msgs)
  {
    Expression oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__LITERAL, oldLiteral, newLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(Expression newLiteral)
  {
    if (newLiteral != literal)
    {
      NotificationChain msgs = null;
      if (literal != null)
        msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__LITERAL, null, msgs);
      if (newLiteral != null)
        msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__LITERAL, null, msgs);
      msgs = basicSetLiteral(newLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__LITERAL, newLiteral, newLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewByClass getNewobject()
  {
    return newobject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewobject(NewByClass newNewobject, NotificationChain msgs)
  {
    NewByClass oldNewobject = newobject;
    newobject = newNewobject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__NEWOBJECT, oldNewobject, newNewobject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewobject(NewByClass newNewobject)
  {
    if (newNewobject != newobject)
    {
      NotificationChain msgs = null;
      if (newobject != null)
        msgs = ((InternalEObject)newobject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__NEWOBJECT, null, msgs);
      if (newNewobject != null)
        msgs = ((InternalEObject)newNewobject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__NEWOBJECT, null, msgs);
      msgs = basicSetNewobject(newNewobject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__NEWOBJECT, newNewobject, newNewobject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewArray getNewarray()
  {
    return newarray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewarray(NewArray newNewarray, NotificationChain msgs)
  {
    NewArray oldNewarray = newarray;
    newarray = newNewarray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__NEWARRAY, oldNewarray, newNewarray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewarray(NewArray newNewarray)
  {
    if (newNewarray != newarray)
    {
      NotificationChain msgs = null;
      if (newarray != null)
        msgs = ((InternalEObject)newarray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__NEWARRAY, null, msgs);
      if (newNewarray != null)
        msgs = ((InternalEObject)newNewarray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__NEWARRAY, null, msgs);
      msgs = basicSetNewarray(newNewarray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__NEWARRAY, newNewarray, newNewarray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIdentifier()
  {
    if (identifier == null)
    {
      identifier = new EDataTypeEList<String>(String.class, this, ApricotPackage.PRIMARY__IDENTIFIER);
    }
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DimExpr> getDimer()
  {
    if (dimer == null)
    {
      dimer = new EObjectContainmentEList<DimExpr>(DimExpr.class, this, ApricotPackage.PRIMARY__DIMER);
    }
    return dimer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierSuffix getIdentifiersuffix()
  {
    return identifiersuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifiersuffix(IdentifierSuffix newIdentifiersuffix, NotificationChain msgs)
  {
    IdentifierSuffix oldIdentifiersuffix = identifiersuffix;
    identifiersuffix = newIdentifiersuffix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__IDENTIFIERSUFFIX, oldIdentifiersuffix, newIdentifiersuffix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifiersuffix(IdentifierSuffix newIdentifiersuffix)
  {
    if (newIdentifiersuffix != identifiersuffix)
    {
      NotificationChain msgs = null;
      if (identifiersuffix != null)
        msgs = ((InternalEObject)identifiersuffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__IDENTIFIERSUFFIX, null, msgs);
      if (newIdentifiersuffix != null)
        msgs = ((InternalEObject)newIdentifiersuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.PRIMARY__IDENTIFIERSUFFIX, null, msgs);
      msgs = basicSetIdentifiersuffix(newIdentifiersuffix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.PRIMARY__IDENTIFIERSUFFIX, newIdentifiersuffix, newIdentifiersuffix));
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
      case ApricotPackage.PRIMARY__PAREXPRESSION:
        return basicSetParexpression(null, msgs);
      case ApricotPackage.PRIMARY__LITERAL:
        return basicSetLiteral(null, msgs);
      case ApricotPackage.PRIMARY__NEWOBJECT:
        return basicSetNewobject(null, msgs);
      case ApricotPackage.PRIMARY__NEWARRAY:
        return basicSetNewarray(null, msgs);
      case ApricotPackage.PRIMARY__DIMER:
        return ((InternalEList<?>)getDimer()).basicRemove(otherEnd, msgs);
      case ApricotPackage.PRIMARY__IDENTIFIERSUFFIX:
        return basicSetIdentifiersuffix(null, msgs);
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
      case ApricotPackage.PRIMARY__PAREXPRESSION:
        return getParexpression();
      case ApricotPackage.PRIMARY__LITERAL:
        return getLiteral();
      case ApricotPackage.PRIMARY__NEWOBJECT:
        return getNewobject();
      case ApricotPackage.PRIMARY__NEWARRAY:
        return getNewarray();
      case ApricotPackage.PRIMARY__IDENTIFIER:
        return getIdentifier();
      case ApricotPackage.PRIMARY__DIMER:
        return getDimer();
      case ApricotPackage.PRIMARY__IDENTIFIERSUFFIX:
        return getIdentifiersuffix();
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
      case ApricotPackage.PRIMARY__PAREXPRESSION:
        setParexpression((ParExpression)newValue);
        return;
      case ApricotPackage.PRIMARY__LITERAL:
        setLiteral((Expression)newValue);
        return;
      case ApricotPackage.PRIMARY__NEWOBJECT:
        setNewobject((NewByClass)newValue);
        return;
      case ApricotPackage.PRIMARY__NEWARRAY:
        setNewarray((NewArray)newValue);
        return;
      case ApricotPackage.PRIMARY__IDENTIFIER:
        getIdentifier().clear();
        getIdentifier().addAll((Collection<? extends String>)newValue);
        return;
      case ApricotPackage.PRIMARY__DIMER:
        getDimer().clear();
        getDimer().addAll((Collection<? extends DimExpr>)newValue);
        return;
      case ApricotPackage.PRIMARY__IDENTIFIERSUFFIX:
        setIdentifiersuffix((IdentifierSuffix)newValue);
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
      case ApricotPackage.PRIMARY__PAREXPRESSION:
        setParexpression((ParExpression)null);
        return;
      case ApricotPackage.PRIMARY__LITERAL:
        setLiteral((Expression)null);
        return;
      case ApricotPackage.PRIMARY__NEWOBJECT:
        setNewobject((NewByClass)null);
        return;
      case ApricotPackage.PRIMARY__NEWARRAY:
        setNewarray((NewArray)null);
        return;
      case ApricotPackage.PRIMARY__IDENTIFIER:
        getIdentifier().clear();
        return;
      case ApricotPackage.PRIMARY__DIMER:
        getDimer().clear();
        return;
      case ApricotPackage.PRIMARY__IDENTIFIERSUFFIX:
        setIdentifiersuffix((IdentifierSuffix)null);
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
      case ApricotPackage.PRIMARY__PAREXPRESSION:
        return parexpression != null;
      case ApricotPackage.PRIMARY__LITERAL:
        return literal != null;
      case ApricotPackage.PRIMARY__NEWOBJECT:
        return newobject != null;
      case ApricotPackage.PRIMARY__NEWARRAY:
        return newarray != null;
      case ApricotPackage.PRIMARY__IDENTIFIER:
        return identifier != null && !identifier.isEmpty();
      case ApricotPackage.PRIMARY__DIMER:
        return dimer != null && !dimer.isEmpty();
      case ApricotPackage.PRIMARY__IDENTIFIERSUFFIX:
        return identifiersuffix != null;
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //PrimaryImpl
