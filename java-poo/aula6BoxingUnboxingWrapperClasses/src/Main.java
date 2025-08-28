public class Main {
    public static void main(String[] args) {
        int x = 20;

        //boxing
        Object obj = x;

        System.out.println(obj);

        //unboxing
        int y = (int) obj;

        System.out.println(y);

        //WrapperClasses

        int a = 30;

        Integer obj2 = x;

        System.out.println(obj2);

        int b = obj2; // nao precisamos usar o controlador

        System.out.println(b);

        // uso comum: campos de entidades em sisitemas de informação (IMPORTANTE)
        // pois tipos referencias (classes) aceitam valores null

        // Tipo Primitivo  | Classe Wrapper
        // boolean         | Boolean
        // char            | Character
        // byte            | Byte
        // short           | Short
        // int             | Integer
        // long            | Long
        // float           | Float
        // double          | Double

    }
}