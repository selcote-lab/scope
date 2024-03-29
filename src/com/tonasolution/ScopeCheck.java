package com.tonasolution;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;

    public void scopeCheck(){
        System.out.println("ScopeCheck created, publicVar = " + publicVar);
        System.out.println("ScopeCheck created, privateVar = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int varTwo = 2;
        for(int i=0; i<10; i++){
            System.out.println(i + " times two is " + (i * varTwo));
        }
    }
    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class " + innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is "+ varOne +" , the varThree is "+ this.varThree);
        }
        public void timesTwo(){
            System.out.println("varOne is still available here " +  varOne);
            ScopeCheck.this.timesTwo();
            for(int i=0; i<10; i++){
                System.out.println(i + " times two is " + (i * this.varThree));
            }
        }
    }
}
