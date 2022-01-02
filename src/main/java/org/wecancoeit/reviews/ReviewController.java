package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping("/")
    private String homepage(){
        return "HomeTemplate.html";
    }

    @RequestMapping("/reviews")
    public String findAllReviews(Model model){
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "ReviewsTemplate";
    }

    @RequestMapping("/reviews/{id}")
    public String findOneReview(@PathVariable Long id, Model model){
        model.addAttribute("reviewModel", reviewRepo.findOne(id));
        return "ReviewTemplate";
    }
}
