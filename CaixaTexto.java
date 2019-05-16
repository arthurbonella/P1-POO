
public class CaixaTexto {

	private static final double DEFAULTLINHA = 30,DEFAULTCOLUNA = 50;

	private static double limitelinha =CaixaTexto.DEFAULTLINHA,limitecoluna = CaixaTexto.DEFAULTCOLUNA;

	private Texto mensagem;
	private double linha,coluna;

	//CONSTRUTORES

	public CaixaTexto(Texto _mensagem,double _linha, double _coluna) throws Exception {
		this.setCampos(_mensagem, _linha, _coluna);
	}
	public CaixaTexto(String _mensagem,double _linha, double _coluna) throws Exception {
		this.setCampos(new Texto(_mensagem), _linha, _coluna);
	}
	public CaixaTexto() throws Exception {
		this.setCampos(new Texto(), 1, 1);
	}

	//METODOS
	public void setMensagem(Texto _mensagem){
		this.mensagem = _mensagem;
	}
	public Texto getMensagem(){
		return this.mensagem;
	}
	public void setLinha(double _linha){
		this.linha = _linha;
	}
	public double getLinha(){
		return this.linha;
	}
	public void setColuna(double _coluna){
		this.coluna = _coluna;
	}
	public double getLimiteLinha(){
		return CaixaTexto.limitelinha;	
	}
	public void setLimiteLinha(double _limite){
		CaixaTexto.limitelinha = _limite;
	}
	public double getLimiteColuna(){
		return CaixaTexto.limitecoluna;	
	}
	public void setLimitecoluna(double _limite){
		CaixaTexto.limitecoluna = _limite;
	}

	public double getColuna(){
		return this.coluna;
	}
	public void setCampos(Texto _mensagem,double _linha,double _coluna)throws Exception{
		if(_linha <= CaixaTexto.limitelinha && _linha >=0 && _coluna <= CaixaTexto.limitecoluna && _coluna >= 0) {
			this.setLinha(_linha);
			this.setColuna(_coluna);
			this.setMensagem(_mensagem);
		}
		else {
			throw new Exception ("Out of Bounds.");
		}
	}
	//TOSTRING
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(this.getMensagem());
		str.append(" - ");
		str.append("(");
		str.append(this.getLinha());
		str.append(",");
		str.append(this.getColuna());
		str.append(")");

		return str.toString();
	}
}
