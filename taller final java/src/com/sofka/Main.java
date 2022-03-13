package com.sofka;
import java.util.Scanner;

public class Main {
    public static double num1;
    public static double num2;
    public static double result;
    public static String operation;
    public static String menu;
    public static boolean fin1;
    public static boolean fin2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        menu =  "  7 8 9 modulo(%)\n"+
                "  4 5 6 division(/) multiplicar(*)\n" +
                "  1 2 3 suma(+) resta(-)\n" +
                "    0   clean(c)\n" +
                "ingresa (f) para finalizar\n" +
                "                                    ";
        while (fin2==false) {
            System.out.println(menu);
            System.out.print("ingresa un numero: ");
            num1 = entrada.nextInt();
            entrada.nextLine();
            fin1 = false;
            while (fin1 == false){
                System.out.print("que operación deseas realizar (ingresa el símbolo): ");
                operation = entrada.nextLine();
                switch (operation){
                    case "%":
                        System.out.println(num1+" modulo ");
                        System.out.print("ingresa un numero: ");
                        num2 = entrada.nextInt();
                        entrada.nextLine();
                        result = num1%num2;
                        System.out.println(num1+" modulo "+num2+" = "+result);
                        num1 = result;
                        break;
                    case "/":
                        System.out.println(num1+" / ");
                        System.out.print("ingresa un numero: ");
                        num2 = entrada.nextInt();
                        entrada.nextLine();
                        if(num1 == 0 || num2 == 0){
                            System.out.println("dividir por 0 no es valido");
                        }
                        else {
                            result = num1/num2;
                            System.out.println(num1+" / "+num2+" = "+result);
                            num1 = result;
                        }
                        break;
                    case "*":
                        System.out.println(num1+" x ");
                        System.out.print("ingresa un numero: ");
                        num2 = entrada.nextInt();
                        entrada.nextLine();
                        result = num1*num2;
                        System.out.println(num1+" x "+num2+" = "+result);
                        num1 = result;
                        break;
                    case "+":
                        System.out.println(num1+" + ");
                        System.out.print("ingresa un numero: ");
                        num2 = entrada.nextInt();
                        entrada.nextLine();
                        result = num1+num2;
                        System.out.println(num1+" + "+num2+" = "+result);
                        num1 = result;
                        break;
                    case "-":
                        System.out.println(num1+" - ");
                        System.out.print("ingresa un numero: ");
                        num2 = entrada.nextInt();
                        entrada.nextLine();
                        result = num1-num2;
                        System.out.println(num1+" - "+num2+" = "+result);
                        num1 = result;
                        break;
                    case "c":
                        num1=0;
                        num2=0;
                        result=0;
                        System.out.println(result);
                        System.out.println(operation);
                        fin1 = true;
                        break;
                    case "f":
                        fin1=true;
                        fin2=true;

                }
            }

        }

    }
}
