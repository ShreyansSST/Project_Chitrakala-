package com.system.chitrakala.pojo;

import com.system.chitrakala.entity.Product;
import com.system.chitrakala.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WishlistPojo {
    private Integer id;
    private Product product;
    private User user;
}
