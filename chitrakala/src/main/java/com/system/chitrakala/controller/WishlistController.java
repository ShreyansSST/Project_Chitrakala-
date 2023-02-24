package com.system.chitrakala.controller;

import com.system.chitrakala.entity.Cart;
import com.system.chitrakala.entity.Product;
import com.system.chitrakala.entity.User;
import com.system.chitrakala.entity.Wishlist;
import com.system.chitrakala.pojo.CartPojo;
import com.system.chitrakala.pojo.WishlistPojo;
import com.system.chitrakala.services.CartService;
import com.system.chitrakala.services.UserService;
import com.system.chitrakala.services.WishlistService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/wishlist")
public class WishlistController {
    private final WishlistService wishlistService;
    private final UserService userService;
    private final CartService cartService;

    @GetMapping()
    public String displayWishlist(Principal principal, Model model){
        Integer id = userService.findByEmail(principal.getName()).getId();
        List<Wishlist> list = wishlistService.fetchAll(id);
        model.addAttribute("wishlistItems", list);

        List<Cart> list2 = cartService.fetchAll(id);

        double total = 0.0;
        for(Cart totalCalc:list2){
            if (totalCalc.getProduct().getProduct_quantity()>0) total += totalCalc.getQuantity()*totalCalc.getProduct().getProduct_price();
        }

        model.addAttribute("total", total);
        model.addAttribute("cartItems", list2);

        return "/wishlist";
    }

    @GetMapping("/add/{id}")
    public String saveToWishlist(@PathVariable Integer id, Principal principal){
        wishlistService.saveToWishlist(id, principal);
        return "redirect:/shop";
    }

    @GetMapping("/remove/{id}")
    public String deleteWishlistItem(@PathVariable("id") Integer id){
        wishlistService.deleteFromWishlist(id);
        return "redirect:/wishlist";
    }
}
