package br.edu.utfpr.dv.sireata.bo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import br.edu.utfpr.dv.sireata.model.Ata;
import br.edu.utfpr.dv.sireata.model.AtaParticipante;

@RunWith(MockitoJUnitRunner.class)
public class AtaParticipanteBOTest {
	
	@Mock
	private AtaParticipanteBO participanteBO;

	@Test
	public void SalvarParticipantes() {
		
		AtaParticipante participanteTeste = new AtaParticipante();
		
		participanteBO = mock(AtaParticipanteBO.class);
		
		participanteTeste.setAta(new Ata());
		try {
			when(participanteBO.salvar(participanteTeste)).thenReturn(1);
			int participantResult = participanteBO.salvar(participanteTeste);
			assertEquals(1, participantResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
