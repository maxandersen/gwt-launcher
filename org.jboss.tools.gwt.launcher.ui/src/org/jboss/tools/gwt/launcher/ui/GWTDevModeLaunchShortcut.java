package org.jboss.tools.gwt.launcher.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

public class GWTDevModeLaunchShortcut implements ILaunchShortcut2 {

	public void launch(ISelection arg0, String arg1) {
	
		
	}

	public void launch(IEditorPart arg0, String arg1) {
		
	}

	public ILaunchConfiguration[] getLaunchConfigurations(ISelection arg0) {
		return null;
	}

	public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart arg0) {
		return null;
	}

	public IResource getLaunchableResource(ISelection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public IResource getLaunchableResource(IEditorPart arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}

