package bdpj.bd1pj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Electronicos extends JPanel {
    
    private JComboBox<String> cbTipoElectronico;
    private JTextField tfTornillos, tfTipoMando;
    private JTextArea taProblema;
    private JRadioButton rbEnciendeSi,rbEnciendeNo;
    private List<Component> componentesDinamicosPanel2;
    private List<Component> componentesDinamicosPanel3;
    private ButtonGroup grupoEnciende;
    
    public Electronicos() {
        
        componentesDinamicosPanel2 = new ArrayList<>();
        componentesDinamicosPanel3 = new ArrayList<>();
        

        setLayout(new BorderLayout()); 

        JPanel panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(200, 200, 255));
        panelSuperior.setLayout(new BoxLayout(panelSuperior, BoxLayout.Y_AXIS)); 

        JLabel tituloSuperior = new JLabel("Registrar Electronicos", JLabel.CENTER); 
        tituloSuperior.setFont(new Font("Arial", Font.BOLD, 32)); 

        tituloSuperior.setAlignmentX(Component.CENTER_ALIGNMENT); 
        panelSuperior.add(Box.createVerticalGlue()); 
        panelSuperior.add(tituloSuperior);
        panelSuperior.add(Box.createVerticalGlue()); 

        
        int altoPanelSuperior = (int) (Toolkit.getDefaultToolkit().getScreenSize().height * 0.1);
        panelSuperior.setPreferredSize(new Dimension(getWidth(), altoPanelSuperior));

        
        add(panelSuperior, BorderLayout.NORTH); // Panel superior en la parte norte

    
        JPanel panelInferiorCentral = new JPanel();
        panelInferiorCentral.setLayout(new GridLayout(1, 4)); 

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(200, 200, 255));
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(200, 200, 255));

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(200, 200, 255));
        
        JPanel panel4 = new JPanel();
        panel4.setBackground(new Color(200, 200, 255));

        panelInferiorCentral.add(panel1);
        panelInferiorCentral.add(panel2);
        panelInferiorCentral.add(panel3);
        panelInferiorCentral.add(panel4);

       
        add(panelInferiorCentral, BorderLayout.CENTER); 

        
        JPanel panelInferiorAdicional = new JPanel();
        panelInferiorAdicional.setBackground(new Color(200, 200, 255));
        panelInferiorAdicional.setLayout(new BoxLayout(panelInferiorAdicional, BoxLayout.Y_AXIS)); 

       
        JButton botonInferior = new JButton("Guardar");
        botonInferior.setFont(new Font("Arial", Font.BOLD, 16));
        botonInferior.setAlignmentX(Component.CENTER_ALIGNMENT); 

      
        panelInferiorAdicional.add(Box.createRigidArea(new Dimension(0, 5))); 
        panelInferiorAdicional.add(botonInferior); 

     
        int altoPanelInferior = (int) (Toolkit.getDefaultToolkit().getScreenSize().height * 0.1);
        panelInferiorAdicional.setPreferredSize(new Dimension(getWidth(), altoPanelInferior));

        add(panelInferiorAdicional, BorderLayout.SOUTH); 
        
        panel2.setLayout(null);
        panel3.setLayout(null);
        
        int xInicial = 0; 
        int yInicial = 10; 
        int anchoEtiqueta = 280; 
        int altoEtiqueta = 30; 
        int espacioVertical = 40; 

        JLabel etiqueta1 = new JLabel("Tipo Electronico: ");
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 24));
        etiqueta1.setBounds(xInicial, yInicial, anchoEtiqueta, altoEtiqueta);
        panel2.add(etiqueta1);

        cbTipoElectronico = new JComboBox<>(new String[]{"Seleccionar", "PC Escritorio", "Notebooks", "Consolas", "Mandos", "Otros"});
        cbTipoElectronico.setFont(new Font("Arial", Font.PLAIN, 18));
        cbTipoElectronico.setBounds(xInicial, yInicial, 250, 30); 

        panel3.add(cbTipoElectronico);

        JLabel etiqueta2 = new JLabel("Enciende: ");
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 24));
        yInicial += altoEtiqueta + espacioVertical; 
        etiqueta2.setBounds(xInicial, yInicial, anchoEtiqueta, altoEtiqueta);
        panel2.add(etiqueta2);
        
        rbEnciendeSi = new JRadioButton("Sí");
        rbEnciendeNo = new JRadioButton("No");

        grupoEnciende = new ButtonGroup();
        grupoEnciende.add(rbEnciendeSi);
        grupoEnciende.add(rbEnciendeNo);

        rbEnciendeSi.setBounds(xInicial, yInicial, 50, 30);
        rbEnciendeNo.setBounds(50, yInicial, 50, 30);
        panel3.add(rbEnciendeSi);
        panel3.add(rbEnciendeNo);

        
        JLabel etiqueta3 = new JLabel("Tornillos Faltantes: ");
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 24));
        yInicial += altoEtiqueta + espacioVertical; 
        etiqueta3.setBounds(xInicial, yInicial, anchoEtiqueta, altoEtiqueta);
        panel2.add(etiqueta3);
        
        tfTornillos = new JTextField(3);  
        tfTornillos.setBounds(xInicial,yInicial,50,30);
        panel3.add(tfTornillos);
        
        
        JLabel etiqueta4 = new JLabel("Problema Electronico: ");
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 24));
        yInicial += altoEtiqueta + espacioVertical; 
        etiqueta4.setBounds(xInicial, yInicial, anchoEtiqueta, altoEtiqueta);
        panel2.add(etiqueta4);
        
        taProblema = new JTextArea();
        taProblema.setLineWrap(true); 
        taProblema.setWrapStyleWord(true); 
        
        JScrollPane scrollPane = new JScrollPane(taProblema);
        scrollPane.setBounds(0, yInicial, 200, 42); 
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 

        panel3.add(scrollPane);
        

