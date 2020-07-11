package lesson_7.HW;

import java.lang.reflect.Method;

public class MyTest {

    public static void start(Class c) throws Exception {

        int checkBeforeSuite = 0;
        int checkAfterSuite = 0;

        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)){
                if (checkBeforeSuite > 0){
                    throw new RuntimeException ("Метод с аннотацией @BeforeSuite должен присутствовать " +
                            "в единственном экземпляре.");
                }
                System.out.println("Запускаю метод: " + m.getAnnotation(BeforeSuite.class).description());
                m.invoke(null);
                checkBeforeSuite++;
            }
        }

            for (Method m : methods){

                if (m.isAnnotationPresent(BeforeSuite.class) || m.isAnnotationPresent(AfterSuite.class)){
                    continue;
                }
                    System.out.println("Запускаю метод: " + m.getAnnotation(Test.class).description());
                    m.invoke(null);
            }


        for (Method m : methods) {
            if (m.isAnnotationPresent(AfterSuite.class)) {
                if (checkAfterSuite > 0) {
                    throw new RuntimeException("Метод с аннотацией @AfterSuite должен присутствовать " +
                            "в единственном экземпляре.");
                }
                System.out.println("Запускаю метод: " + m.getAnnotation(AfterSuite.class).description());
                m.invoke(null);
                checkAfterSuite++;
            }
        }
    }

}
