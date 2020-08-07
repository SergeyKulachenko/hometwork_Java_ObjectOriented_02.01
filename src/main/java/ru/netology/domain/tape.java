package ru.netology.domain;

public class tape {
    private String id;
    private Boolean recordCommunity;
    private Boolean interesting;
    private String headImage;
    private String headTextUrl;
    private String headDateUrl;
    private String text;
    private Boolean ollText;
    private String imageID;
    private String imageLike;
    private int numberOfLike;
    private String imageShare;
    private int numberOfShare;
    private String views;
    private String[] comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getRecordCommunity() {
        return recordCommunity;
    }

    public void setRecordCommunity(Boolean recordCommunity) {
        this.recordCommunity = recordCommunity;
    }

    public Boolean getInteresting() {
        return interesting;
    }

    public void setInteresting(Boolean interesting) {
        this.interesting = interesting;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getHeadTextUrl() {
        return headTextUrl;
    }

    public void setHeadTextUrl(String headTextUrl) {
        this.headTextUrl = headTextUrl;
    }

    public String getHeadDateUrl() {
        return headDateUrl;
    }

    public void setHeadDateUrl(String headDateUrl) {
        this.headDateUrl = headDateUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getOllText() {
        return ollText;
    }

    public void setOllText(Boolean ollText) {
        this.ollText = ollText;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getImageLike() {
        return imageLike;
    }

    public void setImageLike(String imageLike) {
        this.imageLike = imageLike;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    public String getImageShare() {
        return imageShare;
    }

    public void setImageShare(String imageShare) {
        this.imageShare = imageShare;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public Boolean getNextComments() {
        return nextComments;
    }

    public void setNextComments(Boolean nextComments) {
        this.nextComments = nextComments;
    }

    private Boolean nextComments;
}
