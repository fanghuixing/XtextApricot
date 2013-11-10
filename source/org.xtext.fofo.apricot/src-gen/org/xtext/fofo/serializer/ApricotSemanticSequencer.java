package org.xtext.fofo.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.fofo.apricot.Abs;
import org.xtext.fofo.apricot.AbstractCompositionMethod;
import org.xtext.fofo.apricot.AbstractContinuousMethod;
import org.xtext.fofo.apricot.AbstractDiscreteMethod;
import org.xtext.fofo.apricot.AbstractDynamicSwitch;
import org.xtext.fofo.apricot.AbstractInitMethod;
import org.xtext.fofo.apricot.AbstractInvariant;
import org.xtext.fofo.apricot.AbstractMethod;
import org.xtext.fofo.apricot.AdditiveExpression;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.Arguments;
import org.xtext.fofo.apricot.BasicType;
import org.xtext.fofo.apricot.Block;
import org.xtext.fofo.apricot.BooleanLiteral;
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
import org.xtext.fofo.apricot.DiscreteBlock;
import org.xtext.fofo.apricot.DiscreteMethod;
import org.xtext.fofo.apricot.Div;
import org.xtext.fofo.apricot.EnhancedForControl;
import org.xtext.fofo.apricot.EqualityExpression;
import org.xtext.fofo.apricot.Erf;
import org.xtext.fofo.apricot.ExclusiveOrExpression;
import org.xtext.fofo.apricot.Exp;
import org.xtext.fofo.apricot.ExpressionList;
import org.xtext.fofo.apricot.Field;
import org.xtext.fofo.apricot.Fld;
import org.xtext.fofo.apricot.FloatingPointLiteral;
import org.xtext.fofo.apricot.Floor;
import org.xtext.fofo.apricot.ForControl;
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
import org.xtext.fofo.apricot.Log;
import org.xtext.fofo.apricot.MathType;
import org.xtext.fofo.apricot.Max;
import org.xtext.fofo.apricot.Method;
import org.xtext.fofo.apricot.Min;
import org.xtext.fofo.apricot.Mod;
import org.xtext.fofo.apricot.MultiplicativeExpression;
import org.xtext.fofo.apricot.NativeStartMethod;
import org.xtext.fofo.apricot.NewArray;
import org.xtext.fofo.apricot.NewByClass;
import org.xtext.fofo.apricot.NullLiteral;
import org.xtext.fofo.apricot.PackageDeclaration;
import org.xtext.fofo.apricot.ParExpression;
import org.xtext.fofo.apricot.Parameter;
import org.xtext.fofo.apricot.Pause;
import org.xtext.fofo.apricot.Pow;
import org.xtext.fofo.apricot.Primary;
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
import org.xtext.fofo.apricot.UnaryExpression;
import org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus;
import org.xtext.fofo.apricot.UseType;
import org.xtext.fofo.apricot.body;
import org.xtext.fofo.apricot.dimex;
import org.xtext.fofo.services.ApricotGrammarAccess;

