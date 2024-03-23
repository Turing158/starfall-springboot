package com.starfall.entity;

import com.starfall.util.Exp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserOut {
    String user;
    String name;
    int gender;
    String email;
    String birthday;
    int exp;
    int maxExp;
    int level;
    public UserOut(String user, String name, int gender,String email,String birthday,int exp,int level){
        this.user = user;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.birthday = birthday;
        this.exp = exp;
        this.level = level;
        this.maxExp = Exp.getMaxExp(level);
    }
}
