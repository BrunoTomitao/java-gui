package com.unialfa;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JOptionPane.*;

public class ExemploJFrame extends JFrame {
    private JTextField campoNome;
    private JButton botao;

    public  ExemploJFrame(){
        setTitle("exemplo GUI");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5,5,5, 5);

        JLabel labelNome = new JLabel("Digite seu nome:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(labelNome, constraints);

        campoNome = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(campoNome, constraints);

        botao = new JButton("Enviar");
        botao.addActionListener(e -> executarBotao());
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        panel.add(botao, constraints);

        add(panel);
        setLocationRelativeTo(null);
    }
    private void executarBotao(){
    showMessageDialog(this, "Nome: " + this.campoNome.getText());

    }

}