@SuppressWarnings("all")
public class ApricotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ApricotGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ApricotPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ApricotPackage.ABS:
				if(context == grammarAccess.getAbsRule() ||
				   context == grammarAccess.getBuilt_In_MethodsRule()) {
					sequence_Abs(context, (Abs) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ABSTRACT_COMPOSITION_METHOD:
				if(context == grammarAccess.getAbstractCompositionMethodRule() ||
				   context == grammarAccess.getAbstractInterfaceElementRule() ||
				   context == grammarAccess.getAbstractMethodRule()) {
					sequence_AbstractCompositionMethod(context, (AbstractCompositionMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ABSTRACT_CONTINUOUS_METHOD:
				if(context == grammarAccess.getAbstractContinuousMethodRule() ||
				   context == grammarAccess.getAbstractInterfaceElementRule() ||
				   context == grammarAccess.getAbstractMethodRule()) {
					sequence_AbstractContinuousMethod(context, (AbstractContinuousMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ABSTRACT_DISCRETE_METHOD:
				if(context == grammarAccess.getAbstractDiscreteMethodRule() ||
				   context == grammarAccess.getAbstractInterfaceElementRule() ||
				   context == grammarAccess.getAbstractMethodRule()) {
					sequence_AbstractDiscreteMethod(context, (AbstractDiscreteMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH:
				if(context == grammarAccess.getAbstractDynamicSwitchRule()) {
					sequence_AbstractDynamicSwitch(context, (AbstractDynamicSwitch) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ABSTRACT_INIT_METHOD:
				if(context == grammarAccess.getAbstractInitMethodRule() ||
				   context == grammarAccess.getAbstractInterfaceElementRule() ||
				   context == grammarAccess.getAbstractMethodRule()) {
					sequence_AbstractInitMethod(context, (AbstractInitMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ABSTRACT_INVARIANT:
				if(context == grammarAccess.getAbstractInterfaceElementRule() ||
				   context == grammarAccess.getAbstractInvariantRule()) {
					sequence_AbstractInvariant(context, (AbstractInvariant) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ABSTRACT_METHOD:
				if(context == grammarAccess.getAbstractInterfaceElementRule() ||
				   context == grammarAccess.getAbstractMethodRule()) {
					sequence_AbstractMethod(context, (AbstractMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule()) {
					sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ARGUMENTS:
				if(context == grammarAccess.getArgumentsRule()) {
					sequence_Arguments(context, (Arguments) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.BASIC_TYPE:
				if(context == grammarAccess.getBasicTypeRule() ||
				   context == grammarAccess.getNonRefTypeRule()) {
					sequence_BasicType(context, (BasicType) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CAST_EXPRESSION:
				if(context == grammarAccess.getCastExpressionRule()) {
					sequence_CastExpression(context, (CastExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CEIL:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getCeilRule()) {
					sequence_Ceil(context, (Ceil) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CHARACTER_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (CharacterLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CLASS:
				if(context == grammarAccess.getClassRule() ||
				   context == grammarAccess.getRefTypeRule()) {
					sequence_Class(context, (org.xtext.fofo.apricot.Class) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CLOCK_CONSTRAINT:
				if(context == grammarAccess.getAbstractInterfaceElementRule() ||
				   context == grammarAccess.getClockConstraintRule()) {
					sequence_ClockConstraint(context, (ClockConstraint) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.COMPOSITION_METHOD:
				if(context == grammarAccess.getCompositionMethodRule() ||
				   context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_CompositionMethod(context, (CompositionMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CONDITION_BLOCK:
				if(context == grammarAccess.getConditionBlockRule()) {
					sequence_ConditionBlock(context, (ConditionBlock) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CONDITIONAL_AND_EXPRESSION:
				if(context == grammarAccess.getConditionalAndExpressionRule()) {
					sequence_ConditionalAndExpression(context, (ConditionalAndExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CONDITIONAL_EXPRESSION:
				if(context == grammarAccess.getConditionalExpressionRule()) {
					sequence_ConditionalExpression(context, (ConditionalExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getVariableInitializerRule()) {
					sequence_ConditionalExpression_Expression(context, (ConditionalExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CONDITIONAL_OR_EXPRESSION:
				if(context == grammarAccess.getConditionalOrExpressionRule()) {
					sequence_ConditionalOrExpression(context, (ConditionalOrExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CONSTRUCTOR_METHOD:
				if(context == grammarAccess.getConstructorMethodRule() ||
				   context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_ConstructorMethod(context, (ConstructorMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CONTINUOUS_METHOD:
				if(context == grammarAccess.getContinuousMethodRule() ||
				   context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_ContinuousMethod(context, (ContinuousMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CONTROL_SWITCH_COMPOSITION:
				if(context == grammarAccess.getControlSwitchCompositionRule()) {
					sequence_ControlSwitchComposition(context, (ControlSwitchComposition) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.COS:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getCosRule()) {
					sequence_Cos(context, (Cos) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.COT:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getCotRule()) {
					sequence_Cot(context, (Cot) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CSC:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getCscRule()) {
					sequence_Csc(context, (Csc) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.DE_LHS:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getDE_LHSRule()) {
					sequence_DE_LHS(context, (DE_LHS) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.DIFFERENTIAL_EQUATION:
				if(context == grammarAccess.getDifferentialEquationRule()) {
					sequence_DifferentialEquation(context, (DifferentialEquation) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.DISCRETE_BLOCK:
				if(context == grammarAccess.getDiscreteBlockRule()) {
					sequence_DiscreteBlock(context, (DiscreteBlock) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.DISCRETE_METHOD:
				if(context == grammarAccess.getDiscreteMethodRule() ||
				   context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_DiscreteMethod(context, (DiscreteMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.DIV:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getDivRule()) {
					sequence_Div(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ENHANCED_FOR_CONTROL:
				if(context == grammarAccess.getEnhancedForControlRule()) {
					sequence_EnhancedForControl(context, (EnhancedForControl) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.EQUALITY_EXPRESSION:
				if(context == grammarAccess.getEqualityExpressionRule()) {
					sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ERF:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getErfRule()) {
					sequence_Erf(context, (Erf) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.EXCLUSIVE_OR_EXPRESSION:
				if(context == grammarAccess.getExclusiveOrExpressionRule()) {
					sequence_ExclusiveOrExpression(context, (ExclusiveOrExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.EXP:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getExpRule()) {
					sequence_Exp(context, (Exp) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.EXPRESSION_LIST:
				if(context == grammarAccess.getExpressionListRule() ||
				   context == grammarAccess.getForInitRule() ||
				   context == grammarAccess.getForUpdateRule() ||
				   context == grammarAccess.getVariableInitializerRule()) {
					sequence_ExpressionList(context, (ExpressionList) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.FIELD:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.FLD:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getFldRule()) {
					sequence_Fld(context, (Fld) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.FLOATING_POINT_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (FloatingPointLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.FLOOR:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getFloorRule()) {
					sequence_Floor(context, (Floor) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.FOR_CONTROL:
				if(context == grammarAccess.getForControlRule()) {
					sequence_ForControl(context, (ForControl) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.GAMMA:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getGammaRule()) {
					sequence_Gamma(context, (Gamma) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.GCD:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getGcdRule()) {
					sequence_Gcd(context, (Gcd) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.HYPOT:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getHypotRule()) {
					sequence_Hypot(context, (Hypot) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.IDENTIFIER_SUFFIX:
				if(context == grammarAccess.getIdentifierSuffixRule()) {
					sequence_IdentifierSuffix(context, (IdentifierSuffix) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.INFINITE_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (InfiniteLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.INIT_METHOD:
				if(context == grammarAccess.getInitMethodRule() ||
				   context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_InitMethod(context, (InitMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.INSTANCE_OF_EXPRESSION:
				if(context == grammarAccess.getInstanceOfExpressionRule()) {
					sequence_InstanceOfExpression(context, (InstanceOfExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.INTEGER_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.INTERFACE:
				if(context == grammarAccess.getInterfaceRule() ||
				   context == grammarAccess.getRefTypeRule()) {
					sequence_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.INVARIANT_BLOCK:
				if(context == grammarAccess.getInvariantBlockRule() ||
				   context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_InvariantBlock(context, (InvariantBlock) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.LCM:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getLcmRule()) {
					sequence_Lcm(context, (Lcm) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.LOCAL_VAR_DEC:
				if(context == grammarAccess.getBlockStatementRule() ||
				   context == grammarAccess.getLocalVarDecRule() ||
				   context == grammarAccess.getLocalVarDecStatementRule()) {
					sequence_LocalVarDec(context, (LocalVarDec) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.LOG:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getLogRule()) {
					sequence_Log(context, (Log) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.MATH_TYPE:
				if(context == grammarAccess.getMathTypeRule() ||
				   context == grammarAccess.getNonRefTypeRule()) {
					sequence_MathType(context, (MathType) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.MAX:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getMaxRule()) {
					sequence_Max(context, (Max) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.METHOD:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getMethodRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.MIN:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getMinRule()) {
					sequence_Min(context, (Min) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.MOD:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getModRule()) {
					sequence_Mod(context, (Mod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getMultiplicativeExpressionRule()) {
					sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.NATIVE_START_METHOD:
				if(context == grammarAccess.getAbstractInterfaceElementRule() ||
				   context == grammarAccess.getAbstractMethodRule() ||
				   context == grammarAccess.getNativeStartMethodRule()) {
					sequence_NativeStartMethod(context, (NativeStartMethod) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.NEW_ARRAY:
				if(context == grammarAccess.getNewArrayRule()) {
					sequence_NewArray(context, (NewArray) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.NEW_BY_CLASS:
				if(context == grammarAccess.getNewByClassRule()) {
					sequence_NewByClass(context, (NewByClass) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.NULL_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.PAR_EXPRESSION:
				if(context == grammarAccess.getParExpressionRule()) {
					sequence_ParExpression(context, (ParExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.PAUSE:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getPauseRule()) {
					sequence_Pause(context, (Pause) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.POW:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getPowRule()) {
					sequence_Pow(context, (Pow) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.PRIMARY:
				if(context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Primary) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getRelationalExpressionRule()) {
					sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.REM:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getRemRule()) {
					sequence_Rem(context, (Rem) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.REQUIRES:
				if(context == grammarAccess.getAbstractInterfaceElementRule() ||
				   context == grammarAccess.getRequiresRule()) {
					sequence_Requires(context, (Requires) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.REQUIRES_ABSTRACT_COMPOSITION:
				if(context == grammarAccess.getAbstractMethodBodyRule() ||
				   context == grammarAccess.getRequiresAbstractCompositionRule()) {
					sequence_RequiresAbstractComposition(context, (RequiresAbstractComposition) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ROOT:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_Root(context, (Root) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.ROUND:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getRoundRule()) {
					sequence_Round(context, (Round) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.SEC:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getSecRule()) {
					sequence_Sec(context, (Sec) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.SIGN:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getSignRule()) {
					sequence_Sign(context, (Sign) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.SIN:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getSinRule()) {
					sequence_Sin(context, (Sin) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.SIZE:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getSizeRule()) {
					sequence_Size(context, (Size) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.SQRT:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getSqrtRule()) {
					sequence_Sqrt(context, (Sqrt) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.STATEMENT:
				if(context == grammarAccess.getBlockStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.TAN:
				if(context == grammarAccess.getBuilt_In_MethodsRule() ||
				   context == grammarAccess.getTanRule()) {
					sequence_Tan(context, (Tan) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getUnaryExpressionRule()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.UNARY_EXPRESSION_NOT_PLUS_MINUS:
				if(context == grammarAccess.getUnaryExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionNotPlusMinusRule()) {
					sequence_UnaryExpressionNotPlusMinus(context, (UnaryExpressionNotPlusMinus) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.USE_TYPE:
				if(context == grammarAccess.getUseTypeRule()) {
					sequence_UseType(context, (UseType) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.BODY:
				if(context == grammarAccess.getMethodBodyRule()) {
					sequence_MethodBody(context, (body) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.DIMEX:
				if(context == grammarAccess.getDimExprRule()) {
					sequence_DimExpr(context, (dimex) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (BuiltInName='abs' ex=AdditiveExpression)
	 */
	protected void sequence_Abs(EObject context, Abs semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ABS__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ABS__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ABS__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ABS__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAbsAccess().getBuiltInNameAbsKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getAbsAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Composition' rac=RequiresAbstractComposition)
	 */
	protected void sequence_AbstractCompositionMethod(EObject context, AbstractCompositionMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='Continuous'
	 */
	protected void sequence_AbstractContinuousMethod(EObject context, AbstractContinuousMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Discrete' (params+=Parameter params+=Parameter*)?)
	 */
	protected void sequence_AbstractDiscreteMethod(EObject context, AbstractDiscreteMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         sname=ID 
	 *         type1=[RefType|ID] 
	 *         type2=[RefType|ID]? 
	 *         aname=ID 
	 *         type3=[RefType|ID] 
	 *         dname=ID 
	 *         type4=[RefType|ID] 
	 *         type5=[RefType|ID]?
	 *     )
	 */
	protected void sequence_AbstractDynamicSwitch(EObject context, AbstractDynamicSwitch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='Init'
	 */
	protected void sequence_AbstractInitMethod(EObject context, AbstractInitMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='Invariant'
	 */
	protected void sequence_AbstractInvariant(EObject context, AbstractInvariant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ABSTRACT_INTERFACE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ABSTRACT_INTERFACE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAbstractInvariantAccess().getNameInvariantKeyword_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType name=ID (params+=Parameter params+=Parameter*)? body=AbstractMethodBody?)
	 */
	protected void sequence_AbstractMethod(EObject context, AbstractMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (multiplicativeexpression+=MultiplicativeExpression multiplicativeexpression+=MultiplicativeExpression*)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressionlist=ExpressionList?)
	 */
	protected void sequence_Arguments(EObject context, Arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         BT='void' | 
	 *         BT='int' | 
	 *         BT='real' | 
	 *         BT='boolean' | 
	 *         BT='String' | 
	 *         BT='Interval'
	 *     )
	 */
	protected void sequence_BasicType(EObject context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (blockstatement+=BlockStatement*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType expression=UnaryExpressionNotPlusMinus)
	 */
	protected void sequence_CastExpression(EObject context, CastExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CAST_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CAST_EXPRESSION__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CAST_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CAST_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCastExpressionAccess().getTypeUseTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCastExpressionAccess().getExpressionUnaryExpressionNotPlusMinusParserRuleCall_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='ceil' ex=AdditiveExpression)
	 */
	protected void sequence_Ceil(EObject context, Ceil semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CEIL__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CEIL__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CEIL__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CEIL__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCeilAccess().getBuiltInNameCeilKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getCeilAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superclass=[Class|QualifiedName]? interfaceclass=[Interface|QualifiedName]? members+=Member*)
	 */
	protected void sequence_Class(EObject context, org.xtext.fofo.apricot.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=CLOCK
	 */
	protected void sequence_ClockConstraint(EObject context, ClockConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ABSTRACT_INTERFACE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ABSTRACT_INTERFACE_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClockConstraintAccess().getNameCLOCKTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Composition' members+=ControlSwitchComposition*)
	 */
	protected void sequence_CompositionMethod(EObject context, CompositionMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='Condition' conditions+=ConditionalExpression*)
	 */
	protected void sequence_ConditionBlock(EObject context, ConditionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exclusiveorexpression+=ExclusiveOrExpression exclusiveorexpression+=ExclusiveOrExpression*)
	 */
	protected void sequence_ConditionalAndExpression(EObject context, ConditionalAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conditionalorexpression=ConditionalOrExpression (expression1=Expression expression2=Expression)?)
	 */
	protected void sequence_ConditionalExpression(EObject context, ConditionalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         conditionalorexpression=ConditionalOrExpression 
	 *         (expression1=Expression expression2=Expression)? 
	 *         (assignmentoperator=AssignmentOperator expression=Expression)?
	 *     )
	 */
	protected void sequence_ConditionalExpression_Expression(EObject context, ConditionalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conditionalandexpression+=ConditionalAndExpression conditionalandexpression+=ConditionalAndExpression*)
	 */
	protected void sequence_ConditionalOrExpression(EObject context, ConditionalOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (params+=Parameter params+=Parameter*)? body=MethodBody)
	 */
	protected void sequence_ConstructorMethod(EObject context, ConstructorMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Continuous' DES+=DifferentialEquation*)
	 */
	protected void sequence_ContinuousMethod(EObject context, ContinuousMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         id=ID 
	 *         (sync='(' | recev='(?)' | send='(!)')? 
	 *         (source=Expression | sourcelist=ExpressionList) 
	 *         action=Expression? 
	 *         (destination=Expression | destinationlist=ExpressionList) 
	 *         condition=ConditionBlock? 
	 *         discrete=DiscreteBlock?
	 *     )
	 */
	protected void sequence_ControlSwitchComposition(EObject context, ControlSwitchComposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='cos' ex=AdditiveExpression)
	 */
	protected void sequence_Cos(EObject context, Cos semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.COS__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.COS__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.COS__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.COS__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCosAccess().getBuiltInNameCosKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getCosAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='cot' ex=AdditiveExpression)
	 */
	protected void sequence_Cot(EObject context, Cot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.COT__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.COT__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.COT__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.COT__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCotAccess().getBuiltInNameCotKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getCotAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='csc' ex=AdditiveExpression)
	 */
	protected void sequence_Csc(EObject context, Csc semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CSC__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CSC__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CSC__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CSC__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCscAccess().getBuiltInNameCscKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getCscAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var1=ID var2=ID? order=IntegerLiteral)
	 */
	protected void sequence_DE_LHS(EObject context, DE_LHS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (LHS=DE_LHS RHS=AdditiveExpression)
	 */
	protected void sequence_DifferentialEquation(EObject context, DifferentialEquation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.DIFFERENTIAL_EQUATION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.DIFFERENTIAL_EQUATION__LHS));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.DIFFERENTIAL_EQUATION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.DIFFERENTIAL_EQUATION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDifferentialEquationAccess().getLHSDE_LHSParserRuleCall_2_0(), semanticObject.getLHS());
		feeder.accept(grammarAccess.getDifferentialEquationAccess().getRHSAdditiveExpressionParserRuleCall_4_0(), semanticObject.getRHS());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     index=Expression
	 */
	protected void sequence_DimExpr(EObject context, dimex semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.DIMEX__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.DIMEX__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDimExprAccess().getIndexExpressionParserRuleCall_2_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='Discrete' statements+=BlockStatement*)
	 */
	protected void sequence_DiscreteBlock(EObject context, DiscreteBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Discrete' (params+=Parameter params+=Parameter*)? statements+=BlockStatement*)
	 */
	protected void sequence_DiscreteMethod(EObject context, DiscreteMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='div' e1=AdditiveExpression e2=AdditiveExpression)
	 */
	protected void sequence_Div(EObject context, Div semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.DIV__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.DIV__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.DIV__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.DIV__E1));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.DIV__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.DIV__E2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDivAccess().getBuiltInNameDivKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getDivAccess().getE1AdditiveExpressionParserRuleCall_2_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getDivAccess().getE2AdditiveExpressionParserRuleCall_4_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType id=ID expression=Expression)
	 */
	protected void sequence_EnhancedForControl(EObject context, EnhancedForControl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ENHANCED_FOR_CONTROL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ENHANCED_FOR_CONTROL__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ENHANCED_FOR_CONTROL__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ENHANCED_FOR_CONTROL__ID));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ENHANCED_FOR_CONTROL__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ENHANCED_FOR_CONTROL__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnhancedForControlAccess().getTypeUseTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getEnhancedForControlAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getEnhancedForControlAccess().getExpressionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (instanceofexpression+=InstanceOfExpression instanceofexpression+=InstanceOfExpression*)
	 */
	protected void sequence_EqualityExpression(EObject context, EqualityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='erf' ex=AdditiveExpression)
	 */
	protected void sequence_Erf(EObject context, Erf semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ERF__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ERF__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ERF__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ERF__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getErfAccess().getBuiltInNameErfKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getErfAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (equalityexpression+=EqualityExpression equalityexpression+=EqualityExpression*)
	 */
	protected void sequence_ExclusiveOrExpression(EObject context, ExclusiveOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='exp' ex=AdditiveExpression)
	 */
	protected void sequence_Exp(EObject context, Exp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.EXP__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.EXP__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.EXP__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.EXP__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpAccess().getBuiltInNameExpKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getExpAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression1=Expression expression2+=Expression*)
	 */
	protected void sequence_ExpressionList(EObject context, ExpressionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         accessmodifer=Modifier? 
	 *         variablemodifer=VARIABLE_MODIFIER? 
	 *         type=UseType 
	 *         dim+=Dim* 
	 *         name=FieldName 
	 *         varini=VariableInitializer?
	 *     )
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='fld' e1=AdditiveExpression e2=AdditiveExpression)
	 */
	protected void sequence_Fld(EObject context, Fld semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.FLD__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.FLD__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.FLD__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.FLD__E1));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.FLD__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.FLD__E2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFldAccess().getBuiltInNameFldKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getFldAccess().getE1AdditiveExpressionParserRuleCall_2_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getFldAccess().getE2AdditiveExpressionParserRuleCall_4_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='floor' ex=AdditiveExpression)
	 */
	protected void sequence_Floor(EObject context, Floor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.FLOOR__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.FLOOR__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.FLOOR__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.FLOOR__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloorAccess().getBuiltInNameFloorKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getFloorAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (enhancedforcontrol=EnhancedForControl | (forinit=ForInit? expression=Expression? forupdate=ForUpdate?))
	 */
	protected void sequence_ForControl(EObject context, ForControl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='gamma' ex=AdditiveExpression)
	 */
	protected void sequence_Gamma(EObject context, Gamma semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.GAMMA__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.GAMMA__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.GAMMA__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.GAMMA__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGammaAccess().getBuiltInNameGammaKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getGammaAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='gcd' e1=AdditiveExpression e2+=AdditiveExpression*)
	 */
	protected void sequence_Gcd(EObject context, Gcd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='hypot' e1=AdditiveExpression e2=AdditiveExpression)
	 */
	protected void sequence_Hypot(EObject context, Hypot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.HYPOT__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.HYPOT__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.HYPOT__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.HYPOT__E1));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.HYPOT__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.HYPOT__E2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHypotAccess().getBuiltInNameHypotKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getHypotAccess().getE1AdditiveExpressionParserRuleCall_2_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getHypotAccess().getE2AdditiveExpressionParserRuleCall_4_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((arguments=Arguments | arguments=Arguments | (getvalue='at' arguments=Arguments))?)
	 */
	protected void sequence_IdentifierSuffix(EObject context, IdentifierSuffix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Init' statements+=BlockStatement*)
	 */
	protected void sequence_InitMethod(EObject context, InitMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=RelationalExpression type=UseType?)
	 */
	protected void sequence_InstanceOfExpression(EObject context, InstanceOfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superclass=[Interface|QualifiedName]? members+=AbstractInterfaceElement*)
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Invariant' conditions+=ConditionalExpression*)
	 */
	protected void sequence_InvariantBlock(EObject context, InvariantBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='lcm' e1=AdditiveExpression e2+=AdditiveExpression*)
	 */
	protected void sequence_Lcm(EObject context, Lcm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BooleanLiteral
	 */
	protected void sequence_Literal(EObject context, BooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueBooleanLiteralParserRuleCall_5_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=CHARACTER_LITERAL
	 */
	protected void sequence_Literal(EObject context, CharacterLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CHARACTER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CHARACTER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueCHARACTER_LITERALTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOATING_POINT_LITERAL
	 */
	protected void sequence_Literal(EObject context, FloatingPointLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.FLOATING_POINT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.FLOATING_POINT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueFLOATING_POINT_LITERALTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value='Inf'
	 */
	protected void sequence_Literal(EObject context, InfiniteLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.INFINITE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.INFINITE_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueInfKeyword_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=IntegerLiteral
	 */
	protected void sequence_Literal(EObject context, IntegerLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.INTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.INTEGER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueIntegerLiteralParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value='null'
	 */
	protected void sequence_Literal(EObject context, NullLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.NULL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.NULL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueNullKeyword_6_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING_LITERAL
	 */
	protected void sequence_Literal(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getValueSTRING_LITERALTerminalRuleCall_4_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variablemodifer=VARIABLE_MODIFIER? type=UseType dim+=Dim* name=LocalVarName varini=VariableInitializer?)
	 */
	protected void sequence_LocalVarDec(EObject context, LocalVarDec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='log' e1=AdditiveExpression e2+=AdditiveExpression?)
	 */
	protected void sequence_Log(EObject context, Log semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (MT='Int' | MT='Real')
	 */
	protected void sequence_MathType(EObject context, MathType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='max' e1=AdditiveExpression e2+=AdditiveExpression*)
	 */
	protected void sequence_Max(EObject context, Max semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=BlockStatement*)
	 */
	protected void sequence_MethodBody(EObject context, body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType dim+=Dim* name=ID (params+=Parameter params+=Parameter*)? body=MethodBody)
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='min' e1=AdditiveExpression e2+=AdditiveExpression*)
	 */
	protected void sequence_Min(EObject context, Min semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='mod' e1=AdditiveExpression e2=AdditiveExpression)
	 */
	protected void sequence_Mod(EObject context, Mod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.MOD__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.MOD__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.MOD__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.MOD__E1));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.MOD__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.MOD__E2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModAccess().getBuiltInNameModKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getModAccess().getE1AdditiveExpressionParserRuleCall_2_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getModAccess().getE2AdditiveExpressionParserRuleCall_4_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (unaryexpression+=UnaryExpression unaryexpression+=UnaryExpression*)
	 */
	protected void sequence_MultiplicativeExpression(EObject context, MultiplicativeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='Start'
	 */
	protected void sequence_NativeStartMethod(EObject context, NativeStartMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType dime+=DimExpr+)
	 */
	protected void sequence_NewArray(EObject context, NewArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Class|ID] (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_NewByClass(EObject context, NewByClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* elements+=RefType*)
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression1=Expression expression2+=Expression*)
	 */
	protected void sequence_ParExpression(EObject context, ParExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType dim+=Dim* name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='pause' ex=AdditiveExpression)
	 */
	protected void sequence_Pause(EObject context, Pause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.PAUSE__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.PAUSE__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.PAUSE__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.PAUSE__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPauseAccess().getBuiltInNamePauseKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getPauseAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='pow' e1=AdditiveExpression e2=AdditiveExpression)
	 */
	protected void sequence_Pow(EObject context, Pow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.POW__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.POW__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.POW__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.POW__E1));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.POW__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.POW__E2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPowAccess().getBuiltInNamePowKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getPowAccess().getE1AdditiveExpressionParserRuleCall_2_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getPowAccess().getE2AdditiveExpressionParserRuleCall_4_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         parexpression=ParExpression | 
	 *         literal=Literal | 
	 *         newobject=NewByClass | 
	 *         newarray=NewArray | 
	 *         ((identifier+=ID dimer+=DimExpr*)* identifiersuffix=IdentifierSuffix?) | 
	 *         (identifier+=ID dimer+=DimExpr* (identifier+=ID dimer+=DimExpr*)* identifiersuffix=IdentifierSuffix?)
	 *     )
	 */
	protected void sequence_Primary(EObject context, Primary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (additiveexpression+=AdditiveExpression (relationalop+=RelationalOp additiveexpression+=AdditiveExpression)*)
	 */
	protected void sequence_RelationalExpression(EObject context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='rem' e1=AdditiveExpression e2=AdditiveExpression)
	 */
	protected void sequence_Rem(EObject context, Rem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.REM__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.REM__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.REM__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.REM__E1));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.REM__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.REM__E2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRemAccess().getBuiltInNameRemKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getRemAccess().getE1AdditiveExpressionParserRuleCall_2_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getRemAccess().getE2AdditiveExpressionParserRuleCall_4_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID abstract_dynamic_switch=AbstractDynamicSwitch)
	 */
	protected void sequence_RequiresAbstractComposition(EObject context, RequiresAbstractComposition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.REQUIRES_ABSTRACT_COMPOSITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.REQUIRES_ABSTRACT_COMPOSITION__NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRequiresAbstractCompositionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequiresAbstractCompositionAccess().getAbstract_dynamic_switchAbstractDynamicSwitchParserRuleCall_10_0(), semanticObject.getAbstract_dynamic_switch());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=UseType)
	 */
	protected void sequence_Requires(EObject context, Requires semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ABSTRACT_INTERFACE_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ABSTRACT_INTERFACE_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.REQUIRES__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.REQUIRES__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRequiresAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRequiresAccess().getTypeUseTypeParserRuleCall_6_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.RETURN_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.RETURN_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='root' e1=AdditiveExpression e2=AdditiveExpression)
	 */
	protected void sequence_Root(EObject context, Root semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ROOT__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ROOT__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ROOT__E1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ROOT__E1));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ROOT__E2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ROOT__E2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRootAccess().getBuiltInNameRootKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getRootAccess().getE1AdditiveExpressionParserRuleCall_2_0(), semanticObject.getE1());
		feeder.accept(grammarAccess.getRootAccess().getE2AdditiveExpressionParserRuleCall_4_0(), semanticObject.getE2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='round' ex=AdditiveExpression)
	 */
	protected void sequence_Round(EObject context, Round semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ROUND__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ROUND__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.ROUND__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.ROUND__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRoundAccess().getBuiltInNameRoundKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getRoundAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='sec' ex=AdditiveExpression)
	 */
	protected void sequence_Sec(EObject context, Sec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SEC__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SEC__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SEC__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SEC__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSecAccess().getBuiltInNameSecKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getSecAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='sign' ex=AdditiveExpression)
	 */
	protected void sequence_Sign(EObject context, Sign semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SIGN__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SIGN__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SIGN__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SIGN__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSignAccess().getBuiltInNameSignKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getSignAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='sin' ex=AdditiveExpression)
	 */
	protected void sequence_Sin(EObject context, Sin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SIN__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SIN__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SIN__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SIN__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSinAccess().getBuiltInNameSinKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getSinAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='size' ex=AdditiveExpression)
	 */
	protected void sequence_Size(EObject context, Size semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SIZE__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SIZE__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SIZE__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SIZE__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeAccess().getBuiltInNameSizeKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getSizeAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='sqrt' ex=AdditiveExpression)
	 */
	protected void sequence_Sqrt(EObject context, Sqrt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SQRT__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SQRT__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.SQRT__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.SQRT__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSqrtAccess().getBuiltInNameSqrtKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getSqrtAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             block=Block | 
	 *             (parexpression=ParExpression ifstatement=Statement elsestatement=Statement?) | 
	 *             (forcontrol=ForControl forstatement=Statement) | 
	 *             identifier=ID? | 
	 *             identifier=ID? | 
	 *             (parexpression=ParExpression whilestatement=Statement) | 
	 *             return=ReturnStatement | 
	 *             statementexpression=Expression
	 *         )?
	 *     )
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (BuiltInName='tan' ex=AdditiveExpression)
	 */
	protected void sequence_Tan(EObject context, Tan semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.TAN__BUILT_IN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.TAN__BUILT_IN_NAME));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.TAN__EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.TAN__EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTanAccess().getBuiltInNameTanKeyword_0_0(), semanticObject.getBuiltInName());
		feeder.accept(grammarAccess.getTanAccess().getExAdditiveExpressionParserRuleCall_2_0(), semanticObject.getEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (unaryexpression=UnaryExpression | castexpression=CastExpression | primary=Primary | builtin=Built_In_Methods)
	 */
	protected void sequence_UnaryExpressionNotPlusMinus(EObject context, UnaryExpressionNotPlusMinus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=Expression to=Expression)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.UNARY_EXPRESSION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.UNARY_EXPRESSION__FROM));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.UNARY_EXPRESSION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.UNARY_EXPRESSION__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getFromExpressionParserRuleCall_4_1_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getUnaryExpressionAccess().getToExpressionParserRuleCall_4_3_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reftype=[RefType|ID] | type=NonRefType)
	 */
	protected void sequence_UseType(EObject context, UseType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
