<?xml version="1.0"?>
<!--
 The contents of this file are subject to the terms
 of the Common Development and Distribution License
 (the License).  You may not use this file except in
 compliance with the License.
 
 You can obtain a copy of the license at
 https://woodstock.dev.java.net/public/CDDLv1.0.html.
 See the License for the specific language governing
 permissions and limitations under the License.
 
 When distributing Covered Code, include this CDDL
 Header Notice in each file and include the License file
 at https://woodstock.dev.java.net/public/CDDLv1.0.html.
 If applicable, add the following below the CDDL Header,
 with the fields enclosed by brackets [] replaced by
 you own identifying information:
 "Portions Copyrighted [year] [name of copyright owner]"
 
 Copyright 2007 Sun Microsystems, Inc. All rights reserved.
-->
<!DOCTYPE module PUBLIC
    "-//Puppy Crawl//DTD Check Configuration 1.2//EN"
    "http://www.puppycrawl.com/dtds/configuration_1_2.dtd">

<!--

  Checkstyle configuration that checks the sun coding conventions from:

    - the Java Language Specification at
      http://java.sun.com/docs/books/jls/second_edition/html/index.html

    - the Sun Code Conventions at http://java.sun.com/docs/codeconv/

    - the Javadoc guidelines at
      http://java.sun.com/j2se/javadoc/writingdoccomments/index.html

    - the JDK Api documentation http://java.sun.com/j2se/docs/api/index.html

    - some best practices

  Checkstyle is very configurable. Be sure to read the documentation at
  http://checkstyle.sf.net (or in your downloaded distribution).

  Most Checks are configurable, be sure to consult the documentation.

  To completely disable a check, just comment it out or delete it from the file.

  Finally, it is worth reading the documentation.

-->

<module name="Checker">

    <!-- Checks that a package.html file exists for each package.     -->
    <!-- See http://checkstyle.sf.net/config_javadoc.html#PackageHtml -->
    <module name="PackageHtml"/>

    <!-- Checks whether files end with a new line.                        -->
    <!-- See http://checkstyle.sf.net/config_misc.html#NewlineAtEndOfFile -->
    <module name="NewlineAtEndOfFile"/>

    <!-- Checks that property files contain the same keys.         -->
    <!-- See http://checkstyle.sf.net/config_misc.html#Translation -->
    <module name="Translation"/>


    <module name="TreeWalker">

        <!-- Checks for Javadoc comments.                     -->
        <!-- See http://checkstyle.sf.net/config_javadoc.html -->
        <module name="JavadocMethod">
            <property name="scope" value="protected" />
	</module>
        <module name="JavadocType">
            <property name="scope" value="protected" />
	</module>
        <module name="JavadocVariable">
            <property name="scope" value="protected" />
	</module>
        <module name="JavadocStyle">
            <property name="scope" value="protected" />
	</module>


        <!-- Checks for Naming Conventions.                  -->
        <!-- See http://checkstyle.sf.net/config_naming.html -->
        <module name="ConstantName"/>
        <module name="LocalFinalVariableName"/>
        <module name="LocalVariableName"/>
        <module name="MemberName"/>
        <module name="MethodName"/>
        <module name="PackageName"/>
        <module name="ParameterName"/>
        <module name="StaticVariableName"/>
        <module name="TypeName"/>


        <!-- Checks for Headers                                -->
        <!-- See http://checkstyle.sf.net/config_header.html   -->
        <!-- <module name="Header">                            -->
            <!-- The follow property value demonstrates the ability     -->
            <!-- to have access to ANT properties. In this case it uses -->
            <!-- the ${basedir} property to allow Checkstyle to be run  -->
            <!-- from any directory within a project. See property      -->
            <!-- expansion,                                             -->
            <!-- http://checkstyle.sf.net/config.html#properties        -->
            <!-- <property                                              -->
            <!--     name="headerFile"                                  -->
            <!--     value="${basedir}/java.header"/>                   -->
        <!-- </module> -->

        <!-- Following interprets the header file as regular expressions. -->
        <!-- <module name="RegexpHeader"/>                                -->


        <!-- Checks for imports                              -->
        <!-- See http://checkstyle.sf.net/config_import.html -->
        <module name="AvoidStarImport"/>
        <module name="IllegalImport"/> <!-- defaults to sun.* packages -->
        <module name="RedundantImport"/>
        <module name="UnusedImports"/>


        <!-- Checks for Size Violations.                    -->
        <!-- See http://checkstyle.sf.net/config_sizes.html -->
        <module name="FileLength"/>
        <!-- <module name="LineLength"/> -->
        <module name="MethodLength"/>
        <module name="ParameterNumber"/>


        <!-- Checks for whitespace                               -->
        <!-- See http://checkstyle.sf.net/config_whitespace.html -->
        <module name="EmptyForIteratorPad">
	    <property name="option" value="space" />
	</module>
        <module name="MethodParamPad"/>
        <module name="NoWhitespaceAfter"/>
        <module name="NoWhitespaceBefore"/>
        <module name="OperatorWrap"/>
        <module name="ParenPad"/>
        <module name="TypecastParenPad"/>
<!--        <module name="TabCharacter"/> -->
        <module name="WhitespaceAfter" />
        <module name="WhitespaceAround"/>


        <!-- Modifier Checks                                    -->
        <!-- See http://checkstyle.sf.net/config_modifiers.html -->
        <module name="ModifierOrder"/>
        <module name="RedundantModifier"/>


        <!-- Checks for blocks. You know, those {}'s         -->
        <!-- See http://checkstyle.sf.net/config_blocks.html -->
        <module name="AvoidNestedBlocks"/>
        <module name="EmptyBlock"/>
        <module name="LeftCurly"/>
        <module name="NeedBraces"/>
        <module name="RightCurly"/>


        <!-- Checks for common coding problems               -->
        <!-- See http://checkstyle.sf.net/config_coding.html -->
<!--        <module name="AvoidInlineConditionals"/> -->
        <module name="DoubleCheckedLocking"/>    <!-- MY FAVOURITE -->
        <module name="EmptyStatement"/>
        <module name="EqualsHashCode"/>
        <module name="HiddenField"/>
        <module name="IllegalInstantiation"/>
        <module name="InnerAssignment"/>
        <module name="MagicNumber"/>
        <module name="MissingSwitchDefault"/>
        <module name="RedundantThrows"/>
        <module name="SimplifyBooleanExpression"/>
        <module name="SimplifyBooleanReturn"/>

        <!-- Checks for class design                         -->
        <!-- See http://checkstyle.sf.net/config_design.html -->
<!--        <module name="DesignForExtension"/> -->
        <module name="FinalClass"/>
<!--        <module name="HideUtilityClassConstructor"/> -->
        <module name="InterfaceIsType"/>
        <module name="VisibilityModifier"/>


        <!-- Miscellaneous other checks.                   -->
        <!-- See http://checkstyle.sf.net/config_misc.html -->
<!--        <module name="ArrayTypeStyle"/> -->
<!--        <module name="FinalParameters"/> -->
        <module name="GenericIllegalRegexp">
            <property name="format" value="\s+$"/>
            <property name="message" value="Line has trailing spaces."/>
        </module>
        <module name="TodoComment"/>
        <module name="UpperEll"/>

	<!-- Optional Checks -->
        <module name="usage.OneMethodPrivateField"/>
        <module name="usage.UnusedLocalVariable"/>
        <module name="usage.UnusedParameter"/>

    </module>

</module>
