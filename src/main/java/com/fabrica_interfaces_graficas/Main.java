package com.fabrica_interfaces_graficas;

import java.util.Scanner;
import com.fabrica_interfaces_graficas.components.Button;
import com.fabrica_interfaces_graficas.components.NavBar;
import com.fabrica_interfaces_graficas.factory.GUIAbstractFactory;
import com.fabrica_interfaces_graficas.factory.ModoClaroFactory;
import com.fabrica_interfaces_graficas.factory.ModoOscuroFactory;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = """
        ================================================
        == Seleccione el tema de la interfaz gráfica  ==
        ================================================
        1. Modo Oscuro
        2. Modo Claro
        """;
        System.out.println(menu);
        System.out.print("Ingrese su opción (1 o 2): ");
        
        int opcion = sc.nextInt();

        TemaUI tema = getTemaUI(opcion);

        if (tema == null) {
            System.out.println(" Opción no válida. Saliendo del programa...");
            sc.close();
            return;
        }     

        GUIAbstractFactory factory = getFactory(tema);

        Button button = factory.CreateStyledButton();
        NavBar navBar = factory.CreateNavBar();

        button.render();
        navBar.render();

        sc.close();
    }

    public static TemaUI getTemaUI(int opcion) {
        switch (opcion) {
            case 1:
                return TemaUI.MODO_OSCURO;
            case 2:
                return TemaUI.MODO_CLARO;
            default:
                return null;
        }
    }

    public static GUIAbstractFactory getFactory(TemaUI tema) {
        switch (tema) {
            case MODO_OSCURO:
                return new ModoOscuroFactory();
            case MODO_CLARO:
                return new ModoClaroFactory();
            default:
                return null;
        }
    }
}