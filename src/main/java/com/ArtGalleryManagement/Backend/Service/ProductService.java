package com.ArtGalleryManagement.Backend.Service;

import com.ArtGalleryManagement.Backend.Entity.Product;

public interface ProductService {

	public Product checkoutProduct(String userEmail,Long productId);
}
