package persistance;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Forum {

	private int idForum;
	private String nomForum;
	private List<User> users ;
	
	public Forum() {
	
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdForum() {
		return idForum;
	}
	public void setIdForum(int idForum) {
		this.idForum = idForum;
	}
	public String getNomForum() {
		return nomForum;
	}
	public void setNomForum(String nomForum) {
		this.nomForum = nomForum;
	}
	
	
	
	@OneToMany(mappedBy="forum")
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
	
	
}
