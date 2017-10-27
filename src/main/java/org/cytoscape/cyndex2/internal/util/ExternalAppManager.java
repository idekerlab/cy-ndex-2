package org.cytoscape.cyndex2.internal.util;

import java.awt.Dialog.ModalityType;

import javax.swing.JDialog;
import javax.swing.JFrame;

import org.cytoscape.cyndex2.internal.task.OpenBrowseTaskFactory;

public class ExternalAppManager {

	public static final String APP_NAME_SAVE_NETWORK = "save network";
	public static final String APP_NAME_SAVE_COLLECTION = "save collection";
	public static final String APP_NAME_LOAD = "choose";

	private String port;
	private String query;
	private String appName;
	private JDialog dialog;
	public static boolean loadFailed = false;
	
	public JDialog getDialog(JFrame parent){
		if (dialog == null){
			dialog = new JDialog(parent, "CyNDEx2 Browser", ModalityType.APPLICATION_MODAL);
			// ensure modality type
			dialog.getModalityType();
		}
		return dialog;
	}
	
	public static void setLoadFailed(String reason){
		OpenBrowseTaskFactory.getEntry().setDisabled();
		loadFailed = true;
		
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getQuery() {
		return query;
	}
	public void setPort(String port) {
		this.port = port;
	}

	public String getPort() {
		return port;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
