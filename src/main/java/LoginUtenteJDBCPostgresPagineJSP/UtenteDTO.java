package LoginUtenteJDBCPostgresPagineJSP;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Data
public class UtenteDTO {

	String nome;

	String cognome;

	String email;

	String password;
	String vpassword;
	@AssertTrue
	boolean privacy = false;

}
