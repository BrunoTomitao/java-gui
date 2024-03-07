package com.unialfa;

import javax.swing.*;

import static javax.swing.SwingUtilities.*;

public class App
{
    public static void main( String[] args )    {
        invokeLater(() -> {
            ExemploJFrame exemploJFrame = new ExemploJFrame();
            exemploJFrame.setVisible(true);
        });
    }
}
