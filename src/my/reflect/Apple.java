package my.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Apple {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setPrice(5);
        System.out.println("Apple Price:" + apple.getPrice());

        try {
            Class clazz = Class.forName("my.reflect.Apple");
            Method setMethod = clazz.getMethod("setPrice",int.class);
            Constructor constructor = clazz.getConstructor();
            Object o = constructor.newInstance();
            setMethod.invoke(o,14);
            Method getMethod = clazz.getMethod("getPrice");
            System.out.println("Apple Price:" + getMethod.invoke(o));
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void test(Class<?> clazz){
        Object o = clazz.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
        }
    }
}
