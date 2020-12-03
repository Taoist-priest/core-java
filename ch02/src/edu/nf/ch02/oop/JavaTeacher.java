package edu.nf.ch02.oop;

/**
 * @author wangl
 * @date 2020/10/9
 * 继承是is a的关系（是一个）
 * 方法的重写（覆盖）只能发生在父类和子类之间，
 * 由子类重写父类的非私有方法
 * 注意：静态方法不具备重写特性，只看编译时类型
 * 重写是运行时的多态
 *
 *
 * 重载可以发生在本类中，也可以发生在父类和子类之间
 * 重载的要求时方法名相同，参数的个数和类型不同即可
 * ,并且构造方法也是可以重载的
 * 重载是编译时的多态
 */
public class JavaTeacher extends Teacher{

    public JavaTeacher(){

    }
    //构造方法的重载
    public JavaTeacher(String name){

    }

    /**
     * 重写的目的是为了改变父类的默认行为，以满足当前的业务需求
     */
    @Override
    public void say() {
        System.out.println("Hello JavaTeacher");
    }

    public void hello(){
        System.out.println("Hello sir.");
    }

    public void hello(String name){
        System.out.println("Hello " + name);
    }
}
