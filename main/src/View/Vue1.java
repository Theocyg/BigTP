package View;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Vue1 extends JFrame{
        JPanel bottomPanel = new JPanel();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Annuler");
        JLabel prenom = new JLabel("Nom d'utilisateur");
        JLabel mdp = new JLabel("Mot de passe");
        JLabel formLabel = new JLabel("Authentification");
        JLabel form2Label = new JLabel("Veuillez entrer les informations d'identification utilisateur");

        JLabel userLabel = new JLabel(new ImageIcon("C:\\Users\\tetdi\\IdeaProjects\\TD_Seance\\src\\user.png"));

        JPanel panelButton = new JPanel();
        JPanel txtPanel = new JPanel();

        JPanel form2Panel = new JPanel();

        public Vue1() {

            super("Authentification");
            setSize(400, 250);
            setLocationRelativeTo(null); // Centrer la fenêtre
            setLayout(new BorderLayout());


            form2Label.setForeground(Color.MAGENTA);
            form2Panel.setLayout(new MigLayout());
            form2Panel.add(form2Label, "wrap, pushx, pushy, growx, growy");
            add(form2Panel, BorderLayout.NORTH);


            // Ajout d'un panel pour le nom et mot de passe
            txtPanel.setLayout(new MigLayout());
            JTextField textFieldnom = new JTextField(20);
            JPasswordField passwordField = new JPasswordField(20);
            txtPanel.add(userLabel, "span, center, wrap, pushy");
            txtPanel.add(prenom, "wrap, pushx, growx, pushy, growy");
            txtPanel.add(textFieldnom, "wrap, pushx, growx, pushy, growy");
            txtPanel.add(mdp, "wrap, pushx, growx, pushy, growy");
            txtPanel.add(passwordField, "wrap, pushx, growx, pushy, growy");
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            panel.add(txtPanel);
            panel.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
            add(panel, BorderLayout.CENTER);
            add(userLabel, BorderLayout.WEST);
            this.setIconImage(new ImageIcon("user.png").getImage());
            bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
            bottomPanel.add(cancelButton);
            bottomPanel.add(okButton);
            add(bottomPanel, BorderLayout.SOUTH);

            cancelButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });

            /*
            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String nom = textFieldnom.getText();
                    char[] password = passwordField.getPassword();
                    try {

                        // Préparer la requête SQL pour l'insertion A METTRE DANS LE CONTROLEUR
                        String query = "INSERT INTO utilisateur (nom_utilisateur, mot_de_passe) VALUES (?, ?)";
                        PreparedStatement statement = conn.prepareStatement(query);
                        statement.setString(1, nom);
                        statement.setString(2, new String(password));

                        // Exécuter la requête SQL
                        int rowsInserted = statement.executeUpdate();
                        if (rowsInserted > 0) {
                            System.out.println("Les données ont été insérées avec succès dans la base de données.");
                        }

                    } catch (SQLException ex) {
                        System.out.println("Une erreur s'est produite lors de l'insertion des données dans la base de données : " + ex.getMessage());
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Le driver JDBC n'a pas été trouvé : " + ex.getMessage());
                    }
                }
            });
            */

            // Rendre la fenêtre visible
            setVisible(true);
        }
        public void addOKListener(ActionListner listener){
            okButton.addActionListener(listener);
        }

        public void


    }

