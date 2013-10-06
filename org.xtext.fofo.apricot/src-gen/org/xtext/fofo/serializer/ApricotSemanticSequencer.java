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
import org.xtext.fofo.apricot.AbstractDynamicSwitch;
import org.xtext.fofo.apricot.AbstractInvariant;
import org.xtext.fofo.apricot.AbstractMethod;
import org.xtext.fofo.apricot.AdditiveExpression;
import org.xtext.fofo.apricot.ApricotPackage;
import org.xtext.fofo.apricot.Arguments;
import org.xtext.fofo.apricot.BasicType;
import org.xtext.fofo.apricot.BoolConstant;
import org.xtext.fofo.apricot.Cast;
import org.xtext.fofo.apricot.CastExpression;
import org.xtext.fofo.apricot.ClockConstraint;
import org.xtext.fofo.apricot.ConditionalAndExpression;
import org.xtext.fofo.apricot.ConditionalExpression;
import org.xtext.fofo.apricot.ConditionalOrExpression;
import org.xtext.fofo.apricot.DE_LHS;
import org.xtext.fofo.apricot.DifferentialEquation;
import org.xtext.fofo.apricot.EqualityExpression;
import org.xtext.fofo.apricot.ExclusiveOrExpression;
import org.xtext.fofo.apricot.ExpressionList;
import org.xtext.fofo.apricot.Field;
import org.xtext.fofo.apricot.IdentifierSuffix;
import org.xtext.fofo.apricot.Import;
import org.xtext.fofo.apricot.IntConstant;
import org.xtext.fofo.apricot.Interface;
import org.xtext.fofo.apricot.LocalVarDec;
import org.xtext.fofo.apricot.MathType;
import org.xtext.fofo.apricot.Method;
import org.xtext.fofo.apricot.MethodBody;
import org.xtext.fofo.apricot.MultiplicativeExpression;
import org.xtext.fofo.apricot.NewByClass;
import org.xtext.fofo.apricot.PackageDeclaration;
import org.xtext.fofo.apricot.ParamRef;
import org.xtext.fofo.apricot.Parameter;
import org.xtext.fofo.apricot.Primary;
import org.xtext.fofo.apricot.RelationalExpression;
import org.xtext.fofo.apricot.Requires;
import org.xtext.fofo.apricot.RequiresAbstractComposition;
import org.xtext.fofo.apricot.ReturnStatement;
import org.xtext.fofo.apricot.StringConstant;
import org.xtext.fofo.apricot.This;
import org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus;
import org.xtext.fofo.apricot.UseType;
import org.xtext.fofo.services.ApricotGrammarAccess;

