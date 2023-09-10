
public interface Corredor {
	void correr();
	void parar();
	void acelerar();
}
// todos os metodos sao public e abstract SEMPRE
// todos os metodos precisam ser implentados nas subclasses
// voce pode usar infinitas interfaces, mas tem que implementar tudo
// interfaces sao usadas quando voce quer herdar mais de uma classe, mas o java não permite, usando esse macete.