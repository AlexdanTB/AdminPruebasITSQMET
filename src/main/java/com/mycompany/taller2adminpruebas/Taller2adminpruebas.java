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
        String fecha = "";

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
                                    //System.out.println("Ultimo digito es: "+ced);
                                    switch (cedn) {
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
                                    JOptionPane.showMessageDialog(null, "Estimado " + nombre + " " + apellido + "\nRendirás la prueba el día " + fecha);
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
                    do{
                       opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Menú Profesores\n\nElige una opción:\n1. Ingreso de Información de Estudiante\n2. Promedio Final\n3. Regresar"));
                       switch (opcion2){
                           case 1:
                                nombre = JOptionPane.showInputDialog("SOLICITUD DE PRUEBA\n\nIngresa tu nombre:");
                                apellido = JOptionPane.showInputDialog("Ingresa tu apellido:");
                                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
                                cedula = JOptionPane.showInputDialog("Ingresa tu número de cédula");
                                /*
                                if (edad >= 18 && cedula.length() == 10) {
                                    
                                }else if (edad < 18){
                                    
                                }else if (cedula.length() != 10){
                                    
                                }
                                */
                                JOptionPane.showMessageDialog(null, "El estudiante ha sido registrado");
                                break;
                           case 2:
                                JOptionPane.showMessageDialog(null, "PROMEDIO FINAL");
                                break;
                           case 3:
                                break;
                           default:
                                JOptionPane.showMessageDialog(null, "La opción ingresada no es válida");
                                break;
                       }
                    }while(opcion2 != 3);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción ingresada no es válida");
                    break;
            }
        } while (opcion1 != 3);
        
    }
}