@SuppressWarnings("all")
public class ApricotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ApricotGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ApricotPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ApricotPackage.ABSTRACT_DYNAMIC_SWITCH:
				if(context == grammarAccess.getAbstractDynamicSwitchRule()) {
					sequence_AbstractDynamicSwitch(context, (AbstractDynamicSwitch) semanticObject); 
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
				   context == grammarAccess.getNonRefTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BasicType(context, (BasicType) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.BOOL_CONSTANT:
				if(context == grammarAccess.getBoolConstantRule() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_BoolConstant(context, (BoolConstant) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CAST:
				if(context == grammarAccess.getCastRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_Cast(context, (Cast) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CAST_EXPRESSION:
				if(context == grammarAccess.getCastExpressionRule()) {
					sequence_CastExpression(context, (CastExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.CLASS:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getClassRule() ||
				   context == grammarAccess.getRefTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
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
				   context == grammarAccess.getParExpressionRule() ||
				   context == grammarAccess.getParenRule() ||
				   context == grammarAccess.getTerminalExpressionRule() ||
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
			case ApricotPackage.DE_LHS:
				if(context == grammarAccess.getDE_LHSRule()) {
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
			case ApricotPackage.EQUALITY_EXPRESSION:
				if(context == grammarAccess.getEqualityExpressionRule()) {
					sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.EXCLUSIVE_OR_EXPRESSION:
				if(context == grammarAccess.getExclusiveOrExpressionRule()) {
					sequence_ExclusiveOrExpression(context, (ExclusiveOrExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.EXPRESSION_LIST:
				if(context == grammarAccess.getExpressionListRule()) {
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
			case ApricotPackage.INT_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getIntConstantRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_IntConstant(context, (IntConstant) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.INTERFACE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getInterfaceRule() ||
				   context == grammarAccess.getRefTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.LOCAL_VAR_DEC:
				if(context == grammarAccess.getLocalVarDecRule()) {
					sequence_LocalVarDec(context, (LocalVarDec) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.MATH_TYPE:
				if(context == grammarAccess.getMathTypeRule() ||
				   context == grammarAccess.getNonRefTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MathType(context, (MathType) semanticObject); 
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
			case ApricotPackage.METHOD_BODY:
				if(context == grammarAccess.getMethodBodyRule()) {
					sequence_MethodBody(context, (MethodBody) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getMultiplicativeExpressionRule()) {
					sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.NEW_BY_CLASS:
				if(context == grammarAccess.getNewByClassRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_NewByClass(context, (NewByClass) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule() ||
				   context == grammarAccess.getProgramRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.PARAM_REF:
				if(context == grammarAccess.getParamRefRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_ParamRef(context, (ParamRef) semanticObject); 
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
			case ApricotPackage.PRIMARY:
				if(context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Primary) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getInstanceOfExpressionRule()) {
					sequence_InstanceOfExpression_RelationalExpression(context, (RelationalExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRelationalExpressionRule()) {
					sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
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
			case ApricotPackage.STRING_CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getStringConstantRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_StringConstant(context, (StringConstant) semanticObject); 
					return; 
				}
				else break;
			case ApricotPackage.THIS:
				if(context == grammarAccess.getTerminalExpressionRule() ||
				   context == grammarAccess.getThisRule()) {
					sequence_This(context, (This) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (type1=[RefType|ID] type2=[RefType|ID]? type3=[RefType|ID] type4=[RefType|ID] type5=[RefType|ID]?)
	 */
	protected void sequence_AbstractDynamicSwitch(EObject context, AbstractDynamicSwitch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {AbstractInvariant}
	 */
	protected void sequence_AbstractInvariant(EObject context, AbstractInvariant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (BT='void' | BT='int' | BT='real' | BT='boolean' | BT='String')
	 */
	protected void sequence_BasicType(EObject context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constant='true' | constant='false')
	 */
	protected void sequence_BoolConstant(EObject context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType unaryexpression=UnaryExpression)
	 */
	protected void sequence_CastExpression(EObject context, CastExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CAST_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CAST_EXPRESSION__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CAST_EXPRESSION__UNARYEXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CAST_EXPRESSION__UNARYEXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCastExpressionAccess().getTypeUseTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCastExpressionAccess().getUnaryexpressionUnaryExpressionParserRuleCall_4_0(), semanticObject.getUnaryexpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType expression=TerminalExpression)
	 */
	protected void sequence_Cast(EObject context, Cast semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CAST__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CAST__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CAST__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CAST__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCastAccess().getTypeUseTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCastAccess().getExpressionTerminalExpressionParserRuleCall_3_0(), semanticObject.getExpression());
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
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.CLOCK_CONSTRAINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.CLOCK_CONSTRAINT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClockConstraintAccess().getNameCLOCKTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
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
	 *     (var1=ID var2=ID order=INT)
	 */
	protected void sequence_DE_LHS(EObject context, DE_LHS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.DE_LHS__VAR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.DE_LHS__VAR1));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.DE_LHS__VAR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.DE_LHS__VAR2));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.DE_LHS__ORDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.DE_LHS__ORDER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDE_LHSAccess().getVar1IDTerminalRuleCall_2_0(), semanticObject.getVar1());
		feeder.accept(grammarAccess.getDE_LHSAccess().getVar2IDTerminalRuleCall_4_0(), semanticObject.getVar2());
		feeder.accept(grammarAccess.getDE_LHSAccess().getOrderINTTerminalRuleCall_6_0(), semanticObject.getOrder());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (LHS=DE_LHS RHS=Expression)
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
		feeder.accept(grammarAccess.getDifferentialEquationAccess().getLHSDE_LHSParserRuleCall_0_0(), semanticObject.getLHS());
		feeder.accept(grammarAccess.getDifferentialEquationAccess().getRHSExpressionParserRuleCall_2_0(), semanticObject.getRHS());
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
	 *     (equalityexpression+=EqualityExpression equalityexpression+=EqualityExpression*)
	 */
	protected void sequence_ExclusiveOrExpression(EObject context, ExclusiveOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (type=UseType name=FieldName varini=VariableInitializer?)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arguments=Arguments | arguments=Arguments)?)
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
	 *     (additiveexpression+=AdditiveExpression (relationalop+=RelationalOp additiveexpression+=AdditiveExpression)* type=UseType?)
	 */
	protected void sequence_InstanceOfExpression_RelationalExpression(EObject context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constant=INT
	 */
	protected void sequence_IntConstant(EObject context, IntConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.INT_CONSTANT__CONSTANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.INT_CONSTANT__CONSTANT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntConstantAccess().getConstantINTTerminalRuleCall_0(), semanticObject.getConstant());
		feeder.finish();
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
	 *     (type=UseType name=LocalVarName varini=VariableInitializer?)
	 */
	protected void sequence_LocalVarDec(EObject context, LocalVarDec semanticObject) {
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
	 *     (locvars+=LocalVarDec* return=ReturnStatement)
	 */
	protected void sequence_MethodBody(EObject context, MethodBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType name=ID (params+=Parameter params+=Parameter*)? body=MethodBody)
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (type=[Class|ID] (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_NewByClass(EObject context, NewByClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* elements+=AbstractElement*)
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameter=[Parameter|ID]
	 */
	protected void sequence_ParamRef(EObject context, ParamRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.PARAM_REF__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.PARAM_REF__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamRefAccess().getParameterParameterIDTerminalRuleCall_0_1(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=UseType name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.TYPED_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.TYPED_ELEMENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.TYPED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.TYPED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeUseTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         parexpression=ParExpression | 
	 *         literal=Literal | 
	 *         (identifier+=ID* identifiersuffix=IdentifierSuffix?) | 
	 *         (identifier+=ID identifier+=ID* identifiersuffix=IdentifierSuffix?)
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
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.REQUIRES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.REQUIRES__NAME));
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
	 *     constant=STRING
	 */
	protected void sequence_StringConstant(EObject context, StringConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.STRING_CONSTANT__CONSTANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.STRING_CONSTANT__CONSTANT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringConstantAccess().getConstantSTRINGTerminalRuleCall_0(), semanticObject.getConstant());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     variable='this'
	 */
	protected void sequence_This(EObject context, This semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApricotPackage.Literals.THIS__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApricotPackage.Literals.THIS__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getThisAccess().getVariableThisKeyword_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (unaryexpression=UnaryExpression | primary=Primary)
	 */
	protected void sequence_UnaryExpressionNotPlusMinus(EObject context, UnaryExpressionNotPlusMinus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type1=[RefType|ID] | type2=NonRefType)
	 */
	protected void sequence_UseType(EObject context, UseType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
