public class Aula3ProcessamentoDeDados {
    public static void main(String[] args){
        //fazer o y recebendo o valor de x vezes 2
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(y);

        //fazer o z que é decimar receber a conta de x vezes 5
        double z = 5 * x;
        System.out.println(z);

        double area, heinght, smallerBase, largerBase;

        heinght = 5.0;
        smallerBase= 6.0;
        largerBase= 8.0;

        area = (smallerBase + largerBase) / 2 * heinght;
        System.out.println(area);

        // uso de casting
        double a;
        int b;
        a = 5.0;
        b = (int) a; //aqui usamos o casting para que nao corramos o risco de perderdados

        System.out.println(b);
    }
}
