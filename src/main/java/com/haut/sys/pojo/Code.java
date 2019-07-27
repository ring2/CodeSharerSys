package com.haut.sys.pojo;

public class Code {
    private Integer id;

    private String title;

    private String type;

    private String introduction;

    private String filename;

    private Integer shareid;

    private String content;
    
    

    public Code() {
		super();
	}
    
    
    
	@Override
	public String toString() {
		return "Code [id=" + id + ", title=" + title + ", type=" + type + ", introduction=" + introduction
				+ ", filename=" + filename + ", shareid=" + shareid + ", content=" + content + "]";
	}



	public Code(Integer id, String title, String type, String introduction, String filename, Integer shareid,
			String content) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.introduction = introduction;
		this.filename = filename;
		this.shareid = shareid;
		this.content = content;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getShareid() {
        return shareid;
    }

    public void setShareid(Integer shareid) {
        this.shareid = shareid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}