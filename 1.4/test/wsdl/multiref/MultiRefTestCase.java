/*
 * Copyright 2001-2004 The Apache Software Foundation.
 * 
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
 */

package test.wsdl.multiref;

import junit.framework.TestCase;


/** Test the multiref sample code.
 */
public class MultiRefTestCase extends TestCase {

    public MultiRefTestCase(String name) {
        super(name);
    }

    public void doTest () throws Exception {
        String[] args = {};
        test.wsdl.multiref.Main.main(args);
    }

    public void testMultiRefService () throws Exception {
        try {
            doTest();
        }
        catch( Exception e ) {
            e.printStackTrace();
            throw new Exception("Fault returned from test: "+e);
        }
    }
}


