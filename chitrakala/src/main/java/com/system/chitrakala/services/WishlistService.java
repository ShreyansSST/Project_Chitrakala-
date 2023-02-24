package com.system.chitrakala.services;

import com.system.chitrakala.entity.Wishlist;
import com.system.chitrakala.pojo.WishlistPojo;

import java.security.Principal;
import java.util.List;

public interface WishlistService {
    String saveToWishlist(Integer id, Principal principal);

    String deleteFromWishlist(Integer id);

    List<Wishlist> fetchAll(Integer id);
}
