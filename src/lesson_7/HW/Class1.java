package lesson_7.HW;

public class Class1 {

    @BeforeSuite (description = " beforeSuiteMethod")
    public static void beforeSuiteMethod(){
        System.out.println("Class1: Начало");
    }

    @Test (description = " method1", priority = 3)
    public static void method1(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method2")
    public static void method2(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method3")
    public static void method3(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method4", priority = 9)
    public static void method4(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method5", priority = 10)
    public static void method5(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method6", priority = 5)
    public static void method6(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method7", priority = 2)
    public static void method7(){
        System.out.println("Какой-то код");
    }

    @AfterSuite (description = " afterSuiteMethod")
    public static void afterSuiteMethod(){
        System.out.println("Class1: Конец\n");
    }

//    @AfterSuite (description = " afterSuiteMethod2")
//    public static void afterSuiteMethod2(){
//        System.out.println("Class1: Конец2\n");
//    }
}
