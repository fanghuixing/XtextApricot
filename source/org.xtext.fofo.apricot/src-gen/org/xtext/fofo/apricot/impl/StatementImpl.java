/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.Block;
import org.xtext.fofo.apricot.Expression;
import org.xtext.fofo.apricot.ForControl;
import org.xtext.fofo.apricot.ParExpression;
import org.xtext.fofo.apricot.ReturnStatement;
import org.xtext.fofo.apricot.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getParexpression <em>Parexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getIfstatement <em>Ifstatement</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getElsestatement <em>Elsestatement</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getForcontrol <em>Forcontrol</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getForstatement <em>Forstatement</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getWhilestatement <em>Whilestatement</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.impl.StatementImpl#getStatementexpression <em>Statementexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends BlockStatementImpl implements Statement
{
  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

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
   * The cached value of the '{@link #getIfstatement() <em>Ifstatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfstatement()
   * @generated
   * @ordered
   */
  protected Statement ifstatement;

  /**
   * The cached value of the '{@link #getElsestatement() <em>Elsestatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsestatement()
   * @generated
   * @ordered
   */
  protected Statement elsestatement;

  /**
   * The cached value of the '{@link #getForcontrol() <em>Forcontrol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForcontrol()
   * @generated
   * @ordered
   */
  protected ForControl forcontrol;

  /**
   * The cached value of the '{@link #getForstatement() <em>Forstatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForstatement()
   * @generated
   * @ordered
   */
  protected Statement forstatement;

  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getWhilestatement() <em>Whilestatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhilestatement()
   * @generated
   * @ordered
   */
  protected Statement whilestatement;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected ReturnStatement return_;

  /**
   * The cached value of the '{@link #getStatementexpression() <em>Statementexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementexpression()
   * @generated
   * @ordered
   */
  protected Expression statementexpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return ApricotPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__BLOCK, newBlock, newBlock));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__PAREXPRESSION, oldParexpression, newParexpression);
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
        msgs = ((InternalEObject)parexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__PAREXPRESSION, null, msgs);
      if (newParexpression != null)
        msgs = ((InternalEObject)newParexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__PAREXPRESSION, null, msgs);
      msgs = basicSetParexpression(newParexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__PAREXPRESSION, newParexpression, newParexpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getIfstatement()
  {
    return ifstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfstatement(Statement newIfstatement, NotificationChain msgs)
  {
    Statement oldIfstatement = ifstatement;
    ifstatement = newIfstatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__IFSTATEMENT, oldIfstatement, newIfstatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfstatement(Statement newIfstatement)
  {
    if (newIfstatement != ifstatement)
    {
      NotificationChain msgs = null;
      if (ifstatement != null)
        msgs = ((InternalEObject)ifstatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__IFSTATEMENT, null, msgs);
      if (newIfstatement != null)
        msgs = ((InternalEObject)newIfstatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__IFSTATEMENT, null, msgs);
      msgs = basicSetIfstatement(newIfstatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__IFSTATEMENT, newIfstatement, newIfstatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getElsestatement()
  {
    return elsestatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElsestatement(Statement newElsestatement, NotificationChain msgs)
  {
    Statement oldElsestatement = elsestatement;
    elsestatement = newElsestatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__ELSESTATEMENT, oldElsestatement, newElsestatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElsestatement(Statement newElsestatement)
  {
    if (newElsestatement != elsestatement)
    {
      NotificationChain msgs = null;
      if (elsestatement != null)
        msgs = ((InternalEObject)elsestatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__ELSESTATEMENT, null, msgs);
      if (newElsestatement != null)
        msgs = ((InternalEObject)newElsestatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__ELSESTATEMENT, null, msgs);
      msgs = basicSetElsestatement(newElsestatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__ELSESTATEMENT, newElsestatement, newElsestatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForControl getForcontrol()
  {
    return forcontrol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForcontrol(ForControl newForcontrol, NotificationChain msgs)
  {
    ForControl oldForcontrol = forcontrol;
    forcontrol = newForcontrol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__FORCONTROL, oldForcontrol, newForcontrol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForcontrol(ForControl newForcontrol)
  {
    if (newForcontrol != forcontrol)
    {
      NotificationChain msgs = null;
      if (forcontrol != null)
        msgs = ((InternalEObject)forcontrol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__FORCONTROL, null, msgs);
      if (newForcontrol != null)
        msgs = ((InternalEObject)newForcontrol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__FORCONTROL, null, msgs);
      msgs = basicSetForcontrol(newForcontrol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__FORCONTROL, newForcontrol, newForcontrol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getForstatement()
  {
    return forstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForstatement(Statement newForstatement, NotificationChain msgs)
  {
    Statement oldForstatement = forstatement;
    forstatement = newForstatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__FORSTATEMENT, oldForstatement, newForstatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForstatement(Statement newForstatement)
  {
    if (newForstatement != forstatement)
    {
      NotificationChain msgs = null;
      if (forstatement != null)
        msgs = ((InternalEObject)forstatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__FORSTATEMENT, null, msgs);
      if (newForstatement != null)
        msgs = ((InternalEObject)newForstatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__FORSTATEMENT, null, msgs);
      msgs = basicSetForstatement(newForstatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__FORSTATEMENT, newForstatement, newForstatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getWhilestatement()
  {
    return whilestatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhilestatement(Statement newWhilestatement, NotificationChain msgs)
  {
    Statement oldWhilestatement = whilestatement;
    whilestatement = newWhilestatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__WHILESTATEMENT, oldWhilestatement, newWhilestatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhilestatement(Statement newWhilestatement)
  {
    if (newWhilestatement != whilestatement)
    {
      NotificationChain msgs = null;
      if (whilestatement != null)
        msgs = ((InternalEObject)whilestatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__WHILESTATEMENT, null, msgs);
      if (newWhilestatement != null)
        msgs = ((InternalEObject)newWhilestatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__WHILESTATEMENT, null, msgs);
      msgs = basicSetWhilestatement(newWhilestatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__WHILESTATEMENT, newWhilestatement, newWhilestatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(ReturnStatement newReturn, NotificationChain msgs)
  {
    ReturnStatement oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(ReturnStatement newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__RETURN, newReturn, newReturn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getStatementexpression()
  {
    return statementexpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementexpression(Expression newStatementexpression, NotificationChain msgs)
  {
    Expression oldStatementexpression = statementexpression;
    statementexpression = newStatementexpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__STATEMENTEXPRESSION, oldStatementexpression, newStatementexpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementexpression(Expression newStatementexpression)
  {
    if (newStatementexpression != statementexpression)
    {
      NotificationChain msgs = null;
      if (statementexpression != null)
        msgs = ((InternalEObject)statementexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__STATEMENTEXPRESSION, null, msgs);
      if (newStatementexpression != null)
        msgs = ((InternalEObject)newStatementexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApricotPackage.STATEMENT__STATEMENTEXPRESSION, null, msgs);
      msgs = basicSetStatementexpression(newStatementexpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ApricotPackage.STATEMENT__STATEMENTEXPRESSION, newStatementexpression, newStatementexpression));
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
      case ApricotPackage.STATEMENT__BLOCK:
        return basicSetBlock(null, msgs);
      case ApricotPackage.STATEMENT__PAREXPRESSION:
        return basicSetParexpression(null, msgs);
      case ApricotPackage.STATEMENT__IFSTATEMENT:
        return basicSetIfstatement(null, msgs);
      case ApricotPackage.STATEMENT__ELSESTATEMENT:
        return basicSetElsestatement(null, msgs);
      case ApricotPackage.STATEMENT__FORCONTROL:
        return basicSetForcontrol(null, msgs);
      case ApricotPackage.STATEMENT__FORSTATEMENT:
        return basicSetForstatement(null, msgs);
      case ApricotPackage.STATEMENT__WHILESTATEMENT:
        return basicSetWhilestatement(null, msgs);
      case ApricotPackage.STATEMENT__RETURN:
        return basicSetReturn(null, msgs);
      case ApricotPackage.STATEMENT__STATEMENTEXPRESSION:
        return basicSetStatementexpression(null, msgs);
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
      case ApricotPackage.STATEMENT__BLOCK:
        return getBlock();
      case ApricotPackage.STATEMENT__PAREXPRESSION:
        return getParexpression();
      case ApricotPackage.STATEMENT__IFSTATEMENT:
        return getIfstatement();
      case ApricotPackage.STATEMENT__ELSESTATEMENT:
        return getElsestatement();
      case ApricotPackage.STATEMENT__FORCONTROL:
        return getForcontrol();
      case ApricotPackage.STATEMENT__FORSTATEMENT:
        return getForstatement();
      case ApricotPackage.STATEMENT__IDENTIFIER:
        return getIdentifier();
      case ApricotPackage.STATEMENT__WHILESTATEMENT:
        return getWhilestatement();
      case ApricotPackage.STATEMENT__RETURN:
        return getReturn();
      case ApricotPackage.STATEMENT__STATEMENTEXPRESSION:
        return getStatementexpression();
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
      case ApricotPackage.STATEMENT__BLOCK:
        setBlock((Block)newValue);
        return;
      case ApricotPackage.STATEMENT__PAREXPRESSION:
        setParexpression((ParExpression)newValue);
        return;
      case ApricotPackage.STATEMENT__IFSTATEMENT:
        setIfstatement((Statement)newValue);
        return;
      case ApricotPackage.STATEMENT__ELSESTATEMENT:
        setElsestatement((Statement)newValue);
        return;
      case ApricotPackage.STATEMENT__FORCONTROL:
        setForcontrol((ForControl)newValue);
        return;
      case ApricotPackage.STATEMENT__FORSTATEMENT:
        setForstatement((Statement)newValue);
        return;
      case ApricotPackage.STATEMENT__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case ApricotPackage.STATEMENT__WHILESTATEMENT:
        setWhilestatement((Statement)newValue);
        return;
      case ApricotPackage.STATEMENT__RETURN:
        setReturn((ReturnStatement)newValue);
        return;
      case ApricotPackage.STATEMENT__STATEMENTEXPRESSION:
        setStatementexpression((Expression)newValue);
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
      case ApricotPackage.STATEMENT__BLOCK:
        setBlock((Block)null);
        return;
      case ApricotPackage.STATEMENT__PAREXPRESSION:
        setParexpression((ParExpression)null);
        return;
      case ApricotPackage.STATEMENT__IFSTATEMENT:
        setIfstatement((Statement)null);
        return;
      case ApricotPackage.STATEMENT__ELSESTATEMENT:
        setElsestatement((Statement)null);
        return;
      case ApricotPackage.STATEMENT__FORCONTROL:
        setForcontrol((ForControl)null);
        return;
      case ApricotPackage.STATEMENT__FORSTATEMENT:
        setForstatement((Statement)null);
        return;
      case ApricotPackage.STATEMENT__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case ApricotPackage.STATEMENT__WHILESTATEMENT:
        setWhilestatement((Statement)null);
        return;
      case ApricotPackage.STATEMENT__RETURN:
        setReturn((ReturnStatement)null);
        return;
      case ApricotPackage.STATEMENT__STATEMENTEXPRESSION:
        setStatementexpression((Expression)null);
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
      case ApricotPackage.STATEMENT__BLOCK:
        return block != null;
      case ApricotPackage.STATEMENT__PAREXPRESSION:
        return parexpression != null;
      case ApricotPackage.STATEMENT__IFSTATEMENT:
        return ifstatement != null;
      case ApricotPackage.STATEMENT__ELSESTATEMENT:
        return elsestatement != null;
      case ApricotPackage.STATEMENT__FORCONTROL:
        return forcontrol != null;
      case ApricotPackage.STATEMENT__FORSTATEMENT:
        return forstatement != null;
      case ApricotPackage.STATEMENT__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case ApricotPackage.STATEMENT__WHILESTATEMENT:
        return whilestatement != null;
      case ApricotPackage.STATEMENT__RETURN:
        return return_ != null;
      case ApricotPackage.STATEMENT__STATEMENTEXPRESSION:
        return statementexpression != null;
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

} //StatementImpl
