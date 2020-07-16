package de.tefemuc.Uebung11;

import javax.swing.*;
import java.io.*;

public class A41a {

    public static void main(String[] args){
        JFileChooser dialog = new JFileChooser();
        if (dialog.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            File f = dialog.getSelectedFile();
            PrintWriter pw = null;
            try{
                pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(f)));
            } catch (FileNotFoundException e){
                System.out.println(e.getMessage());
                System.exit(1);
            }

            pw.println("ok");
            pw.close();

        }
    }
}
