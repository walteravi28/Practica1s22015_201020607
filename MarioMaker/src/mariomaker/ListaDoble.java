/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mariomaker;

/**
 *
 * @author Walden-PC
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    
    public ListaDoble(){
        inicio=null;
        fin=null;
    }
    
    public void InsertarInicio(String dato){
        if(inicio==null)
        {
            inicio=new Nodo(dato, null, null );
            fin = inicio;
        }
        else
        {
             Nodo nuevo= new Nodo(dato,null,inicio);
             inicio.setAnterior(nuevo);
             inicio= nuevo;
        }
    }

    public void InsertarFin(String dato){
        if(inicio==null)
        {
            fin=new Nodo(dato, null, null );
            inicio = fin;
        }
        else
        {
             Nodo nuevo= new Nodo(dato,null,inicio);
             fin.setAnterior(nuevo);
             fin= nuevo;
        }
    }
    
    public String ExtraerInicio(){
        String dato =inicio.getDato();
        inicio=inicio.getSiguiente();
        if(inicio != null){
            inicio.setAnterior(null);
        }
        else{
            fin=null;
        }
        return dato;
    }
    
      public String ExtraerFin(){
        String dato =fin.getDato();
        fin=fin.getAnterior();
        if(fin != null){
            fin.setSiguiente(null);
        }
        else{
            inicio=null;
        }
        return dato;
    }

      public void MostrarAdelante(){
          Nodo temp= inicio;
          
          while(temp != null){
              System.out.println(temp.getDato());
              temp=temp.getSiguiente();
          }
      }
      
      public void MostrarAtras(){
          Nodo temp = fin;
          while(temp != null)
              System.out.println(temp.getDato());
              temp= temp.getAnterior();
      }
      
      
}

