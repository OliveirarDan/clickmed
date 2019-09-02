package com.clickmed.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name ="permissoes")
public class Permissao implements GrantedAuthority {

    /*
     * Permissões
     * 1 - Médico
     * 2 - Paciente
     * */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="permissao")
    private Long permissao;

    @Column(name = "descricao")
    private String descricao;

    public Long getPermissao() {
        return permissao;
    }

    public void setPermissao(Long permissao) {
        this.permissao = permissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Permissao{" +
                "id=" + id +
                ", permissao=" + permissao +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public String getAuthority() {
        return this.descricao;
    }
}
