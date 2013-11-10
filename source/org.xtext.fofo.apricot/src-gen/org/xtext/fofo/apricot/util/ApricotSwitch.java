/**
 */
package org.xtext.fofo.apricot.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.fofo.apricot.ApricotPackage
 * @generated
 */
public class ApricotSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ApricotPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApricotSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ApricotPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ApricotPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.REF_TYPE:
      {
        RefType refType = (RefType)theEObject;
        T result = caseRefType(refType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.NON_REF_TYPE:
      {
        NonRefType nonRefType = (NonRefType)theEObject;
        T result = caseNonRefType(nonRefType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.BASIC_TYPE:
      {
        BasicType basicType = (BasicType)theEObject;
        T result = caseBasicType(basicType);
        if (result == null) result = caseNonRefType(basicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.MATH_TYPE:
      {
        MathType mathType = (MathType)theEObject;
        T result = caseMathType(mathType);
        if (result == null) result = caseNonRefType(mathType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = caseRefType(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CLASS:
      {
        org.xtext.fofo.apricot.Class class_ = (org.xtext.fofo.apricot.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseRefType(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.MEMBER:
      {
        Member member = (Member)theEObject;
        T result = caseMember(member);
        if (result == null) result = caseTypedElement(member);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = caseMember(field);
        if (result == null) result = caseTypedElement(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CONSTRUCTOR_METHOD:
      {
        ConstructorMethod constructorMethod = (ConstructorMethod)theEObject;
        T result = caseConstructorMethod(constructorMethod);
        if (result == null) result = caseMember(constructorMethod);
        if (result == null) result = caseTypedElement(constructorMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = caseMember(method);
        if (result == null) result = caseTypedElement(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABSTRACT_METHOD:
      {
        AbstractMethod abstractMethod = (AbstractMethod)theEObject;
        T result = caseAbstractMethod(abstractMethod);
        if (result == null) result = caseAbstractInterfaceElement(abstractMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.USE_TYPE:
      {
        UseType useType = (UseType)theEObject;
        T result = caseUseType(useType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseTypedElement(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.TYPED_ELEMENT:
      {
        TypedElement typedElement = (TypedElement)theEObject;
        T result = caseTypedElement(typedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.METHOD_BODY:
      {
        MethodBody methodBody = (MethodBody)theEObject;
        T result = caseMethodBody(methodBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABSTRACT_METHOD_BODY:
      {
        AbstractMethodBody abstractMethodBody = (AbstractMethodBody)theEObject;
        T result = caseAbstractMethodBody(abstractMethodBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.VARIABLE_INITIALIZER:
      {
        VariableInitializer variableInitializer = (VariableInitializer)theEObject;
        T result = caseVariableInitializer(variableInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.RETURN_STATEMENT:
      {
        ReturnStatement returnStatement = (ReturnStatement)theEObject;
        T result = caseReturnStatement(returnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABSTRACT_INTERFACE_ELEMENT:
      {
        AbstractInterfaceElement abstractInterfaceElement = (AbstractInterfaceElement)theEObject;
        T result = caseAbstractInterfaceElement(abstractInterfaceElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.REQUIRES:
      {
        Requires requires = (Requires)theEObject;
        T result = caseRequires(requires);
        if (result == null) result = caseAbstractInterfaceElement(requires);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH:
      {
        AbstractDynamicSwitch abstractDynamicSwitch = (AbstractDynamicSwitch)theEObject;
        T result = caseAbstractDynamicSwitch(abstractDynamicSwitch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABSTRACT_COMPOSITION_METHOD:
      {
        AbstractCompositionMethod abstractCompositionMethod = (AbstractCompositionMethod)theEObject;
        T result = caseAbstractCompositionMethod(abstractCompositionMethod);
        if (result == null) result = caseAbstractMethod(abstractCompositionMethod);
        if (result == null) result = caseAbstractInterfaceElement(abstractCompositionMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.NATIVE_START_METHOD:
      {
        NativeStartMethod nativeStartMethod = (NativeStartMethod)theEObject;
        T result = caseNativeStartMethod(nativeStartMethod);
        if (result == null) result = caseAbstractMethod(nativeStartMethod);
        if (result == null) result = caseAbstractInterfaceElement(nativeStartMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION:
      {
        RequiresAbstractComposition requiresAbstractComposition = (RequiresAbstractComposition)theEObject;
        T result = caseRequiresAbstractComposition(requiresAbstractComposition);
        if (result == null) result = caseAbstractMethodBody(requiresAbstractComposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CLOCK_CONSTRAINT:
      {
        ClockConstraint clockConstraint = (ClockConstraint)theEObject;
        T result = caseClockConstraint(clockConstraint);
        if (result == null) result = caseAbstractInterfaceElement(clockConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABSTRACT_INVARIANT:
      {
        AbstractInvariant abstractInvariant = (AbstractInvariant)theEObject;
        T result = caseAbstractInvariant(abstractInvariant);
        if (result == null) result = caseAbstractInterfaceElement(abstractInvariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseVariableInitializer(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CONDITIONAL_EXPRESSION:
      {
        ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
        T result = caseConditionalExpression(conditionalExpression);
        if (result == null) result = caseExpression(conditionalExpression);
        if (result == null) result = caseVariableInitializer(conditionalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CONDITIONAL_OR_EXPRESSION:
      {
        ConditionalOrExpression conditionalOrExpression = (ConditionalOrExpression)theEObject;
        T result = caseConditionalOrExpression(conditionalOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CONDITIONAL_AND_EXPRESSION:
      {
        ConditionalAndExpression conditionalAndExpression = (ConditionalAndExpression)theEObject;
        T result = caseConditionalAndExpression(conditionalAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.EXCLUSIVE_OR_EXPRESSION:
      {
        ExclusiveOrExpression exclusiveOrExpression = (ExclusiveOrExpression)theEObject;
        T result = caseExclusiveOrExpression(exclusiveOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.EQUALITY_EXPRESSION:
      {
        EqualityExpression equalityExpression = (EqualityExpression)theEObject;
        T result = caseEqualityExpression(equalityExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.INSTANCE_OF_EXPRESSION:
      {
        InstanceOfExpression instanceOfExpression = (InstanceOfExpression)theEObject;
        T result = caseInstanceOfExpression(instanceOfExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.RELATIONAL_EXPRESSION:
      {
        RelationalExpression relationalExpression = (RelationalExpression)theEObject;
        T result = caseRelationalExpression(relationalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ADDITIVE_EXPRESSION:
      {
        AdditiveExpression additiveExpression = (AdditiveExpression)theEObject;
        T result = caseAdditiveExpression(additiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.MULTIPLICATIVE_EXPRESSION:
      {
        MultiplicativeExpression multiplicativeExpression = (MultiplicativeExpression)theEObject;
        T result = caseMultiplicativeExpression(multiplicativeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS:
      {
        UnaryExpressionNotPlusMinus unaryExpressionNotPlusMinus = (UnaryExpressionNotPlusMinus)theEObject;
        T result = caseUnaryExpressionNotPlusMinus(unaryExpressionNotPlusMinus);
        if (result == null) result = caseUnaryExpression(unaryExpressionNotPlusMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.PRIMARY:
      {
        Primary primary = (Primary)theEObject;
        T result = casePrimary(primary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.IDENTIFIER_SUFFIX:
      {
        IdentifierSuffix identifierSuffix = (IdentifierSuffix)theEObject;
        T result = caseIdentifierSuffix(identifierSuffix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ARGUMENTS:
      {
        Arguments arguments = (Arguments)theEObject;
        T result = caseArguments(arguments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.EXPRESSION_LIST:
      {
        ExpressionList expressionList = (ExpressionList)theEObject;
        T result = caseExpressionList(expressionList);
        if (result == null) result = caseVariableInitializer(expressionList);
        if (result == null) result = caseForInit(expressionList);
        if (result == null) result = caseForUpdate(expressionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CAST_EXPRESSION:
      {
        CastExpression castExpression = (CastExpression)theEObject;
        T result = caseCastExpression(castExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.PAR_EXPRESSION:
      {
        ParExpression parExpression = (ParExpression)theEObject;
        T result = caseParExpression(parExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.DE_LHS:
      {
        DE_LHS dE_LHS = (DE_LHS)theEObject;
        T result = caseDE_LHS(dE_LHS);
        if (result == null) result = caseBuilt_In_Methods(dE_LHS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.DIFFERENTIAL_EQUATION:
      {
        DifferentialEquation differentialEquation = (DifferentialEquation)theEObject;
        T result = caseDifferentialEquation(differentialEquation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CONTINUOUS_METHOD:
      {
        ContinuousMethod continuousMethod = (ContinuousMethod)theEObject;
        T result = caseContinuousMethod(continuousMethod);
        if (result == null) result = caseMember(continuousMethod);
        if (result == null) result = caseTypedElement(continuousMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABSTRACT_CONTINUOUS_METHOD:
      {
        AbstractContinuousMethod abstractContinuousMethod = (AbstractContinuousMethod)theEObject;
        T result = caseAbstractContinuousMethod(abstractContinuousMethod);
        if (result == null) result = caseAbstractMethod(abstractContinuousMethod);
        if (result == null) result = caseAbstractInterfaceElement(abstractContinuousMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.BUILT_IN_METHODS:
      {
        Built_In_Methods built_In_Methods = (Built_In_Methods)theEObject;
        T result = caseBuilt_In_Methods(built_In_Methods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.SQRT:
      {
        Sqrt sqrt = (Sqrt)theEObject;
        T result = caseSqrt(sqrt);
        if (result == null) result = caseBuilt_In_Methods(sqrt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.SIN:
      {
        Sin sin = (Sin)theEObject;
        T result = caseSin(sin);
        if (result == null) result = caseBuilt_In_Methods(sin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.COS:
      {
        Cos cos = (Cos)theEObject;
        T result = caseCos(cos);
        if (result == null) result = caseBuilt_In_Methods(cos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.TAN:
      {
        Tan tan = (Tan)theEObject;
        T result = caseTan(tan);
        if (result == null) result = caseBuilt_In_Methods(tan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.COT:
      {
        Cot cot = (Cot)theEObject;
        T result = caseCot(cot);
        if (result == null) result = caseBuilt_In_Methods(cot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.SEC:
      {
        Sec sec = (Sec)theEObject;
        T result = caseSec(sec);
        if (result == null) result = caseBuilt_In_Methods(sec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CSC:
      {
        Csc csc = (Csc)theEObject;
        T result = caseCsc(csc);
        if (result == null) result = caseBuilt_In_Methods(csc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ROUND:
      {
        Round round = (Round)theEObject;
        T result = caseRound(round);
        if (result == null) result = caseBuilt_In_Methods(round);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.FLOOR:
      {
        Floor floor = (Floor)theEObject;
        T result = caseFloor(floor);
        if (result == null) result = caseBuilt_In_Methods(floor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CEIL:
      {
        Ceil ceil = (Ceil)theEObject;
        T result = caseCeil(ceil);
        if (result == null) result = caseBuilt_In_Methods(ceil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseBuilt_In_Methods(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.FLD:
      {
        Fld fld = (Fld)theEObject;
        T result = caseFld(fld);
        if (result == null) result = caseBuilt_In_Methods(fld);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.REM:
      {
        Rem rem = (Rem)theEObject;
        T result = caseRem(rem);
        if (result == null) result = caseBuilt_In_Methods(rem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.MOD:
      {
        Mod mod = (Mod)theEObject;
        T result = caseMod(mod);
        if (result == null) result = caseBuilt_In_Methods(mod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.GCD:
      {
        Gcd gcd = (Gcd)theEObject;
        T result = caseGcd(gcd);
        if (result == null) result = caseBuilt_In_Methods(gcd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.LCM:
      {
        Lcm lcm = (Lcm)theEObject;
        T result = caseLcm(lcm);
        if (result == null) result = caseBuilt_In_Methods(lcm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABS:
      {
        Abs abs = (Abs)theEObject;
        T result = caseAbs(abs);
        if (result == null) result = caseBuilt_In_Methods(abs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.SIGN:
      {
        Sign sign = (Sign)theEObject;
        T result = caseSign(sign);
        if (result == null) result = caseBuilt_In_Methods(sign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = caseBuilt_In_Methods(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.HYPOT:
      {
        Hypot hypot = (Hypot)theEObject;
        T result = caseHypot(hypot);
        if (result == null) result = caseBuilt_In_Methods(hypot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.POW:
      {
        Pow pow = (Pow)theEObject;
        T result = casePow(pow);
        if (result == null) result = caseBuilt_In_Methods(pow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.EXP:
      {
        Exp exp = (Exp)theEObject;
        T result = caseExp(exp);
        if (result == null) result = caseBuilt_In_Methods(exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.LOG:
      {
        Log log = (Log)theEObject;
        T result = caseLog(log);
        if (result == null) result = caseBuilt_In_Methods(log);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ERF:
      {
        Erf erf = (Erf)theEObject;
        T result = caseErf(erf);
        if (result == null) result = caseBuilt_In_Methods(erf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.GAMMA:
      {
        Gamma gamma = (Gamma)theEObject;
        T result = caseGamma(gamma);
        if (result == null) result = caseBuilt_In_Methods(gamma);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.MAX:
      {
        Max max = (Max)theEObject;
        T result = caseMax(max);
        if (result == null) result = caseBuilt_In_Methods(max);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.MIN:
      {
        Min min = (Min)theEObject;
        T result = caseMin(min);
        if (result == null) result = caseBuilt_In_Methods(min);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.PAUSE:
      {
        Pause pause = (Pause)theEObject;
        T result = casePause(pause);
        if (result == null) result = caseBuilt_In_Methods(pause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.SIZE:
      {
        Size size = (Size)theEObject;
        T result = caseSize(size);
        if (result == null) result = caseBuilt_In_Methods(size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.INVARIANT_BLOCK:
      {
        InvariantBlock invariantBlock = (InvariantBlock)theEObject;
        T result = caseInvariantBlock(invariantBlock);
        if (result == null) result = caseMember(invariantBlock);
        if (result == null) result = caseTypedElement(invariantBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.BLOCK_STATEMENT:
      {
        BlockStatement blockStatement = (BlockStatement)theEObject;
        T result = caseBlockStatement(blockStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.LOCAL_VAR_DEC_STATEMENT:
      {
        LocalVarDecStatement localVarDecStatement = (LocalVarDecStatement)theEObject;
        T result = caseLocalVarDecStatement(localVarDecStatement);
        if (result == null) result = caseBlockStatement(localVarDecStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.LOCAL_VAR_DEC:
      {
        LocalVarDec localVarDec = (LocalVarDec)theEObject;
        T result = caseLocalVarDec(localVarDec);
        if (result == null) result = caseLocalVarDecStatement(localVarDec);
        if (result == null) result = caseBlockStatement(localVarDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = caseBlockStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.FOR_CONTROL:
      {
        ForControl forControl = (ForControl)theEObject;
        T result = caseForControl(forControl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ENHANCED_FOR_CONTROL:
      {
        EnhancedForControl enhancedForControl = (EnhancedForControl)theEObject;
        T result = caseEnhancedForControl(enhancedForControl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.FOR_INIT:
      {
        ForInit forInit = (ForInit)theEObject;
        T result = caseForInit(forInit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.FOR_UPDATE:
      {
        ForUpdate forUpdate = (ForUpdate)theEObject;
        T result = caseForUpdate(forUpdate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.COMPOSITION_METHOD:
      {
        CompositionMethod compositionMethod = (CompositionMethod)theEObject;
        T result = caseCompositionMethod(compositionMethod);
        if (result == null) result = caseMember(compositionMethod);
        if (result == null) result = caseTypedElement(compositionMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CONTROL_SWITCH_COMPOSITION:
      {
        ControlSwitchComposition controlSwitchComposition = (ControlSwitchComposition)theEObject;
        T result = caseControlSwitchComposition(controlSwitchComposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.DISCRETE_BLOCK:
      {
        DiscreteBlock discreteBlock = (DiscreteBlock)theEObject;
        T result = caseDiscreteBlock(discreteBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CONDITION_BLOCK:
      {
        ConditionBlock conditionBlock = (ConditionBlock)theEObject;
        T result = caseConditionBlock(conditionBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.DISCRETE_METHOD:
      {
        DiscreteMethod discreteMethod = (DiscreteMethod)theEObject;
        T result = caseDiscreteMethod(discreteMethod);
        if (result == null) result = caseMember(discreteMethod);
        if (result == null) result = caseTypedElement(discreteMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABSTRACT_DISCRETE_METHOD:
      {
        AbstractDiscreteMethod abstractDiscreteMethod = (AbstractDiscreteMethod)theEObject;
        T result = caseAbstractDiscreteMethod(abstractDiscreteMethod);
        if (result == null) result = caseAbstractMethod(abstractDiscreteMethod);
        if (result == null) result = caseAbstractInterfaceElement(abstractDiscreteMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.INIT_METHOD:
      {
        InitMethod initMethod = (InitMethod)theEObject;
        T result = caseInitMethod(initMethod);
        if (result == null) result = caseMember(initMethod);
        if (result == null) result = caseTypedElement(initMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.ABSTRACT_INIT_METHOD:
      {
        AbstractInitMethod abstractInitMethod = (AbstractInitMethod)theEObject;
        T result = caseAbstractInitMethod(abstractInitMethod);
        if (result == null) result = caseAbstractMethod(abstractInitMethod);
        if (result == null) result = caseAbstractInterfaceElement(abstractInitMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.NEW_BY_CLASS:
      {
        NewByClass newByClass = (NewByClass)theEObject;
        T result = caseNewByClass(newByClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.NEW_ARRAY:
      {
        NewArray newArray = (NewArray)theEObject;
        T result = caseNewArray(newArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.DIM_EXPR:
      {
        DimExpr dimExpr = (DimExpr)theEObject;
        T result = caseDimExpr(dimExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.BODY:
      {
        body body = (body)theEObject;
        T result = casebody(body);
        if (result == null) result = caseMethodBody(body);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.INFINITE_LITERAL:
      {
        InfiniteLiteral infiniteLiteral = (InfiniteLiteral)theEObject;
        T result = caseInfiniteLiteral(infiniteLiteral);
        if (result == null) result = caseExpression(infiniteLiteral);
        if (result == null) result = caseVariableInitializer(infiniteLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseExpression(integerLiteral);
        if (result == null) result = caseVariableInitializer(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.FLOATING_POINT_LITERAL:
      {
        FloatingPointLiteral floatingPointLiteral = (FloatingPointLiteral)theEObject;
        T result = caseFloatingPointLiteral(floatingPointLiteral);
        if (result == null) result = caseExpression(floatingPointLiteral);
        if (result == null) result = caseVariableInitializer(floatingPointLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.CHARACTER_LITERAL:
      {
        CharacterLiteral characterLiteral = (CharacterLiteral)theEObject;
        T result = caseCharacterLiteral(characterLiteral);
        if (result == null) result = caseExpression(characterLiteral);
        if (result == null) result = caseVariableInitializer(characterLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = caseVariableInitializer(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = caseVariableInitializer(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.NULL_LITERAL:
      {
        NullLiteral nullLiteral = (NullLiteral)theEObject;
        T result = caseNullLiteral(nullLiteral);
        if (result == null) result = caseExpression(nullLiteral);
        if (result == null) result = caseVariableInitializer(nullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ApricotPackage.DIMEX:
      {
        dimex dimex = (dimex)theEObject;
        T result = casedimex(dimex);
        if (result == null) result = caseDimExpr(dimex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefType(RefType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Ref Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Ref Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonRefType(NonRefType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicType(BasicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Math Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Math Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMathType(MathType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(org.xtext.fofo.apricot.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructorMethod(ConstructorMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMethod(AbstractMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Use Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Use Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUseType(UseType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedElement(TypedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodBody(MethodBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Method Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Method Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMethodBody(AbstractMethodBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableInitializer(VariableInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStatement(ReturnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Interface Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Interface Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractInterfaceElement(AbstractInterfaceElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requires</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requires</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequires(Requires object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Dynamic Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Dynamic Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDynamicSwitch(AbstractDynamicSwitch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Composition Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Composition Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractCompositionMethod(AbstractCompositionMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Native Start Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Native Start Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNativeStartMethod(NativeStartMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requires Abstract Composition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requires Abstract Composition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiresAbstractComposition(RequiresAbstractComposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clock Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClockConstraint(ClockConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Invariant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Invariant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractInvariant(AbstractInvariant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalExpression(ConditionalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalOrExpression(ConditionalOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalAndExpression(ConditionalAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exclusive Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exclusive Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExclusiveOrExpression(ExclusiveOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualityExpression(EqualityExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceOfExpression(InstanceOfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalExpression(RelationalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExpression(AdditiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpression(MultiplicativeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpression(UnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression Not Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression Not Plus Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpressionNotPlusMinus(UnaryExpressionNotPlusMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimary(Primary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identifier Suffix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identifier Suffix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentifierSuffix(IdentifierSuffix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arguments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arguments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArguments(Arguments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionList(ExpressionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastExpression(CastExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Par Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Par Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParExpression(ParExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DE LHS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DE LHS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDE_LHS(DE_LHS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Differential Equation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Differential Equation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDifferentialEquation(DifferentialEquation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continuous Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continuous Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinuousMethod(ContinuousMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Continuous Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Continuous Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractContinuousMethod(AbstractContinuousMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Methods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Methods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuilt_In_Methods(Built_In_Methods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sqrt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sqrt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSqrt(Sqrt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSin(Sin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCos(Cos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tan</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tan</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTan(Tan object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCot(Cot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSec(Sec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Csc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Csc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCsc(Csc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Round</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Round</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRound(Round object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Floor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Floor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloor(Floor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ceil</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ceil</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCeil(Ceil object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fld</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fld</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFld(Fld object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRem(Rem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMod(Mod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gcd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gcd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGcd(Gcd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lcm</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lcm</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLcm(Lcm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbs(Abs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSign(Sign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hypot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hypot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHypot(Hypot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePow(Pow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp(Exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Log</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Log</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLog(Log object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Erf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Erf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErf(Erf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gamma</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gamma</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGamma(Gamma object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMax(Max object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMin(Min object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePause(Pause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSize(Size object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Invariant Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Invariant Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInvariantBlock(InvariantBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockStatement(BlockStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Var Dec Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Var Dec Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalVarDecStatement(LocalVarDecStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Var Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Var Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalVarDec(LocalVarDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForControl(ForControl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enhanced For Control</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enhanced For Control</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnhancedForControl(EnhancedForControl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForInit(ForInit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Update</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Update</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForUpdate(ForUpdate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositionMethod(CompositionMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Control Switch Composition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Control Switch Composition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseControlSwitchComposition(ControlSwitchComposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discrete Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discrete Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscreteBlock(DiscreteBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionBlock(ConditionBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Discrete Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Discrete Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiscreteMethod(DiscreteMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Discrete Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Discrete Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDiscreteMethod(AbstractDiscreteMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitMethod(InitMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Init Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Init Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractInitMethod(AbstractInitMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New By Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New By Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewByClass(NewByClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewArray(NewArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dim Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dim Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimExpr(DimExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebody(body object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infinite Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infinite Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfiniteLiteral(InfiniteLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Floating Point Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Floating Point Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatingPointLiteral(FloatingPointLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Character Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Character Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacterLiteral(CharacterLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullLiteral(NullLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>dimex</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>dimex</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedimex(dimex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ApricotSwitch
