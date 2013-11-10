/**
 */
package org.xtext.fofo.apricot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getBlock <em>Block</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getParexpression <em>Parexpression</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getIfstatement <em>Ifstatement</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getElsestatement <em>Elsestatement</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getForcontrol <em>Forcontrol</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getForstatement <em>Forstatement</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getWhilestatement <em>Whilestatement</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getReturn <em>Return</em>}</li>
 *   <li>{@link org.xtext.fofo.apricot.Statement#getStatementexpression <em>Statementexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fofo.apricot.ApricotPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends BlockStatement
{
  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

  /**
   * Returns the value of the '<em><b>Parexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parexpression</em>' containment reference.
   * @see #setParexpression(ParExpression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Parexpression()
   * @model containment="true"
   * @generated
   */
  ParExpression getParexpression();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getParexpression <em>Parexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parexpression</em>' containment reference.
   * @see #getParexpression()
   * @generated
   */
  void setParexpression(ParExpression value);

  /**
   * Returns the value of the '<em><b>Ifstatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifstatement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifstatement</em>' containment reference.
   * @see #setIfstatement(Statement)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Ifstatement()
   * @model containment="true"
   * @generated
   */
  Statement getIfstatement();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getIfstatement <em>Ifstatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifstatement</em>' containment reference.
   * @see #getIfstatement()
   * @generated
   */
  void setIfstatement(Statement value);

  /**
   * Returns the value of the '<em><b>Elsestatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsestatement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsestatement</em>' containment reference.
   * @see #setElsestatement(Statement)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Elsestatement()
   * @model containment="true"
   * @generated
   */
  Statement getElsestatement();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getElsestatement <em>Elsestatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsestatement</em>' containment reference.
   * @see #getElsestatement()
   * @generated
   */
  void setElsestatement(Statement value);

  /**
   * Returns the value of the '<em><b>Forcontrol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forcontrol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forcontrol</em>' containment reference.
   * @see #setForcontrol(ForControl)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Forcontrol()
   * @model containment="true"
   * @generated
   */
  ForControl getForcontrol();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getForcontrol <em>Forcontrol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forcontrol</em>' containment reference.
   * @see #getForcontrol()
   * @generated
   */
  void setForcontrol(ForControl value);

  /**
   * Returns the value of the '<em><b>Forstatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forstatement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forstatement</em>' containment reference.
   * @see #setForstatement(Statement)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Forstatement()
   * @model containment="true"
   * @generated
   */
  Statement getForstatement();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getForstatement <em>Forstatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forstatement</em>' containment reference.
   * @see #getForstatement()
   * @generated
   */
  void setForstatement(Statement value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Whilestatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whilestatement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whilestatement</em>' containment reference.
   * @see #setWhilestatement(Statement)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Whilestatement()
   * @model containment="true"
   * @generated
   */
  Statement getWhilestatement();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getWhilestatement <em>Whilestatement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whilestatement</em>' containment reference.
   * @see #getWhilestatement()
   * @generated
   */
  void setWhilestatement(Statement value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(ReturnStatement)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Return()
   * @model containment="true"
   * @generated
   */
  ReturnStatement getReturn();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(ReturnStatement value);

  /**
   * Returns the value of the '<em><b>Statementexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statementexpression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statementexpression</em>' containment reference.
   * @see #setStatementexpression(Expression)
   * @see org.xtext.fofo.apricot.ApricotPackage#getStatement_Statementexpression()
   * @model containment="true"
   * @generated
   */
  Expression getStatementexpression();

  /**
   * Sets the value of the '{@link org.xtext.fofo.apricot.Statement#getStatementexpression <em>Statementexpression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statementexpression</em>' containment reference.
   * @see #getStatementexpression()
   * @generated
   */
  void setStatementexpression(Expression value);

} // Statement
