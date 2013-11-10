package apricot.xemantics.validation;

import apricot.xemantics.ApricotSystem;
import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import org.xtext.fofo.validation.AbstractApricotJavaValidator;

@SuppressWarnings("all")
public class ApricotSystemValidator extends AbstractApricotJavaValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected ApricotSystem xsemanticsSystem;
  
  protected ApricotSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
