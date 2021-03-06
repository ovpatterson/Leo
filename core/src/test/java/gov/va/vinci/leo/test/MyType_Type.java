
/* First created by JCasGen Fri Sep 27 09:07:07 MDT 2013 */
package gov.va.vinci.leo.test;

/*
 * #%L
 * Leo Core
 * %%
 * Copyright (C) 2010 - 2014 Department of Veterans Affairs
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** My Test Type
 * Updated by JCasGen Fri Sep 27 09:07:07 MDT 2013
 * @generated */
public class MyType_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MyType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MyType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MyType(addr, MyType_Type.this);
  			   MyType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MyType(addr, MyType_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MyType.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("gov.va.vinci.leo.test.MyType");
 
  /** @generated */
  final Feature casFeat_Pattern;
  /** @generated */
  final int     casFeatCode_Pattern;
  /** @generated */ 
  public String getPattern(int addr) {
        if (featOkTst && casFeat_Pattern == null)
      jcas.throwFeatMissing("Pattern", "gov.va.vinci.leo.test.MyType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Pattern);
  }
  /** @generated */    
  public void setPattern(int addr, String v) {
        if (featOkTst && casFeat_Pattern == null)
      jcas.throwFeatMissing("Pattern", "gov.va.vinci.leo.test.MyType");
    ll_cas.ll_setStringValue(addr, casFeatCode_Pattern, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public MyType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Pattern = jcas.getRequiredFeatureDE(casType, "Pattern", "uima.cas.String", featOkTst);
    casFeatCode_Pattern  = (null == casFeat_Pattern) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Pattern).getCode();

  }
}



    