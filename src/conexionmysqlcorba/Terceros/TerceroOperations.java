package Terceros;


/**
* Terceros/TerceroOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Terceros.idl
* mi�rcoles 26 de septiembre de 2018 09:15:22 PM COT
*/

public interface TerceroOperations 
{
  boolean insertarTercero (String nombre, String apellido, String telefono);
  boolean actualizarTercero (int id, String nombre, String apellido, String telefono);
  boolean eliminarTercero (int id);
  String consultarTercero (int id);
  void shoutdown ();
} // interface TerceroOperations
