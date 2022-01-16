package education__.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String name;
    private String surname;
    private String email;
    private String password;
    private UserType type;


}
