package entities;

import java.util.Date;
import java.util.Objects;

public class User {

	private String nome;
	private Date date;

	public User(String nome, Date date) {
		this.nome = nome;
		this.date = date;
	}

	public String getNome() {
		return nome;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(nome, other.nome);
	}

}
