/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.*;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    
    
    
    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;
    
//    private MatriculaCampamento campamento;
//    private MatriculaColegio colegio;
//    private MatriculaEscuela escuela;
//    private MatriculaJardin jardin;
//    private MatriculaMaternal maternal;
//    private MatriculaMaternal maternal2;
    
//    public void establecerMatriculaCampamento(MatriculaCampamento c){
//        campamento = c;
//    }
//    
//    public void establecerMatriculaColegio(MatriculaColegio c){
//        colegio = c;
//    }
//    
//    public MatriculaCampamento obtenerMatriculaCampamento(){
//        return campamento;
//    }
//    
//    public MatriculaColegio obtenerMatriculaColegio(){
//        return colegio;
//    }
    
    public void establecerMatriculas(ArrayList<Matricula> mt){
        matriculas = mt;
    }
    
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < matriculas.size(); i++) {
            
            suma = suma + matriculas.get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / matriculas.size();
        
    }
    
    public ArrayList<Matricula> obtenerMatriculas(){
        return matriculas;
    }
    
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
}
