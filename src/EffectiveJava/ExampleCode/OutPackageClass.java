package EffectiveJava.ExampleCode;

import EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth.AccessModifier;

public class OutPackageClass {

    public void printAuth() {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicAuth = true;
    }
}
