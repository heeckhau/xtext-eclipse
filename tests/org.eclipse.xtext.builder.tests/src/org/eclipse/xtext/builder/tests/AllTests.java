package org.eclipse.xtext.builder.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/*
 * automatically generated by org.eclipse.emf.mwe.releng.GenerateTestSuite 
 * 
 * @generated 
 */
public class AllTests {
   public static Test suite() {
      TestSuite suite = new TestSuite("Tests for org.eclipse.xtext.builder.tests");
// BinaryResourceBasedPersisterTest fails for unknown reasons ... need to investigate
//      suite.addTestSuite(org.eclipse.xtext.builder.builderState.BinaryResourceBasedPersisterTest.class);
      suite.addTestSuite(org.eclipse.xtext.builder.builderState.PersistableResourceDescriptionsTest.class);
      suite.addTestSuite(org.eclipse.xtext.builder.builderState.XMIBasedPersisterTest.class);
      suite.addTestSuite(org.eclipse.xtext.builder.impl.IntegrationTest.class);
      return suite;
   }
}
