package apricot.xemantics.validation;

import apricot.xemantics.ApricotSystem;
import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

@SuppressWarnings("all")
public class ApricotSystemValidator extends AbstractDeclarativeValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected ApricotSystem xsemanticsSystem;
  
  protected ApricotSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
