package com.tonasolution;

public class Main {

    public static void main(String[] args) {
	    String varFour = "This is private to main()";

	    ScopeCheck scopeCheck = new ScopeCheck();
	    scopeCheck.useInner();
        System.out.println("scopeInstance varOne is " + scopeCheck.getVarOne());

        System.out.println(varFour);

        scopeCheck.timesTwo();
        System.out.println("**************************8");
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();



    }
}
