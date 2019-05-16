
public class Texto {

	final private static int DEFAULT =12;

	private String texto;
	private int  tam_fonte;


	//CONTRUTORES
	public Texto(String _texto, int _tam_fonte) {
		this.setDados(_texto, _tam_fonte);
	}
	public Texto(String _texto) {
		this.setDados(_texto,Texto.DEFAULT);
	}
	public Texto() {
		this.setDados("digite aqui",Texto.DEFAULT);
	}
	//METODOS
	public void setTamanhoFonte(int _tam_fonte){
		this.tam_fonte = _tam_fonte;
	}
	public void setTexto(String _texto){
		this.texto = _texto;
	}
	public String getTexto(){
		return this.texto;
	}
	public int getTamanhoFonte() {
		return this.tam_fonte;
	}
	public void setDados(String _texto,int _tam_fonte) {
		this.setTexto(_texto);
		this.setTamanhoFonte(_tam_fonte);
	}

	//EQUALS
	public boolean equals(Texto objeto) {
		if (this.getTexto().equals(objeto.getTexto()) && this.getTamanhoFonte() == objeto.getTamanhoFonte() ) {
			return true;
		}
		else {
			return false;
		}
	}

	//COMPARETO
	public int compareTo(Texto objeto) {
		if(this.getTexto().length() == objeto.getTexto().length()) {
			if(this.getTamanhoFonte() == objeto.getTamanhoFonte()) {
				return 0;
			}
			if(this.getTamanhoFonte() > objeto.getTamanhoFonte()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		if(this.getTexto().length() > objeto.getTexto().length()) {
			return 1;
		}
		else {
			return -1;
		}
	}

	//TOSTRING
	public String toString() {

		StringBuilder str = new StringBuilder();

		str.append(getTexto());
		str.append("(");
		str.append(getTamanhoFonte());
		str.append(")");

		return str.toString();
	}
}
