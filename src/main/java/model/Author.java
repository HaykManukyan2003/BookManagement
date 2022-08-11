package model;

import enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    private String name;
    private String surname;
    private String email;
    private Gender gender;
    private Date registeredDate;

}
