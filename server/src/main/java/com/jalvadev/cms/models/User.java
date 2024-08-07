package com.jalvadev.cms.models;

import java.util.UUID;

import com.jalvadev.cms.base.Roles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    private String Name;

    private Roles Role;

    public User(UUID Id, String Name, Roles role){
        this.Id = Id;
        this.Name = Name;
        this.Role = role;
    }

    public void setId(UUID Id) { this.Id = Id; }
    
    public UUID getId() { return this.Id; }
    
    public void setName(String Name) { this.Name = Name; }
    
    public String getName() { return this.Name; }
    
    public void setRole(Roles Role) { this.Role = Role; }
    
    public Roles getRole() { return this.Role; }
}
