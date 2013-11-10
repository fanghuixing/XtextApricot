/**
 */
package org.xtext.fofo.apricot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.fofo.apricot.ApricotFactory
 * @model kind="package"
 * @generated
 */
public interface ApricotPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "apricot";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/fofo/Apricot";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "apricot";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ApricotPackage eINSTANCE = org.xtext.fofo.apricot.impl.ApricotPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.PackageDeclarationImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ImportImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.RefTypeImpl <em>Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.RefTypeImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRefType()
   * @generated
   */
  int REF_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.NonRefTypeImpl <em>Non Ref Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.NonRefTypeImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNonRefType()
   * @generated
   */
  int NON_REF_TYPE = 3;

  /**
   * The number of structural features of the '<em>Non Ref Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_REF_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.BasicTypeImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 4;

  /**
   * The feature id for the '<em><b>BT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__BT = NON_REF_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = NON_REF_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.MathTypeImpl <em>Math Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.MathTypeImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMathType()
   * @generated
   */
  int MATH_TYPE = 5;

  /**
   * The feature id for the '<em><b>MT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TYPE__MT = NON_REF_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Math Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_TYPE_FEATURE_COUNT = NON_REF_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.InterfaceImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = REF_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Superclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__SUPERCLASS = REF_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__MEMBERS = REF_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = REF_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ClassImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = REF_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Superclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPERCLASS = REF_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interfaceclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__INTERFACECLASS = REF_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__MEMBERS = REF_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = REF_TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.TypedElementImpl <em>Typed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.TypedElementImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getTypedElement()
   * @generated
   */
  int TYPED_ELEMENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.MemberImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = TYPED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.FieldImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getField()
   * @generated
   */
  int FIELD = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Accessmodifer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ACCESSMODIFER = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variablemodifer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VARIABLEMODIFER = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Dim</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__DIM = MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Varini</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VARINI = MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ConstructorMethodImpl <em>Constructor Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ConstructorMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConstructorMethod()
   * @generated
   */
  int CONSTRUCTOR_METHOD = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_METHOD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_METHOD__PARAMS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_METHOD__BODY = MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constructor Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.MethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TYPE = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dim</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__DIM = MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMS = MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__BODY = MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbstractInterfaceElementImpl <em>Abstract Interface Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbstractInterfaceElementImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractInterfaceElement()
   * @generated
   */
  int ABSTRACT_INTERFACE_ELEMENT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_INTERFACE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Interface Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_INTERFACE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbstractMethodImpl <em>Abstract Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbstractMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractMethod()
   * @generated
   */
  int ABSTRACT_METHOD = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD__NAME = ABSTRACT_INTERFACE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD__TYPE = ABSTRACT_INTERFACE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD__PARAMS = ABSTRACT_INTERFACE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD__BODY = ABSTRACT_INTERFACE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Abstract Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD_FEATURE_COUNT = ABSTRACT_INTERFACE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.UseTypeImpl <em>Use Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.UseTypeImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getUseType()
   * @generated
   */
  int USE_TYPE = 13;

  /**
   * The feature id for the '<em><b>Reftype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_TYPE__REFTYPE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_TYPE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Use Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ParameterImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = TYPED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dim</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DIM = TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.MethodBodyImpl <em>Method Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.MethodBodyImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMethodBody()
   * @generated
   */
  int METHOD_BODY = 16;

  /**
   * The number of structural features of the '<em>Method Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbstractMethodBodyImpl <em>Abstract Method Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbstractMethodBodyImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractMethodBody()
   * @generated
   */
  int ABSTRACT_METHOD_BODY = 17;

  /**
   * The number of structural features of the '<em>Abstract Method Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD_BODY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.VariableInitializerImpl <em>Variable Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.VariableInitializerImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getVariableInitializer()
   * @generated
   */
  int VARIABLE_INITIALIZER = 18;

  /**
   * The number of structural features of the '<em>Variable Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ReturnStatementImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.RequiresImpl <em>Requires</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.RequiresImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRequires()
   * @generated
   */
  int REQUIRES = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES__NAME = ABSTRACT_INTERFACE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES__TYPE = ABSTRACT_INTERFACE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Requires</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES_FEATURE_COUNT = ABSTRACT_INTERFACE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl <em>Abstract Dynamic Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractDynamicSwitch()
   * @generated
   */
  int ABSTRACT_DYNAMIC_SWITCH = 22;

  /**
   * The feature id for the '<em><b>Sname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DYNAMIC_SWITCH__SNAME = 0;

  /**
   * The feature id for the '<em><b>Type1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DYNAMIC_SWITCH__TYPE1 = 1;

  /**
   * The feature id for the '<em><b>Type2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DYNAMIC_SWITCH__TYPE2 = 2;

  /**
   * The feature id for the '<em><b>Aname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DYNAMIC_SWITCH__ANAME = 3;

  /**
   * The feature id for the '<em><b>Type3</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DYNAMIC_SWITCH__TYPE3 = 4;

  /**
   * The feature id for the '<em><b>Dname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DYNAMIC_SWITCH__DNAME = 5;

  /**
   * The feature id for the '<em><b>Type4</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DYNAMIC_SWITCH__TYPE4 = 6;

  /**
   * The feature id for the '<em><b>Type5</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DYNAMIC_SWITCH__TYPE5 = 7;

  /**
   * The number of structural features of the '<em>Abstract Dynamic Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DYNAMIC_SWITCH_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbstractCompositionMethodImpl <em>Abstract Composition Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbstractCompositionMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractCompositionMethod()
   * @generated
   */
  int ABSTRACT_COMPOSITION_METHOD = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COMPOSITION_METHOD__NAME = ABSTRACT_METHOD__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COMPOSITION_METHOD__TYPE = ABSTRACT_METHOD__TYPE;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COMPOSITION_METHOD__PARAMS = ABSTRACT_METHOD__PARAMS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COMPOSITION_METHOD__BODY = ABSTRACT_METHOD__BODY;

  /**
   * The feature id for the '<em><b>Rac</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COMPOSITION_METHOD__RAC = ABSTRACT_METHOD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Composition Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_COMPOSITION_METHOD_FEATURE_COUNT = ABSTRACT_METHOD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.NativeStartMethodImpl <em>Native Start Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.NativeStartMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNativeStartMethod()
   * @generated
   */
  int NATIVE_START_METHOD = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_START_METHOD__NAME = ABSTRACT_METHOD__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_START_METHOD__TYPE = ABSTRACT_METHOD__TYPE;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_START_METHOD__PARAMS = ABSTRACT_METHOD__PARAMS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_START_METHOD__BODY = ABSTRACT_METHOD__BODY;

  /**
   * The number of structural features of the '<em>Native Start Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_START_METHOD_FEATURE_COUNT = ABSTRACT_METHOD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.RequiresAbstractCompositionImpl <em>Requires Abstract Composition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.RequiresAbstractCompositionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRequiresAbstractComposition()
   * @generated
   */
  int REQUIRES_ABSTRACT_COMPOSITION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES_ABSTRACT_COMPOSITION__NAME = ABSTRACT_METHOD_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract dynamic switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH = ABSTRACT_METHOD_BODY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Requires Abstract Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRES_ABSTRACT_COMPOSITION_FEATURE_COUNT = ABSTRACT_METHOD_BODY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ClockConstraintImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getClockConstraint()
   * @generated
   */
  int CLOCK_CONSTRAINT = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK_CONSTRAINT__NAME = ABSTRACT_INTERFACE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Clock Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK_CONSTRAINT_FEATURE_COUNT = ABSTRACT_INTERFACE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbstractInvariantImpl <em>Abstract Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbstractInvariantImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractInvariant()
   * @generated
   */
  int ABSTRACT_INVARIANT = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_INVARIANT__NAME = ABSTRACT_INTERFACE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Abstract Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_INVARIANT_FEATURE_COUNT = ABSTRACT_INTERFACE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 28;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = VARIABLE_INITIALIZER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ConditionalExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConditionalExpression()
   * @generated
   */
  int CONDITIONAL_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Assignmentoperator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Conditionalorexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__EXPRESSION1 = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__EXPRESSION2 = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Conditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ConditionalOrExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConditionalOrExpression()
   * @generated
   */
  int CONDITIONAL_OR_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Conditionalandexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Conditional Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ConditionalAndExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConditionalAndExpression()
   * @generated
   */
  int CONDITIONAL_AND_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Exclusiveorexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__EXCLUSIVEOREXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Conditional And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ExclusiveOrExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getExclusiveOrExpression()
   * @generated
   */
  int EXCLUSIVE_OR_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Equalityexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION__EQUALITYEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Exclusive Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.EqualityExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getEqualityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Instanceofexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.InstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.InstanceOfExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInstanceOfExpression()
   * @generated
   */
  int INSTANCE_OF_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Instance Of Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_OF_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.RelationalExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRelationalExpression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Additiveexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__ADDITIVEEXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Relationalop</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__RELATIONALOP = 1;

  /**
   * The number of structural features of the '<em>Relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AdditiveExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAdditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Multiplicativeexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.MultiplicativeExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Unaryexpression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.UnaryExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__TO = 1;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.UnaryExpressionNotPlusMinusImpl <em>Unary Expression Not Plus Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.UnaryExpressionNotPlusMinusImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getUnaryExpressionNotPlusMinus()
   * @generated
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS = 39;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__FROM = UNARY_EXPRESSION__FROM;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__TO = UNARY_EXPRESSION__TO;

  /**
   * The feature id for the '<em><b>Unaryexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Castexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION = UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY = UNARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Builtin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN = UNARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Unary Expression Not Plus Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_NOT_PLUS_MINUS_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.PrimaryImpl <em>Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.PrimaryImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getPrimary()
   * @generated
   */
  int PRIMARY = 40;

  /**
   * The feature id for the '<em><b>Parexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__PAREXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__LITERAL = 1;

  /**
   * The feature id for the '<em><b>Newobject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__NEWOBJECT = 2;

  /**
   * The feature id for the '<em><b>Newarray</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__NEWARRAY = 3;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__IDENTIFIER = 4;

  /**
   * The feature id for the '<em><b>Dimer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__DIMER = 5;

  /**
   * The feature id for the '<em><b>Identifiersuffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__IDENTIFIERSUFFIX = 6;

  /**
   * The number of structural features of the '<em>Primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.IdentifierSuffixImpl <em>Identifier Suffix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.IdentifierSuffixImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getIdentifierSuffix()
   * @generated
   */
  int IDENTIFIER_SUFFIX = 41;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_SUFFIX__ARGUMENTS = 0;

  /**
   * The feature id for the '<em><b>Getvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_SUFFIX__GETVALUE = 1;

  /**
   * The number of structural features of the '<em>Identifier Suffix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_SUFFIX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ArgumentsImpl <em>Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ArgumentsImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getArguments()
   * @generated
   */
  int ARGUMENTS = 42;

  /**
   * The feature id for the '<em><b>Expressionlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__EXPRESSIONLIST = 0;

  /**
   * The number of structural features of the '<em>Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ExpressionListImpl <em>Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ExpressionListImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getExpressionList()
   * @generated
   */
  int EXPRESSION_LIST = 43;

  /**
   * The feature id for the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESSION1 = VARIABLE_INITIALIZER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST__EXPRESSION2 = VARIABLE_INITIALIZER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_LIST_FEATURE_COUNT = VARIABLE_INITIALIZER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.CastExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCastExpression()
   * @generated
   */
  int CAST_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ParExpressionImpl <em>Par Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ParExpressionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getParExpression()
   * @generated
   */
  int PAR_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_EXPRESSION__EXPRESSION1 = 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_EXPRESSION__EXPRESSION2 = 1;

  /**
   * The number of structural features of the '<em>Par Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.Built_In_MethodsImpl <em>Built In Methods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.Built_In_MethodsImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBuilt_In_Methods()
   * @generated
   */
  int BUILT_IN_METHODS = 50;

  /**
   * The number of structural features of the '<em>Built In Methods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_METHODS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.DE_LHSImpl <em>DE LHS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.DE_LHSImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDE_LHS()
   * @generated
   */
  int DE_LHS = 46;

  /**
   * The feature id for the '<em><b>Var1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DE_LHS__VAR1 = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DE_LHS__VAR2 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DE_LHS__ORDER = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>DE LHS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DE_LHS_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.DifferentialEquationImpl <em>Differential Equation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.DifferentialEquationImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDifferentialEquation()
   * @generated
   */
  int DIFFERENTIAL_EQUATION = 47;

  /**
   * The feature id for the '<em><b>LHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENTIAL_EQUATION__LHS = 0;

  /**
   * The feature id for the '<em><b>RHS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENTIAL_EQUATION__RHS = 1;

  /**
   * The number of structural features of the '<em>Differential Equation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENTIAL_EQUATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ContinuousMethodImpl <em>Continuous Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ContinuousMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getContinuousMethod()
   * @generated
   */
  int CONTINUOUS_METHOD = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUOUS_METHOD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>DES</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUOUS_METHOD__DES = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Continuous Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUOUS_METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbstractContinuousMethodImpl <em>Abstract Continuous Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbstractContinuousMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractContinuousMethod()
   * @generated
   */
  int ABSTRACT_CONTINUOUS_METHOD = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONTINUOUS_METHOD__NAME = ABSTRACT_METHOD__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONTINUOUS_METHOD__TYPE = ABSTRACT_METHOD__TYPE;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONTINUOUS_METHOD__PARAMS = ABSTRACT_METHOD__PARAMS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONTINUOUS_METHOD__BODY = ABSTRACT_METHOD__BODY;

  /**
   * The number of structural features of the '<em>Abstract Continuous Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONTINUOUS_METHOD_FEATURE_COUNT = ABSTRACT_METHOD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.SqrtImpl <em>Sqrt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.SqrtImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSqrt()
   * @generated
   */
  int SQRT = 51;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQRT__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQRT__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sqrt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQRT_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.SinImpl <em>Sin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.SinImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSin()
   * @generated
   */
  int SIN = 52;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIN__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIN__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIN_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.CosImpl <em>Cos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.CosImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCos()
   * @generated
   */
  int COS = 53;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COS__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COS__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COS_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.TanImpl <em>Tan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.TanImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getTan()
   * @generated
   */
  int TAN = 54;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAN__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAN__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAN_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.CotImpl <em>Cot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.CotImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCot()
   * @generated
   */
  int COT = 55;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COT__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COT__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COT_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.SecImpl <em>Sec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.SecImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSec()
   * @generated
   */
  int SEC = 56;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.CscImpl <em>Csc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.CscImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCsc()
   * @generated
   */
  int CSC = 57;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSC__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSC__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Csc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSC_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.RoundImpl <em>Round</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.RoundImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRound()
   * @generated
   */
  int ROUND = 58;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUND__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUND__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Round</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROUND_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.FloorImpl <em>Floor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.FloorImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getFloor()
   * @generated
   */
  int FLOOR = 59;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOOR__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOOR__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Floor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOOR_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.CeilImpl <em>Ceil</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.CeilImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCeil()
   * @generated
   */
  int CEIL = 60;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEIL__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEIL__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ceil</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CEIL_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.DivImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDiv()
   * @generated
   */
  int DIV = 61;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.FldImpl <em>Fld</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.FldImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getFld()
   * @generated
   */
  int FLD = 62;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLD__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLD__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLD__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Fld</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLD_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.RemImpl <em>Rem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.RemImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRem()
   * @generated
   */
  int REM = 63;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REM_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ModImpl <em>Mod</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ModImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMod()
   * @generated
   */
  int MOD = 64;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mod</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.GcdImpl <em>Gcd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.GcdImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getGcd()
   * @generated
   */
  int GCD = 65;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GCD__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GCD__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GCD__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Gcd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GCD_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.LcmImpl <em>Lcm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.LcmImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getLcm()
   * @generated
   */
  int LCM = 66;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCM__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCM__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCM__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Lcm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LCM_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbsImpl <em>Abs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbsImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbs()
   * @generated
   */
  int ABS = 67;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABS__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABS__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Abs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABS_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.SignImpl <em>Sign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.SignImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSign()
   * @generated
   */
  int SIGN = 68;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGN__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGN__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGN_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.RootImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 69;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.HypotImpl <em>Hypot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.HypotImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getHypot()
   * @generated
   */
  int HYPOT = 70;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPOT__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPOT__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPOT__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Hypot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPOT_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.PowImpl <em>Pow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.PowImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getPow()
   * @generated
   */
  int POW = 71;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Pow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ExpImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getExp()
   * @generated
   */
  int EXP = 72;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.LogImpl <em>Log</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.LogImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getLog()
   * @generated
   */
  int LOG = 73;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Log</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ErfImpl <em>Erf</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ErfImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getErf()
   * @generated
   */
  int ERF = 74;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERF__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERF__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Erf</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERF_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.GammaImpl <em>Gamma</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.GammaImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getGamma()
   * @generated
   */
  int GAMMA = 75;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAMMA__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAMMA__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Gamma</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAMMA_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.MaxImpl <em>Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.MaxImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMax()
   * @generated
   */
  int MAX = 76;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.MinImpl <em>Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.MinImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMin()
   * @generated
   */
  int MIN = 77;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN__E1 = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>E2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN__E2 = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.PauseImpl <em>Pause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.PauseImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getPause()
   * @generated
   */
  int PAUSE = 78;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.SizeImpl <em>Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.SizeImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSize()
   * @generated
   */
  int SIZE = 79;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__BUILT_IN_NAME = BUILT_IN_METHODS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE__EX = BUILT_IN_METHODS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_COUNT = BUILT_IN_METHODS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.InvariantBlockImpl <em>Invariant Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.InvariantBlockImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInvariantBlock()
   * @generated
   */
  int INVARIANT_BLOCK = 80;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_BLOCK__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_BLOCK__CONDITIONS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Invariant Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVARIANT_BLOCK_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.BlockImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 81;

  /**
   * The feature id for the '<em><b>Blockstatement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__BLOCKSTATEMENT = 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.BlockStatementImpl <em>Block Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.BlockStatementImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBlockStatement()
   * @generated
   */
  int BLOCK_STATEMENT = 82;

  /**
   * The number of structural features of the '<em>Block Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.LocalVarDecStatementImpl <em>Local Var Dec Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.LocalVarDecStatementImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getLocalVarDecStatement()
   * @generated
   */
  int LOCAL_VAR_DEC_STATEMENT = 83;

  /**
   * The number of structural features of the '<em>Local Var Dec Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DEC_STATEMENT_FEATURE_COUNT = BLOCK_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.LocalVarDecImpl <em>Local Var Dec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.LocalVarDecImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getLocalVarDec()
   * @generated
   */
  int LOCAL_VAR_DEC = 84;

  /**
   * The feature id for the '<em><b>Variablemodifer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DEC__VARIABLEMODIFER = LOCAL_VAR_DEC_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DEC__TYPE = LOCAL_VAR_DEC_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dim</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DEC__DIM = LOCAL_VAR_DEC_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DEC__NAME = LOCAL_VAR_DEC_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Varini</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DEC__VARINI = LOCAL_VAR_DEC_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Local Var Dec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_DEC_FEATURE_COUNT = LOCAL_VAR_DEC_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.StatementImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 85;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__BLOCK = BLOCK_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__PAREXPRESSION = BLOCK_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ifstatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IFSTATEMENT = BLOCK_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elsestatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ELSESTATEMENT = BLOCK_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Forcontrol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FORCONTROL = BLOCK_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Forstatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FORSTATEMENT = BLOCK_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IDENTIFIER = BLOCK_STATEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Whilestatement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__WHILESTATEMENT = BLOCK_STATEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__RETURN = BLOCK_STATEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Statementexpression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENTEXPRESSION = BLOCK_STATEMENT_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = BLOCK_STATEMENT_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ForControlImpl <em>For Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ForControlImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getForControl()
   * @generated
   */
  int FOR_CONTROL = 86;

  /**
   * The feature id for the '<em><b>Enhancedforcontrol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL__ENHANCEDFORCONTROL = 0;

  /**
   * The feature id for the '<em><b>Forinit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL__FORINIT = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL__EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Forupdate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL__FORUPDATE = 3;

  /**
   * The number of structural features of the '<em>For Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.EnhancedForControlImpl <em>Enhanced For Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.EnhancedForControlImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getEnhancedForControl()
   * @generated
   */
  int ENHANCED_FOR_CONTROL = 87;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENHANCED_FOR_CONTROL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENHANCED_FOR_CONTROL__ID = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENHANCED_FOR_CONTROL__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Enhanced For Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENHANCED_FOR_CONTROL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ForInitImpl <em>For Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ForInitImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getForInit()
   * @generated
   */
  int FOR_INIT = 88;

  /**
   * The number of structural features of the '<em>For Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INIT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ForUpdateImpl <em>For Update</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ForUpdateImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getForUpdate()
   * @generated
   */
  int FOR_UPDATE = 89;

  /**
   * The number of structural features of the '<em>For Update</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_UPDATE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.CompositionMethodImpl <em>Composition Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.CompositionMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCompositionMethod()
   * @generated
   */
  int COMPOSITION_METHOD = 90;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_METHOD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_METHOD__MEMBERS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Composition Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl <em>Control Switch Composition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getControlSwitchComposition()
   * @generated
   */
  int CONTROL_SWITCH_COMPOSITION = 91;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__ID = 0;

  /**
   * The feature id for the '<em><b>Sync</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__SYNC = 1;

  /**
   * The feature id for the '<em><b>Recev</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__RECEV = 2;

  /**
   * The feature id for the '<em><b>Send</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__SEND = 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__SOURCE = 4;

  /**
   * The feature id for the '<em><b>Sourcelist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__SOURCELIST = 5;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__ACTION = 6;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__DESTINATION = 7;

  /**
   * The feature id for the '<em><b>Destinationlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST = 8;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__CONDITION = 9;

  /**
   * The feature id for the '<em><b>Discrete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION__DISCRETE = 10;

  /**
   * The number of structural features of the '<em>Control Switch Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SWITCH_COMPOSITION_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.DiscreteBlockImpl <em>Discrete Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.DiscreteBlockImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDiscreteBlock()
   * @generated
   */
  int DISCRETE_BLOCK = 92;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_BLOCK__BUILT_IN_NAME = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_BLOCK__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Discrete Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.ConditionBlockImpl <em>Condition Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.ConditionBlockImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConditionBlock()
   * @generated
   */
  int CONDITION_BLOCK = 93;

  /**
   * The feature id for the '<em><b>Built In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_BLOCK__BUILT_IN_NAME = 0;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_BLOCK__CONDITIONS = 1;

  /**
   * The number of structural features of the '<em>Condition Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.DiscreteMethodImpl <em>Discrete Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.DiscreteMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDiscreteMethod()
   * @generated
   */
  int DISCRETE_METHOD = 94;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_METHOD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_METHOD__PARAMS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_METHOD__STATEMENTS = MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Discrete Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRETE_METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbstractDiscreteMethodImpl <em>Abstract Discrete Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbstractDiscreteMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractDiscreteMethod()
   * @generated
   */
  int ABSTRACT_DISCRETE_METHOD = 95;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DISCRETE_METHOD__NAME = ABSTRACT_METHOD__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DISCRETE_METHOD__TYPE = ABSTRACT_METHOD__TYPE;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DISCRETE_METHOD__PARAMS = ABSTRACT_METHOD__PARAMS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DISCRETE_METHOD__BODY = ABSTRACT_METHOD__BODY;

  /**
   * The number of structural features of the '<em>Abstract Discrete Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DISCRETE_METHOD_FEATURE_COUNT = ABSTRACT_METHOD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.InitMethodImpl <em>Init Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.InitMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInitMethod()
   * @generated
   */
  int INIT_METHOD = 96;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_METHOD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_METHOD__STATEMENTS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Init Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.AbstractInitMethodImpl <em>Abstract Init Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.AbstractInitMethodImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractInitMethod()
   * @generated
   */
  int ABSTRACT_INIT_METHOD = 97;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_INIT_METHOD__NAME = ABSTRACT_METHOD__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_INIT_METHOD__TYPE = ABSTRACT_METHOD__TYPE;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_INIT_METHOD__PARAMS = ABSTRACT_METHOD__PARAMS;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_INIT_METHOD__BODY = ABSTRACT_METHOD__BODY;

  /**
   * The number of structural features of the '<em>Abstract Init Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_INIT_METHOD_FEATURE_COUNT = ABSTRACT_METHOD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.NewByClassImpl <em>New By Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.NewByClassImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNewByClass()
   * @generated
   */
  int NEW_BY_CLASS = 98;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_BY_CLASS__TYPE = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_BY_CLASS__ARGS = 1;

  /**
   * The number of structural features of the '<em>New By Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_BY_CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.NewArrayImpl <em>New Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.NewArrayImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNewArray()
   * @generated
   */
  int NEW_ARRAY = 99;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ARRAY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Dime</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ARRAY__DIME = 1;

  /**
   * The number of structural features of the '<em>New Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ARRAY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.DimExprImpl <em>Dim Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.DimExprImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDimExpr()
   * @generated
   */
  int DIM_EXPR = 100;

  /**
   * The number of structural features of the '<em>Dim Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIM_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.bodyImpl <em>body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.bodyImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getbody()
   * @generated
   */
  int BODY = 101;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__STATEMENTS = METHOD_BODY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = METHOD_BODY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.InfiniteLiteralImpl <em>Infinite Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.InfiniteLiteralImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInfiniteLiteral()
   * @generated
   */
  int INFINITE_LITERAL = 102;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFINITE_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Infinite Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFINITE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.IntegerLiteralImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 103;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.FloatingPointLiteralImpl <em>Floating Point Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.FloatingPointLiteralImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getFloatingPointLiteral()
   * @generated
   */
  int FLOATING_POINT_LITERAL = 104;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOATING_POINT_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Floating Point Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOATING_POINT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.CharacterLiteralImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCharacterLiteral()
   * @generated
   */
  int CHARACTER_LITERAL = 105;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Character Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHARACTER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.StringLiteralImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 106;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.BooleanLiteralImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 107;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.NullLiteralImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 108;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.fofo.apricot.impl.dimexImpl <em>dimex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.fofo.apricot.impl.dimexImpl
   * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getdimex()
   * @generated
   */
  int DIMEX = 109;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMEX__INDEX = DIM_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>dimex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIMEX_FEATURE_COUNT = DIM_EXPR_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.xtext.fofo.apricot.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.fofo.apricot.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.PackageDeclaration#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.fofo.apricot.PackageDeclaration#getImports()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.fofo.apricot.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtext.fofo.apricot.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.fofo.apricot.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.RefType <em>Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Type</em>'.
   * @see org.xtext.fofo.apricot.RefType
   * @generated
   */
  EClass getRefType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.RefType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.fofo.apricot.RefType#getName()
   * @see #getRefType()
   * @generated
   */
  EAttribute getRefType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.NonRefType <em>Non Ref Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Ref Type</em>'.
   * @see org.xtext.fofo.apricot.NonRefType
   * @generated
   */
  EClass getNonRefType();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Type</em>'.
   * @see org.xtext.fofo.apricot.BasicType
   * @generated
   */
  EClass getBasicType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.BasicType#getBT <em>BT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>BT</em>'.
   * @see org.xtext.fofo.apricot.BasicType#getBT()
   * @see #getBasicType()
   * @generated
   */
  EAttribute getBasicType_BT();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.MathType <em>Math Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math Type</em>'.
   * @see org.xtext.fofo.apricot.MathType
   * @generated
   */
  EClass getMathType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.MathType#getMT <em>MT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>MT</em>'.
   * @see org.xtext.fofo.apricot.MathType#getMT()
   * @see #getMathType()
   * @generated
   */
  EAttribute getMathType_MT();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.xtext.fofo.apricot.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.Interface#getSuperclass <em>Superclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Superclass</em>'.
   * @see org.xtext.fofo.apricot.Interface#getSuperclass()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Superclass();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Interface#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.xtext.fofo.apricot.Interface#getMembers()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Members();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.xtext.fofo.apricot.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.Class#getSuperclass <em>Superclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Superclass</em>'.
   * @see org.xtext.fofo.apricot.Class#getSuperclass()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Superclass();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.Class#getInterfaceclass <em>Interfaceclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interfaceclass</em>'.
   * @see org.xtext.fofo.apricot.Class#getInterfaceclass()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Interfaceclass();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Class#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.xtext.fofo.apricot.Class#getMembers()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Members();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see org.xtext.fofo.apricot.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.xtext.fofo.apricot.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Field#getAccessmodifer <em>Accessmodifer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Accessmodifer</em>'.
   * @see org.xtext.fofo.apricot.Field#getAccessmodifer()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Accessmodifer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Field#getVariablemodifer <em>Variablemodifer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variablemodifer</em>'.
   * @see org.xtext.fofo.apricot.Field#getVariablemodifer()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Variablemodifer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.fofo.apricot.Field#getDim <em>Dim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dim</em>'.
   * @see org.xtext.fofo.apricot.Field#getDim()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Dim();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Field#getVarini <em>Varini</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Varini</em>'.
   * @see org.xtext.fofo.apricot.Field#getVarini()
   * @see #getField()
   * @generated
   */
  EReference getField_Varini();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ConstructorMethod <em>Constructor Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Method</em>'.
   * @see org.xtext.fofo.apricot.ConstructorMethod
   * @generated
   */
  EClass getConstructorMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.ConstructorMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.fofo.apricot.ConstructorMethod#getParams()
   * @see #getConstructorMethod()
   * @generated
   */
  EReference getConstructorMethod_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ConstructorMethod#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.fofo.apricot.ConstructorMethod#getBody()
   * @see #getConstructorMethod()
   * @generated
   */
  EReference getConstructorMethod_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.xtext.fofo.apricot.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.Method#getType()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.fofo.apricot.Method#getDim <em>Dim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dim</em>'.
   * @see org.xtext.fofo.apricot.Method#getDim()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Dim();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.fofo.apricot.Method#getParams()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Method#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.fofo.apricot.Method#getBody()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AbstractMethod <em>Abstract Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Method</em>'.
   * @see org.xtext.fofo.apricot.AbstractMethod
   * @generated
   */
  EClass getAbstractMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.AbstractMethod#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.AbstractMethod#getType()
   * @see #getAbstractMethod()
   * @generated
   */
  EReference getAbstractMethod_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.AbstractMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.fofo.apricot.AbstractMethod#getParams()
   * @see #getAbstractMethod()
   * @generated
   */
  EReference getAbstractMethod_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.AbstractMethod#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.fofo.apricot.AbstractMethod#getBody()
   * @see #getAbstractMethod()
   * @generated
   */
  EReference getAbstractMethod_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.UseType <em>Use Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Type</em>'.
   * @see org.xtext.fofo.apricot.UseType
   * @generated
   */
  EClass getUseType();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.UseType#getReftype <em>Reftype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reftype</em>'.
   * @see org.xtext.fofo.apricot.UseType#getReftype()
   * @see #getUseType()
   * @generated
   */
  EReference getUseType_Reftype();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.UseType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.UseType#getType()
   * @see #getUseType()
   * @generated
   */
  EReference getUseType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.fofo.apricot.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.fofo.apricot.Parameter#getDim <em>Dim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dim</em>'.
   * @see org.xtext.fofo.apricot.Parameter#getDim()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Dim();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Element</em>'.
   * @see org.xtext.fofo.apricot.TypedElement
   * @generated
   */
  EClass getTypedElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.TypedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.fofo.apricot.TypedElement#getName()
   * @see #getTypedElement()
   * @generated
   */
  EAttribute getTypedElement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.MethodBody <em>Method Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Body</em>'.
   * @see org.xtext.fofo.apricot.MethodBody
   * @generated
   */
  EClass getMethodBody();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AbstractMethodBody <em>Abstract Method Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Method Body</em>'.
   * @see org.xtext.fofo.apricot.AbstractMethodBody
   * @generated
   */
  EClass getAbstractMethodBody();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.VariableInitializer <em>Variable Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Initializer</em>'.
   * @see org.xtext.fofo.apricot.VariableInitializer
   * @generated
   */
  EClass getVariableInitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.xtext.fofo.apricot.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ReturnStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.fofo.apricot.ReturnStatement#getExpression()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AbstractInterfaceElement <em>Abstract Interface Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Interface Element</em>'.
   * @see org.xtext.fofo.apricot.AbstractInterfaceElement
   * @generated
   */
  EClass getAbstractInterfaceElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.AbstractInterfaceElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.fofo.apricot.AbstractInterfaceElement#getName()
   * @see #getAbstractInterfaceElement()
   * @generated
   */
  EAttribute getAbstractInterfaceElement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Requires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requires</em>'.
   * @see org.xtext.fofo.apricot.Requires
   * @generated
   */
  EClass getRequires();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Requires#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.Requires#getType()
   * @see #getRequires()
   * @generated
   */
  EReference getRequires_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch <em>Abstract Dynamic Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Dynamic Switch</em>'.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch
   * @generated
   */
  EClass getAbstractDynamicSwitch();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch#getSname <em>Sname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sname</em>'.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch#getSname()
   * @see #getAbstractDynamicSwitch()
   * @generated
   */
  EAttribute getAbstractDynamicSwitch_Sname();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch#getType1 <em>Type1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type1</em>'.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch#getType1()
   * @see #getAbstractDynamicSwitch()
   * @generated
   */
  EReference getAbstractDynamicSwitch_Type1();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch#getType2 <em>Type2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type2</em>'.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch#getType2()
   * @see #getAbstractDynamicSwitch()
   * @generated
   */
  EReference getAbstractDynamicSwitch_Type2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch#getAname <em>Aname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aname</em>'.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch#getAname()
   * @see #getAbstractDynamicSwitch()
   * @generated
   */
  EAttribute getAbstractDynamicSwitch_Aname();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch#getType3 <em>Type3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type3</em>'.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch#getType3()
   * @see #getAbstractDynamicSwitch()
   * @generated
   */
  EReference getAbstractDynamicSwitch_Type3();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch#getDname <em>Dname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dname</em>'.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch#getDname()
   * @see #getAbstractDynamicSwitch()
   * @generated
   */
  EAttribute getAbstractDynamicSwitch_Dname();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch#getType4 <em>Type4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type4</em>'.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch#getType4()
   * @see #getAbstractDynamicSwitch()
   * @generated
   */
  EReference getAbstractDynamicSwitch_Type4();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.AbstractDynamicSwitch#getType5 <em>Type5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type5</em>'.
   * @see org.xtext.fofo.apricot.AbstractDynamicSwitch#getType5()
   * @see #getAbstractDynamicSwitch()
   * @generated
   */
  EReference getAbstractDynamicSwitch_Type5();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AbstractCompositionMethod <em>Abstract Composition Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Composition Method</em>'.
   * @see org.xtext.fofo.apricot.AbstractCompositionMethod
   * @generated
   */
  EClass getAbstractCompositionMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.AbstractCompositionMethod#getRac <em>Rac</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rac</em>'.
   * @see org.xtext.fofo.apricot.AbstractCompositionMethod#getRac()
   * @see #getAbstractCompositionMethod()
   * @generated
   */
  EReference getAbstractCompositionMethod_Rac();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.NativeStartMethod <em>Native Start Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native Start Method</em>'.
   * @see org.xtext.fofo.apricot.NativeStartMethod
   * @generated
   */
  EClass getNativeStartMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.RequiresAbstractComposition <em>Requires Abstract Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requires Abstract Composition</em>'.
   * @see org.xtext.fofo.apricot.RequiresAbstractComposition
   * @generated
   */
  EClass getRequiresAbstractComposition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.RequiresAbstractComposition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.fofo.apricot.RequiresAbstractComposition#getName()
   * @see #getRequiresAbstractComposition()
   * @generated
   */
  EAttribute getRequiresAbstractComposition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.RequiresAbstractComposition#getAbstract_dynamic_switch <em>Abstract dynamic switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract dynamic switch</em>'.
   * @see org.xtext.fofo.apricot.RequiresAbstractComposition#getAbstract_dynamic_switch()
   * @see #getRequiresAbstractComposition()
   * @generated
   */
  EReference getRequiresAbstractComposition_Abstract_dynamic_switch();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ClockConstraint <em>Clock Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clock Constraint</em>'.
   * @see org.xtext.fofo.apricot.ClockConstraint
   * @generated
   */
  EClass getClockConstraint();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AbstractInvariant <em>Abstract Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Invariant</em>'.
   * @see org.xtext.fofo.apricot.AbstractInvariant
   * @generated
   */
  EClass getAbstractInvariant();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.fofo.apricot.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Expression</em>'.
   * @see org.xtext.fofo.apricot.ConditionalExpression
   * @generated
   */
  EClass getConditionalExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.ConditionalExpression#getAssignmentoperator <em>Assignmentoperator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assignmentoperator</em>'.
   * @see org.xtext.fofo.apricot.ConditionalExpression#getAssignmentoperator()
   * @see #getConditionalExpression()
   * @generated
   */
  EAttribute getConditionalExpression_Assignmentoperator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ConditionalExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.fofo.apricot.ConditionalExpression#getExpression()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ConditionalExpression#getConditionalorexpression <em>Conditionalorexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditionalorexpression</em>'.
   * @see org.xtext.fofo.apricot.ConditionalExpression#getConditionalorexpression()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_Conditionalorexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ConditionalExpression#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.xtext.fofo.apricot.ConditionalExpression#getExpression1()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_Expression1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ConditionalExpression#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.fofo.apricot.ConditionalExpression#getExpression2()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_Expression2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Or Expression</em>'.
   * @see org.xtext.fofo.apricot.ConditionalOrExpression
   * @generated
   */
  EClass getConditionalOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.ConditionalOrExpression#getConditionalandexpression <em>Conditionalandexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditionalandexpression</em>'.
   * @see org.xtext.fofo.apricot.ConditionalOrExpression#getConditionalandexpression()
   * @see #getConditionalOrExpression()
   * @generated
   */
  EReference getConditionalOrExpression_Conditionalandexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional And Expression</em>'.
   * @see org.xtext.fofo.apricot.ConditionalAndExpression
   * @generated
   */
  EClass getConditionalAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.ConditionalAndExpression#getExclusiveorexpression <em>Exclusiveorexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exclusiveorexpression</em>'.
   * @see org.xtext.fofo.apricot.ConditionalAndExpression#getExclusiveorexpression()
   * @see #getConditionalAndExpression()
   * @generated
   */
  EReference getConditionalAndExpression_Exclusiveorexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusive Or Expression</em>'.
   * @see org.xtext.fofo.apricot.ExclusiveOrExpression
   * @generated
   */
  EClass getExclusiveOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.ExclusiveOrExpression#getEqualityexpression <em>Equalityexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equalityexpression</em>'.
   * @see org.xtext.fofo.apricot.ExclusiveOrExpression#getEqualityexpression()
   * @see #getExclusiveOrExpression()
   * @generated
   */
  EReference getExclusiveOrExpression_Equalityexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression</em>'.
   * @see org.xtext.fofo.apricot.EqualityExpression
   * @generated
   */
  EClass getEqualityExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.EqualityExpression#getInstanceofexpression <em>Instanceofexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instanceofexpression</em>'.
   * @see org.xtext.fofo.apricot.EqualityExpression#getInstanceofexpression()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Instanceofexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.InstanceOfExpression <em>Instance Of Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Of Expression</em>'.
   * @see org.xtext.fofo.apricot.InstanceOfExpression
   * @generated
   */
  EClass getInstanceOfExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.InstanceOfExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.fofo.apricot.InstanceOfExpression#getLeft()
   * @see #getInstanceOfExpression()
   * @generated
   */
  EReference getInstanceOfExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.InstanceOfExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.InstanceOfExpression#getType()
   * @see #getInstanceOfExpression()
   * @generated
   */
  EReference getInstanceOfExpression_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Expression</em>'.
   * @see org.xtext.fofo.apricot.RelationalExpression
   * @generated
   */
  EClass getRelationalExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.RelationalExpression#getAdditiveexpression <em>Additiveexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additiveexpression</em>'.
   * @see org.xtext.fofo.apricot.RelationalExpression#getAdditiveexpression()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_Additiveexpression();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.fofo.apricot.RelationalExpression#getRelationalop <em>Relationalop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Relationalop</em>'.
   * @see org.xtext.fofo.apricot.RelationalExpression#getRelationalop()
   * @see #getRelationalExpression()
   * @generated
   */
  EAttribute getRelationalExpression_Relationalop();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see org.xtext.fofo.apricot.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.AdditiveExpression#getMultiplicativeexpression <em>Multiplicativeexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Multiplicativeexpression</em>'.
   * @see org.xtext.fofo.apricot.AdditiveExpression#getMultiplicativeexpression()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_Multiplicativeexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression</em>'.
   * @see org.xtext.fofo.apricot.MultiplicativeExpression
   * @generated
   */
  EClass getMultiplicativeExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.MultiplicativeExpression#getUnaryexpression <em>Unaryexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unaryexpression</em>'.
   * @see org.xtext.fofo.apricot.MultiplicativeExpression#getUnaryexpression()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_Unaryexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.xtext.fofo.apricot.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.UnaryExpression#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.xtext.fofo.apricot.UnaryExpression#getFrom()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_From();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.UnaryExpression#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.xtext.fofo.apricot.UnaryExpression#getTo()
   * @see #getUnaryExpression()
   * @generated
   */
  EReference getUnaryExpression_To();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus <em>Unary Expression Not Plus Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression Not Plus Minus</em>'.
   * @see org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus
   * @generated
   */
  EClass getUnaryExpressionNotPlusMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getUnaryexpression <em>Unaryexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unaryexpression</em>'.
   * @see org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getUnaryexpression()
   * @see #getUnaryExpressionNotPlusMinus()
   * @generated
   */
  EReference getUnaryExpressionNotPlusMinus_Unaryexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getCastexpression <em>Castexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Castexpression</em>'.
   * @see org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getCastexpression()
   * @see #getUnaryExpressionNotPlusMinus()
   * @generated
   */
  EReference getUnaryExpressionNotPlusMinus_Castexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getPrimary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary</em>'.
   * @see org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getPrimary()
   * @see #getUnaryExpressionNotPlusMinus()
   * @generated
   */
  EReference getUnaryExpressionNotPlusMinus_Primary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getBuiltin <em>Builtin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Builtin</em>'.
   * @see org.xtext.fofo.apricot.UnaryExpressionNotPlusMinus#getBuiltin()
   * @see #getUnaryExpressionNotPlusMinus()
   * @generated
   */
  EReference getUnaryExpressionNotPlusMinus_Builtin();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary</em>'.
   * @see org.xtext.fofo.apricot.Primary
   * @generated
   */
  EClass getPrimary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Primary#getParexpression <em>Parexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parexpression</em>'.
   * @see org.xtext.fofo.apricot.Primary#getParexpression()
   * @see #getPrimary()
   * @generated
   */
  EReference getPrimary_Parexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Primary#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.xtext.fofo.apricot.Primary#getLiteral()
   * @see #getPrimary()
   * @generated
   */
  EReference getPrimary_Literal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Primary#getNewobject <em>Newobject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Newobject</em>'.
   * @see org.xtext.fofo.apricot.Primary#getNewobject()
   * @see #getPrimary()
   * @generated
   */
  EReference getPrimary_Newobject();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Primary#getNewarray <em>Newarray</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Newarray</em>'.
   * @see org.xtext.fofo.apricot.Primary#getNewarray()
   * @see #getPrimary()
   * @generated
   */
  EReference getPrimary_Newarray();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.fofo.apricot.Primary#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Identifier</em>'.
   * @see org.xtext.fofo.apricot.Primary#getIdentifier()
   * @see #getPrimary()
   * @generated
   */
  EAttribute getPrimary_Identifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Primary#getDimer <em>Dimer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimer</em>'.
   * @see org.xtext.fofo.apricot.Primary#getDimer()
   * @see #getPrimary()
   * @generated
   */
  EReference getPrimary_Dimer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Primary#getIdentifiersuffix <em>Identifiersuffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifiersuffix</em>'.
   * @see org.xtext.fofo.apricot.Primary#getIdentifiersuffix()
   * @see #getPrimary()
   * @generated
   */
  EReference getPrimary_Identifiersuffix();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.IdentifierSuffix <em>Identifier Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier Suffix</em>'.
   * @see org.xtext.fofo.apricot.IdentifierSuffix
   * @generated
   */
  EClass getIdentifierSuffix();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.IdentifierSuffix#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see org.xtext.fofo.apricot.IdentifierSuffix#getArguments()
   * @see #getIdentifierSuffix()
   * @generated
   */
  EReference getIdentifierSuffix_Arguments();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.IdentifierSuffix#getGetvalue <em>Getvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Getvalue</em>'.
   * @see org.xtext.fofo.apricot.IdentifierSuffix#getGetvalue()
   * @see #getIdentifierSuffix()
   * @generated
   */
  EAttribute getIdentifierSuffix_Getvalue();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Arguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arguments</em>'.
   * @see org.xtext.fofo.apricot.Arguments
   * @generated
   */
  EClass getArguments();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Arguments#getExpressionlist <em>Expressionlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressionlist</em>'.
   * @see org.xtext.fofo.apricot.Arguments#getExpressionlist()
   * @see #getArguments()
   * @generated
   */
  EReference getArguments_Expressionlist();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ExpressionList <em>Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression List</em>'.
   * @see org.xtext.fofo.apricot.ExpressionList
   * @generated
   */
  EClass getExpressionList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ExpressionList#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.xtext.fofo.apricot.ExpressionList#getExpression1()
   * @see #getExpressionList()
   * @generated
   */
  EReference getExpressionList_Expression1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.ExpressionList#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression2</em>'.
   * @see org.xtext.fofo.apricot.ExpressionList#getExpression2()
   * @see #getExpressionList()
   * @generated
   */
  EReference getExpressionList_Expression2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expression</em>'.
   * @see org.xtext.fofo.apricot.CastExpression
   * @generated
   */
  EClass getCastExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.CastExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.CastExpression#getType()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.CastExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.fofo.apricot.CastExpression#getExpression()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ParExpression <em>Par Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Par Expression</em>'.
   * @see org.xtext.fofo.apricot.ParExpression
   * @generated
   */
  EClass getParExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ParExpression#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.xtext.fofo.apricot.ParExpression#getExpression1()
   * @see #getParExpression()
   * @generated
   */
  EReference getParExpression_Expression1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.ParExpression#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression2</em>'.
   * @see org.xtext.fofo.apricot.ParExpression#getExpression2()
   * @see #getParExpression()
   * @generated
   */
  EReference getParExpression_Expression2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.DE_LHS <em>DE LHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DE LHS</em>'.
   * @see org.xtext.fofo.apricot.DE_LHS
   * @generated
   */
  EClass getDE_LHS();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.DE_LHS#getVar1 <em>Var1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var1</em>'.
   * @see org.xtext.fofo.apricot.DE_LHS#getVar1()
   * @see #getDE_LHS()
   * @generated
   */
  EAttribute getDE_LHS_Var1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.DE_LHS#getVar2 <em>Var2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var2</em>'.
   * @see org.xtext.fofo.apricot.DE_LHS#getVar2()
   * @see #getDE_LHS()
   * @generated
   */
  EAttribute getDE_LHS_Var2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.DE_LHS#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Order</em>'.
   * @see org.xtext.fofo.apricot.DE_LHS#getOrder()
   * @see #getDE_LHS()
   * @generated
   */
  EAttribute getDE_LHS_Order();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.DifferentialEquation <em>Differential Equation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Differential Equation</em>'.
   * @see org.xtext.fofo.apricot.DifferentialEquation
   * @generated
   */
  EClass getDifferentialEquation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.DifferentialEquation#getLHS <em>LHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LHS</em>'.
   * @see org.xtext.fofo.apricot.DifferentialEquation#getLHS()
   * @see #getDifferentialEquation()
   * @generated
   */
  EReference getDifferentialEquation_LHS();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.DifferentialEquation#getRHS <em>RHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>RHS</em>'.
   * @see org.xtext.fofo.apricot.DifferentialEquation#getRHS()
   * @see #getDifferentialEquation()
   * @generated
   */
  EReference getDifferentialEquation_RHS();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ContinuousMethod <em>Continuous Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continuous Method</em>'.
   * @see org.xtext.fofo.apricot.ContinuousMethod
   * @generated
   */
  EClass getContinuousMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.ContinuousMethod#getDES <em>DES</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>DES</em>'.
   * @see org.xtext.fofo.apricot.ContinuousMethod#getDES()
   * @see #getContinuousMethod()
   * @generated
   */
  EReference getContinuousMethod_DES();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AbstractContinuousMethod <em>Abstract Continuous Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Continuous Method</em>'.
   * @see org.xtext.fofo.apricot.AbstractContinuousMethod
   * @generated
   */
  EClass getAbstractContinuousMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Built_In_Methods <em>Built In Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Methods</em>'.
   * @see org.xtext.fofo.apricot.Built_In_Methods
   * @generated
   */
  EClass getBuilt_In_Methods();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Sqrt <em>Sqrt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sqrt</em>'.
   * @see org.xtext.fofo.apricot.Sqrt
   * @generated
   */
  EClass getSqrt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Sqrt#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Sqrt#getBuiltInName()
   * @see #getSqrt()
   * @generated
   */
  EAttribute getSqrt_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Sqrt#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Sqrt#getEx()
   * @see #getSqrt()
   * @generated
   */
  EReference getSqrt_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Sin <em>Sin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sin</em>'.
   * @see org.xtext.fofo.apricot.Sin
   * @generated
   */
  EClass getSin();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Sin#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Sin#getBuiltInName()
   * @see #getSin()
   * @generated
   */
  EAttribute getSin_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Sin#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Sin#getEx()
   * @see #getSin()
   * @generated
   */
  EReference getSin_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Cos <em>Cos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cos</em>'.
   * @see org.xtext.fofo.apricot.Cos
   * @generated
   */
  EClass getCos();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Cos#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Cos#getBuiltInName()
   * @see #getCos()
   * @generated
   */
  EAttribute getCos_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Cos#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Cos#getEx()
   * @see #getCos()
   * @generated
   */
  EReference getCos_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Tan <em>Tan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tan</em>'.
   * @see org.xtext.fofo.apricot.Tan
   * @generated
   */
  EClass getTan();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Tan#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Tan#getBuiltInName()
   * @see #getTan()
   * @generated
   */
  EAttribute getTan_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Tan#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Tan#getEx()
   * @see #getTan()
   * @generated
   */
  EReference getTan_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Cot <em>Cot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cot</em>'.
   * @see org.xtext.fofo.apricot.Cot
   * @generated
   */
  EClass getCot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Cot#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Cot#getBuiltInName()
   * @see #getCot()
   * @generated
   */
  EAttribute getCot_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Cot#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Cot#getEx()
   * @see #getCot()
   * @generated
   */
  EReference getCot_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Sec <em>Sec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sec</em>'.
   * @see org.xtext.fofo.apricot.Sec
   * @generated
   */
  EClass getSec();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Sec#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Sec#getBuiltInName()
   * @see #getSec()
   * @generated
   */
  EAttribute getSec_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Sec#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Sec#getEx()
   * @see #getSec()
   * @generated
   */
  EReference getSec_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Csc <em>Csc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Csc</em>'.
   * @see org.xtext.fofo.apricot.Csc
   * @generated
   */
  EClass getCsc();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Csc#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Csc#getBuiltInName()
   * @see #getCsc()
   * @generated
   */
  EAttribute getCsc_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Csc#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Csc#getEx()
   * @see #getCsc()
   * @generated
   */
  EReference getCsc_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Round <em>Round</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Round</em>'.
   * @see org.xtext.fofo.apricot.Round
   * @generated
   */
  EClass getRound();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Round#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Round#getBuiltInName()
   * @see #getRound()
   * @generated
   */
  EAttribute getRound_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Round#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Round#getEx()
   * @see #getRound()
   * @generated
   */
  EReference getRound_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Floor <em>Floor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Floor</em>'.
   * @see org.xtext.fofo.apricot.Floor
   * @generated
   */
  EClass getFloor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Floor#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Floor#getBuiltInName()
   * @see #getFloor()
   * @generated
   */
  EAttribute getFloor_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Floor#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Floor#getEx()
   * @see #getFloor()
   * @generated
   */
  EReference getFloor_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Ceil <em>Ceil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ceil</em>'.
   * @see org.xtext.fofo.apricot.Ceil
   * @generated
   */
  EClass getCeil();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Ceil#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Ceil#getBuiltInName()
   * @see #getCeil()
   * @generated
   */
  EAttribute getCeil_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Ceil#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Ceil#getEx()
   * @see #getCeil()
   * @generated
   */
  EReference getCeil_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see org.xtext.fofo.apricot.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Div#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Div#getBuiltInName()
   * @see #getDiv()
   * @generated
   */
  EAttribute getDiv_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Div#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Div#getE1()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Div#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Div#getE2()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Fld <em>Fld</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fld</em>'.
   * @see org.xtext.fofo.apricot.Fld
   * @generated
   */
  EClass getFld();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Fld#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Fld#getBuiltInName()
   * @see #getFld()
   * @generated
   */
  EAttribute getFld_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Fld#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Fld#getE1()
   * @see #getFld()
   * @generated
   */
  EReference getFld_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Fld#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Fld#getE2()
   * @see #getFld()
   * @generated
   */
  EReference getFld_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Rem <em>Rem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rem</em>'.
   * @see org.xtext.fofo.apricot.Rem
   * @generated
   */
  EClass getRem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Rem#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Rem#getBuiltInName()
   * @see #getRem()
   * @generated
   */
  EAttribute getRem_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Rem#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Rem#getE1()
   * @see #getRem()
   * @generated
   */
  EReference getRem_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Rem#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Rem#getE2()
   * @see #getRem()
   * @generated
   */
  EReference getRem_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Mod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod</em>'.
   * @see org.xtext.fofo.apricot.Mod
   * @generated
   */
  EClass getMod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Mod#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Mod#getBuiltInName()
   * @see #getMod()
   * @generated
   */
  EAttribute getMod_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Mod#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Mod#getE1()
   * @see #getMod()
   * @generated
   */
  EReference getMod_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Mod#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Mod#getE2()
   * @see #getMod()
   * @generated
   */
  EReference getMod_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Gcd <em>Gcd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gcd</em>'.
   * @see org.xtext.fofo.apricot.Gcd
   * @generated
   */
  EClass getGcd();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Gcd#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Gcd#getBuiltInName()
   * @see #getGcd()
   * @generated
   */
  EAttribute getGcd_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Gcd#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Gcd#getE1()
   * @see #getGcd()
   * @generated
   */
  EReference getGcd_E1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Gcd#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Gcd#getE2()
   * @see #getGcd()
   * @generated
   */
  EReference getGcd_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Lcm <em>Lcm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lcm</em>'.
   * @see org.xtext.fofo.apricot.Lcm
   * @generated
   */
  EClass getLcm();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Lcm#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Lcm#getBuiltInName()
   * @see #getLcm()
   * @generated
   */
  EAttribute getLcm_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Lcm#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Lcm#getE1()
   * @see #getLcm()
   * @generated
   */
  EReference getLcm_E1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Lcm#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Lcm#getE2()
   * @see #getLcm()
   * @generated
   */
  EReference getLcm_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Abs <em>Abs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abs</em>'.
   * @see org.xtext.fofo.apricot.Abs
   * @generated
   */
  EClass getAbs();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Abs#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Abs#getBuiltInName()
   * @see #getAbs()
   * @generated
   */
  EAttribute getAbs_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Abs#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Abs#getEx()
   * @see #getAbs()
   * @generated
   */
  EReference getAbs_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Sign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sign</em>'.
   * @see org.xtext.fofo.apricot.Sign
   * @generated
   */
  EClass getSign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Sign#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Sign#getBuiltInName()
   * @see #getSign()
   * @generated
   */
  EAttribute getSign_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Sign#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Sign#getEx()
   * @see #getSign()
   * @generated
   */
  EReference getSign_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.xtext.fofo.apricot.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Root#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Root#getBuiltInName()
   * @see #getRoot()
   * @generated
   */
  EAttribute getRoot_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Root#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Root#getE1()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Root#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Root#getE2()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Hypot <em>Hypot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hypot</em>'.
   * @see org.xtext.fofo.apricot.Hypot
   * @generated
   */
  EClass getHypot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Hypot#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Hypot#getBuiltInName()
   * @see #getHypot()
   * @generated
   */
  EAttribute getHypot_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Hypot#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Hypot#getE1()
   * @see #getHypot()
   * @generated
   */
  EReference getHypot_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Hypot#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Hypot#getE2()
   * @see #getHypot()
   * @generated
   */
  EReference getHypot_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Pow <em>Pow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pow</em>'.
   * @see org.xtext.fofo.apricot.Pow
   * @generated
   */
  EClass getPow();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Pow#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Pow#getBuiltInName()
   * @see #getPow()
   * @generated
   */
  EAttribute getPow_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Pow#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Pow#getE1()
   * @see #getPow()
   * @generated
   */
  EReference getPow_E1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Pow#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Pow#getE2()
   * @see #getPow()
   * @generated
   */
  EReference getPow_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see org.xtext.fofo.apricot.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Exp#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Exp#getBuiltInName()
   * @see #getExp()
   * @generated
   */
  EAttribute getExp_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Exp#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Exp#getEx()
   * @see #getExp()
   * @generated
   */
  EReference getExp_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Log</em>'.
   * @see org.xtext.fofo.apricot.Log
   * @generated
   */
  EClass getLog();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Log#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Log#getBuiltInName()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Log#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Log#getE1()
   * @see #getLog()
   * @generated
   */
  EReference getLog_E1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Log#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Log#getE2()
   * @see #getLog()
   * @generated
   */
  EReference getLog_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Erf <em>Erf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Erf</em>'.
   * @see org.xtext.fofo.apricot.Erf
   * @generated
   */
  EClass getErf();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Erf#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Erf#getBuiltInName()
   * @see #getErf()
   * @generated
   */
  EAttribute getErf_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Erf#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Erf#getEx()
   * @see #getErf()
   * @generated
   */
  EReference getErf_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Gamma <em>Gamma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gamma</em>'.
   * @see org.xtext.fofo.apricot.Gamma
   * @generated
   */
  EClass getGamma();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Gamma#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Gamma#getBuiltInName()
   * @see #getGamma()
   * @generated
   */
  EAttribute getGamma_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Gamma#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Gamma#getEx()
   * @see #getGamma()
   * @generated
   */
  EReference getGamma_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Max <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max</em>'.
   * @see org.xtext.fofo.apricot.Max
   * @generated
   */
  EClass getMax();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Max#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Max#getBuiltInName()
   * @see #getMax()
   * @generated
   */
  EAttribute getMax_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Max#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Max#getE1()
   * @see #getMax()
   * @generated
   */
  EReference getMax_E1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Max#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Max#getE2()
   * @see #getMax()
   * @generated
   */
  EReference getMax_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Min <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min</em>'.
   * @see org.xtext.fofo.apricot.Min
   * @generated
   */
  EClass getMin();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Min#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Min#getBuiltInName()
   * @see #getMin()
   * @generated
   */
  EAttribute getMin_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Min#getE1 <em>E1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>E1</em>'.
   * @see org.xtext.fofo.apricot.Min#getE1()
   * @see #getMin()
   * @generated
   */
  EReference getMin_E1();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Min#getE2 <em>E2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>E2</em>'.
   * @see org.xtext.fofo.apricot.Min#getE2()
   * @see #getMin()
   * @generated
   */
  EReference getMin_E2();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pause</em>'.
   * @see org.xtext.fofo.apricot.Pause
   * @generated
   */
  EClass getPause();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Pause#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Pause#getBuiltInName()
   * @see #getPause()
   * @generated
   */
  EAttribute getPause_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Pause#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Pause#getEx()
   * @see #getPause()
   * @generated
   */
  EReference getPause_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size</em>'.
   * @see org.xtext.fofo.apricot.Size
   * @generated
   */
  EClass getSize();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Size#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.Size#getBuiltInName()
   * @see #getSize()
   * @generated
   */
  EAttribute getSize_BuiltInName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Size#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see org.xtext.fofo.apricot.Size#getEx()
   * @see #getSize()
   * @generated
   */
  EReference getSize_Ex();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.InvariantBlock <em>Invariant Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invariant Block</em>'.
   * @see org.xtext.fofo.apricot.InvariantBlock
   * @generated
   */
  EClass getInvariantBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.InvariantBlock#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see org.xtext.fofo.apricot.InvariantBlock#getConditions()
   * @see #getInvariantBlock()
   * @generated
   */
  EReference getInvariantBlock_Conditions();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.xtext.fofo.apricot.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.Block#getBlockstatement <em>Blockstatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blockstatement</em>'.
   * @see org.xtext.fofo.apricot.Block#getBlockstatement()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Blockstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Statement</em>'.
   * @see org.xtext.fofo.apricot.BlockStatement
   * @generated
   */
  EClass getBlockStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.LocalVarDecStatement <em>Local Var Dec Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Var Dec Statement</em>'.
   * @see org.xtext.fofo.apricot.LocalVarDecStatement
   * @generated
   */
  EClass getLocalVarDecStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.LocalVarDec <em>Local Var Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Var Dec</em>'.
   * @see org.xtext.fofo.apricot.LocalVarDec
   * @generated
   */
  EClass getLocalVarDec();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.LocalVarDec#getVariablemodifer <em>Variablemodifer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variablemodifer</em>'.
   * @see org.xtext.fofo.apricot.LocalVarDec#getVariablemodifer()
   * @see #getLocalVarDec()
   * @generated
   */
  EAttribute getLocalVarDec_Variablemodifer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.LocalVarDec#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.LocalVarDec#getType()
   * @see #getLocalVarDec()
   * @generated
   */
  EReference getLocalVarDec_Type();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.fofo.apricot.LocalVarDec#getDim <em>Dim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dim</em>'.
   * @see org.xtext.fofo.apricot.LocalVarDec#getDim()
   * @see #getLocalVarDec()
   * @generated
   */
  EAttribute getLocalVarDec_Dim();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.LocalVarDec#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.fofo.apricot.LocalVarDec#getName()
   * @see #getLocalVarDec()
   * @generated
   */
  EAttribute getLocalVarDec_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.LocalVarDec#getVarini <em>Varini</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Varini</em>'.
   * @see org.xtext.fofo.apricot.LocalVarDec#getVarini()
   * @see #getLocalVarDec()
   * @generated
   */
  EReference getLocalVarDec_Varini();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.fofo.apricot.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Statement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.xtext.fofo.apricot.Statement#getBlock()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Statement#getParexpression <em>Parexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parexpression</em>'.
   * @see org.xtext.fofo.apricot.Statement#getParexpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Parexpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Statement#getIfstatement <em>Ifstatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ifstatement</em>'.
   * @see org.xtext.fofo.apricot.Statement#getIfstatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Ifstatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Statement#getElsestatement <em>Elsestatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elsestatement</em>'.
   * @see org.xtext.fofo.apricot.Statement#getElsestatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Elsestatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Statement#getForcontrol <em>Forcontrol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forcontrol</em>'.
   * @see org.xtext.fofo.apricot.Statement#getForcontrol()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Forcontrol();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Statement#getForstatement <em>Forstatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forstatement</em>'.
   * @see org.xtext.fofo.apricot.Statement#getForstatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Forstatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.Statement#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.fofo.apricot.Statement#getIdentifier()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Statement#getWhilestatement <em>Whilestatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Whilestatement</em>'.
   * @see org.xtext.fofo.apricot.Statement#getWhilestatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Whilestatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Statement#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see org.xtext.fofo.apricot.Statement#getReturn()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Return();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.Statement#getStatementexpression <em>Statementexpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statementexpression</em>'.
   * @see org.xtext.fofo.apricot.Statement#getStatementexpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Statementexpression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ForControl <em>For Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Control</em>'.
   * @see org.xtext.fofo.apricot.ForControl
   * @generated
   */
  EClass getForControl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ForControl#getEnhancedforcontrol <em>Enhancedforcontrol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enhancedforcontrol</em>'.
   * @see org.xtext.fofo.apricot.ForControl#getEnhancedforcontrol()
   * @see #getForControl()
   * @generated
   */
  EReference getForControl_Enhancedforcontrol();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ForControl#getForinit <em>Forinit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forinit</em>'.
   * @see org.xtext.fofo.apricot.ForControl#getForinit()
   * @see #getForControl()
   * @generated
   */
  EReference getForControl_Forinit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ForControl#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.fofo.apricot.ForControl#getExpression()
   * @see #getForControl()
   * @generated
   */
  EReference getForControl_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ForControl#getForupdate <em>Forupdate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forupdate</em>'.
   * @see org.xtext.fofo.apricot.ForControl#getForupdate()
   * @see #getForControl()
   * @generated
   */
  EReference getForControl_Forupdate();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.EnhancedForControl <em>Enhanced For Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enhanced For Control</em>'.
   * @see org.xtext.fofo.apricot.EnhancedForControl
   * @generated
   */
  EClass getEnhancedForControl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.EnhancedForControl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.EnhancedForControl#getType()
   * @see #getEnhancedForControl()
   * @generated
   */
  EReference getEnhancedForControl_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.EnhancedForControl#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.fofo.apricot.EnhancedForControl#getId()
   * @see #getEnhancedForControl()
   * @generated
   */
  EAttribute getEnhancedForControl_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.EnhancedForControl#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.fofo.apricot.EnhancedForControl#getExpression()
   * @see #getEnhancedForControl()
   * @generated
   */
  EReference getEnhancedForControl_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ForInit <em>For Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Init</em>'.
   * @see org.xtext.fofo.apricot.ForInit
   * @generated
   */
  EClass getForInit();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ForUpdate <em>For Update</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Update</em>'.
   * @see org.xtext.fofo.apricot.ForUpdate
   * @generated
   */
  EClass getForUpdate();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.CompositionMethod <em>Composition Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Method</em>'.
   * @see org.xtext.fofo.apricot.CompositionMethod
   * @generated
   */
  EClass getCompositionMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.CompositionMethod#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.xtext.fofo.apricot.CompositionMethod#getMembers()
   * @see #getCompositionMethod()
   * @generated
   */
  EReference getCompositionMethod_Members();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ControlSwitchComposition <em>Control Switch Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Switch Composition</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition
   * @generated
   */
  EClass getControlSwitchComposition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getId()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EAttribute getControlSwitchComposition_Id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSync <em>Sync</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sync</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getSync()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EAttribute getControlSwitchComposition_Sync();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getRecev <em>Recev</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Recev</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getRecev()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EAttribute getControlSwitchComposition_Recev();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSend <em>Send</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Send</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getSend()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EAttribute getControlSwitchComposition_Send();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getSource()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EReference getControlSwitchComposition_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getSourcelist <em>Sourcelist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sourcelist</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getSourcelist()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EReference getControlSwitchComposition_Sourcelist();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getAction()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EReference getControlSwitchComposition_Action();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getDestination()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EReference getControlSwitchComposition_Destination();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getDestinationlist <em>Destinationlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destinationlist</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getDestinationlist()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EReference getControlSwitchComposition_Destinationlist();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getCondition()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EReference getControlSwitchComposition_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.ControlSwitchComposition#getDiscrete <em>Discrete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discrete</em>'.
   * @see org.xtext.fofo.apricot.ControlSwitchComposition#getDiscrete()
   * @see #getControlSwitchComposition()
   * @generated
   */
  EReference getControlSwitchComposition_Discrete();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.DiscreteBlock <em>Discrete Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discrete Block</em>'.
   * @see org.xtext.fofo.apricot.DiscreteBlock
   * @generated
   */
  EClass getDiscreteBlock();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.DiscreteBlock#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.DiscreteBlock#getBuiltInName()
   * @see #getDiscreteBlock()
   * @generated
   */
  EAttribute getDiscreteBlock_BuiltInName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.DiscreteBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.fofo.apricot.DiscreteBlock#getStatements()
   * @see #getDiscreteBlock()
   * @generated
   */
  EReference getDiscreteBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.ConditionBlock <em>Condition Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Block</em>'.
   * @see org.xtext.fofo.apricot.ConditionBlock
   * @generated
   */
  EClass getConditionBlock();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.ConditionBlock#getBuiltInName <em>Built In Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Built In Name</em>'.
   * @see org.xtext.fofo.apricot.ConditionBlock#getBuiltInName()
   * @see #getConditionBlock()
   * @generated
   */
  EAttribute getConditionBlock_BuiltInName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.ConditionBlock#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see org.xtext.fofo.apricot.ConditionBlock#getConditions()
   * @see #getConditionBlock()
   * @generated
   */
  EReference getConditionBlock_Conditions();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.DiscreteMethod <em>Discrete Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Discrete Method</em>'.
   * @see org.xtext.fofo.apricot.DiscreteMethod
   * @generated
   */
  EClass getDiscreteMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.DiscreteMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.fofo.apricot.DiscreteMethod#getParams()
   * @see #getDiscreteMethod()
   * @generated
   */
  EReference getDiscreteMethod_Params();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.DiscreteMethod#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.fofo.apricot.DiscreteMethod#getStatements()
   * @see #getDiscreteMethod()
   * @generated
   */
  EReference getDiscreteMethod_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AbstractDiscreteMethod <em>Abstract Discrete Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Discrete Method</em>'.
   * @see org.xtext.fofo.apricot.AbstractDiscreteMethod
   * @generated
   */
  EClass getAbstractDiscreteMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.InitMethod <em>Init Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Method</em>'.
   * @see org.xtext.fofo.apricot.InitMethod
   * @generated
   */
  EClass getInitMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.InitMethod#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.fofo.apricot.InitMethod#getStatements()
   * @see #getInitMethod()
   * @generated
   */
  EReference getInitMethod_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.AbstractInitMethod <em>Abstract Init Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Init Method</em>'.
   * @see org.xtext.fofo.apricot.AbstractInitMethod
   * @generated
   */
  EClass getAbstractInitMethod();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.NewByClass <em>New By Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New By Class</em>'.
   * @see org.xtext.fofo.apricot.NewByClass
   * @generated
   */
  EClass getNewByClass();

  /**
   * Returns the meta object for the reference '{@link org.xtext.fofo.apricot.NewByClass#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.NewByClass#getType()
   * @see #getNewByClass()
   * @generated
   */
  EReference getNewByClass_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.NewByClass#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.xtext.fofo.apricot.NewByClass#getArgs()
   * @see #getNewByClass()
   * @generated
   */
  EReference getNewByClass_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.NewArray <em>New Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Array</em>'.
   * @see org.xtext.fofo.apricot.NewArray
   * @generated
   */
  EClass getNewArray();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.NewArray#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.fofo.apricot.NewArray#getType()
   * @see #getNewArray()
   * @generated
   */
  EReference getNewArray_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.NewArray#getDime <em>Dime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dime</em>'.
   * @see org.xtext.fofo.apricot.NewArray#getDime()
   * @see #getNewArray()
   * @generated
   */
  EReference getNewArray_Dime();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.DimExpr <em>Dim Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dim Expr</em>'.
   * @see org.xtext.fofo.apricot.DimExpr
   * @generated
   */
  EClass getDimExpr();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.body <em>body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>body</em>'.
   * @see org.xtext.fofo.apricot.body
   * @generated
   */
  EClass getbody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.fofo.apricot.body#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.fofo.apricot.body#getStatements()
   * @see #getbody()
   * @generated
   */
  EReference getbody_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.InfiniteLiteral <em>Infinite Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infinite Literal</em>'.
   * @see org.xtext.fofo.apricot.InfiniteLiteral
   * @generated
   */
  EClass getInfiniteLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.InfiniteLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.fofo.apricot.InfiniteLiteral#getValue()
   * @see #getInfiniteLiteral()
   * @generated
   */
  EAttribute getInfiniteLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see org.xtext.fofo.apricot.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.fofo.apricot.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.FloatingPointLiteral <em>Floating Point Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Floating Point Literal</em>'.
   * @see org.xtext.fofo.apricot.FloatingPointLiteral
   * @generated
   */
  EClass getFloatingPointLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.FloatingPointLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.fofo.apricot.FloatingPointLiteral#getValue()
   * @see #getFloatingPointLiteral()
   * @generated
   */
  EAttribute getFloatingPointLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.CharacterLiteral <em>Character Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Character Literal</em>'.
   * @see org.xtext.fofo.apricot.CharacterLiteral
   * @generated
   */
  EClass getCharacterLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.CharacterLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.fofo.apricot.CharacterLiteral#getValue()
   * @see #getCharacterLiteral()
   * @generated
   */
  EAttribute getCharacterLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.xtext.fofo.apricot.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.fofo.apricot.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.xtext.fofo.apricot.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.fofo.apricot.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see org.xtext.fofo.apricot.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.fofo.apricot.NullLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.fofo.apricot.NullLiteral#getValue()
   * @see #getNullLiteral()
   * @generated
   */
  EAttribute getNullLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.fofo.apricot.dimex <em>dimex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>dimex</em>'.
   * @see org.xtext.fofo.apricot.dimex
   * @generated
   */
  EClass getdimex();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.fofo.apricot.dimex#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.xtext.fofo.apricot.dimex#getIndex()
   * @see #getdimex()
   * @generated
   */
  EReference getdimex_Index();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ApricotFactory getApricotFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.PackageDeclarationImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__IMPORTS = eINSTANCE.getPackageDeclaration_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ImportImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.RefTypeImpl <em>Ref Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.RefTypeImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRefType()
     * @generated
     */
    EClass REF_TYPE = eINSTANCE.getRefType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_TYPE__NAME = eINSTANCE.getRefType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.NonRefTypeImpl <em>Non Ref Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.NonRefTypeImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNonRefType()
     * @generated
     */
    EClass NON_REF_TYPE = eINSTANCE.getNonRefType();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.BasicTypeImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasicType();

    /**
     * The meta object literal for the '<em><b>BT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__BT = eINSTANCE.getBasicType_BT();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.MathTypeImpl <em>Math Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.MathTypeImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMathType()
     * @generated
     */
    EClass MATH_TYPE = eINSTANCE.getMathType();

    /**
     * The meta object literal for the '<em><b>MT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATH_TYPE__MT = eINSTANCE.getMathType_MT();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.InterfaceImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__SUPERCLASS = eINSTANCE.getInterface_Superclass();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__MEMBERS = eINSTANCE.getInterface_Members();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ClassImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SUPERCLASS = eINSTANCE.getClass_Superclass();

    /**
     * The meta object literal for the '<em><b>Interfaceclass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__INTERFACECLASS = eINSTANCE.getClass_Interfaceclass();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__MEMBERS = eINSTANCE.getClass_Members();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.MemberImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.FieldImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Accessmodifer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__ACCESSMODIFER = eINSTANCE.getField_Accessmodifer();

    /**
     * The meta object literal for the '<em><b>Variablemodifer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__VARIABLEMODIFER = eINSTANCE.getField_Variablemodifer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Dim</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__DIM = eINSTANCE.getField_Dim();

    /**
     * The meta object literal for the '<em><b>Varini</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__VARINI = eINSTANCE.getField_Varini();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ConstructorMethodImpl <em>Constructor Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ConstructorMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConstructorMethod()
     * @generated
     */
    EClass CONSTRUCTOR_METHOD = eINSTANCE.getConstructorMethod();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_METHOD__PARAMS = eINSTANCE.getConstructorMethod_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_METHOD__BODY = eINSTANCE.getConstructorMethod_Body();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.MethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__TYPE = eINSTANCE.getMethod_Type();

    /**
     * The meta object literal for the '<em><b>Dim</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__DIM = eINSTANCE.getMethod_Dim();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__BODY = eINSTANCE.getMethod_Body();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbstractMethodImpl <em>Abstract Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbstractMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractMethod()
     * @generated
     */
    EClass ABSTRACT_METHOD = eINSTANCE.getAbstractMethod();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_METHOD__TYPE = eINSTANCE.getAbstractMethod_Type();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_METHOD__PARAMS = eINSTANCE.getAbstractMethod_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_METHOD__BODY = eINSTANCE.getAbstractMethod_Body();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.UseTypeImpl <em>Use Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.UseTypeImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getUseType()
     * @generated
     */
    EClass USE_TYPE = eINSTANCE.getUseType();

    /**
     * The meta object literal for the '<em><b>Reftype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_TYPE__REFTYPE = eINSTANCE.getUseType_Reftype();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USE_TYPE__TYPE = eINSTANCE.getUseType_Type();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ParameterImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Dim</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__DIM = eINSTANCE.getParameter_Dim();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.TypedElementImpl <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.TypedElementImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getTypedElement()
     * @generated
     */
    EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPED_ELEMENT__NAME = eINSTANCE.getTypedElement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.MethodBodyImpl <em>Method Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.MethodBodyImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMethodBody()
     * @generated
     */
    EClass METHOD_BODY = eINSTANCE.getMethodBody();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbstractMethodBodyImpl <em>Abstract Method Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbstractMethodBodyImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractMethodBody()
     * @generated
     */
    EClass ABSTRACT_METHOD_BODY = eINSTANCE.getAbstractMethodBody();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.VariableInitializerImpl <em>Variable Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.VariableInitializerImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getVariableInitializer()
     * @generated
     */
    EClass VARIABLE_INITIALIZER = eINSTANCE.getVariableInitializer();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ReturnStatementImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbstractInterfaceElementImpl <em>Abstract Interface Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbstractInterfaceElementImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractInterfaceElement()
     * @generated
     */
    EClass ABSTRACT_INTERFACE_ELEMENT = eINSTANCE.getAbstractInterfaceElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_INTERFACE_ELEMENT__NAME = eINSTANCE.getAbstractInterfaceElement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.RequiresImpl <em>Requires</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.RequiresImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRequires()
     * @generated
     */
    EClass REQUIRES = eINSTANCE.getRequires();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRES__TYPE = eINSTANCE.getRequires_Type();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl <em>Abstract Dynamic Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbstractDynamicSwitchImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractDynamicSwitch()
     * @generated
     */
    EClass ABSTRACT_DYNAMIC_SWITCH = eINSTANCE.getAbstractDynamicSwitch();

    /**
     * The meta object literal for the '<em><b>Sname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DYNAMIC_SWITCH__SNAME = eINSTANCE.getAbstractDynamicSwitch_Sname();

    /**
     * The meta object literal for the '<em><b>Type1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DYNAMIC_SWITCH__TYPE1 = eINSTANCE.getAbstractDynamicSwitch_Type1();

    /**
     * The meta object literal for the '<em><b>Type2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DYNAMIC_SWITCH__TYPE2 = eINSTANCE.getAbstractDynamicSwitch_Type2();

    /**
     * The meta object literal for the '<em><b>Aname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DYNAMIC_SWITCH__ANAME = eINSTANCE.getAbstractDynamicSwitch_Aname();

    /**
     * The meta object literal for the '<em><b>Type3</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DYNAMIC_SWITCH__TYPE3 = eINSTANCE.getAbstractDynamicSwitch_Type3();

    /**
     * The meta object literal for the '<em><b>Dname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DYNAMIC_SWITCH__DNAME = eINSTANCE.getAbstractDynamicSwitch_Dname();

    /**
     * The meta object literal for the '<em><b>Type4</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DYNAMIC_SWITCH__TYPE4 = eINSTANCE.getAbstractDynamicSwitch_Type4();

    /**
     * The meta object literal for the '<em><b>Type5</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DYNAMIC_SWITCH__TYPE5 = eINSTANCE.getAbstractDynamicSwitch_Type5();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbstractCompositionMethodImpl <em>Abstract Composition Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbstractCompositionMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractCompositionMethod()
     * @generated
     */
    EClass ABSTRACT_COMPOSITION_METHOD = eINSTANCE.getAbstractCompositionMethod();

    /**
     * The meta object literal for the '<em><b>Rac</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_COMPOSITION_METHOD__RAC = eINSTANCE.getAbstractCompositionMethod_Rac();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.NativeStartMethodImpl <em>Native Start Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.NativeStartMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNativeStartMethod()
     * @generated
     */
    EClass NATIVE_START_METHOD = eINSTANCE.getNativeStartMethod();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.RequiresAbstractCompositionImpl <em>Requires Abstract Composition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.RequiresAbstractCompositionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRequiresAbstractComposition()
     * @generated
     */
    EClass REQUIRES_ABSTRACT_COMPOSITION = eINSTANCE.getRequiresAbstractComposition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRES_ABSTRACT_COMPOSITION__NAME = eINSTANCE.getRequiresAbstractComposition_Name();

    /**
     * The meta object literal for the '<em><b>Abstract dynamic switch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRES_ABSTRACT_COMPOSITION__ABSTRACT_DYNAMIC_SWITCH = eINSTANCE.getRequiresAbstractComposition_Abstract_dynamic_switch();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ClockConstraintImpl <em>Clock Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ClockConstraintImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getClockConstraint()
     * @generated
     */
    EClass CLOCK_CONSTRAINT = eINSTANCE.getClockConstraint();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbstractInvariantImpl <em>Abstract Invariant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbstractInvariantImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractInvariant()
     * @generated
     */
    EClass ABSTRACT_INVARIANT = eINSTANCE.getAbstractInvariant();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ConditionalExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConditionalExpression()
     * @generated
     */
    EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

    /**
     * The meta object literal for the '<em><b>Assignmentoperator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_EXPRESSION__ASSIGNMENTOPERATOR = eINSTANCE.getConditionalExpression_Assignmentoperator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__EXPRESSION = eINSTANCE.getConditionalExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Conditionalorexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__CONDITIONALOREXPRESSION = eINSTANCE.getConditionalExpression_Conditionalorexpression();

    /**
     * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__EXPRESSION1 = eINSTANCE.getConditionalExpression_Expression1();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPRESSION__EXPRESSION2 = eINSTANCE.getConditionalExpression_Expression2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ConditionalOrExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConditionalOrExpression()
     * @generated
     */
    EClass CONDITIONAL_OR_EXPRESSION = eINSTANCE.getConditionalOrExpression();

    /**
     * The meta object literal for the '<em><b>Conditionalandexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_OR_EXPRESSION__CONDITIONALANDEXPRESSION = eINSTANCE.getConditionalOrExpression_Conditionalandexpression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ConditionalAndExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConditionalAndExpression()
     * @generated
     */
    EClass CONDITIONAL_AND_EXPRESSION = eINSTANCE.getConditionalAndExpression();

    /**
     * The meta object literal for the '<em><b>Exclusiveorexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_AND_EXPRESSION__EXCLUSIVEOREXPRESSION = eINSTANCE.getConditionalAndExpression_Exclusiveorexpression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ExclusiveOrExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getExclusiveOrExpression()
     * @generated
     */
    EClass EXCLUSIVE_OR_EXPRESSION = eINSTANCE.getExclusiveOrExpression();

    /**
     * The meta object literal for the '<em><b>Equalityexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSIVE_OR_EXPRESSION__EQUALITYEXPRESSION = eINSTANCE.getExclusiveOrExpression_Equalityexpression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.EqualityExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getEqualityExpression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

    /**
     * The meta object literal for the '<em><b>Instanceofexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__INSTANCEOFEXPRESSION = eINSTANCE.getEqualityExpression_Instanceofexpression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.InstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.InstanceOfExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInstanceOfExpression()
     * @generated
     */
    EClass INSTANCE_OF_EXPRESSION = eINSTANCE.getInstanceOfExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_OF_EXPRESSION__LEFT = eINSTANCE.getInstanceOfExpression_Left();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_OF_EXPRESSION__TYPE = eINSTANCE.getInstanceOfExpression_Type();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.RelationalExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRelationalExpression()
     * @generated
     */
    EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

    /**
     * The meta object literal for the '<em><b>Additiveexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXPRESSION__ADDITIVEEXPRESSION = eINSTANCE.getRelationalExpression_Additiveexpression();

    /**
     * The meta object literal for the '<em><b>Relationalop</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONAL_EXPRESSION__RELATIONALOP = eINSTANCE.getRelationalExpression_Relationalop();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AdditiveExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAdditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

    /**
     * The meta object literal for the '<em><b>Multiplicativeexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPRESSION__MULTIPLICATIVEEXPRESSION = eINSTANCE.getAdditiveExpression_Multiplicativeexpression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.MultiplicativeExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMultiplicativeExpression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

    /**
     * The meta object literal for the '<em><b>Unaryexpression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPRESSION__UNARYEXPRESSION = eINSTANCE.getMultiplicativeExpression_Unaryexpression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.UnaryExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__FROM = eINSTANCE.getUnaryExpression_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__TO = eINSTANCE.getUnaryExpression_To();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.UnaryExpressionNotPlusMinusImpl <em>Unary Expression Not Plus Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.UnaryExpressionNotPlusMinusImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getUnaryExpressionNotPlusMinus()
     * @generated
     */
    EClass UNARY_EXPRESSION_NOT_PLUS_MINUS = eINSTANCE.getUnaryExpressionNotPlusMinus();

    /**
     * The meta object literal for the '<em><b>Unaryexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION_NOT_PLUS_MINUS__UNARYEXPRESSION = eINSTANCE.getUnaryExpressionNotPlusMinus_Unaryexpression();

    /**
     * The meta object literal for the '<em><b>Castexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION_NOT_PLUS_MINUS__CASTEXPRESSION = eINSTANCE.getUnaryExpressionNotPlusMinus_Castexpression();

    /**
     * The meta object literal for the '<em><b>Primary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION_NOT_PLUS_MINUS__PRIMARY = eINSTANCE.getUnaryExpressionNotPlusMinus_Primary();

    /**
     * The meta object literal for the '<em><b>Builtin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION_NOT_PLUS_MINUS__BUILTIN = eINSTANCE.getUnaryExpressionNotPlusMinus_Builtin();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.PrimaryImpl <em>Primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.PrimaryImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getPrimary()
     * @generated
     */
    EClass PRIMARY = eINSTANCE.getPrimary();

    /**
     * The meta object literal for the '<em><b>Parexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY__PAREXPRESSION = eINSTANCE.getPrimary_Parexpression();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY__LITERAL = eINSTANCE.getPrimary_Literal();

    /**
     * The meta object literal for the '<em><b>Newobject</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY__NEWOBJECT = eINSTANCE.getPrimary_Newobject();

    /**
     * The meta object literal for the '<em><b>Newarray</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY__NEWARRAY = eINSTANCE.getPrimary_Newarray();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY__IDENTIFIER = eINSTANCE.getPrimary_Identifier();

    /**
     * The meta object literal for the '<em><b>Dimer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY__DIMER = eINSTANCE.getPrimary_Dimer();

    /**
     * The meta object literal for the '<em><b>Identifiersuffix</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY__IDENTIFIERSUFFIX = eINSTANCE.getPrimary_Identifiersuffix();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.IdentifierSuffixImpl <em>Identifier Suffix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.IdentifierSuffixImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getIdentifierSuffix()
     * @generated
     */
    EClass IDENTIFIER_SUFFIX = eINSTANCE.getIdentifierSuffix();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDENTIFIER_SUFFIX__ARGUMENTS = eINSTANCE.getIdentifierSuffix_Arguments();

    /**
     * The meta object literal for the '<em><b>Getvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER_SUFFIX__GETVALUE = eINSTANCE.getIdentifierSuffix_Getvalue();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ArgumentsImpl <em>Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ArgumentsImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getArguments()
     * @generated
     */
    EClass ARGUMENTS = eINSTANCE.getArguments();

    /**
     * The meta object literal for the '<em><b>Expressionlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENTS__EXPRESSIONLIST = eINSTANCE.getArguments_Expressionlist();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ExpressionListImpl <em>Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ExpressionListImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getExpressionList()
     * @generated
     */
    EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

    /**
     * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESSION1 = eINSTANCE.getExpressionList_Expression1();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_LIST__EXPRESSION2 = eINSTANCE.getExpressionList_Expression2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.CastExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCastExpression()
     * @generated
     */
    EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__TYPE = eINSTANCE.getCastExpression_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__EXPRESSION = eINSTANCE.getCastExpression_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ParExpressionImpl <em>Par Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ParExpressionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getParExpression()
     * @generated
     */
    EClass PAR_EXPRESSION = eINSTANCE.getParExpression();

    /**
     * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_EXPRESSION__EXPRESSION1 = eINSTANCE.getParExpression_Expression1();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_EXPRESSION__EXPRESSION2 = eINSTANCE.getParExpression_Expression2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.DE_LHSImpl <em>DE LHS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.DE_LHSImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDE_LHS()
     * @generated
     */
    EClass DE_LHS = eINSTANCE.getDE_LHS();

    /**
     * The meta object literal for the '<em><b>Var1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DE_LHS__VAR1 = eINSTANCE.getDE_LHS_Var1();

    /**
     * The meta object literal for the '<em><b>Var2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DE_LHS__VAR2 = eINSTANCE.getDE_LHS_Var2();

    /**
     * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DE_LHS__ORDER = eINSTANCE.getDE_LHS_Order();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.DifferentialEquationImpl <em>Differential Equation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.DifferentialEquationImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDifferentialEquation()
     * @generated
     */
    EClass DIFFERENTIAL_EQUATION = eINSTANCE.getDifferentialEquation();

    /**
     * The meta object literal for the '<em><b>LHS</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENTIAL_EQUATION__LHS = eINSTANCE.getDifferentialEquation_LHS();

    /**
     * The meta object literal for the '<em><b>RHS</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENTIAL_EQUATION__RHS = eINSTANCE.getDifferentialEquation_RHS();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ContinuousMethodImpl <em>Continuous Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ContinuousMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getContinuousMethod()
     * @generated
     */
    EClass CONTINUOUS_METHOD = eINSTANCE.getContinuousMethod();

    /**
     * The meta object literal for the '<em><b>DES</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTINUOUS_METHOD__DES = eINSTANCE.getContinuousMethod_DES();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbstractContinuousMethodImpl <em>Abstract Continuous Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbstractContinuousMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractContinuousMethod()
     * @generated
     */
    EClass ABSTRACT_CONTINUOUS_METHOD = eINSTANCE.getAbstractContinuousMethod();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.Built_In_MethodsImpl <em>Built In Methods</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.Built_In_MethodsImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBuilt_In_Methods()
     * @generated
     */
    EClass BUILT_IN_METHODS = eINSTANCE.getBuilt_In_Methods();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.SqrtImpl <em>Sqrt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.SqrtImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSqrt()
     * @generated
     */
    EClass SQRT = eINSTANCE.getSqrt();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SQRT__BUILT_IN_NAME = eINSTANCE.getSqrt_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SQRT__EX = eINSTANCE.getSqrt_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.SinImpl <em>Sin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.SinImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSin()
     * @generated
     */
    EClass SIN = eINSTANCE.getSin();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIN__BUILT_IN_NAME = eINSTANCE.getSin_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIN__EX = eINSTANCE.getSin_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.CosImpl <em>Cos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.CosImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCos()
     * @generated
     */
    EClass COS = eINSTANCE.getCos();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COS__BUILT_IN_NAME = eINSTANCE.getCos_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COS__EX = eINSTANCE.getCos_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.TanImpl <em>Tan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.TanImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getTan()
     * @generated
     */
    EClass TAN = eINSTANCE.getTan();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAN__BUILT_IN_NAME = eINSTANCE.getTan_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAN__EX = eINSTANCE.getTan_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.CotImpl <em>Cot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.CotImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCot()
     * @generated
     */
    EClass COT = eINSTANCE.getCot();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COT__BUILT_IN_NAME = eINSTANCE.getCot_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COT__EX = eINSTANCE.getCot_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.SecImpl <em>Sec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.SecImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSec()
     * @generated
     */
    EClass SEC = eINSTANCE.getSec();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC__BUILT_IN_NAME = eINSTANCE.getSec_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEC__EX = eINSTANCE.getSec_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.CscImpl <em>Csc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.CscImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCsc()
     * @generated
     */
    EClass CSC = eINSTANCE.getCsc();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSC__BUILT_IN_NAME = eINSTANCE.getCsc_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSC__EX = eINSTANCE.getCsc_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.RoundImpl <em>Round</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.RoundImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRound()
     * @generated
     */
    EClass ROUND = eINSTANCE.getRound();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROUND__BUILT_IN_NAME = eINSTANCE.getRound_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROUND__EX = eINSTANCE.getRound_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.FloorImpl <em>Floor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.FloorImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getFloor()
     * @generated
     */
    EClass FLOOR = eINSTANCE.getFloor();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOOR__BUILT_IN_NAME = eINSTANCE.getFloor_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOOR__EX = eINSTANCE.getFloor_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.CeilImpl <em>Ceil</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.CeilImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCeil()
     * @generated
     */
    EClass CEIL = eINSTANCE.getCeil();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CEIL__BUILT_IN_NAME = eINSTANCE.getCeil_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CEIL__EX = eINSTANCE.getCeil_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.DivImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIV__BUILT_IN_NAME = eINSTANCE.getDiv_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__E1 = eINSTANCE.getDiv_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__E2 = eINSTANCE.getDiv_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.FldImpl <em>Fld</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.FldImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getFld()
     * @generated
     */
    EClass FLD = eINSTANCE.getFld();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLD__BUILT_IN_NAME = eINSTANCE.getFld_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLD__E1 = eINSTANCE.getFld_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLD__E2 = eINSTANCE.getFld_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.RemImpl <em>Rem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.RemImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRem()
     * @generated
     */
    EClass REM = eINSTANCE.getRem();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REM__BUILT_IN_NAME = eINSTANCE.getRem_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REM__E1 = eINSTANCE.getRem_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REM__E2 = eINSTANCE.getRem_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ModImpl <em>Mod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ModImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMod()
     * @generated
     */
    EClass MOD = eINSTANCE.getMod();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOD__BUILT_IN_NAME = eINSTANCE.getMod_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD__E1 = eINSTANCE.getMod_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD__E2 = eINSTANCE.getMod_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.GcdImpl <em>Gcd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.GcdImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getGcd()
     * @generated
     */
    EClass GCD = eINSTANCE.getGcd();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GCD__BUILT_IN_NAME = eINSTANCE.getGcd_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GCD__E1 = eINSTANCE.getGcd_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GCD__E2 = eINSTANCE.getGcd_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.LcmImpl <em>Lcm</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.LcmImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getLcm()
     * @generated
     */
    EClass LCM = eINSTANCE.getLcm();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LCM__BUILT_IN_NAME = eINSTANCE.getLcm_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCM__E1 = eINSTANCE.getLcm_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LCM__E2 = eINSTANCE.getLcm_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbsImpl <em>Abs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbsImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbs()
     * @generated
     */
    EClass ABS = eINSTANCE.getAbs();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABS__BUILT_IN_NAME = eINSTANCE.getAbs_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABS__EX = eINSTANCE.getAbs_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.SignImpl <em>Sign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.SignImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSign()
     * @generated
     */
    EClass SIGN = eINSTANCE.getSign();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGN__BUILT_IN_NAME = eINSTANCE.getSign_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGN__EX = eINSTANCE.getSign_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.RootImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROOT__BUILT_IN_NAME = eINSTANCE.getRoot_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__E1 = eINSTANCE.getRoot_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__E2 = eINSTANCE.getRoot_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.HypotImpl <em>Hypot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.HypotImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getHypot()
     * @generated
     */
    EClass HYPOT = eINSTANCE.getHypot();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HYPOT__BUILT_IN_NAME = eINSTANCE.getHypot_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPOT__E1 = eINSTANCE.getHypot_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPOT__E2 = eINSTANCE.getHypot_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.PowImpl <em>Pow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.PowImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getPow()
     * @generated
     */
    EClass POW = eINSTANCE.getPow();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POW__BUILT_IN_NAME = eINSTANCE.getPow_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW__E1 = eINSTANCE.getPow_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW__E2 = eINSTANCE.getPow_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ExpImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP__BUILT_IN_NAME = eINSTANCE.getExp_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP__EX = eINSTANCE.getExp_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.LogImpl <em>Log</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.LogImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getLog()
     * @generated
     */
    EClass LOG = eINSTANCE.getLog();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__BUILT_IN_NAME = eINSTANCE.getLog_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOG__E1 = eINSTANCE.getLog_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOG__E2 = eINSTANCE.getLog_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ErfImpl <em>Erf</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ErfImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getErf()
     * @generated
     */
    EClass ERF = eINSTANCE.getErf();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERF__BUILT_IN_NAME = eINSTANCE.getErf_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERF__EX = eINSTANCE.getErf_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.GammaImpl <em>Gamma</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.GammaImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getGamma()
     * @generated
     */
    EClass GAMMA = eINSTANCE.getGamma();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAMMA__BUILT_IN_NAME = eINSTANCE.getGamma_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GAMMA__EX = eINSTANCE.getGamma_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.MaxImpl <em>Max</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.MaxImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMax()
     * @generated
     */
    EClass MAX = eINSTANCE.getMax();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAX__BUILT_IN_NAME = eINSTANCE.getMax_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAX__E1 = eINSTANCE.getMax_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAX__E2 = eINSTANCE.getMax_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.MinImpl <em>Min</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.MinImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getMin()
     * @generated
     */
    EClass MIN = eINSTANCE.getMin();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIN__BUILT_IN_NAME = eINSTANCE.getMin_BuiltInName();

    /**
     * The meta object literal for the '<em><b>E1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIN__E1 = eINSTANCE.getMin_E1();

    /**
     * The meta object literal for the '<em><b>E2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIN__E2 = eINSTANCE.getMin_E2();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.PauseImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getPause()
     * @generated
     */
    EClass PAUSE = eINSTANCE.getPause();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAUSE__BUILT_IN_NAME = eINSTANCE.getPause_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAUSE__EX = eINSTANCE.getPause_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.SizeImpl <em>Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.SizeImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getSize()
     * @generated
     */
    EClass SIZE = eINSTANCE.getSize();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE__BUILT_IN_NAME = eINSTANCE.getSize_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIZE__EX = eINSTANCE.getSize_Ex();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.InvariantBlockImpl <em>Invariant Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.InvariantBlockImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInvariantBlock()
     * @generated
     */
    EClass INVARIANT_BLOCK = eINSTANCE.getInvariantBlock();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVARIANT_BLOCK__CONDITIONS = eINSTANCE.getInvariantBlock_Conditions();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.BlockImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Blockstatement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__BLOCKSTATEMENT = eINSTANCE.getBlock_Blockstatement();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.BlockStatementImpl <em>Block Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.BlockStatementImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBlockStatement()
     * @generated
     */
    EClass BLOCK_STATEMENT = eINSTANCE.getBlockStatement();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.LocalVarDecStatementImpl <em>Local Var Dec Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.LocalVarDecStatementImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getLocalVarDecStatement()
     * @generated
     */
    EClass LOCAL_VAR_DEC_STATEMENT = eINSTANCE.getLocalVarDecStatement();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.LocalVarDecImpl <em>Local Var Dec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.LocalVarDecImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getLocalVarDec()
     * @generated
     */
    EClass LOCAL_VAR_DEC = eINSTANCE.getLocalVarDec();

    /**
     * The meta object literal for the '<em><b>Variablemodifer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VAR_DEC__VARIABLEMODIFER = eINSTANCE.getLocalVarDec_Variablemodifer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VAR_DEC__TYPE = eINSTANCE.getLocalVarDec_Type();

    /**
     * The meta object literal for the '<em><b>Dim</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VAR_DEC__DIM = eINSTANCE.getLocalVarDec_Dim();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VAR_DEC__NAME = eINSTANCE.getLocalVarDec_Name();

    /**
     * The meta object literal for the '<em><b>Varini</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VAR_DEC__VARINI = eINSTANCE.getLocalVarDec_Varini();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.StatementImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__BLOCK = eINSTANCE.getStatement_Block();

    /**
     * The meta object literal for the '<em><b>Parexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__PAREXPRESSION = eINSTANCE.getStatement_Parexpression();

    /**
     * The meta object literal for the '<em><b>Ifstatement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__IFSTATEMENT = eINSTANCE.getStatement_Ifstatement();

    /**
     * The meta object literal for the '<em><b>Elsestatement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ELSESTATEMENT = eINSTANCE.getStatement_Elsestatement();

    /**
     * The meta object literal for the '<em><b>Forcontrol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__FORCONTROL = eINSTANCE.getStatement_Forcontrol();

    /**
     * The meta object literal for the '<em><b>Forstatement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__FORSTATEMENT = eINSTANCE.getStatement_Forstatement();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__IDENTIFIER = eINSTANCE.getStatement_Identifier();

    /**
     * The meta object literal for the '<em><b>Whilestatement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__WHILESTATEMENT = eINSTANCE.getStatement_Whilestatement();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__RETURN = eINSTANCE.getStatement_Return();

    /**
     * The meta object literal for the '<em><b>Statementexpression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__STATEMENTEXPRESSION = eINSTANCE.getStatement_Statementexpression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ForControlImpl <em>For Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ForControlImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getForControl()
     * @generated
     */
    EClass FOR_CONTROL = eINSTANCE.getForControl();

    /**
     * The meta object literal for the '<em><b>Enhancedforcontrol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_CONTROL__ENHANCEDFORCONTROL = eINSTANCE.getForControl_Enhancedforcontrol();

    /**
     * The meta object literal for the '<em><b>Forinit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_CONTROL__FORINIT = eINSTANCE.getForControl_Forinit();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_CONTROL__EXPRESSION = eINSTANCE.getForControl_Expression();

    /**
     * The meta object literal for the '<em><b>Forupdate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_CONTROL__FORUPDATE = eINSTANCE.getForControl_Forupdate();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.EnhancedForControlImpl <em>Enhanced For Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.EnhancedForControlImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getEnhancedForControl()
     * @generated
     */
    EClass ENHANCED_FOR_CONTROL = eINSTANCE.getEnhancedForControl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENHANCED_FOR_CONTROL__TYPE = eINSTANCE.getEnhancedForControl_Type();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENHANCED_FOR_CONTROL__ID = eINSTANCE.getEnhancedForControl_Id();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENHANCED_FOR_CONTROL__EXPRESSION = eINSTANCE.getEnhancedForControl_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ForInitImpl <em>For Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ForInitImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getForInit()
     * @generated
     */
    EClass FOR_INIT = eINSTANCE.getForInit();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ForUpdateImpl <em>For Update</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ForUpdateImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getForUpdate()
     * @generated
     */
    EClass FOR_UPDATE = eINSTANCE.getForUpdate();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.CompositionMethodImpl <em>Composition Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.CompositionMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCompositionMethod()
     * @generated
     */
    EClass COMPOSITION_METHOD = eINSTANCE.getCompositionMethod();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITION_METHOD__MEMBERS = eINSTANCE.getCompositionMethod_Members();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl <em>Control Switch Composition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ControlSwitchCompositionImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getControlSwitchComposition()
     * @generated
     */
    EClass CONTROL_SWITCH_COMPOSITION = eINSTANCE.getControlSwitchComposition();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_SWITCH_COMPOSITION__ID = eINSTANCE.getControlSwitchComposition_Id();

    /**
     * The meta object literal for the '<em><b>Sync</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_SWITCH_COMPOSITION__SYNC = eINSTANCE.getControlSwitchComposition_Sync();

    /**
     * The meta object literal for the '<em><b>Recev</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_SWITCH_COMPOSITION__RECEV = eINSTANCE.getControlSwitchComposition_Recev();

    /**
     * The meta object literal for the '<em><b>Send</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_SWITCH_COMPOSITION__SEND = eINSTANCE.getControlSwitchComposition_Send();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_SWITCH_COMPOSITION__SOURCE = eINSTANCE.getControlSwitchComposition_Source();

    /**
     * The meta object literal for the '<em><b>Sourcelist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_SWITCH_COMPOSITION__SOURCELIST = eINSTANCE.getControlSwitchComposition_Sourcelist();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_SWITCH_COMPOSITION__ACTION = eINSTANCE.getControlSwitchComposition_Action();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_SWITCH_COMPOSITION__DESTINATION = eINSTANCE.getControlSwitchComposition_Destination();

    /**
     * The meta object literal for the '<em><b>Destinationlist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_SWITCH_COMPOSITION__DESTINATIONLIST = eINSTANCE.getControlSwitchComposition_Destinationlist();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_SWITCH_COMPOSITION__CONDITION = eINSTANCE.getControlSwitchComposition_Condition();

    /**
     * The meta object literal for the '<em><b>Discrete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_SWITCH_COMPOSITION__DISCRETE = eINSTANCE.getControlSwitchComposition_Discrete();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.DiscreteBlockImpl <em>Discrete Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.DiscreteBlockImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDiscreteBlock()
     * @generated
     */
    EClass DISCRETE_BLOCK = eINSTANCE.getDiscreteBlock();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISCRETE_BLOCK__BUILT_IN_NAME = eINSTANCE.getDiscreteBlock_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCRETE_BLOCK__STATEMENTS = eINSTANCE.getDiscreteBlock_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.ConditionBlockImpl <em>Condition Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.ConditionBlockImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getConditionBlock()
     * @generated
     */
    EClass CONDITION_BLOCK = eINSTANCE.getConditionBlock();

    /**
     * The meta object literal for the '<em><b>Built In Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION_BLOCK__BUILT_IN_NAME = eINSTANCE.getConditionBlock_BuiltInName();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_BLOCK__CONDITIONS = eINSTANCE.getConditionBlock_Conditions();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.DiscreteMethodImpl <em>Discrete Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.DiscreteMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDiscreteMethod()
     * @generated
     */
    EClass DISCRETE_METHOD = eINSTANCE.getDiscreteMethod();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCRETE_METHOD__PARAMS = eINSTANCE.getDiscreteMethod_Params();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISCRETE_METHOD__STATEMENTS = eINSTANCE.getDiscreteMethod_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbstractDiscreteMethodImpl <em>Abstract Discrete Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbstractDiscreteMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractDiscreteMethod()
     * @generated
     */
    EClass ABSTRACT_DISCRETE_METHOD = eINSTANCE.getAbstractDiscreteMethod();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.InitMethodImpl <em>Init Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.InitMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInitMethod()
     * @generated
     */
    EClass INIT_METHOD = eINSTANCE.getInitMethod();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_METHOD__STATEMENTS = eINSTANCE.getInitMethod_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.AbstractInitMethodImpl <em>Abstract Init Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.AbstractInitMethodImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getAbstractInitMethod()
     * @generated
     */
    EClass ABSTRACT_INIT_METHOD = eINSTANCE.getAbstractInitMethod();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.NewByClassImpl <em>New By Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.NewByClassImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNewByClass()
     * @generated
     */
    EClass NEW_BY_CLASS = eINSTANCE.getNewByClass();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_BY_CLASS__TYPE = eINSTANCE.getNewByClass_Type();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_BY_CLASS__ARGS = eINSTANCE.getNewByClass_Args();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.NewArrayImpl <em>New Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.NewArrayImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNewArray()
     * @generated
     */
    EClass NEW_ARRAY = eINSTANCE.getNewArray();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_ARRAY__TYPE = eINSTANCE.getNewArray_Type();

    /**
     * The meta object literal for the '<em><b>Dime</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_ARRAY__DIME = eINSTANCE.getNewArray_Dime();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.DimExprImpl <em>Dim Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.DimExprImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getDimExpr()
     * @generated
     */
    EClass DIM_EXPR = eINSTANCE.getDimExpr();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.bodyImpl <em>body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.bodyImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getbody()
     * @generated
     */
    EClass BODY = eINSTANCE.getbody();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__STATEMENTS = eINSTANCE.getbody_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.InfiniteLiteralImpl <em>Infinite Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.InfiniteLiteralImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getInfiniteLiteral()
     * @generated
     */
    EClass INFINITE_LITERAL = eINSTANCE.getInfiniteLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFINITE_LITERAL__VALUE = eINSTANCE.getInfiniteLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.IntegerLiteralImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.FloatingPointLiteralImpl <em>Floating Point Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.FloatingPointLiteralImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getFloatingPointLiteral()
     * @generated
     */
    EClass FLOATING_POINT_LITERAL = eINSTANCE.getFloatingPointLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOATING_POINT_LITERAL__VALUE = eINSTANCE.getFloatingPointLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.CharacterLiteralImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getCharacterLiteral()
     * @generated
     */
    EClass CHARACTER_LITERAL = eINSTANCE.getCharacterLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHARACTER_LITERAL__VALUE = eINSTANCE.getCharacterLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.StringLiteralImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.BooleanLiteralImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.NullLiteralImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL_LITERAL__VALUE = eINSTANCE.getNullLiteral_Value();

    /**
     * The meta object literal for the '{@link org.xtext.fofo.apricot.impl.dimexImpl <em>dimex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.fofo.apricot.impl.dimexImpl
     * @see org.xtext.fofo.apricot.impl.ApricotPackageImpl#getdimex()
     * @generated
     */
    EClass DIMEX = eINSTANCE.getdimex();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIMEX__INDEX = eINSTANCE.getdimex_Index();

  }

} //ApricotPackage
