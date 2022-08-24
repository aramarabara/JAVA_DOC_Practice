package EffectiveJava.CH4_ClassNInterface.Item_15_minimizeAuth.MVC.Class;

public class FinalizeClass{

    FinalizeClass(){
        System.out.println("FinalizeClass Constructor");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("FinalizeClass finalize");
    }

}
