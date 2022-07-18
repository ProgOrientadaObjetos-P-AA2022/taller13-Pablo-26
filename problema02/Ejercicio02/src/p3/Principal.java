/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.*;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();
        
        ArrayList<Matricula> lista = new ArrayList<>();
        lista.add(mcamp);
        lista.add(mcolegio);
        lista.add(mescuela);
        lista.add(mjardin);
        lista.add(mmaternal);
        lista.add(mmaternal2);
        
        TipoMatricula tipos = new TipoMatricula();
        tipos.establecerMatriculas(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio Matriculas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
    }
}
