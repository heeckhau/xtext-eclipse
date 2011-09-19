/*
 * generated by Xtext
 */
package org.eclipse.xtext.builder.tests.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.builder.tests.DelegatingBuilderParticipant;
import org.eclipse.xtext.resource.IContainer;

/**
 * Use this class to register components to be used within the IDE.
 */
public class BuilderTestLanguageUiModule extends org.eclipse.xtext.builder.tests.ui.AbstractBuilderTestLanguageUiModule {
	public BuilderTestLanguageUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends IContainer.Manager> bindIContainer$Manager() {
		return org.eclipse.xtext.resource.containers.StateBasedContainerManager.class;
	}
	
	public Class<? extends IXtextBuilderParticipant> bindBuilderParticipant() {
		return DelegatingBuilderParticipant.class;
	}

	public void configureBuilderPreferenceStoreInitializer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer.class).to(org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess.Initializer.class);
	}
}
