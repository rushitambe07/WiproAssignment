package com.wipro.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.wipro.test")
// @SelectClasses({ NullUpperCaseTest.class, StringLowerCaseTest.class, StringUtilsTest.class })
public class AllTests {

}
