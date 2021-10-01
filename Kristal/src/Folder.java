
public class Folder {
	private int id;
	private String name;
	private Integer parentid;
	private int position;

	public Folder(int id, String name, Integer parentid, int position) {
		super();
		this.id = id;
		this.name = name;
		this.parentid = parentid;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Folder [id=" + id + ", name=" + name + ", parentid=" + parentid + ", position=" + position + "]";
	}

}
