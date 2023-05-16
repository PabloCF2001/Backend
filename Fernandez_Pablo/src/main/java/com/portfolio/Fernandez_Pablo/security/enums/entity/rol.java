
package com.portfolio.Fernandez_Pablo.security.enums.entity;

import com.portfolio.Fernandez_Pablo.security.enums.rolnombre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private rolnombre Rolnombre;

    public rol() {
    }

    public rol(rolnombre Rolnombre) {
        this.Rolnombre = Rolnombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public rolnombre getRolnombre() {
        return Rolnombre;
    }

    public void setRolnombre(rolnombre Rolnombre) {
        this.Rolnombre = Rolnombre;
    }
    
    
    
    
}
