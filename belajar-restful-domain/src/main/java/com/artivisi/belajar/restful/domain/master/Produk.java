/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artivisi.belajar.restful.domain.master;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author DHANI
 */
@Entity
@Table(name = "tbl_barang")
public class Produk {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @NotEmpty
    @Column(name = "kdbrg", nullable = false)
    private String kdbrg;
    
    @NotNull
    @NotEmpty
    @Column(name = "nama", nullable = false)
    private String nama;
    
    @NotNull
    @Min(0)
    @Column(name = "harga", nullable = false)
    private BigDecimal harga = BigDecimal.ZERO;
    
    @NotNull
    @Column(name = "stok")
    private Integer stok;

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKdbrg() {
        return kdbrg;
    }

    public void setKdbrg(String kdbrg) {
        this.kdbrg = kdbrg;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
    
    
}
