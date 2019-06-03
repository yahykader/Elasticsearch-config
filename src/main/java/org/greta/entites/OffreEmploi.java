package org.greta.entites;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "offreemploi",type = "customer", shards = 2)
public class OffreEmploi implements Serializable {
	
	@Id
    private Long idOffre;
    private String nomOffre;
    private String source;
    private String dateDebut;
    private String dateAcceptation;
    private String contenuOffre;

    public OffreEmploi() {
    }

    public OffreEmploi(Long idOffre, String nomOffre, String source, String dateDebut, String dateAcceptation, String contenuOffre) {
        this.idOffre = idOffre;
        this.nomOffre = nomOffre;
        this.source = source;
        this.dateDebut = dateDebut;
        this.dateAcceptation = dateAcceptation;
        this.contenuOffre = contenuOffre;
    }

    public Long getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(Long idOffre) {
        this.idOffre = idOffre;
    }

    public String getNomOffre() {
        return nomOffre;
    }

    public void setNomOffre(String nomOffre) {
        this.nomOffre = nomOffre;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateAcceptation() {
        return dateAcceptation;
    }

    public void setDateAcceptation(String dateAcceptation) {
        this.dateAcceptation = dateAcceptation;
    }

    public String getContenuOffre() {
        return contenuOffre;
    }

    public void setContenuOffre(String contenuOffre) {
        this.contenuOffre = contenuOffre;
    }
}


