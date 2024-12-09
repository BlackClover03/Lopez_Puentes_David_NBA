/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticasnba;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dl260
 */
public class TextoPersonalizado extends JLabel { 
    public TextoPersonalizado() {
        super("Texto por defecto");
    }
    
    public TextoPersonalizado(String texto, int tamañoFuente) {
        super(texto);
        configurarEstilo(tamañoFuente);
    }

    void configurarEstilo(int tamañoFuente) {
        setForeground(Color.RED);
        setBackground(Color.CYAN);
        setOpaque(true);
        setHorizontalAlignment(SwingConstants.CENTER);
        setFont(new Font("Arial", Font.BOLD, determinarTamañoFuente(tamañoFuente)));
    }
    
    public int determinarTamañoFuente(int opción) {
        switch (opción) {
            case 1:
                return 10;
            case 2:
                return 14;
            case 3:
                return 18;
            default:
                return 14;
        }
    }
}
