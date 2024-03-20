package org.example.usuario;

import javax.swing.*;

public class InterfazUsuario extends JFrame {
    private JTextField campoNombreSimulacion;
    private JButton botonIniciarSimulacion;

    public InterfazUsuario() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);

        JPanel panel = new JPanel();
        this.add(panel);

        panel.add(new JLabel("Nombre de la simulación:"));
        campoNombreSimulacion = new JTextField(20);
        panel.add(campoNombreSimulacion);

        botonIniciarSimulacion = new JButton("Iniciar simulación");
        panel.add(botonIniciarSimulacion);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazUsuario interfazUsuario = new InterfazUsuario();
            interfazUsuario.setVisible(true);
        });
    }
}