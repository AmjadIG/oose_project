package businesslogic.client.domain;

import businesslogic.client.domain.map.Case;

public abstract class AbstractUnit {
    private int idUnit;
    private String name;
    private Case position;

    /**
     * 
     * @return
     */
    public int getIdUnit() {
        return idUnit;
    }

    /**
     * 
     * @param idUnit
     */
    public void setIdUnit(int idUnit) {
        this.idUnit = idUnit;
    }

    /**
     * 
     * @return
     */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
    public Case getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     */
    public void setPosition(Case position) {
        this.position = position;
    }
}
