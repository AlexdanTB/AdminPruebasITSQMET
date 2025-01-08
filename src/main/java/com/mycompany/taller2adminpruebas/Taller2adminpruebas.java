/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller2adminpruebas;

import javax.swing.JOptionPane;

/**
 *
 * @author alexd
 */
public class Taller2adminpruebas {

    public static void main(String[] args) {
        int opcion1 = 0;
        int opcion2 = 0;
        String nombre;
        String apellido;
        int edad;
        String cedula;
        char ced;
        int cedn;

        String[] estudiantes = new String[4];
        int conti = estudiantes.length;
        int estud;

        double[] notas1 = new double[4];
        double[] notas2 = new double[4];
        double[] notas3 = new double[4];
        double[] notas4 = new double[4];

        do {
            opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Menú Principal\n\nElige una opción:\n1. Estudiantes\n2. Profesores\n3. Salir del programa"));
            switch (opcion1) {
                case 1:
                    do {
                        opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Menú Estudiantes\n\nElige una opción:\n1. Solicitud de prueba\n2. Verificar calificaciones\n3. Regresar"));
                        switch (opcion2) {
                            case 1:
                                nombre = JOptionPane.showInputDialog("SOLICITUD DE PRUEBA\n\nIngresa tu nombre:");
                                apellido = JOptionPane.showInputDialog("Ingresa tu apellido:");
                                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
                                cedula = JOptionPane.showInputDialog("Ingresa tu número de cédula");
                                if (edad >= 18 && cedula.length() == 10) {
                                    ced = cedula.charAt(9);
                                    cedn = Integer.parseInt(String.valueOf(ced));
                                    JOptionPane.showMessageDialog(null, "Estimado " + nombre + " " + apellido + "\nRendirás la prueba el día " + ultdigced(cedn));
                                    if (conti <= 0) {
                                        JOptionPane.showMessageDialog(null, "Número máximo de estudiantes regirstrados");
                                    } else {
                                        estudiantes[estudiantes.length - conti] = cedula;
                                        conti--;
                                    }

                                } else if (edad < 18) {
                                    JOptionPane.showMessageDialog(null, "Debes se mayor de edad para rendir el exámen");
                                } else if (cedula.length() != 10) {
                                    JOptionPane.showMessageDialog(null, "Ingresa correctamente el núumero de cédula");
                                }

                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Verificar calificaciones");
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingresa una opción válida");
                                break;
                        }
                    } while (opcion2 != 3);
                    break;
                case 2:
                    do {
                        opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Menú Profesores\n\nElige una opción:\n1. Ingreso de Información de Estudiante\n2. Promedio Final\n3. Regresar"));
                        switch (opcion2) {
                            case 1:
                                do {
                                    estud = Integer.parseInt(JOptionPane.showInputDialog("Selecciona el estudiante:\n0. Regresar\n" + selecestudiantes(estudiantes, false)));
                                    System.out.println(selecestudiantes(estudiantes, false));
                                    System.out.println(conti);
                                    if (estud > 0 && estud <= estudiantes.length - conti) {
                                        switch (estud) {
                                            case 1:
                                                notas1 = ingresarnotas(estud);
                                                break;
                                            case 2:
                                                notas2 = ingresarnotas(estud);
                                                break;
                                            case 3:
                                                notas3 = ingresarnotas(estud);
                                                break;
                                            case 4:
                                                notas4 = ingresarnotas(estud);
                                                break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente las notas del estudiante: "+estudiantes[estud-1]);
                                    } else if (estud == 0) {
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Debes seleccionar el número de estudiante");
                                    }
                                } while (estud != 0);
                                break;
                            case 2:
                                do {
                                    estud = Integer.parseInt(JOptionPane.showInputDialog("Selecciona el estudiante:\n0. Regresar\n" + selecestudiantes(estudiantes, false)));
                                    System.out.println(selecestudiantes(estudiantes, false));
                                    if (estud > 0 && estud <= estudiantes.length - conti) {
                                        switch (estud) {
                                            case 1:
                                                JOptionPane.showMessageDialog(null, "El promedio final del estudiante es: "+promedio(notas1, estud));
                                                break;
                                            case 2:
                                                JOptionPane.showMessageDialog(null, "El promedio final del estudiante es: "+promedio(notas2, estud));
                                                break;
                                            case 3:
                                                JOptionPane.showMessageDialog(null, "El promedio final del estudiante es: "+promedio(notas3, estud));
                                                break;
                                            case 4:
                                                JOptionPane.showMessageDialog(null, "El promedio final del estudiante es: "+promedio(notas4, estud));
                                                break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente las notas del estudiante: "+estudiantes[estud-1]);
                                    } else if (estud == 0) {
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Debes seleccionar el número de estudiante");
                                    }
                                } while (estud != 0);
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "La opción ingresada no es válida");
                                break;
                        }
                    } while (opcion2 != 3);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción ingresada no es válida");
                    break;
            }
        } while (opcion1 != 3);

    }

    public static String selecestudiantes(String[] le, boolean u) {
        // true para Estudiantes - false para profesores
        String lista = "";
        int cont = 0;;
        for (int i = 0; i < le.length; i++) {
            System.out.println(le[i]);
            cont = i + 1;
            if (le[i] == null) {
                if (u) {
                    lista = lista + "\n" + cont + ". " + "-";
                } else {
                    break;
                }

            } else {
                lista = lista + "\n" + cont + ". " + le[i];
            }
        }
        return lista;
    }

    public static double[] ingresarnotas(int ind) {
        boolean x;
        double nota;
        double[] lista = new double[4];
        for (int i = 0; i < lista.length; i++) {
            do {
                nota = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota " + (i + 1)));
                if (nota >= 0 && nota <= 10) {
                    lista[i] = nota;
                    x = true;
                } else {
                    x = false;
                    JOptionPane.showMessageDialog(null, "La nota debe ser de 0 a 10");                    
                }
            } while (!x);

        }
        return lista;
    }
    public static double promedio(double [] notas, int id){
        String texto = "";
        double suma = 0;
        double prom = 0;
        for (double i : notas){
            suma = suma + i;
            texto = texto + "\n" + i;
        }
        prom = suma / notas.length;
        JOptionPane.showMessageDialog(null, "Lista de calificaciones del estudiante: "+texto);
        return prom;
    }

    public static String ultdigced(int n) {
        String fecha = "";
        switch (n) {
            case 0:
                fecha = "Lunes 02 de Diciembre del 2024";
                break;
            case 1:
                fecha = "Martes 03 de Diciembre del 2024";
                break;
            case 2:
                fecha = "Miércoles 04 de Diciembre del 2024";
                break;
            case 3:
                fecha = "Jueves 05 de Diciembre del 2024";
                break;
            case 4:
                fecha = "Viernes 06 de Diciembre del 2024";
                break;
            case 5:
                fecha = "Sábado 07 de Diciembre del 2024";
                break;
            case 6:
                fecha = "Lunes 09 de Diciembre del 2024";
                break;
            case 7:
                fecha = "Martes 10 de Diciembre del 2024";
                break;
            case 8:
                fecha = "Miércoles 11 de Diciembre del 2024";
                break;
            case 9:
                fecha = "Jueves 12 de Diciembre del 2024";
                break;
        }
        return fecha;
    }
}
