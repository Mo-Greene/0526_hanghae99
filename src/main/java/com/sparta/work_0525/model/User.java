package com.sparta.work_0525.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;            //고유 테이블생성시 아이디

    @Column(nullable = false, unique = true)
    private String username;        //아이디 겸 닉네임

    @Column(nullable = false)
    private String password;        //비번


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