cbTipoElectronico.addItemListener(new ItemListener() {
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String seleccion = (String) cbTipoElectronico.getSelectedItem();
            for (Component c : componentesDinamicosPanel2) {
                panel2.remove(c);
            }
            componentesDinamicosPanel2.clear();

            for (Component c : componentesDinamicosPanel3) {
                panel3.remove(c);
            }
            componentesDinamicosPanel3.clear();

           
            if (!"Seleccionar".equals(seleccion)) {
                int ultimaAltura; // Valor inicial

                if ("Mandos".equals(seleccion)) {
                    ultimaAltura = 220;
                    ultimaAltura += 30 + 40;
                    
                    JLabel etiquetaMando = new JLabel("Marca De Mando: ");
                    etiquetaMando.setFont(new Font("Arial", Font.BOLD, 24));
                    etiquetaMando.setBounds(0, ultimaAltura, 280, 30); // Posicionar correctamente
                    panel2.add(etiquetaMando);
                    componentesDinamicosPanel2.add(etiquetaMando); 

                    JComboBox<String> cbMandos = new JComboBox<>(new String[]{"Seleccionar", "Playstation", "Xbox", "Switch", "Generico"});
                    cbMandos.setFont(new Font("Arial", Font.PLAIN, 18));
                    cbMandos.setBounds(xInicial, ultimaAltura, 250, 30);
                    panel3.add(cbMandos);
                    componentesDinamicosPanel3.add(cbMandos); 
                }
                if ("Consolas".equals(seleccion)) {
                    ultimaAltura = 220;
                    ultimaAltura += 30 + 40;
                    JLabel consolas = new JLabel("Tipo De Consola: ");
                    consolas.setFont(new Font("Arial", Font.BOLD, 24));
                    consolas.setBounds(0, ultimaAltura, 280, 30); 
                    panel2.add(consolas);
                    componentesDinamicosPanel2.add(consolas); 

                    JComboBox<String> TipoConsola = new JComboBox<>(new String[]{"Seleccionar", "Playstation", "Xbox", "Switch","Wii", "Generico"});
                    TipoConsola.setFont(new Font("Arial", Font.PLAIN, 18));
                    TipoConsola.setBounds(xInicial, ultimaAltura, 250, 30);
                    panel3.add(TipoConsola);
                    componentesDinamicosPanel3.add(TipoConsola); 
                }
                if ("PC Escritorio".equals(seleccion)) {
                    ultimaAltura = 220; 
                    ultimaAltura += 30 + 40;
                    JLabel pcescritorio = new JLabel("User Password: ");
                    pcescritorio.setFont(new Font("Arial", Font.BOLD, 24));
                    pcescritorio.setBounds(0, ultimaAltura, 280, 30); 
                    panel2.add(pcescritorio);
                    componentesDinamicosPanel2.add(pcescritorio); 

                    JTextField contra = new JTextField(8);  
                    contra.setBounds(0,ultimaAltura,120,30);
                    panel3.add(contra);
                    componentesDinamicosPanel3.add(contra); 
                    }
                    if ("Otros".equals(seleccion)) {

                    ultimaAltura = 220;
                    ultimaAltura += 30 + 40;

                    JLabel etiquetaElectronico = new JLabel("Electronico: ");
                    etiquetaElectronico.setFont(new Font("Arial", Font.BOLD, 24));
                    etiquetaElectronico.setBounds(0, ultimaAltura, 280, 30); 
                    panel2.add(etiquetaElectronico);
                    componentesDinamicosPanel2.add(etiquetaElectronico); 
                    
                    JTextField Elec = new JTextField(10); 
                    Elec.setBounds(0,ultimaAltura,120,30);
                    panel3.add(Elec);
                    componentesDinamicosPanel3.add(Elec); 
                    
                    ultimaAltura += 30 + 40;
                    JLabel detalles = new JLabel("Detalles: ");
                    detalles.setFont(new Font("Arial", Font.BOLD, 24));
                    detalles.setBounds(0, ultimaAltura, 280, 30); 
                    panel2.add(detalles);
                    componentesDinamicosPanel2.add(detalles); 
                    
                    JTextField detalle = new JTextField(10);  
                    detalle.setBounds(0,ultimaAltura,120,30);
                    panel3.add(detalle);
                    componentesDinamicosPanel3.add(detalle);                 
                }                                            
                if ("Notebooks".equals(seleccion)) {
                    ultimaAltura = 220;
                    ultimaAltura += 30 + 40;
                    JLabel etiquetanotes = new JLabel("User Password: ");
                    etiquetanotes.setFont(new Font("Arial", Font.BOLD, 24));
                    etiquetanotes.setBounds(0, ultimaAltura, 280, 30); 
                    panel2.add(etiquetanotes);
                    componentesDinamicosPanel2.add(etiquetanotes); 

                    JTextField Pass = new JTextField(8);  
                    Pass.setBounds(0,ultimaAltura,120,30);
                    panel3.add(Pass);
                    componentesDinamicosPanel3.add(Pass); 
                    
                    ultimaAltura += 30 + 40;
                    JLabel cargador = new JLabel("Cargador: ");
                    cargador.setFont(new Font("Arial", Font.BOLD, 24));
                    cargador.setBounds(0, ultimaAltura, 280, 30); 
                    panel2.add(cargador);
                    componentesDinamicosPanel2.add(cargador); 
                        
                    JRadioButton rbcargadorsi = new JRadioButton("Sí");
                    JRadioButton rbcargadorno = new JRadioButton("No");

                    ButtonGroup grupoEnciende = new ButtonGroup();
                    grupoEnciende.add(rbcargadorsi);
                    grupoEnciende.add(rbcargadorno);

                    rbcargadorsi.setBounds(xInicial, ultimaAltura, 50, 30);
                    rbcargadorno.setBounds(50, ultimaAltura, 50, 30);
                    panel3.add(rbcargadorsi);
                    panel3.add(rbcargadorno);
                        
                    componentesDinamicosPanel3.add(rbcargadorsi); 
                    componentesDinamicosPanel3.add(rbcargadorno); 
                        
                    ultimaAltura += 30 + 40;

                    JLabel marca = new JLabel("Marca Notebooks: ");
                    marca.setFont(new Font("Arial", Font.BOLD, 24));
                    marca.setBounds(0, ultimaAltura, 280, 30); 
                    panel2.add(marca);
                    componentesDinamicosPanel2.add(marca);
                    
                    JTextField marcas = new JTextField(10); 
                    marcas.setBounds(0,ultimaAltura,120,30);
                    panel3.add(marcas);
                    componentesDinamicosPanel3.add(marcas);                         
                    }            
            }
            }
            panel2.revalidate();
            panel2.repaint();
            panel3.revalidate();
            panel3.repaint();
        }    
});

