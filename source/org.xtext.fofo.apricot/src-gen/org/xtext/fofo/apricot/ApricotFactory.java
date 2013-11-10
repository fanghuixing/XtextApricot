/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.fofo.apricot.ApricotPackage
 * @generated
 */
public interface ApricotFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApricotFactory eINSTANCE = org.xtext.fofo.apricot.impl.ApricotFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Declaration</em>'.
   * @generated
   */
  PackageDeclaration createPackageDeclaration();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Ref Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Type</em>'.
   * @generated
   */
  RefType createRefType();

  /**
   * Returns a new object of class '<em>Non Ref Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Ref Type</em>'.
   * @generated
   */
  NonRefType createNonRefType();

  /**
   * Returns a new object of class '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Type</em>'.
   * @generated
   */
  BasicType createBasicType();

  /**
   * Returns a new object of class '<em>Math Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Math Type</em>'.
   * @generated
   */
  MathType createMathType();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member</em>'.
   * @generated
   */
  Member createMember();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Constructor Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor Method</em>'.
   * @generated
   */
  ConstructorMethod createConstructorMethod();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Abstract Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Method</em>'.
   * @generated
   */
  AbstractMethod createAbstractMethod();

  /**
   * Returns a new object of class '<em>Use Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Use Type</em>'.
   * @generated
   */
  UseType createUseType();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Typed Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Element</em>'.
   * @generated
   */
  TypedElement createTypedElement();

  /**
   * Returns a new object of class '<em>Method Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Body</em>'.
   * @generated
   */
  MethodBody createMethodBody();

  /**
   * Returns a new object of class '<em>Abstract Method Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Method Body</em>'.
   * @generated
   */
  AbstractMethodBody createAbstractMethodBody();

  /**
   * Returns a new object of class '<em>Variable Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Initializer</em>'.
   * @generated
   */
  VariableInitializer createVariableInitializer();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  ReturnStatement createReturnStatement();

  /**
   * Returns a new object of class '<em>Abstract Interface Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Interface Element</em>'.
   * @generated
   */
  AbstractInterfaceElement createAbstractInterfaceElement();

  /**
   * Returns a new object of class '<em>Requires</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requires</em>'.
   * @generated
   */
  Requires createRequires();

  /**
   * Returns a new object of class '<em>Abstract Dynamic Switch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Dynamic Switch</em>'.
   * @generated
   */
  AbstractDynamicSwitch createAbstractDynamicSwitch();

  /**
   * Returns a new object of class '<em>Abstract Composition Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Composition Method</em>'.
   * @generated
   */
  AbstractCompositionMethod createAbstractCompositionMethod();

  /**
   * Returns a new object of class '<em>Native Start Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Native Start Method</em>'.
   * @generated
   */
  NativeStartMethod createNativeStartMethod();

  /**
   * Returns a new object of class '<em>Requires Abstract Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Requires Abstract Composition</em>'.
   * @generated
   */
  RequiresAbstractComposition createRequiresAbstractComposition();

  /**
   * Returns a new object of class '<em>Clock Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clock Constraint</em>'.
   * @generated
   */
  ClockConstraint createClockConstraint();

  /**
   * Returns a new object of class '<em>Abstract Invariant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Invariant</em>'.
   * @generated
   */
  AbstractInvariant createAbstractInvariant();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Expression</em>'.
   * @generated
   */
  ConditionalExpression createConditionalExpression();

  /**
   * Returns a new object of class '<em>Conditional Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Or Expression</em>'.
   * @generated
   */
  ConditionalOrExpression createConditionalOrExpression();

  /**
   * Returns a new object of class '<em>Conditional And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional And Expression</em>'.
   * @generated
   */
  ConditionalAndExpression createConditionalAndExpression();

  /**
   * Returns a new object of class '<em>Exclusive Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exclusive Or Expression</em>'.
   * @generated
   */
  ExclusiveOrExpression createExclusiveOrExpression();

  /**
   * Returns a new object of class '<em>Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality Expression</em>'.
   * @generated
   */
  EqualityExpression createEqualityExpression();

  /**
   * Returns a new object of class '<em>Instance Of Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Of Expression</em>'.
   * @generated
   */
  InstanceOfExpression createInstanceOfExpression();

  /**
   * Returns a new object of class '<em>Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relational Expression</em>'.
   * @generated
   */
  RelationalExpression createRelationalExpression();

  /**
   * Returns a new object of class '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive Expression</em>'.
   * @generated
   */
  AdditiveExpression createAdditiveExpression();

  /**
   * Returns a new object of class '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicative Expression</em>'.
   * @generated
   */
  MultiplicativeExpression createMultiplicativeExpression();

  /**
   * Returns a new object of class '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression</em>'.
   * @generated
   */
  UnaryExpression createUnaryExpression();

  /**
   * Returns a new object of class '<em>Unary Expression Not Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression Not Plus Minus</em>'.
   * @generated
   */
  UnaryExpressionNotPlusMinus createUnaryExpressionNotPlusMinus();

  /**
   * Returns a new object of class '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary</em>'.
   * @generated
   */
  Primary createPrimary();

  /**
   * Returns a new object of class '<em>Identifier Suffix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier Suffix</em>'.
   * @generated
   */
  IdentifierSuffix createIdentifierSuffix();

  /**
   * Returns a new object of class '<em>Arguments</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arguments</em>'.
   * @generated
   */
  Arguments createArguments();

  /**
   * Returns a new object of class '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression List</em>'.
   * @generated
   */
  ExpressionList createExpressionList();

  /**
   * Returns a new object of class '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast Expression</em>'.
   * @generated
   */
  CastExpression createCastExpression();

  /**
   * Returns a new object of class '<em>Par Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Par Expression</em>'.
   * @generated
   */
  ParExpression createParExpression();

  /**
   * Returns a new object of class '<em>DE LHS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DE LHS</em>'.
   * @generated
   */
  DE_LHS createDE_LHS();

  /**
   * Returns a new object of class '<em>Differential Equation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Differential Equation</em>'.
   * @generated
   */
  DifferentialEquation createDifferentialEquation();

  /**
   * Returns a new object of class '<em>Continuous Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continuous Method</em>'.
   * @generated
   */
  ContinuousMethod createContinuousMethod();

  /**
   * Returns a new object of class '<em>Abstract Continuous Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Continuous Method</em>'.
   * @generated
   */
  AbstractContinuousMethod createAbstractContinuousMethod();

  /**
   * Returns a new object of class '<em>Built In Methods</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Methods</em>'.
   * @generated
   */
  Built_In_Methods createBuilt_In_Methods();

  /**
   * Returns a new object of class '<em>Sqrt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sqrt</em>'.
   * @generated
   */
  Sqrt createSqrt();

  /**
   * Returns a new object of class '<em>Sin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sin</em>'.
   * @generated
   */
  Sin createSin();

  /**
   * Returns a new object of class '<em>Cos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cos</em>'.
   * @generated
   */
  Cos createCos();

  /**
   * Returns a new object of class '<em>Tan</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tan</em>'.
   * @generated
   */
  Tan createTan();

  /**
   * Returns a new object of class '<em>Cot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cot</em>'.
   * @generated
   */
  Cot createCot();

  /**
   * Returns a new object of class '<em>Sec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sec</em>'.
   * @generated
   */
  Sec createSec();

  /**
   * Returns a new object of class '<em>Csc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Csc</em>'.
   * @generated
   */
  Csc createCsc();

  /**
   * Returns a new object of class '<em>Round</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Round</em>'.
   * @generated
   */
  Round createRound();

  /**
   * Returns a new object of class '<em>Floor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Floor</em>'.
   * @generated
   */
  Floor createFloor();

  /**
   * Returns a new object of class '<em>Ceil</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ceil</em>'.
   * @generated
   */
  Ceil createCeil();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Fld</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fld</em>'.
   * @generated
   */
  Fld createFld();

  /**
   * Returns a new object of class '<em>Rem</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rem</em>'.
   * @generated
   */
  Rem createRem();

  /**
   * Returns a new object of class '<em>Mod</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mod</em>'.
   * @generated
   */
  Mod createMod();

  /**
   * Returns a new object of class '<em>Gcd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gcd</em>'.
   * @generated
   */
  Gcd createGcd();

  /**
   * Returns a new object of class '<em>Lcm</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lcm</em>'.
   * @generated
   */
  Lcm createLcm();

  /**
   * Returns a new object of class '<em>Abs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abs</em>'.
   * @generated
   */
  Abs createAbs();

  /**
   * Returns a new object of class '<em>Sign</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sign</em>'.
   * @generated
   */
  Sign createSign();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Hypot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hypot</em>'.
   * @generated
   */
  Hypot createHypot();

  /**
   * Returns a new object of class '<em>Pow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pow</em>'.
   * @generated
   */
  Pow createPow();

  /**
   * Returns a new object of class '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp</em>'.
   * @generated
   */
  Exp createExp();

  /**
   * Returns a new object of class '<em>Log</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Log</em>'.
   * @generated
   */
  Log createLog();

  /**
   * Returns a new object of class '<em>Erf</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Erf</em>'.
   * @generated
   */
  Erf createErf();

  /**
   * Returns a new object of class '<em>Gamma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gamma</em>'.
   * @generated
   */
  Gamma createGamma();

  /**
   * Returns a new object of class '<em>Max</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max</em>'.
   * @generated
   */
  Max createMax();

  /**
   * Returns a new object of class '<em>Min</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min</em>'.
   * @generated
   */
  Min createMin();

  /**
   * Returns a new object of class '<em>Pause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pause</em>'.
   * @generated
   */
  Pause createPause();

  /**
   * Returns a new object of class '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size</em>'.
   * @generated
   */
  Size createSize();

  /**
   * Returns a new object of class '<em>Invariant Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invariant Block</em>'.
   * @generated
   */
  InvariantBlock createInvariantBlock();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Block Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Statement</em>'.
   * @generated
   */
  BlockStatement createBlockStatement();

  /**
   * Returns a new object of class '<em>Local Var Dec Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Var Dec Statement</em>'.
   * @generated
   */
  LocalVarDecStatement createLocalVarDecStatement();

  /**
   * Returns a new object of class '<em>Local Var Dec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Var Dec</em>'.
   * @generated
   */
  LocalVarDec createLocalVarDec();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>For Control</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Control</em>'.
   * @generated
   */
  ForControl createForControl();

  /**
   * Returns a new object of class '<em>Enhanced For Control</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enhanced For Control</em>'.
   * @generated
   */
  EnhancedForControl createEnhancedForControl();

  /**
   * Returns a new object of class '<em>For Init</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Init</em>'.
   * @generated
   */
  ForInit createForInit();

  /**
   * Returns a new object of class '<em>For Update</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Update</em>'.
   * @generated
   */
  ForUpdate createForUpdate();

  /**
   * Returns a new object of class '<em>Composition Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Method</em>'.
   * @generated
   */
  CompositionMethod createCompositionMethod();

  /**
   * Returns a new object of class '<em>Control Switch Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Control Switch Composition</em>'.
   * @generated
   */
  ControlSwitchComposition createControlSwitchComposition();

  /**
   * Returns a new object of class '<em>Discrete Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discrete Block</em>'.
   * @generated
   */
  DiscreteBlock createDiscreteBlock();

  /**
   * Returns a new object of class '<em>Condition Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Block</em>'.
   * @generated
   */
  ConditionBlock createConditionBlock();

  /**
   * Returns a new object of class '<em>Discrete Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Discrete Method</em>'.
   * @generated
   */
  DiscreteMethod createDiscreteMethod();

  /**
   * Returns a new object of class '<em>Abstract Discrete Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Discrete Method</em>'.
   * @generated
   */
  AbstractDiscreteMethod createAbstractDiscreteMethod();

  /**
   * Returns a new object of class '<em>Init Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Init Method</em>'.
   * @generated
   */
  InitMethod createInitMethod();

  /**
   * Returns a new object of class '<em>Abstract Init Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Init Method</em>'.
   * @generated
   */
  AbstractInitMethod createAbstractInitMethod();

  /**
   * Returns a new object of class '<em>New By Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New By Class</em>'.
   * @generated
   */
  NewByClass createNewByClass();

  /**
   * Returns a new object of class '<em>New Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Array</em>'.
   * @generated
   */
  NewArray createNewArray();

  /**
   * Returns a new object of class '<em>Dim Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dim Expr</em>'.
   * @generated
   */
  DimExpr createDimExpr();

  /**
   * Returns a new object of class '<em>body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>body</em>'.
   * @generated
   */
  body createbody();

  /**
   * Returns a new object of class '<em>Infinite Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Infinite Literal</em>'.
   * @generated
   */
  InfiniteLiteral createInfiniteLiteral();

  /**
   * Returns a new object of class '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal</em>'.
   * @generated
   */
  IntegerLiteral createIntegerLiteral();

  /**
   * Returns a new object of class '<em>Floating Point Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Floating Point Literal</em>'.
   * @generated
   */
  FloatingPointLiteral createFloatingPointLiteral();

  /**
   * Returns a new object of class '<em>Character Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Character Literal</em>'.
   * @generated
   */
  CharacterLiteral createCharacterLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>dimex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>dimex</em>'.
   * @generated
   */
  dimex createdimex();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ApricotPackage getApricotPackage();

} //ApricotFactory
