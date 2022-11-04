package com.company;


    import java.lang.annotation.ElementType;
    import java.lang.annotation.Annotation;
    import java.lang.annotation.Retention;
    import java.lang.annotation.RetentionPolicy;
    import java.lang.annotation.Target;
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)

    @interface Info
    {
        int AuthorID();
        String Date();
        String Time();
        int Version();

    }
    @Info(AuthorID=19,Date="1 Jan 2002",Time="5",Version=10)
    class Developer1 {
        Developer1() {
            System.out.println("information");
        }
    }
    public class AnnotationTest2{
        public static void main(String[] args) {
            Developer1 developer = new Developer1();
            Class c1=developer.getClass();
            Annotation a=c1.getAnnotation(Info.class);
            Info info=(Info)a;
            System.out.println(info.AuthorID());
            System.out.println(info.Date());
            System.out.println(info.Time());
            System.out.println(info.Version());
        }
    }

