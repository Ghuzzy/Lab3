import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import agenda.Contato;

public class ContatoTest {

	 
    private Contato[] contatosBase = new Contato[5];
    private Contato[] contatosBaseCompara = new Contato[5];
 
    @BeforeEach
    void preparaContatos() {
        this.contatosBase[0] = new Contato("Matheus", "Gaudencio", "555-5551");
        this.contatosBase[1] = new Contato("Samuel", "Cabral", "(83) 9999-9999");
        this.contatosBase[2] = new Contato("Samuel", "Cabral", "(83) 1111-1111");
        this.contatosBase[3] = new Contato("Luis", "Inacio", "(83) 1313-1313");
        this.contatosBase[4] = new Contato("Pedro", "Silva", "(83) 7777-7777");
        
        this.contatosBaseCompara[0] = new Contato("Matheus", "Gaudencio", "6666-6666");
        this.contatosBaseCompara[1] = new Contato("Amanda", "Sousa", "4575-8751");
        this.contatosBaseCompara[2] = new Contato("Victor", "Santos", "1345-8471");
        this.contatosBaseCompara[3] = new Contato("Luis", "Pedro", "1345-8971");
        this.contatosBaseCompara[4] = new Contato("Victor", "Silsa", "4576-8471");
        
    }

    @Test
    void testNomeCompleto() {
       String msg = "Esperando obter o nome completo";
       String[] nomesCompletos = {"Matheus Gaudencio","Samuel Cabral", "Samuel Cabral", "Luis Inacio", "Pedro Silva"};
       int i = 0;
       for(String nomeCompleto : nomesCompletos) {
       assertEquals( nomeCompleto, this.contatosBase[i].nomeCompleto(), msg + "indice do erro: " + i);
       i += 1;
       }
    }
    
	@Test
	void testEqualsContato() {
		String msg = "Esperando obter o valor booleano que indica se os objetos são iguais";
		boolean[] equal = { true, false, false, false, false};
		for(int i = 0; i < this.contatosBase.length; i++) {
		assertEquals( this.contatosBaseCompara[i].equals(this.contatosBase[i]), equal[i], msg + "indice do erro: " + i);
		}
		
	}


}
