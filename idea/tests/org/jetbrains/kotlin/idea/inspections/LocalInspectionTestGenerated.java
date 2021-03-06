/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.inspections;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/inspectionsLocal")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class LocalInspectionTestGenerated extends AbstractLocalInspectionTest {
    public void testAllFilesPresentInInspectionsLocal() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/inspectionsLocal"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("idea/testData/inspectionsLocal/copyWithoutNamedArguments")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CopyWithoutNamedArguments extends AbstractLocalInspectionTest {
        public void testAllFilesPresentInCopyWithoutNamedArguments() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/inspectionsLocal/copyWithoutNamedArguments"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("base.kt")
        public void testBase() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/copyWithoutNamedArguments/base.kt");
            doTest(fileName);
        }

        @TestMetadata("notAllNamed.kt")
        public void testNotAllNamed() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/copyWithoutNamedArguments/notAllNamed.kt");
            doTest(fileName);
        }

        @TestMetadata("this.kt")
        public void testThis() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/copyWithoutNamedArguments/this.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/inspectionsLocal/leakingThis")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class LeakingThis extends AbstractLocalInspectionTest {
        public void testAllFilesPresentInLeakingThis() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/inspectionsLocal/leakingThis"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("noOpenForInterface.kt")
        public void testNoOpenForInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/leakingThis/noOpenForInterface.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MoveSuspiciousCallableReferenceIntoParentheses extends AbstractLocalInspectionTest {
        public void testAllFilesPresentInMoveSuspiciousCallableReferenceIntoParentheses() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("defaultParameter.kt")
        public void testDefaultParameter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/defaultParameter.kt");
            doTest(fileName);
        }

        @TestMetadata("expectedFunction.kt")
        public void testExpectedFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/expectedFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("it.kt")
        public void testIt() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/it.kt");
            doTest(fileName);
        }

        @TestMetadata("lambdaWithArg.kt")
        public void testLambdaWithArg() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/lambdaWithArg.kt");
            doTest(fileName);
        }

        @TestMetadata("multipleLines.kt")
        public void testMultipleLines() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/multipleLines.kt");
            doTest(fileName);
        }

        @TestMetadata("noBody.kt")
        public void testNoBody() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/noBody.kt");
            doTest(fileName);
        }

        @TestMetadata("noneCallableRef.kt")
        public void testNoneCallableRef() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/noneCallableRef.kt");
            doTest(fileName);
        }

        @TestMetadata("normal.kt")
        public void testNormal() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/normal.kt");
            doTest(fileName);
        }

        @TestMetadata("parameter.kt")
        public void testParameter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/parameter.kt");
            doTest(fileName);
        }

        @TestMetadata("parameter2.kt")
        public void testParameter2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/moveSuspiciousCallableReferenceIntoParentheses/parameter2.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ReplaceArrayOfWithLiteral extends AbstractLocalInspectionTest {
        public void testAllFilesPresentInReplaceArrayOfWithLiteral() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("base.kt")
        public void testBase() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral/base.kt");
            doTest(fileName);
        }

        @TestMetadata("default.kt")
        public void testDefault() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral/default.kt");
            doTest(fileName);
        }

        @TestMetadata("defaultNotAnnotation.kt")
        public void testDefaultNotAnnotation() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral/defaultNotAnnotation.kt");
            doTest(fileName);
        }

        @TestMetadata("empty.kt")
        public void testEmpty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral/empty.kt");
            doTest(fileName);
        }

        @TestMetadata("intArray.kt")
        public void testIntArray() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral/intArray.kt");
            doTest(fileName);
        }

        @TestMetadata("noAnnotation.kt")
        public void testNoAnnotation() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral/noAnnotation.kt");
            doTest(fileName);
        }

        @TestMetadata("noArray.kt")
        public void testNoArray() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral/noArray.kt");
            doTest(fileName);
        }

        @TestMetadata("unnamed.kt")
        public void testUnnamed() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral/unnamed.kt");
            doTest(fileName);
        }

        @TestMetadata("vararg.kt")
        public void testVararg() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceArrayOfWithLiteral/vararg.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/inspectionsLocal/replaceRangeToWithUntil")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ReplaceRangeToWithUntil extends AbstractLocalInspectionTest {
        public void testAllFilesPresentInReplaceRangeToWithUntil() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/inspectionsLocal/replaceRangeToWithUntil"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("closedRange.kt")
        public void testClosedRange() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceRangeToWithUntil/closedRange.kt");
            doTest(fileName);
        }

        @TestMetadata("minusTwo.kt")
        public void testMinusTwo() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceRangeToWithUntil/minusTwo.kt");
            doTest(fileName);
        }

        @TestMetadata("notMinusOne.kt")
        public void testNotMinusOne() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceRangeToWithUntil/notMinusOne.kt");
            doTest(fileName);
        }

        @TestMetadata("operator.kt")
        public void testOperator() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceRangeToWithUntil/operator.kt");
            doTest(fileName);
        }

        @TestMetadata("operatorLong.kt")
        public void testOperatorLong() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceRangeToWithUntil/operatorLong.kt");
            doTest(fileName);
        }

        @TestMetadata("plusOne.kt")
        public void testPlusOne() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceRangeToWithUntil/plusOne.kt");
            doTest(fileName);
        }

        @TestMetadata("rangeTo.kt")
        public void testRangeTo() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/inspectionsLocal/replaceRangeToWithUntil/rangeTo.kt");
            doTest(fileName);
        }
    }
}
