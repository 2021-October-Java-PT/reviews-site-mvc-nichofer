package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String name;
    private String review;
    private String reviewCategory;
    private String imgUrl;

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getReview(){
        return review;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Review(Long id, String name, String review, String reviewCategory, String imgUrl) {
        this.id = id;
        this.name = name;
        this.review = review;
        this.reviewCategory = reviewCategory;
        this.imgUrl = imgUrl;
    }
}
