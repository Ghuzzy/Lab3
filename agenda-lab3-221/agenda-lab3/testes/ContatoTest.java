import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import agenda.Contato;

public class ContatoTest {

	private Contato contato;

	@BeforeEach
	void setUp() {
		this.contato = new Contato("Matheus", "Gaudencio", "555-5551");
	}

	@Test
	void testConstrutor(){
		String msg = "Esperando obter nome";
		assertEquals("Matheus", this.contato.getNome(), msg);
		msg = "Esperando obter sobrenome";
		assertEquals("Gaudencio", this.contato.getSobrenome(), msg);
		msg = "Esperando obter telefone";
		assertEquals("555-5551", this.contato.getTelefone(), msg);
	}
	@Test
	void testNomeCompleto() {
		String msg = "Esperando obter o nome completo";

		assertEquals("Matheus Gaudencio", this.contato.nomeCompleto(), msg);

	}

	@Test
	void testEqualsContato() {
		String msg = "Esperando obter o valor booleano que indica se os objetos são iguais";

		Contato c1 = new Contato("Samuel", "Cabral", "(83) 9999-9999");
		Contato c2 = new Contato("Matheus", "Gaudencio", "555-5551");
		Contato c3 = new Contato("Samuel", "Cabral", "(83) 1111-1111");
		Contato c4 = new Contato("Samuel", "", "6666-6666");
		Contato c5 = new Contato("Amanda", "Cabral", "4575-8751");

		assertEquals(c1.equals(c2), false, msg);
		assertEquals(c1.equals(c3), true, msg);
		assertEquals(c1.equals(c4), false, msg);
		assertEquals(c1.equals(c5), false, msg);

	}

}
