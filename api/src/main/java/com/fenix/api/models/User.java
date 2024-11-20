package com.fenix.api.models;

import java.io.Serializable;

import java.util.Set;

import com.fenix.api.models.Enum.UserEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.HashSet;


@Entity
@Table(name ="tb_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private Integer cargo;
    private String cpf;

    @OneToMany
    private Set<TeDjesfsa> list = new HashSet<>();

    public User(){}

    public User(Long id,String name, String email, String phone, String password, UserEnum cargo){
        super();
        this.id = id;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.password = password;
        setUserEnum(cargo);
    }

    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getPhone() {
        return phone;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUserEnum(UserEnum cargo) {
        if (cargo != null) {
            this.cargo = cargo.getCode();
        }
    }

    public UserEnum getUserEnum() {
        return UserEnum.valueOf(cargo);
    }

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if(other.id != null)
                return false;
        }else if(!id.equals(other.id)){
            return false;
        }
        return true;
    }
}
