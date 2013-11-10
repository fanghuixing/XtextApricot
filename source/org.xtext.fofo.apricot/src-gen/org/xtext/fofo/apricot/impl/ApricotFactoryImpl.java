/**
 */
package org.xtext.fofo.apricot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.fofo.apricot.Abs;
import org.xtext.fofo.apricot.AbstractCompositionMethod;
import org.xtext.fofo.apricot.AbstractContinuousMethod;
import org.xtext.fofo.apricot.AbstractDiscreteMethod;
import org.xtext.fofo.apricot.AbstractDynamicSwitch;
import org.xtext.fofo.apricot.AbstractInitMethod;
import org.xtext.fofo.apricot.AbstractInterfaceElement;
import org.xtext.fofo.apricot.AbstractInvariant;
import org.xtext.fofo.apricot.AbstractMethod;
import org.xtext.fofo.apricot.AbstractMethodBody;
import org.xtext.fofo.apricot.AdditiveExpression;
import org.xtext.fofo.apricot.ApricotFactory;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.Arguments;
import org.xtext.fofo.apricot.BasicType;
import org.xtext.fofo.apricot.Block;
import org.xtext.fofo.apricot.BlockStatement;
import org.xtext.fofo.apricot.BooleanLiteral;
import org.xtext.fofo.apricot.Built_In_Methods;
import org.xtext.fofo.apricot.CastExpression;
import org.xtext.fofo.apricot.Ceil;
import org.xtext.fofo.apricot.CharacterLiteral;
import org.xtext.fofo.apricot.ClockConstraint;
import org.xtext.fofo.apricot.CompositionMethod;
import org.xtext.fofo.apricot.ConditionBlock;
import org.xtext.fofo.apricot.ConditionalAndExpression;
import org.xtext.fofo.apricot.ConditionalExpression;
import org.xtext.fofo.apricot.ConditionalOrExpression;
import org.xtext.fofo.apricot.ConstructorMethod;
import org.xtext.fofo.apricot.ContinuousMethod;
import org.xtext.fofo.apricot.ControlSwitchComposition;
import org.xtext.fofo.apricot.Cos;
import org.xtext.fofo.apricot.Cot;
import org.xtext.fofo.apricot.Csc;
import org.xtext.fofo.apricot.DE_LHS;
import org.xtext.fofo.apricot.DifferentialEquation;
import org.xtext.fofo.apricot.DimExpr;
import org.xtext.fofo.apricot.DiscreteBlock;
import org.xtext.fofo.apricot.DiscreteMethod;
import org.xtext.fofo.apricot.Div;
import org.xtext.fofo.apricot.EnhancedForControl;
import org.xtext.fofo.apricot.EqualityExpression;
import org.xtext.fofo.apricot.Erf;
import org.xtext.fofo.apricot.ExclusiveOrExpression;
import org.xtext.fofo.apricot.Exp;
import org.xtext.fofo.apricot.Expression;
import org.xtext.fofo.apricot.ExpressionList;
import org.xtext.fofo.apricot.Field;
import org.xtext.fofo.apricot.Fld;
import org.xtext.fofo.apricot.FloatingPointLiteral;
import org.xtext.fofo.apricot.Floor;
import org.xtext.fofo.apricot.ForControl;
import org.xtext.fofo.apricot.ForInit;
import org.xtext.fofo.apricot.ForUpdate;
import org.xtext.fofo.apricot.Gamma;
import org.xtext.fofo.apricot.Gcd;
import org.xtext.fofo.apricot.Hypot;
import org.xtext.fofo.apricot.IdentifierSuffix;
import org.xtext.fofo.apricot.Import;
import org.xtext.fofo.apricot.InfiniteLiteral;
import org.xtext.fofo.apricot.InitMethod;
import org.xtext.fofo.apricot.InstanceOfExpression;
import org.xtext.fofo.apricot.IntegerLiteral;
import org.xtext.fofo.apricot.Interface;
import org.xtext.fofo.apricot.InvariantBlock;
import org.xtext.fofo.apricot.Lcm;
import org.xtext.fofo.apricot.LocalVarDec;
import org.xtext.fofo.apricot.LocalVarDecStatement;
import org.xtext.fofo.apricot.Log;
import org.xtext.fofo.apricot.MathType;
import org.xtext.fofo.apricot.Max;
import org.xtext.fofo.apricot.Member;
import org.xtext.fofo.apricot.Method;
import org.xtext.fofo.apricot.MethodBody;
import org.xtext.fofo.apricot.Min;
import org.xtext.fofo.apricot.Mod;
import org.xtext.fofo.apricot.MultiplicativeExpression;
import org.xtext.fofo.apricot.NativeStartMethod;
import org.xtext.fofo.apricot.NewArray;
import org.xtext.fofo.apricot.NewByClass;
import org.xtext.fofo.apricot.NonRefType;
import org.xtext.fofo.apricot.NullLiteral;
import org.xtext.fofo.apricot.PackageDeclaration;
import org.xtext.fofo.apricot.ParExpression;
import org.xtext.fofo.apricot.Parameter;
import org.xtext.fofo.apricot.Pause;
import org.xtext.fofo.apricot.Pow;
import org.xtext.fofo.apricot.Primary;
import org.xtext.fofo.apricot.RefType;
import org.xtext.fofo.apricot.RelationalExpression;
import org.xtext.fofo.apricot.Rem;
import org.xtext.fofo.apricot.Requires;
import org.xtext.fofo.apricot.RequiresAbstractComposition;
import org.xtext.fofo.apricot.ReturnStatement;
import org.xtext.fofo.apricot.Root;
import org.xtext.fofo.apricot.Round;
import org.xtext.fofo.apricot.Sec;
import org.xtext.fofo.apricot.Sign;
import org.xtext.fofo.apricot.Sin;
import org.xtext.fofo.apricot.Size;
import org.xtext.fofo.apricot.Sqrt;
import org.xtext.fofo.apricot.Statement;
import org.xtext.fofo.apricot.StringLiteral;
import org.xtext.fofo.apricot.Tan;
import org.xtext.fofo.apricot.TypedElement;
import org.xtext.fofo.apricot.UnaryExpression;
import org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus;
import org.xtext.fofo.apricot.UseType;
import org.xtext.fofo.apricot.VariableInitializer;
import org.xtext.fofo.apricot.body;
import org.xtext.fofo.apricot.dimex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApricotFactoryImpl extends EFactoryImpl implements ApricotFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ApricotFactory init()
  {
    try
    {
      ApricotFactory theApricotFactory = (ApricotFactory)EPackage.Registry.INSTANCE.getEFactory(ApricotPackage.eNS_URI);
      if (theApricotFactory != null)
      {
        return theApricotFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ApricotFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApricotFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ApricotPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case ApricotPackage.IMPORT: return createImport();
      case ApricotPackage.REF_TYPE: return createRefType();
      case ApricotPackage.NON_REF_TYPE: return createNonRefType();
      case ApricotPackage.BASIC_TYPE: return createBasicType();
      case ApricotPackage.MATH_TYPE: return createMathType();
      case ApricotPackage.INTERFACE: return createInterface();
      case ApricotPackage.CLASS: return createClass();
      case ApricotPackage.MEMBER: return createMember();
      case ApricotPackage.FIELD: return createField();
      case ApricotPackage.CONSTRUCTOR_METHOD: return createConstructorMethod();
      case ApricotPackage.METHOD: return createMethod();
      case ApricotPackage.ABSTRACT_METHOD: return createAbstractMethod();
      case ApricotPackage.USE_TYPE: return createUseType();
      case ApricotPackage.PARAMETER: return createParameter();
      case ApricotPackage.TYPED_ELEMENT: return createTypedElement();
      case ApricotPackage.METHOD_BODY: return createMethodBody();
      case ApricotPackage.ABSTRACT_METHOD_BODY: return createAbstractMethodBody();
      case ApricotPackage.VARIABLE_INITIALIZER: return createVariableInitializer();
      case ApricotPackage.RETURN_STATEMENT: return createReturnStatement();
      case ApricotPackage.ABSTRACT_INTERFACE_ELEMENT: return createAbstractInterfaceElement();
      case ApricotPackage.REQUIRES: return createRequires();
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH: return createAbstractDynamicSwitch();
      case ApricotPackage.ABSTRACT_COMPOSITION_METHOD: return createAbstractCompositionMethod();
      case ApricotPackage.NATIVE_START_METHOD: return createNativeStartMethod();
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION: return createRequiresAbstractComposition();
      case ApricotPackage.CLOCK_CONSTRAINT: return createClockConstraint();
      case ApricotPackage.ABSTRACT_INVARIANT: return createAbstractInvariant();
      case ApricotPackage.EXPRESSION: return createExpression();
      case ApricotPackage.CONDITIONAL_EXPRESSION: return createConditionalExpression();
      case ApricotPackage.CONDITIONAL_OR_EXPRESSION: return createConditionalOrExpression();
      case ApricotPackage.CONDITIONAL_AND_EXPRESSION: return createConditionalAndExpression();
      case ApricotPackage.EXCLUSIVE_OR_EXPRESSION: return createExclusiveOrExpression();
      case ApricotPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case ApricotPackage.INSTANCE_OF_EXPRESSION: return createInstanceOfExpression();
      case ApricotPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
      case ApricotPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case ApricotPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case ApricotPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS: return createUnaryExpressionNotPlusMinus();
      case ApricotPackage.PRIMARY: return createPrimary();
      case ApricotPackage.IDENTIFIER_SUFFIX: return createIdentifierSuffix();
      case ApricotPackage.ARGUMENTS: return createArguments();
      case ApricotPackage.EXPRESSION_LIST: return createExpressionList();
      case ApricotPackage.CAST_EXPRESSION: return createCastExpression();
      case ApricotPackage.PAR_EXPRESSION: return createParExpression();
      case ApricotPackage.DE_LHS: return createDE_LHS();
      case ApricotPackage.DIFFERENTIAL_EQUATION: return createDifferentialEquation();
      case ApricotPackage.CONTINUOUS_METHOD: return createContinuousMethod();
      case ApricotPackage.ABSTRACT_CONTINUOUS_METHOD: return createAbstractContinuousMethod();
      case ApricotPackage.BUILT_IN_METHODS: return createBuilt_In_Methods();
      case ApricotPackage.SQRT: return createSqrt();
      case ApricotPackage.SIN: return createSin();
      case ApricotPackage.COS: return createCos();
      case ApricotPackage.TAN: return createTan();
      case ApricotPackage.COT: return createCot();
      case ApricotPackage.SEC: return createSec();
      case ApricotPackage.CSC: return createCsc();
      case ApricotPackage.ROUND: return createRound();
      case ApricotPackage.FLOOR: return createFloor();
      case ApricotPackage.CEIL: return createCeil();
      case ApricotPackage.DIV: return createDiv();
      case ApricotPackage.FLD: return createFld();
      case ApricotPackage.REM: return createRem();
      case ApricotPackage.MOD: return createMod();
      case ApricotPackage.GCD: return createGcd();
      case ApricotPackage.LCM: return createLcm();
      case ApricotPackage.ABS: return createAbs();
      case ApricotPackage.SIGN: return createSign();
      case ApricotPackage.ROOT: return createRoot();
      case ApricotPackage.HYPOT: return createHypot();
      case ApricotPackage.POW: return createPow();
      case ApricotPackage.EXP: return createExp();
      case ApricotPackage.LOG: return createLog();
      case ApricotPackage.ERF: return createErf();
      case ApricotPackage.GAMMA: return createGamma();
      case ApricotPackage.MAX: return createMax();
      case ApricotPackage.MIN: return createMin();
      case ApricotPackage.PAUSE: return createPause();
      case ApricotPackage.SIZE: return createSize();
      case ApricotPackage.INVARIANT_BLOCK: return createInvariantBlock();
      case ApricotPackage.BLOCK: return createBlock();
      case ApricotPackage.BLOCK_STATEMENT: return createBlockStatement();
      case ApricotPackage.LOCAL_VAR_DEC_STATEMENT: return createLocalVarDecStatement();
      case ApricotPackage.LOCAL_VAR_DEC: return createLocalVarDec();
      case ApricotPackage.STATEMENT: return createStatement();
      case ApricotPackage.FOR_CONTROL: return createForControl();
      case ApricotPackage.ENHANCED_FOR_CONTROL: return createEnhancedForControl();
      case ApricotPackage.FOR_INIT: return createForInit();
      case ApricotPackage.FOR_UPDATE: return createForUpdate();
      case ApricotPackage.COMPOSITION_METHOD: return createCompositionMethod();
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION: return createControlSwitchComposition();
      case ApricotPackage.DISCRETE_BLOCK: return createDiscreteBlock();
      case ApricotPackage.CONDITION_BLOCK: return createConditionBlock();
      case ApricotPackage.DISCRETE_METHOD: return createDiscreteMethod();
      case ApricotPackage.ABSTRACT_DISCRETE_METHOD: return createAbstractDiscreteMethod();
      case ApricotPackage.INIT_METHOD: return createInitMethod();
      case ApricotPackage.ABSTRACT_INIT_METHOD: return createAbstractInitMethod();
      case ApricotPackage.NEW_BY_CLASS: return createNewByClass();
      case ApricotPackage.NEW_ARRAY: return createNewArray();
      case ApricotPackage.DIM_EXPR: return createDimExpr();
      case ApricotPackage.BODY: return createbody();
      case ApricotPackage.INFINITE_LITERAL: return createInfiniteLiteral();
      case ApricotPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case ApricotPackage.FLOATING_POINT_LITERAL: return createFloatingPointLiteral();
      case ApricotPackage.CHARACTER_LITERAL: return createCharacterLiteral();
      case ApricotPackage.STRING_LITERAL: return createStringLiteral();
      case ApricotPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case ApricotPackage.NULL_LITERAL: return createNullLiteral();
      case ApricotPackage.DIMEX: return createdimex();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefType createRefType()
  {
    RefTypeImpl refType = new RefTypeImpl();
    return refType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonRefType createNonRefType()
  {
    NonRefTypeImpl nonRefType = new NonRefTypeImpl();
    return nonRefType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathType createMathType()
  {
    MathTypeImpl mathType = new MathTypeImpl();
    return mathType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.fofo.apricot.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorMethod createConstructorMethod()
  {
    ConstructorMethodImpl constructorMethod = new ConstructorMethodImpl();
    return constructorMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractMethod createAbstractMethod()
  {
    AbstractMethodImpl abstractMethod = new AbstractMethodImpl();
    return abstractMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseType createUseType()
  {
    UseTypeImpl useType = new UseTypeImpl();
    return useType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedElement createTypedElement()
  {
    TypedElementImpl typedElement = new TypedElementImpl();
    return typedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodBody createMethodBody()
  {
    MethodBodyImpl methodBody = new MethodBodyImpl();
    return methodBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractMethodBody createAbstractMethodBody()
  {
    AbstractMethodBodyImpl abstractMethodBody = new AbstractMethodBodyImpl();
    return abstractMethodBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableInitializer createVariableInitializer()
  {
    VariableInitializerImpl variableInitializer = new VariableInitializerImpl();
    return variableInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractInterfaceElement createAbstractInterfaceElement()
  {
    AbstractInterfaceElementImpl abstractInterfaceElement = new AbstractInterfaceElementImpl();
    return abstractInterfaceElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requires createRequires()
  {
    RequiresImpl requires = new RequiresImpl();
    return requires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDynamicSwitch createAbstractDynamicSwitch()
  {
    AbstractDynamicSwitchImpl abstractDynamicSwitch = new AbstractDynamicSwitchImpl();
    return abstractDynamicSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractCompositionMethod createAbstractCompositionMethod()
  {
    AbstractCompositionMethodImpl abstractCompositionMethod = new AbstractCompositionMethodImpl();
    return abstractCompositionMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeStartMethod createNativeStartMethod()
  {
    NativeStartMethodImpl nativeStartMethod = new NativeStartMethodImpl();
    return nativeStartMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiresAbstractComposition createRequiresAbstractComposition()
  {
    RequiresAbstractCompositionImpl requiresAbstractComposition = new RequiresAbstractCompositionImpl();
    return requiresAbstractComposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClockConstraint createClockConstraint()
  {
    ClockConstraintImpl clockConstraint = new ClockConstraintImpl();
    return clockConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractInvariant createAbstractInvariant()
  {
    AbstractInvariantImpl abstractInvariant = new AbstractInvariantImpl();
    return abstractInvariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalExpression createConditionalExpression()
  {
    ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
    return conditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalOrExpression createConditionalOrExpression()
  {
    ConditionalOrExpressionImpl conditionalOrExpression = new ConditionalOrExpressionImpl();
    return conditionalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalAndExpression createConditionalAndExpression()
  {
    ConditionalAndExpressionImpl conditionalAndExpression = new ConditionalAndExpressionImpl();
    return conditionalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusiveOrExpression createExclusiveOrExpression()
  {
    ExclusiveOrExpressionImpl exclusiveOrExpression = new ExclusiveOrExpressionImpl();
    return exclusiveOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceOfExpression createInstanceOfExpression()
  {
    InstanceOfExpressionImpl instanceOfExpression = new InstanceOfExpressionImpl();
    return instanceOfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalExpression createRelationalExpression()
  {
    RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
    return relationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpressionNotPlusMinus createUnaryExpressionNotPlusMinus()
  {
    UnaryExpressionNotPlusMinusImpl unaryExpressionNotPlusMinus = new UnaryExpressionNotPlusMinusImpl();
    return unaryExpressionNotPlusMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentifierSuffix createIdentifierSuffix()
  {
    IdentifierSuffixImpl identifierSuffix = new IdentifierSuffixImpl();
    return identifierSuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arguments createArguments()
  {
    ArgumentsImpl arguments = new ArgumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList createExpressionList()
  {
    ExpressionListImpl expressionList = new ExpressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression createCastExpression()
  {
    CastExpressionImpl castExpression = new CastExpressionImpl();
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParExpression createParExpression()
  {
    ParExpressionImpl parExpression = new ParExpressionImpl();
    return parExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DE_LHS createDE_LHS()
  {
    DE_LHSImpl dE_LHS = new DE_LHSImpl();
    return dE_LHS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DifferentialEquation createDifferentialEquation()
  {
    DifferentialEquationImpl differentialEquation = new DifferentialEquationImpl();
    return differentialEquation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContinuousMethod createContinuousMethod()
  {
    ContinuousMethodImpl continuousMethod = new ContinuousMethodImpl();
    return continuousMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractContinuousMethod createAbstractContinuousMethod()
  {
    AbstractContinuousMethodImpl abstractContinuousMethod = new AbstractContinuousMethodImpl();
    return abstractContinuousMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Built_In_Methods createBuilt_In_Methods()
  {
    Built_In_MethodsImpl built_In_Methods = new Built_In_MethodsImpl();
    return built_In_Methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sqrt createSqrt()
  {
    SqrtImpl sqrt = new SqrtImpl();
    return sqrt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sin createSin()
  {
    SinImpl sin = new SinImpl();
    return sin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cos createCos()
  {
    CosImpl cos = new CosImpl();
    return cos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tan createTan()
  {
    TanImpl tan = new TanImpl();
    return tan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cot createCot()
  {
    CotImpl cot = new CotImpl();
    return cot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sec createSec()
  {
    SecImpl sec = new SecImpl();
    return sec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Csc createCsc()
  {
    CscImpl csc = new CscImpl();
    return csc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Round createRound()
  {
    RoundImpl round = new RoundImpl();
    return round;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Floor createFloor()
  {
    FloorImpl floor = new FloorImpl();
    return floor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ceil createCeil()
  {
    CeilImpl ceil = new CeilImpl();
    return ceil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fld createFld()
  {
    FldImpl fld = new FldImpl();
    return fld;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rem createRem()
  {
    RemImpl rem = new RemImpl();
    return rem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mod createMod()
  {
    ModImpl mod = new ModImpl();
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gcd createGcd()
  {
    GcdImpl gcd = new GcdImpl();
    return gcd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lcm createLcm()
  {
    LcmImpl lcm = new LcmImpl();
    return lcm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abs createAbs()
  {
    AbsImpl abs = new AbsImpl();
    return abs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sign createSign()
  {
    SignImpl sign = new SignImpl();
    return sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hypot createHypot()
  {
    HypotImpl hypot = new HypotImpl();
    return hypot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pow createPow()
  {
    PowImpl pow = new PowImpl();
    return pow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Log createLog()
  {
    LogImpl log = new LogImpl();
    return log;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Erf createErf()
  {
    ErfImpl erf = new ErfImpl();
    return erf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gamma createGamma()
  {
    GammaImpl gamma = new GammaImpl();
    return gamma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Max createMax()
  {
    MaxImpl max = new MaxImpl();
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Min createMin()
  {
    MinImpl min = new MinImpl();
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pause createPause()
  {
    PauseImpl pause = new PauseImpl();
    return pause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InvariantBlock createInvariantBlock()
  {
    InvariantBlockImpl invariantBlock = new InvariantBlockImpl();
    return invariantBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockStatement createBlockStatement()
  {
    BlockStatementImpl blockStatement = new BlockStatementImpl();
    return blockStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVarDecStatement createLocalVarDecStatement()
  {
    LocalVarDecStatementImpl localVarDecStatement = new LocalVarDecStatementImpl();
    return localVarDecStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVarDec createLocalVarDec()
  {
    LocalVarDecImpl localVarDec = new LocalVarDecImpl();
    return localVarDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForControl createForControl()
  {
    ForControlImpl forControl = new ForControlImpl();
    return forControl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnhancedForControl createEnhancedForControl()
  {
    EnhancedForControlImpl enhancedForControl = new EnhancedForControlImpl();
    return enhancedForControl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForInit createForInit()
  {
    ForInitImpl forInit = new ForInitImpl();
    return forInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForUpdate createForUpdate()
  {
    ForUpdateImpl forUpdate = new ForUpdateImpl();
    return forUpdate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositionMethod createCompositionMethod()
  {
    CompositionMethodImpl compositionMethod = new CompositionMethodImpl();
    return compositionMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlSwitchComposition createControlSwitchComposition()
  {
    ControlSwitchCompositionImpl controlSwitchComposition = new ControlSwitchCompositionImpl();
    return controlSwitchComposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteBlock createDiscreteBlock()
  {
    DiscreteBlockImpl discreteBlock = new DiscreteBlockImpl();
    return discreteBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionBlock createConditionBlock()
  {
    ConditionBlockImpl conditionBlock = new ConditionBlockImpl();
    return conditionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiscreteMethod createDiscreteMethod()
  {
    DiscreteMethodImpl discreteMethod = new DiscreteMethodImpl();
    return discreteMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDiscreteMethod createAbstractDiscreteMethod()
  {
    AbstractDiscreteMethodImpl abstractDiscreteMethod = new AbstractDiscreteMethodImpl();
    return abstractDiscreteMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitMethod createInitMethod()
  {
    InitMethodImpl initMethod = new InitMethodImpl();
    return initMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractInitMethod createAbstractInitMethod()
  {
    AbstractInitMethodImpl abstractInitMethod = new AbstractInitMethodImpl();
    return abstractInitMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewByClass createNewByClass()
  {
    NewByClassImpl newByClass = new NewByClassImpl();
    return newByClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewArray createNewArray()
  {
    NewArrayImpl newArray = new NewArrayImpl();
    return newArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DimExpr createDimExpr()
  {
    DimExprImpl dimExpr = new DimExprImpl();
    return dimExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public body createbody()
  {
    bodyImpl body = new bodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfiniteLiteral createInfiniteLiteral()
  {
    InfiniteLiteralImpl infiniteLiteral = new InfiniteLiteralImpl();
    return infiniteLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatingPointLiteral createFloatingPointLiteral()
  {
    FloatingPointLiteralImpl floatingPointLiteral = new FloatingPointLiteralImpl();
    return floatingPointLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharacterLiteral createCharacterLiteral()
  {
    CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
    return characterLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dimex createdimex()
  {
    dimexImpl dimex = new dimexImpl();
    return dimex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApricotPackage getApricotPackage()
  {
    return (ApricotPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ApricotPackage getPackage()
  {
    return ApricotPackage.eINSTANCE;
  }

} //ApricotFactoryImpl
