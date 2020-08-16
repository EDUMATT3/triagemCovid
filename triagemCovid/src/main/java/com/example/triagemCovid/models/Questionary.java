package com.example.triagemCovid.models;

import org.springframework.lang.NonNull;

import javax.persistence.*;

import java.io.Serializable;
@Entity
@Table(name="questionary")
public class Questionary implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int registry;
    private boolean contact;
    private boolean fever;
    private boolean chills;
    private boolean shortness_breathe;
    private boolean cough;
    private boolean sore_throat;
    private boolean headache;
    private boolean body_ache;
    private boolean loss_physical_senses;
    private boolean diarrhea;

    public boolean canGoToWork(){
        if(contact | fever | chills | shortness_breathe | cough | sore_throat | headache | body_ache | loss_physical_senses | diarrhea)
            return false;
        return true;
    }

    public Questionary() {}

    public Questionary(int registry, boolean contact, boolean fever, boolean chills, boolean shortness_breathe, boolean cough, boolean sore_throat, boolean headache, boolean body_ache, boolean loss_physical_senses, boolean diarrhea) {
        this.registry = registry;
        this.contact = contact;
        this.fever = fever;
        this.chills = chills;
        this.shortness_breathe = shortness_breathe;
        this.cough = cough;
        this.sore_throat = sore_throat;
        this.headache = headache;
        this.body_ache = body_ache;
        this.loss_physical_senses = loss_physical_senses;
        this.diarrhea = diarrhea;
    }

    public int getRegistry() {
        return registry;
    }

    public void setRegistry(int registry) {
        this.registry = registry;
    }

    public boolean isContact() {
        return contact;
    }

    public void setContact(boolean contact) {
        this.contact = contact;
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isChills() {
        return chills;
    }

    public void setChills(boolean chills) {
        this.chills = chills;
    }

    public boolean isShortness_breathe() {
        return shortness_breathe;
    }

    public void setShortness_breathe(boolean shortness_breathe) {
        this.shortness_breathe = shortness_breathe;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isSore_throat() {
        return sore_throat;
    }

    public void setSore_throat(boolean sore_throat) {
        this.sore_throat = sore_throat;
    }

    public boolean isHeadache() {
        return headache;
    }

    public void setHeadache(boolean headache) {
        this.headache = headache;
    }

    public boolean isBody_ache() {
        return body_ache;
    }

    public void setBody_ache(boolean body_ache) {
        this.body_ache = body_ache;
    }

    public boolean isLoss_physical_senses() {
        return loss_physical_senses;
    }

    public void setLoss_physical_senses(boolean loss_physical_senses) {
        this.loss_physical_senses = loss_physical_senses;
    }

    public boolean isDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(boolean diarrhea) {
        this.diarrhea = diarrhea;
    }
}