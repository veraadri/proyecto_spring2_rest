package py.edu.facitec.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Post extends General  {
	
	private String titulo;
	private String autor;
	private LocalDate Fecha;
	private String texto;	
//	one es uno a muchos mapy es aplic relacion
@OneToMany(mappedBy = "post")
	private List<Comentario> comentarios ;

public Post() {}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public LocalDate getFecha() {
	return Fecha;
}

public void setFecha(LocalDate fecha) {
	Fecha = fecha;
}

public String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

public List<Comentario> getComentarios() {
	return comentarios;
}

public void setComentarios(List<Comentario> comentarios) {
	this.comentarios = comentarios;
}

@Override
public String toString() {
	return "Post [titulo=" + titulo + ", autor=" + autor + ", Fecha=" + Fecha + ", texto=" + texto + "]";
}



	
	

}
