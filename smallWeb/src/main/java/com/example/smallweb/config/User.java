package com.example.smallweb.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDetailsService")
public class User implements UserDetailsService {

    private String user;
    private String pwd;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //先使用根据用户名查找权限和角色
        List<GrantedAuthority> role = AuthorityUtils.commaSeparatedStringToAuthorityList("role");
        return new org.springframework.security.core.userdetails.User("lcy",new BCryptPasswordEncoder().encode("123"),role);
    }
}
