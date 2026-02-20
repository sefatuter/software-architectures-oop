package com.arc.questions.ex_4;

public class MethodOverload {

    // Overloading method for int type
    public double sqrt(int number) {
        return Math.sqrt(number);
    }

    // Overloading method for float type
    public double sqrt(float number) {
        return Math.sqrt(number);
    }

    // Overloading method for double type (optional)
    public double sqrt(double number) {
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();

        // Testing with int
        System.out.println("Square root of 16 (int): " + obj.sqrt(16));

        // Testing with float
        System.out.println("Square root of 25.5 (float): " + obj.sqrt(25.5f));

        // Testing with double (optional)
        System.out.println("Square root of 49.0 (double): " + obj.sqrt(49.0));
    }
}


//Metot aşırı yükleme (overloading),
//Java gibi nesne yönelimli programlama dillerinde bir sınıfta aynı isme sahip birden fazla metodun tanımlanmasına olanak tanıyan bir özelliktir.
//Bu metotlar aynı isme sahip olabilir ancak aldıkları parametrelerin türü, sayısı veya sırası farklı olmalıdır.
//
//Metot aşırı yükleme sayesinde, farklı türdeki verileri işleyebilecek esnek metotlar yazabiliriz.
//Örneğin, bir topla metodu hem iki tam sayı (int) hem de iki ondalık sayı (float) toplama işlemi yapabilir.
