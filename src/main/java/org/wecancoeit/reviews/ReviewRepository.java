package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review ankle = new Review(1L,"ankle","Yummy","","/images/115286.png");
        Review noShow = new Review(2L,"noShow", "Ick!","","/images/115318.png");
        Review tube = new Review(3L,"tube", "Ick!","","/images/321889.png");
        Review toe = new Review(4L,"toe", "Ick!","","/images/321929.png");

        reviewList.put(ankle.getId(), ankle);
        reviewList.put(noShow.getId(), noShow);
        reviewList.put(tube.getId(), tube);
        reviewList.put(toe.getId(), toe);
    }

    public ReviewRepository(Review...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }

}
