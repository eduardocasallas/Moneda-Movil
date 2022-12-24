package com.unab.banca.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="transaccion")
public class Transaccion implements Serializable {
    @Id
    @Column(name="id_transaccion")
    private String id_transaccion;
    @Column(name="fecha_apertura")
    private Date fecha_apertura;
    @Column(name="valor_transaccion")
    private double valor_transaccion;
    @Column(name="tipo_transaccion")
    private double tipo_transaccion;
    @ManyToOne
    @JoinColumn(name="id_cuenta")
    private Cuenta cuenta;
    
    @Override
    public String toString() {
        return "Transaccion [id_transaccion=" + id_transaccion + ", fecha_apertura=" + fecha_apertura + ", valor_transaccion="
                + valor_transaccion + ", cuenta=" + cuenta + "]";
    }

    

}
