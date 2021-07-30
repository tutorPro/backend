package com.tutorPro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User implements UserDetails {
    @Id
    private Long id;
    private String username;
    private String password;
    private Integer enabled;
    private Integer accountExpired;
    private Integer credentialExpired;
    private Integer accountLocked;
    private Collection<? extends GrantedAuthority> authorities;

    public User(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountExpired == 0;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountLocked == 0;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialExpired == 0;
    }

    @Override
    public boolean isEnabled() {
        return enabled == 1;
    }

}
