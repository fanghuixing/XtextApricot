/**
 */
package org.xtext.fofo.apricot.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.fofo.apricot.ApricotPackage
 * @generated
 */
public class ApricotAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ApricotPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApricotAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ApricotPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApricotSwitch<Adapter> modelSwitch =
    new ApricotSwitch<Adapter>()
    {
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseRefType(RefType object)
      {
        return createRefTypeAdapter();
      }
      @Override
      public Adapter caseNonRefType(NonRefType object)
      {
        return createNonRefTypeAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseMathType(MathType object)
      {
        return createMathTypeAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseClass(org.xtext.fofo.apricot.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseConstructorMethod(ConstructorMethod object)
      {
        return createConstructorMethodAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseAbstractMethod(AbstractMethod object)
      {
        return createAbstractMethodAdapter();
      }
      @Override
      public Adapter caseUseType(UseType object)
      {
        return createUseTypeAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseTypedElement(TypedElement object)
      {
        return createTypedElementAdapter();
      }
      @Override
      public Adapter caseMethodBody(MethodBody object)
      {
        return createMethodBodyAdapter();
      }
      @Override
      public Adapter caseAbstractMethodBody(AbstractMethodBody object)
      {
        return createAbstractMethodBodyAdapter();
      }
      @Override
      public Adapter caseVariableInitializer(VariableInitializer object)
      {
        return createVariableInitializerAdapter();
      }
      @Override
      public Adapter caseReturnStatement(ReturnStatement object)
      {
        return createReturnStatementAdapter();
      }
      @Override
      public Adapter caseAbstractInterfaceElement(AbstractInterfaceElement object)
      {
        return createAbstractInterfaceElementAdapter();
      }
      @Override
      public Adapter caseRequires(Requires object)
      {
        return createRequiresAdapter();
      }
      @Override
      public Adapter caseAbstractDynamicSwitch(AbstractDynamicSwitch object)
      {
        return createAbstractDynamicSwitchAdapter();
      }
      @Override
      public Adapter caseAbstractCompositionMethod(AbstractCompositionMethod object)
      {
        return createAbstractCompositionMethodAdapter();
      }
      @Override
      public Adapter caseNativeStartMethod(NativeStartMethod object)
      {
        return createNativeStartMethodAdapter();
      }
      @Override
      public Adapter caseRequiresAbstractComposition(RequiresAbstractComposition object)
      {
        return createRequiresAbstractCompositionAdapter();
      }
      @Override
      public Adapter caseClockConstraint(ClockConstraint object)
      {
        return createClockConstraintAdapter();
      }
      @Override
      public Adapter caseAbstractInvariant(AbstractInvariant object)
      {
        return createAbstractInvariantAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalExpression(ConditionalExpression object)
      {
        return createConditionalExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalOrExpression(ConditionalOrExpression object)
      {
        return createConditionalOrExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalAndExpression(ConditionalAndExpression object)
      {
        return createConditionalAndExpressionAdapter();
      }
      @Override
      public Adapter caseExclusiveOrExpression(ExclusiveOrExpression object)
      {
        return createExclusiveOrExpressionAdapter();
      }
      @Override
      public Adapter caseEqualityExpression(EqualityExpression object)
      {
        return createEqualityExpressionAdapter();
      }
      @Override
      public Adapter caseInstanceOfExpression(InstanceOfExpression object)
      {
        return createInstanceOfExpressionAdapter();
      }
      @Override
      public Adapter caseRelationalExpression(RelationalExpression object)
      {
        return createRelationalExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpression(MultiplicativeExpression object)
      {
        return createMultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinus object)
      {
        return createUnaryExpressionNotPlusMinusAdapter();
      }
      @Override
      public Adapter casePrimary(Primary object)
      {
        return createPrimaryAdapter();
      }
      @Override
      public Adapter caseIdentifierSuffix(IdentifierSuffix object)
      {
        return createIdentifierSuffixAdapter();
      }
      @Override
      public Adapter caseArguments(Arguments object)
      {
        return createArgumentsAdapter();
      }
      @Override
      public Adapter caseExpressionList(ExpressionList object)
      {
        return createExpressionListAdapter();
      }
      @Override
      public Adapter caseCastExpression(CastExpression object)
      {
        return createCastExpressionAdapter();
      }
      @Override
      public Adapter caseParExpression(ParExpression object)
      {
        return createParExpressionAdapter();
      }
      @Override
      public Adapter caseDE_LHS(DE_LHS object)
      {
        return createDE_LHSAdapter();
      }
      @Override
      public Adapter caseDifferentialEquation(DifferentialEquation object)
      {
        return createDifferentialEquationAdapter();
      }
      @Override
      public Adapter caseContinuousMethod(ContinuousMethod object)
      {
        return createContinuousMethodAdapter();
      }
      @Override
      public Adapter caseAbstractContinuousMethod(AbstractContinuousMethod object)
      {
        return createAbstractContinuousMethodAdapter();
      }
      @Override
      public Adapter caseBuilt_In_Methods(Built_In_Methods object)
      {
        return createBuilt_In_MethodsAdapter();
      }
      @Override
      public Adapter caseSqrt(Sqrt object)
      {
        return createSqrtAdapter();
      }
      @Override
      public Adapter caseSin(Sin object)
      {
        return createSinAdapter();
      }
      @Override
      public Adapter caseCos(Cos object)
      {
        return createCosAdapter();
      }
      @Override
      public Adapter caseTan(Tan object)
      {
        return createTanAdapter();
      }
      @Override
      public Adapter caseCot(Cot object)
      {
        return createCotAdapter();
      }
      @Override
      public Adapter caseSec(Sec object)
      {
        return createSecAdapter();
      }
      @Override
      public Adapter caseCsc(Csc object)
      {
        return createCscAdapter();
      }
      @Override
      public Adapter caseRound(Round object)
      {
        return createRoundAdapter();
      }
      @Override
      public Adapter caseFloor(Floor object)
      {
        return createFloorAdapter();
      }
      @Override
      public Adapter caseCeil(Ceil object)
      {
        return createCeilAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseFld(Fld object)
      {
        return createFldAdapter();
      }
      @Override
      public Adapter caseRem(Rem object)
      {
        return createRemAdapter();
      }
      @Override
      public Adapter caseMod(Mod object)
      {
        return createModAdapter();
      }
      @Override
      public Adapter caseGcd(Gcd object)
      {
        return createGcdAdapter();
      }
      @Override
      public Adapter caseLcm(Lcm object)
      {
        return createLcmAdapter();
      }
      @Override
      public Adapter caseAbs(Abs object)
      {
        return createAbsAdapter();
      }
      @Override
      public Adapter caseSign(Sign object)
      {
        return createSignAdapter();
      }
      @Override
      public Adapter caseRoot(Root object)
      {
        return createRootAdapter();
      }
      @Override
      public Adapter caseHypot(Hypot object)
      {
        return createHypotAdapter();
      }
      @Override
      public Adapter casePow(Pow object)
      {
        return createPowAdapter();
      }
      @Override
      public Adapter caseExp(Exp object)
      {
        return createExpAdapter();
      }
      @Override
      public Adapter caseLog(Log object)
      {
        return createLogAdapter();
      }
      @Override
      public Adapter caseErf(Erf object)
      {
        return createErfAdapter();
      }
      @Override
      public Adapter caseGamma(Gamma object)
      {
        return createGammaAdapter();
      }
      @Override
      public Adapter caseMax(Max object)
      {
        return createMaxAdapter();
      }
      @Override
      public Adapter caseMin(Min object)
      {
        return createMinAdapter();
      }
      @Override
      public Adapter casePause(Pause object)
      {
        return createPauseAdapter();
      }
      @Override
      public Adapter caseSize(Size object)
      {
        return createSizeAdapter();
      }
      @Override
      public Adapter caseInvariantBlock(InvariantBlock object)
      {
        return createInvariantBlockAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseBlockStatement(BlockStatement object)
      {
        return createBlockStatementAdapter();
      }
      @Override
      public Adapter caseLocalVarDecStatement(LocalVarDecStatement object)
      {
        return createLocalVarDecStatementAdapter();
      }
      @Override
      public Adapter caseLocalVarDec(LocalVarDec object)
      {
        return createLocalVarDecAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseForControl(ForControl object)
      {
        return createForControlAdapter();
      }
      @Override
      public Adapter caseEnhancedForControl(EnhancedForControl object)
      {
        return createEnhancedForControlAdapter();
      }
      @Override
      public Adapter caseForInit(ForInit object)
      {
        return createForInitAdapter();
      }
      @Override
      public Adapter caseForUpdate(ForUpdate object)
      {
        return createForUpdateAdapter();
      }
      @Override
      public Adapter caseCompositionMethod(CompositionMethod object)
      {
        return createCompositionMethodAdapter();
      }
      @Override
      public Adapter caseControlSwitchComposition(ControlSwitchComposition object)
      {
        return createControlSwitchCompositionAdapter();
      }
      @Override
      public Adapter caseDiscreteBlock(DiscreteBlock object)
      {
        return createDiscreteBlockAdapter();
      }
      @Override
      public Adapter caseConditionBlock(ConditionBlock object)
      {
        return createConditionBlockAdapter();
      }
      @Override
      public Adapter caseDiscreteMethod(DiscreteMethod object)
      {
        return createDiscreteMethodAdapter();
      }
      @Override
      public Adapter caseAbstractDiscreteMethod(AbstractDiscreteMethod object)
      {
        return createAbstractDiscreteMethodAdapter();
      }
      @Override
      public Adapter caseInitMethod(InitMethod object)
      {
        return createInitMethodAdapter();
      }
      @Override
      public Adapter caseAbstractInitMethod(AbstractInitMethod object)
      {
        return createAbstractInitMethodAdapter();
      }
      @Override
      public Adapter caseNewByClass(NewByClass object)
      {
        return createNewByClassAdapter();
      }
      @Override
      public Adapter caseNewArray(NewArray object)
      {
        return createNewArrayAdapter();
      }
      @Override
      public Adapter caseDimExpr(DimExpr object)
      {
        return createDimExprAdapter();
      }
      @Override
      public Adapter casebody(body object)
      {
        return createbodyAdapter();
      }
      @Override
      public Adapter caseInfiniteLiteral(InfiniteLiteral object)
      {
        return createInfiniteLiteralAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseFloatingPointLiteral(FloatingPointLiteral object)
      {
        return createFloatingPointLiteralAdapter();
      }
      @Override
      public Adapter caseCharacterLiteral(CharacterLiteral object)
      {
        return createCharacterLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseNullLiteral(NullLiteral object)
      {
        return createNullLiteralAdapter();
      }
      @Override
      public Adapter casedimex(dimex object)
      {
        return createdimexAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.RefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.RefType
   * @generated
   */
  public Adapter createRefTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.NonRefType <em>Non Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.NonRefType
   * @generated
   */
  public Adapter createNonRefTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.MathType <em>Math Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.MathType
   * @generated
   */
  public Adapter createMathTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ConstructorMethod <em>Constructor Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ConstructorMethod
   * @generated
   */
  public Adapter createConstructorMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AbstractMethod <em>Abstract Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AbstractMethod
   * @generated
   */
  public Adapter createAbstractMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.UseType <em>Use Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.UseType
   * @generated
   */
  public Adapter createUseTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.TypedElement
   * @generated
   */
  public Adapter createTypedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.MethodBody <em>Method Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.MethodBody
   * @generated
   */
  public Adapter createMethodBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AbstractMethodBody <em>Abstract Method Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AbstractMethodBody
   * @generated
   */
  public Adapter createAbstractMethodBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.VariableInitializer <em>Variable Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.VariableInitializer
   * @generated
   */
  public Adapter createVariableInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ReturnStatement
   * @generated
   */
  public Adapter createReturnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AbstractInterfaceElement <em>Abstract Interface Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AbstractInterfaceElement
   * @generated
   */
  public Adapter createAbstractInterfaceElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Requires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Requires
   * @generated
   */
  public Adapter createRequiresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch <em>Abstract Dynamic Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch
   * @generated
   */
  public Adapter createAbstractDynamicSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AbstractCompositionMethod <em>Abstract Composition Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AbstractCompositionMethod
   * @generated
   */
  public Adapter createAbstractCompositionMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.NativeStartMethod <em>Native Start Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.NativeStartMethod
   * @generated
   */
  public Adapter createNativeStartMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.RequiresAbstractComposition <em>Requires Abstract Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.RequiresAbstractComposition
   * @generated
   */
  public Adapter createRequiresAbstractCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ClockConstraint <em>Clock Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ClockConstraint
   * @generated
   */
  public Adapter createClockConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AbstractInvariant <em>Abstract Invariant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AbstractInvariant
   * @generated
   */
  public Adapter createAbstractInvariantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ConditionalExpression
   * @generated
   */
  public Adapter createConditionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ConditionalOrExpression
   * @generated
   */
  public Adapter createConditionalOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ConditionalAndExpression
   * @generated
   */
  public Adapter createConditionalAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ExclusiveOrExpression
   * @generated
   */
  public Adapter createExclusiveOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.EqualityExpression
   * @generated
   */
  public Adapter createEqualityExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.InstanceOfExpression <em>Instance Of Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.InstanceOfExpression
   * @generated
   */
  public Adapter createInstanceOfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.RelationalExpression
   * @generated
   */
  public Adapter createRelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.MultiplicativeExpression
   * @generated
   */
  public Adapter createMultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus <em>Unary Expression Not Plus Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus
   * @generated
   */
  public Adapter createUnaryExpressionNotPlusMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Primary
   * @generated
   */
  public Adapter createPrimaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.IdentifierSuffix <em>Identifier Suffix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.IdentifierSuffix
   * @generated
   */
  public Adapter createIdentifierSuffixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Arguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Arguments
   * @generated
   */
  public Adapter createArgumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ExpressionList
   * @generated
   */
  public Adapter createExpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.CastExpression
   * @generated
   */
  public Adapter createCastExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ParExpression <em>Par Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ParExpression
   * @generated
   */
  public Adapter createParExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.DE_LHS <em>DE LHS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.DE_LHS
   * @generated
   */
  public Adapter createDE_LHSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.DifferentialEquation <em>Differential Equation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.DifferentialEquation
   * @generated
   */
  public Adapter createDifferentialEquationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ContinuousMethod <em>Continuous Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ContinuousMethod
   * @generated
   */
  public Adapter createContinuousMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AbstractContinuousMethod <em>Abstract Continuous Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AbstractContinuousMethod
   * @generated
   */
  public Adapter createAbstractContinuousMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Built_In_Methods <em>Built In Methods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Built_In_Methods
   * @generated
   */
  public Adapter createBuilt_In_MethodsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Sqrt <em>Sqrt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Sqrt
   * @generated
   */
  public Adapter createSqrtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Sin <em>Sin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Sin
   * @generated
   */
  public Adapter createSinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Cos <em>Cos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Cos
   * @generated
   */
  public Adapter createCosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Tan <em>Tan</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Tan
   * @generated
   */
  public Adapter createTanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Cot <em>Cot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Cot
   * @generated
   */
  public Adapter createCotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Sec <em>Sec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Sec
   * @generated
   */
  public Adapter createSecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Csc <em>Csc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Csc
   * @generated
   */
  public Adapter createCscAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Round <em>Round</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Round
   * @generated
   */
  public Adapter createRoundAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Floor <em>Floor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Floor
   * @generated
   */
  public Adapter createFloorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Ceil <em>Ceil</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Ceil
   * @generated
   */
  public Adapter createCeilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Fld <em>Fld</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Fld
   * @generated
   */
  public Adapter createFldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Rem <em>Rem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Rem
   * @generated
   */
  public Adapter createRemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Mod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Mod
   * @generated
   */
  public Adapter createModAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Gcd <em>Gcd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Gcd
   * @generated
   */
  public Adapter createGcdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Lcm <em>Lcm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Lcm
   * @generated
   */
  public Adapter createLcmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Abs <em>Abs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Abs
   * @generated
   */
  public Adapter createAbsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Sign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Sign
   * @generated
   */
  public Adapter createSignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Hypot <em>Hypot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Hypot
   * @generated
   */
  public Adapter createHypotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Pow <em>Pow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Pow
   * @generated
   */
  public Adapter createPowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Exp
   * @generated
   */
  public Adapter createExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Log
   * @generated
   */
  public Adapter createLogAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Erf <em>Erf</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Erf
   * @generated
   */
  public Adapter createErfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Gamma <em>Gamma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Gamma
   * @generated
   */
  public Adapter createGammaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Max <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Max
   * @generated
   */
  public Adapter createMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Min <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Min
   * @generated
   */
  public Adapter createMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Pause
   * @generated
   */
  public Adapter createPauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Size
   * @generated
   */
  public Adapter createSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.InvariantBlock <em>Invariant Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.InvariantBlock
   * @generated
   */
  public Adapter createInvariantBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.BlockStatement
   * @generated
   */
  public Adapter createBlockStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.LocalVarDecStatement <em>Local Var Dec Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.LocalVarDecStatement
   * @generated
   */
  public Adapter createLocalVarDecStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.LocalVarDec <em>Local Var Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.LocalVarDec
   * @generated
   */
  public Adapter createLocalVarDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ForControl <em>For Control</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ForControl
   * @generated
   */
  public Adapter createForControlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.EnhancedForControl <em>Enhanced For Control</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.EnhancedForControl
   * @generated
   */
  public Adapter createEnhancedForControlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ForInit <em>For Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ForInit
   * @generated
   */
  public Adapter createForInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ForUpdate <em>For Update</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ForUpdate
   * @generated
   */
  public Adapter createForUpdateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.CompositionMethod <em>Composition Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.CompositionMethod
   * @generated
   */
  public Adapter createCompositionMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ControlSwitchComposition <em>Control Switch Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition
   * @generated
   */
  public Adapter createControlSwitchCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.DiscreteBlock <em>Discrete Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.DiscreteBlock
   * @generated
   */
  public Adapter createDiscreteBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.ConditionBlock <em>Condition Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.ConditionBlock
   * @generated
   */
  public Adapter createConditionBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.DiscreteMethod <em>Discrete Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.DiscreteMethod
   * @generated
   */
  public Adapter createDiscreteMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AbstractDiscreteMethod <em>Abstract Discrete Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AbstractDiscreteMethod
   * @generated
   */
  public Adapter createAbstractDiscreteMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.InitMethod <em>Init Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.InitMethod
   * @generated
   */
  public Adapter createInitMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.AbstractInitMethod <em>Abstract Init Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.AbstractInitMethod
   * @generated
   */
  public Adapter createAbstractInitMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.NewByClass <em>New By Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.NewByClass
   * @generated
   */
  public Adapter createNewByClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.NewArray <em>New Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.NewArray
   * @generated
   */
  public Adapter createNewArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.DimExpr <em>Dim Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.DimExpr
   * @generated
   */
  public Adapter createDimExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.body <em>body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.body
   * @generated
   */
  public Adapter createbodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.InfiniteLiteral <em>Infinite Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.InfiniteLiteral
   * @generated
   */
  public Adapter createInfiniteLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.FloatingPointLiteral <em>Floating Point Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.FloatingPointLiteral
   * @generated
   */
  public Adapter createFloatingPointLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.CharacterLiteral <em>Character Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.CharacterLiteral
   * @generated
   */
  public Adapter createCharacterLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.NullLiteral
   * @generated
   */
  public Adapter createNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.fofo.apricot.dimex <em>dimex</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.fofo.apricot.dimex
   * @generated
   */
  public Adapter createdimexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ApricotAdapterFactory
