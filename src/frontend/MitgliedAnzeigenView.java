package frontend;

import backend.Mitglied;

import javax.swing.*;

public class MitgliedAnzeigenView extends JFrame {
    private JPanel pContent;
    private JTextField tfMitgliedsnummer;
    private JTextField tfStatus;
    private JTextField tfAltersklasse;
    private JTextField tfAbonnements;
    private JTextField tfKuendigung;
    private JTextField tfGeburtsdatum;
    private JTextField tfAntrag;
    private JTextField tfRechnungen;
    private JLabel lName;
    private JLabel lMitgliedsnummer;
    private JLabel lStatus;
    private JLabel lGeburtsdatum;
    private JLabel lAltersklasse;
    private JLabel lAntrag;
    private JLabel lAbonnements;
    private JLabel lRechnungen;
    private JLabel lKuendigung;

    public MitgliedAnzeigenView(Mitglied mitglied) {
        setTitle("Mitglied anzeigen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pContent);
        pack();

        tfMitgliedsnummer.setText(mitglied.getMitgliedsnummer());
        tfStatus.setText(mitglied.getStatus().getStatus());
        tfAltersklasse.setText(mitglied.getAltersklasse().getBezeichnung());
        tfGeburtsdatum.setText(mitglied.getGeburtsdatum());

        if (mitglied.getKuendigung() == null) {
            tfKuendigung.setText("Keine Kündigung vorhanden");
        } else {
            tfKuendigung.setText("Kündigung vom " + mitglied.getKuendigung().getKuendigungsDatum() + " vorhanden");
        }
        if (mitglied.getMitgliederantrag() == null) {
            tfAntrag.setText("Kein Antrag vorhanden");
        } else {
            tfAntrag.setText("Antrag vom " + mitglied.getMitgliederantrag().getDatum() + " vorhanden");
        }

        tfRechnungen.setText("Es sind " + mitglied.getRechnungen().size() + " Rechnungen vorhanden");
        tfAbonnements.setText("Es sind " + mitglied.getAbonnements().size() + " Abonnements vorhanden");
    }
}
