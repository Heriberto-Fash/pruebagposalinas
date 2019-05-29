package com.prueba.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Product {
  @Id
  public ObjectId _id;
  
  public String nombreProducto;
  public float costo;
  public int numeroInventario;
  public String descripcion;
  
  // Constructors
  public Product() {}
  
  public Product(ObjectId _id, String nombreProducto, float costo, int numeroInventario, String descripcion) {
    this._id = _id;
    this.nombreProducto = nombreProducto;
    this.costo = costo;
    this.numeroInventario = numeroInventario;
    this.descripcion = descripcion;
  }
  
  // ObjectId needs to be converted to string
  public String get_id() { return _id.toHexString(); }
  public void set_id(ObjectId _id) { this._id = _id; }
  
  public String getNombreProducto() { return nombreProducto; }
  public void setNombreProducto(String name) { this.nombreProducto = name; }
  
  public float getCosto() { return costo; }
  public void setCosto(float cost) { this.costo = cost; }
  
  public int getNumeroInventario() { return numeroInventario; }
  public void setNumeroInventario(int num) { this.numeroInventario = num; }
  
  public String getDescripcion(){ return descripcion;}
  public void setDescripcion(String desc){ this.descripcion = desc;}
}
