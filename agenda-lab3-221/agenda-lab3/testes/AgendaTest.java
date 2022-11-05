import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import agenda.Agenda;

class AgendaTest {
	
	private Agenda agenda = new Agenda();

	
	@Test
	void testAgendaConstructor() {
		assertEquals(100, agenda.getContatos().length);
	}
	@Test
	void testCadastraContato() {
		try {
			agenda.cadastraContato(1 ,"", "brasil", "5555-4444");
			fail("Deveria ter lancado excecao de cadastro invalido");
		}catch(IllegalArgumentException e) {
			assertEquals("CONTATO INVALIDO AO MENOS O NOME DEVE SER PREENCHIDO", e.getMessage());
		}
		try {
			agenda.cadastraContato(1 ,"david", "brasil", "5555-4444");
			agenda.cadastraContato(2 ,"david", "brasil", "1111-4444");
			fail("Deveria ter lancado excecao de contato já cadastrado");
		}catch(IllegalArgumentException e) {
			assertEquals("CONTATO JA CADASTRADO", e.getMessage());
		}
		
		assertEquals(agenda.getContato(1), "david brasil \n 5555-4444");
		
	}
	@Test
	void testGetContatos() {
		fail("Not yet implemented");
	}

	@Test
	void testGetContato() {
		fail("Not yet implemented");
	}

	@Test
	void testJaCadastrado() {
		fail("Not yet implemented");
	}

	@Test
	void testAdicionarFavorito() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoverDosFavoritos() {
		fail("Not yet implemented");
	}

	@Test
	void testEstaNosFavoritos() {
		fail("Not yet implemented");
	}

	@Test
	void testGetFavoritos() {
		fail("Not yet implemented");
	}

}
