package com.tapiwanshembizvo.secureaapi.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;
    private  String name;
    private String username;
    private String password;
    @ManyToMany(fetch =  FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();


}
