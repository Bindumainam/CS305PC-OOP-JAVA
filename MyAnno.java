import java.lang.annotation .*;

 @Target(ElementType.TYPE)
 @Retention(RetentionPolicy.RUNTIME)
 
 @interface MyAnno{
 	String Usage() default "dip dip dip";
 }
