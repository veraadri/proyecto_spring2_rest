package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class Comentario extends General {
	
	private String texto ;
	private int estrellas ;
	@ManyToOne // muchos a uno
	private Post post ; // relacionar de forma bidimencional 
	@ManyToOne
	private Suscrito suscrito;
	public Comentario() {}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public Suscrito getSuscrito() {
		return suscrito;
	}
	public void setSuscrito(Suscrito suscrito) {
		this.suscrito = suscrito;
	}
	@Override
	public String toString() {
		return "Comentario [texto=" + texto + ", estrellas=" + estrellas + "]";
	}
	
	

	
	
	
	
	
	

}
