package persistance;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Winner {
	
private int idWinner;
private String nameWinner;
private String awardWinner;

private List<Challenge> listChallenge;





public Winner() {
	
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getIdWinner() {
	return idWinner;
}
public void setIdWinner(int idWinner) {
	this.idWinner = idWinner;
}
public String getNameWinner() {
	return nameWinner;
}
public void setNameWinner(String nameWinner) {
	this.nameWinner = nameWinner;
}
public String getAwardWinner() {
	return awardWinner;
}
public void setAwardWinner(String awardWinner) {
	this.awardWinner = awardWinner;
}
@OneToMany(mappedBy="winner")
public List<Challenge> getListChallenge() {
	return listChallenge;
}
public void setListChallenge(List<Challenge> listChallenge) {
	this.listChallenge = listChallenge;
}


	

}
