package org.greta.entites;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;
@Document(indexName = "offreemploi",type = "customer", shards = 2)

public class Cv implements Serializable {

	@Id
    private String idCv ;
    private String nomCv;
    private Date disponibilite;
    private String mobilite;
    private String nomfile;
    private String contenu;

    public Cv() {
    }

    public Cv(String id_cv, String nomCv, Date disponibilite, String mobilite, String nomfile, String contenu) {
        this.idCv = idCv;
        this.nomCv = nomCv;
        this.disponibilite = disponibilite;
        this.mobilite = mobilite;
        this.nomfile = nomfile;
        this.contenu = contenu;
    }


    public String getIdCv() {
        return idCv;
    }

    public void setIdCv(String id_cv) {
        this.idCv = id_cv;
    }

    public String getNomCv() {
        return nomCv;
    }

    public void setNomCv(String nomCv) {
        this.nomCv = nomCv;
    }

    public Date getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Date disponibilite) {
        this.disponibilite = disponibilite;
    }

    public String getMobilite() {
        return mobilite;
    }

    public void setMobilite(String mobilite) {
        this.mobilite = mobilite;
    }

    public String getNomfile() {
        return nomfile;
    }

    public void setNomfile(String nomfile) {
        this.nomfile = nomfile;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}
