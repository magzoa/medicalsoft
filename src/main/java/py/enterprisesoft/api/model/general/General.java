package py.enterprisesoft.api.model.general;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Magno Portillo
 * @since 31/10/2016
 */

@MappedSuperclass
public abstract class General {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public General() {
		super();
		this.id = 0;
	}
	

	public General(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
