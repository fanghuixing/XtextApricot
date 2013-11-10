package org.xtext.fofo.ui.wizard;

import java.io.IOException;
import java.io.InputStream;




import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.xtext.fofo.ui.internal.ApricotActivator;



public class WizardApricotNewFileCreationPage extends WizardNewFileCreationPage {

	public WizardApricotNewFileCreationPage(IStructuredSelection selection) {
		super("XtextApricot File Wizard",selection);
		setTitle("Apricot File Wizard");
        setDescription("Create a Apricot File");
        setFileExtension("apr");
	}
	
	@Override
	protected InputStream getInitialContents() {
		String templateFilePath = "/templates/apricot-template.apr";
		InputStream inputStream = null;
        try {
            inputStream = ApricotActivator.getInstance().getBundle().getEntry(templateFilePath).openStream();
        } catch (IOException e) {
            // send back null
        }
		return inputStream;
	}
	
	
}
