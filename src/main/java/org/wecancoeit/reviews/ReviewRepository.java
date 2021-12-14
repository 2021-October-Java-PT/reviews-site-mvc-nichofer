package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review ohioPie = new Review(1L,"Ohio Pie","Yummy","","");
        Review dominoes = new Review(2L,"Dominoes", "Ick!","","");

        reviewList.put(ohioPie.getId(), ohioPie);
        reviewList.put(dominoes.getId(), dominoes);
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
