import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float [] calificaciones = new float[5];
        float suma=0, promedio=0;
        String CalificacionFinal;
        Scanner entrada=new Scanner(System.in);

        System.out.print("Inserta el nombre");
        String nombre= entrada.nextLine();

        for (int i=0;i<5;i++){
            System.out.println("Ingresa la calificación");
            calificaciones[i]= entrada.nextFloat();
            suma=suma+ calificaciones[i];

        }

        promedio=suma/5;

        if (promedio>=0 && promedio<=50) {
            CalificacionFinal = "F";
        } else {
            if (promedio>=51 && promedio<=60) {
                CalificacionFinal = "E";
            } else {
                if (promedio>=61 && promedio<=70) {
                    CalificacionFinal = "D";
                } else {
                    if (promedio>=71 && promedio<=80) {
                        CalificacionFinal = "C";
                    } else {
                        if (promedio>=81 && promedio<=90) {
                            CalificacionFinal = "B";
                        } else {
                            if (promedio>=81 && promedio<=100) {
                                CalificacionFinal = "A";
                            } else {
                                CalificacionFinal = "Calificacion final no admitida";
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Nombre del estudiante:"+nombre);
        System.out.println("Calificación 1: "+calificaciones[0]);
        System.out.println("Calificación 2: "+calificaciones[1]);
        System.out.println("Calificación 3: "+calificaciones[2]);
        System.out.println("Calificación 4: "+calificaciones[3]);
        System.out.println("Calificación 5: "+calificaciones[4]);
        System.out.println("Promedio: "+promedio);
        System.out.println("Calificación: "+CalificacionFinal);
    }
}