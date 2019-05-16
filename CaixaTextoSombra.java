
public class CaixaTextoSombra extends CaixaTexto{

	private int cod;

	//CONSTRUTORES
	public CaixaTextoSombra(Texto _mensagem,double _linha, double _coluna,int _cod) throws Exception {
		super(_mensagem,_linha,_coluna);
		this.setCodigo(_cod);
	}
	public CaixaTextoSombra() throws Exception {
		super();
		this.setCodigo(0);
	}

	public void setCodigo(int _cod) {
		this.cod = _cod;
	}
	public int getCodigo() {
		return this.cod;
	}
	
	//TOSTRING
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append(super.toString());
		str.append(" - ");
		str.append(this.getCodigo());
		
		return str.toString();
		
	}
}
