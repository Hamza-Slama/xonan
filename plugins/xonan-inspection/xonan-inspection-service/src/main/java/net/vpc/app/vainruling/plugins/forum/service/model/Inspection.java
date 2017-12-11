package net.vpc.app.vainruling.plugins.forum.service.model;

import net.vpc.upa.config.*;

import java.util.Date;

@Entity
@Path("/Inspections")
public class Inspection {
    @Id     @Sequence
    private int id;
    @Main
    private String title;
    @Summary
    private Question questions;
    private Inspector inspectors;
    @Summary
    private String locality;
    private Date dateDebut;
    private Date dateFin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Question getQuestions() {
        return questions;
    }

    public void setQuestions(Question questions) {
        this.questions = questions;
    }

    public Inspector getInspectors() {
        return inspectors;
    }

    public void setInspectors(Inspector inspectors) {
        this.inspectors = inspectors;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
