package com.system.chitrakala.services;

import com.system.chitrakala.entity.Review;
import com.system.chitrakala.pojo.ReviewPojo;

import java.security.Principal;
import java.util.List;

public interface ReviewService {
    void addReview(ReviewPojo reviewPojo);
    List<Review> getAllReviews(Integer productId);
    void deleteReview(Integer reviewId);
}
