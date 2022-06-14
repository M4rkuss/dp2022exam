package exam2022.table2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



	
@Entity
@Table(name="tablename1")
public class Table2 {
	@Id
	@GeneratedValue	
	private int prkey;
	private String name2;
	private long age;
	
	public Table2() {
	}
	
	public Table2(int prkey, String name2, long age) {
		super();
		this.prkey = prkey;
		this.name2 = name2;
		this.age = age;
	}

	public int getPrkey() {
		return prkey;
	}

	public void setPrkey(int prkey) {
		this.prkey = prkey;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}
	
	

	
	
	
	
	//@Override
	//public String toString() {
		//return "{\"id\": \""+id+"\",\"title\":\""+title+"\",\"price\":"+price+", \"desc\":\""+desc+"\"}";
	}