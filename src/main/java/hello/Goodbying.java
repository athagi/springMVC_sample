package hello;

public class Goodbying {

    private final long id;

    private final String content;

    public Goodbying(long id, String content) {
        this.id = id;
        this.content = content;
    }
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
/*
	public Goodbying(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Getter
	private long id;

	@Getter
	private String name;

}
*/
