package org.example;

public class Salarios1 {
        public static double calcularDescuento(double salario) throws IllegalArgumentException {
            double salarioBasico = 2000.0;
            if (salario <= 0) {
                throw new IllegalArgumentException("Salario no válido");
            } else if (salario <= salarioBasico) {
                return 0.0;
            } else if (salario > salarioBasico && salario <= (2 * salarioBasico)) {
                return salario * 0.05;
            } else {
                return salario * 0.15;
            }
        }

        public static void main(String[] args) {
            double salario1 = 1500.0;
            double salario2 = 2100.0;
            double salario3 = 3000.0;

            try {
                double descuento1 = calcularDescuento(salario1);
                double descuento2 = calcularDescuento(salario2);
                double descuento3 = calcularDescuento(salario3);

                System.out.println("Salario: " + salario1 + ", Descuento: " + descuento1);
                System.out.println("Salario: " + salario2 + ", Descuento: " + descuento2);
                System.out.println("Salario: " + salario3 + ", Descuento: " + descuento3);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

