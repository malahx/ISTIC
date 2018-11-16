package m2.vv.tutorials;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtNewConstructor;
import javassist.CtNewMethod;
import javassist.Modifier;

public class App {
    public static void main(String[] args) {
        try {
            ClassPool pool = ClassPool.getDefault();

            CtClass point = pool.makeClass("Point");

            point.addField(new CtField(CtClass.intType, "x", point));
            point.addField(new CtField(CtClass.intType, "y", point));

            point.addMethod(
                    CtNewMethod.make(
                            Modifier.PUBLIC,
                            CtClass.intType,
                            "getX",
                            new CtClass[0],
                            new CtClass[0],
                            "{return this.x;}",
                            point));
            point.addMethod(
                    CtNewMethod.make(
                            Modifier.PUBLIC,
                            CtClass.intType,
                            "getY",
                            new CtClass[0],
                            new CtClass[0],
                            "{return this.y;}",
                            point));

            point.addMethod(
                    CtNewMethod.make(
                            Modifier.PUBLIC,
                            CtClass.voidType,
                            "setX",
                            new CtClass[]{CtClass.intType},
                            new CtClass[0],
                            "{this.x = $1;}",
                            point));
            point.addMethod(
                    CtNewMethod.make(
                            Modifier.PUBLIC,
                            CtClass.voidType,
                            "setY",
                            new CtClass[]{CtClass.intType},
                            new CtClass[0],
                            "{this.y = $1;}",
                            point));
            point.addMethod(
                    CtNewMethod.make(
                            Modifier.PUBLIC,
                            pool.getCtClass("java.lang.String"),
                            "toString",
                            new CtClass[0],
                            new CtClass[0],
                            "{return this.x = \" x \" + this.y;}",
                            point));
            point.addConstructor(CtNewConstructor.make(
                    new CtClass[]{CtClass.intType,CtClass.intType},
                    new CtClass[0],
                    "{this.x = $1;this.x = $2;}",
                    point
            ));
            point.writeFile();
        } catch (Throwable exc) {
            System.out.println("Oh, no! Something went wrong.");
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }

    }
}
