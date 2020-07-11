package lesson_7.HW;

public class Class2 {

    @BeforeSuite (description = " beforeSuiteMethod")
    public static void beforeSuiteMethod(){
        System.out.println("Class2: Начало");
    }

    @Test (description = " method1", priority = 3)
    public static void method1(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method2")
    public static void method2(){
        System.out.println("Какой-то код");
    }

    @Test(description = " method3")
    public static void method3(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method4", priority = 10)
    public static void method4(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method5", priority = 7)
    public static void method5(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method6", priority = 5)
    public static void method6(){
        System.out.println("Какой-то код");
    }

    @Test (description = " method7", priority = 8)
    public static void method7(){
        System.out.println("Какой-то код");
    }

    @AfterSuite (description = " afterSuiteMethod")
    public static void afterSuiteMethod(){
        System.out.println("Class2: Конец\n");
    }
}


