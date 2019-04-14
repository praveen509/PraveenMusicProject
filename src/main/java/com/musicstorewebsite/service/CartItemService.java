package com.musicstorewebsite.service;

import com.musicstorewebsite.model.Cart;
import com.musicstorewebsite.model.CartItem;

/**
 * Created by Le on 1/23/2016.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem (CartItem cartItem);

    void removeAllCartItems (Cart cart);

    CartItem getCartItemByProductId (int productId);
}
