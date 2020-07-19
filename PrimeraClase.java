import java.util.Scanner;
class PrimeraClase 
{
    public static void main (String[] args)
    {
        //Se crea un objeto de la clase Scanner para capturar información del usuario 
        Scanner capturador = new Scanner(System.in);

        //Declaro las variables tipo entero
        int num1, num2, num3;

        //Muestro en pantalla el mensaje al usuario 
        System.out.print("Por favor ingrese el primer número: ");

        //Se captura la información del usuario y se guarda en la variable num1
        num1 = capturador.nextInt();

        System.out.print("Por favor ingrese el segundo número: ");
        num2 = capturador.nextInt();

        System.out.print("Por favor ingrese el tercer número: ");
        num3 = capturador.nextInt();

        //Datos de proceso 
        //Condición para comparar el primer numero con el segundo y el primer numero con el tercero
        if(num1 > num2 && num1 > num3)
        {
            System.out.println("El numero mayor es: " + num1);
            //Condición que compara el orden del valor del num2 y num3 
            if (num2 > num3)
            {
                System.out.println("El numero del medio es: " + num2); 
                System.out.println("El numero menor es: " + num3); 
            }
            //Condición que compara el orden del valor del num3 y num2 
            else
            {
                System.out.println("El numero del medio es: " + num3); 
                System.out.println("El numero menor es: " + num2); 
            }
        }
        //Condición para comparar el segundo numero con el primero y el seegundo numero con el tercero
        else if (num2 > num1 && num2 > num3)
        {
            System.out.println("El numero mayor es: " + num2);
            //Condición que compara el orden del valor del num2 y num3 
            if (num1 > num3)
            {
                System.out.println("El numero del medio es: " + num1); 
                System.out.println("El numero menor es: " + num3); 
            }
            //Condición que compara el orden del valor del num3 y num2 
            else
            {
                System.out.println("El numero del medio es: " + num3); 
                System.out.println("El numero menor es: " + num1); 
            }
        }
        // Condición que se ejecuta cuando el tercer numero ingresado por el usuario es el mayor 
        else
        {
            System.out.println("El numero mayor es: " + num3);
            if (num1 > num2)
            {
                System.out.println("El numero del medio es: " + num1); 
                System.out.println("El numero menor es: " + num2); 
            }
            //Condición que compara el orden del valor del num3 y num2 
            else
            {
                System.out.println("El numero del medio es: " + num2); 
                System.out.println("El numero menor es: " + num1); 
            }
        }
    }
}