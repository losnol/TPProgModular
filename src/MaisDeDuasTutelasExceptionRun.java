import java.util.List;

public class MaisDeDuasTutelasExceptionRun {
	public static void adicionarTutela(List<Servico> servicos, Servico servico) throws MaisdeDuasTutelasException{
		if (servicos.size()>=2)
		      throw new MaisdeDuasTutelasException("nao eh possivel adicionar um servico! "
		      		+ "Tecnico jah possui 2 ordems");  
		else {
			servicos.add(servico);
		}
		
	}

}