package service;



public class Method<T> {
    public static String getClassName(Object obj){
        String str=obj.getClass().toString();
        str = str.substring(str.lastIndexOf('.') + 1);
        return str;
    }
}
