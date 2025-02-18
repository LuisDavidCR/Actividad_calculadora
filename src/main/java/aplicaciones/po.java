package aplicaciones;


import static javabeans.Suma.sumarDosReales;

public class po {

    public static void main(String[] args) {

        try {
            System.out.println(sumarDosReales(Double.MAX_VALUE, -Double.MAX_VALUE));
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(-Double.MAX_VALUE);
    }

}
