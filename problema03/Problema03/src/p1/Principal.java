/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
        */
        
        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        
        DominioGmail dom1 = new DominioGmail();
        dom1.establecerDominio("gmail.com");
        
        Correo c1 = new Correo();
        c1.establecerDominio(dom1);
        c1.establecerUserName(e.obtenerUserName());
        c1.establecerCorreo();
        
        DominioOutlook dom2 = new DominioOutlook();
        dom2.establecerDominio("outlook.com");
        
        Correo c2 = new Correo();
        c2.establecerDominio(dom2);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();
        
        DominioYahoo dom3 = new DominioYahoo();
        dom3.establecerDominio("yahoo.com");
        
        Correo c3 = new Correo();
        c3.establecerDominio(dom3);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();
        
        DominioUTPL dom4 = new DominioUTPL();
        dom4.establecerDominio("utpl.edu.ec");
        
        Correo c4 = new Correo();
        c4.establecerDominio(dom4);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();
        
        DominioGobierno dom5 = new DominioGobierno();
        dom5.establecerDominio("gobiernoec.gob");
        
        Correo c5 = new Correo();
        c5.establecerDominio(dom5);
        c5.establecerUserName(e.obtenerUserName());
        c5.establecerCorreo();
        
        ArrayList<Correo> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        
        e.establecerCorreos(lista);
        
        System.out.printf("%s\n", e);
        
        
    }
    
}