botonInferior.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String seleccionElectronico = (String) cbTipoElectronico.getSelectedItem();
        switch (seleccionElectronico) {
            case "PC Escritorio":
                ConsultaPcEscritorio();
                break;
            case "Notebooks":
                ConsultaNotebooks();
                break;
            case "Consolas":
                ConsultaConsolas();
                break;
            case "Mandos":
                ConsultaMandos();
                break;
            case "Otros":
                ConsultaOtros();
                break;
            default: 
                JOptionPane.showMessageDialog(Electronicos.this, "Por favor selecciona un tipo válido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
});


}
    
private void ConsultaPcEscritorio() {
    
    if (validarFormulario("PC Escritorio")) {
    String problemaElectronico = taProblema.getText();
    int tornillosFaltantes = Integer.parseInt(tfTornillos.getText());

    boolean enciende = false;
    if (rbEnciendeSi.isSelected()) {
        enciende = true;  // Si "Sí" está seleccionado, asignamos true
    } else if (rbEnciendeNo.isSelected()) {
        enciende = false; // Si "No" está seleccionado, asignamos false
    }
    
    JTextField password = (JTextField) componentesDinamicosPanel3.get(0);
    String userPassword = password.getText();
    
  
    System.out.println("Procesando PC Escritorio...");
    System.out.println("Problema: " + problemaElectronico);
    System.out.println("Tornillos Faltantes: " + tornillosFaltantes);
    System.out.println("Enciende: " + enciende);    
    System.out.println("User Password: " + userPassword);
    
    int idGenerado = generarId();  
    System.out.println("EL ID ES:"+idGenerado);
   
    try (Connection connection = ConexionBd.getConnection()) {
           String sqlElectronicos = "INSERT INTO electronicos (id_electronico,enciende,tornillos_faltante,tipo,problema_cliente) VALUES (?, ?, ?, ?, ?)";
           try (PreparedStatement stmtElectronicos = connection.prepareStatement(sqlElectronicos)) {
               stmtElectronicos.setInt(1, idGenerado); 
               stmtElectronicos.setBoolean(2, enciende);
               stmtElectronicos.setInt(3, tornillosFaltantes);
               stmtElectronicos.setString(4, "pc_escritorio");
               stmtElectronicos.setString(5, problemaElectronico);

               stmtElectronicos.executeUpdate();
           }

           String sqlPcEscritorio = "INSERT INTO pc_escritorio (id_electronico, user_password) VALUES (?, ?)";
           try (PreparedStatement stmtPcEscritorio = connection.prepareStatement(sqlPcEscritorio)) {
               stmtPcEscritorio.setInt(1, idGenerado);  
               stmtPcEscritorio.setString(2,userPassword);  
               stmtPcEscritorio.executeUpdate();
           }
           JOptionPane.showMessageDialog(this, "Electrónico agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
           limpiarFormulario();
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
}

private void ConsultaNotebooks() {    

    if (validarFormulario("Notebooks")) {
        
        String problemaElectronico = taProblema.getText();
        int tornillosFaltantes = Integer.parseInt(tfTornillos.getText());
        boolean enciende = rbEnciendeSi.isSelected();

        JTextField passField = (JTextField) componentesDinamicosPanel3.get(0);
        String userPassword = passField.getText();

        JRadioButton rbcargadorSi = (JRadioButton) componentesDinamicosPanel3.get(1);
        JRadioButton rbcargadorNo = (JRadioButton) componentesDinamicosPanel3.get(2);
        
        boolean tieneCargador = rbcargadorSi.isSelected();

        JTextField marcasField = (JTextField) componentesDinamicosPanel3.get(3);
        String marcaNotebook = marcasField.getText();
        
        int idGenerado = generarId();  
        System.out.println("EL ID ES:"+idGenerado);
        
        try (Connection connection = ConexionBd.getConnection()) {
           String sqlElectronicos = "INSERT INTO electronicos (id_electronico,enciende,tornillos_faltante,tipo,problema_cliente) VALUES (?, ?, ?, ?, ?)";
           try (PreparedStatement stmtElectronicos = connection.prepareStatement(sqlElectronicos)) {
               stmtElectronicos.setInt(1, idGenerado); 
               stmtElectronicos.setBoolean(2, enciende);
               stmtElectronicos.setInt(3, tornillosFaltantes);
               stmtElectronicos.setString(4, "notebooks");
               stmtElectronicos.setString(5, problemaElectronico);

               stmtElectronicos.executeUpdate();
           }

           String sqlPcEscritorio = "INSERT INTO notebooks (id_electronico, modelo_pc,cargador,user_password) VALUES (?, ?, ?, ?)";
           try (PreparedStatement stmtNotebooks = connection.prepareStatement(sqlPcEscritorio)) {
               stmtNotebooks.setInt(1, idGenerado);  
               stmtNotebooks.setString(2,marcaNotebook);
               stmtNotebooks.setBoolean(3,tieneCargador);
               stmtNotebooks.setString(4,userPassword);
               
               stmtNotebooks.executeUpdate();
           }
           JOptionPane.showMessageDialog(this, "Electrónico agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
           limpiarFormulario();
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
}

private void ConsultaConsolas() {
    
    if (validarFormulario("Consolas")) {

        String problemaElectronico = taProblema.getText();
        int tornillosFaltantes = Integer.parseInt(tfTornillos.getText());

        boolean enciende = rbEnciendeSi.isSelected();

        JComboBox<String> Consolas = (JComboBox<String>) componentesDinamicosPanel3.get(0);
        String TipoConsola = (String) Consolas.getSelectedItem();
    
        int idGenerado = generarId();  
        System.out.println("EL ID ES:"+idGenerado);
        
        try (Connection connection = ConexionBd.getConnection()) {
           String sqlElectronicos = "INSERT INTO electronicos (id_electronico,enciende,tornillos_faltante,tipo,problema_cliente) VALUES (?, ?, ?, ?, ?)";
           try (PreparedStatement stmtElectronicos = connection.prepareStatement(sqlElectronicos)) {
               stmtElectronicos.setInt(1, idGenerado); 
               stmtElectronicos.setBoolean(2, enciende);
               stmtElectronicos.setInt(3, tornillosFaltantes);
               stmtElectronicos.setString(4, "consolas");
               stmtElectronicos.setString(5, problemaElectronico);

               stmtElectronicos.executeUpdate();
           }

           String sqlConsola = "INSERT INTO consolas (id_electronico, tipo_consola) VALUES (?, ?)";
           try (PreparedStatement stmtConsolas = connection.prepareStatement(sqlConsola)) {
               stmtConsolas.setInt(1, idGenerado);  
               stmtConsolas.setString(2,TipoConsola);
               
               stmtConsolas.executeUpdate();
           }
           JOptionPane.showMessageDialog(this, "Electrónico agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
           limpiarFormulario();
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
}

private void ConsultaMandos() {
    
    if (validarFormulario("Mandos")) {
        
        String problemaElectronico = taProblema.getText();
        int tornillosFaltantes = Integer.parseInt(tfTornillos.getText());
        boolean enciende = rbEnciendeSi.isSelected();


        JComboBox<String> Mnds = (JComboBox<String>) componentesDinamicosPanel3.get(0);
        String TipoMando = (String) Mnds.getSelectedItem();

        int idGenerado = generarId();  
        System.out.println("EL ID ES:"+idGenerado);
        
        try (Connection connection = ConexionBd.getConnection()) {
           String sqlElectronicos = "INSERT INTO electronicos (id_electronico,enciende,tornillos_faltante,tipo,problema_cliente) VALUES (?, ?, ?, ?, ?)";
           try (PreparedStatement stmtElectronicos = connection.prepareStatement(sqlElectronicos)) {
               stmtElectronicos.setInt(1, idGenerado); 
               stmtElectronicos.setBoolean(2, enciende);
               stmtElectronicos.setInt(3, tornillosFaltantes);
               stmtElectronicos.setString(4, "mandos");
               stmtElectronicos.setString(5, problemaElectronico);

               stmtElectronicos.executeUpdate();
           }

           String sqlMandos = "INSERT INTO mandos (id_electronico, tipo_mando) VALUES (?, ?)";
           try (PreparedStatement stmtMandos = connection.prepareStatement(sqlMandos)) {
               stmtMandos.setInt(1, idGenerado);  
               stmtMandos.setString(2,TipoMando);
               
               stmtMandos.executeUpdate();
           }
           JOptionPane.showMessageDialog(this, "Electrónico agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
           limpiarFormulario();
       } catch (SQLException e) {
           e.printStackTrace();
       }    
    }
    
}

private void ConsultaOtros() {
    if (validarFormulario("Otros")) {
        String problemaElectronico = taProblema.getText();
        int tornillosFaltantes = Integer.parseInt(tfTornillos.getText());
        boolean enciende = rbEnciendeSi.isSelected();

        JTextField Electro = (JTextField) componentesDinamicosPanel3.get(0);
        String Electronico = Electro.getText();

        JTextField Deta = (JTextField) componentesDinamicosPanel3.get(1);
        String Detalles = Deta.getText();
        
        int idGenerado = generarId();  
        System.out.println("EL ID ES:"+idGenerado);
        
        try (Connection connection = ConexionBd.getConnection()) {
           String sqlElectronicos = "INSERT INTO electronicos (id_electronico,enciende,tornillos_faltante,tipo,problema_cliente) VALUES (?, ?, ?, ?, ?)";
           try (PreparedStatement stmtElectronicos = connection.prepareStatement(sqlElectronicos)) {
               stmtElectronicos.setInt(1, idGenerado); 
               stmtElectronicos.setBoolean(2, enciende);
               stmtElectronicos.setInt(3, tornillosFaltantes);
               stmtElectronicos.setString(4, "otros");
               stmtElectronicos.setString(5, problemaElectronico);

               stmtElectronicos.executeUpdate();
           }

           String sqlMandos = "INSERT INTO otros (id_electronico, detalles,tipo_electronico) VALUES (?, ?, ?)";
           try (PreparedStatement stmtMandos = connection.prepareStatement(sqlMandos)) {
               stmtMandos.setInt(1, idGenerado);  
               stmtMandos.setString(2,Detalles);
               stmtMandos.setString(3,Electronico);

               stmtMandos.executeUpdate();
           }
           JOptionPane.showMessageDialog(this, "Electrónico agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
           limpiarFormulario();
       } catch (SQLException e) {
           e.printStackTrace();
       }        

    }
}

private boolean validarFormulario(String tipoElectronico) { //PARA VALIDAD QUE TODO ESTE SELECIONADO/INGRESADO...EXCEPTO PASSWORD
    if (taProblema.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el problema del electrónico.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if (tfTornillos.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el número de tornillos faltantes.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;  
    }

    if (tipoElectronico == null || tipoElectronico.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione el tipo de electrónico.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;  
    }

    if (!rbEnciendeSi.isSelected() && !rbEnciendeNo.isSelected()) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione si el dispositivo enciende o no.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;  
    }

    switch (tipoElectronico) {
        case "Mandos":
            JComboBox<String> Mnds = (JComboBox<String>) componentesDinamicosPanel3.get(0);
            String TipoMando = (String) Mnds.getSelectedItem();

            if (TipoMando == null || TipoMando.equals("Seleccionar")) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de mando.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        case "Otros":
            JTextField Electro = (JTextField) componentesDinamicosPanel3.get(0);
            String Electronico = Electro.getText().trim();

            JTextField Deta = (JTextField) componentesDinamicosPanel3.get(1);
            String Detalles = Deta.getText().trim();

            if (Electronico.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese el electrónico.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;  
            }
            if (Detalles.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese los detalles del electrónico.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;  
            }
            return true;
        case "Consolas":
            JComboBox<String> Cns = (JComboBox<String>) componentesDinamicosPanel3.get(0);
            String TipoConsola = (String) Cns.getSelectedItem();

            if (TipoConsola == null || TipoConsola.equals("Seleccionar")) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de consola.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        case "Notebooks":
            JRadioButton rbcargadorSi = (JRadioButton) componentesDinamicosPanel3.get(1);
            JRadioButton rbcargadorNo = (JRadioButton) componentesDinamicosPanel3.get(2);
            String tieneCargador = rbcargadorSi.isSelected() ? "Si" : rbcargadorNo.isSelected() ? "No" : null; 

            if (tieneCargador == null) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione si el dispositivo tiene cargador.", "Error", JOptionPane.ERROR_MESSAGE);
                return false; 
            }
            JTextField marcasField = (JTextField) componentesDinamicosPanel3.get(3);
            String marca = marcasField.getText().trim();  
            if (marca.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese la marca del notebook.", "Error", JOptionPane.ERROR_MESSAGE);
                return false; 
            }
            return true;
        default:
            return true;
    }
}

private int generarId() {
    
    boolean idUnico = false;
    int id = 0;
    try (Connection connection = ConexionBd.getConnection()) {
        while (!idUnico) {
            id = (int) (Math.random() * 999999) + 1;  

            if (esIdUnico(id, connection)) {
                idUnico = true; 
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al conectar a la base de datos para generar ID.");
        e.printStackTrace();
    }
    return id;  
}

private boolean esIdUnico(int id, Connection connection) {
    String query = "SELECT COUNT(*) FROM electronicos WHERE id_electronico = ?";  

    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            return rs.getInt(1) == 0; 
        }
    } catch (SQLException e) {
        System.err.println("Error al verificar ID en la base de datos.");
        e.printStackTrace();
    }
    
    return false;  
}

private void limpiarFormulario() {
    if (taProblema != null) {
        taProblema.setText("");
    }
    if (tfTornillos != null) {
        tfTornillos.setText("");
    }
    if (rbEnciendeSi != null) {
        grupoEnciende.clearSelection();
    }
    if (rbEnciendeNo != null) {
        grupoEnciende.clearSelection();
    }

    if (cbTipoElectronico != null) {
        cbTipoElectronico.setSelectedItem("Seleccionar");
    } 
    if (componentesDinamicosPanel3 != null) {
        for (Component componente : componentesDinamicosPanel3) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            } else if (componente instanceof JComboBox) {
                ((JComboBox<?>) componente).setSelectedIndex(0); 
            } else if (componente instanceof JRadioButton) {
                ((JRadioButton) componente).setSelected(false);
            }
        }
    }
}
}
    



