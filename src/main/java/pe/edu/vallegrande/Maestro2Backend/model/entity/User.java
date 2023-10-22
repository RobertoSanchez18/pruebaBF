package pe.edu.vallegrande.Maestro2Backend.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name= "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_user")
    private Long id;

    @Column(name = "name_user")
    private String name;

    @Column(name = "surname_user")
    private String surname;

    @Column(name = "celphone_user")
    private String celphone;

    @Column(name = "type_document_user")
    private String tipoDocumento;

    @Column(name = "number_document_user")
    private String numeroDocumento;

    @Column(name = "pass")
    private String password;

    @Column(name = "email_user")
    private String email;

    @Column(name = "type_user")
    private String tipoUsuario;

}
