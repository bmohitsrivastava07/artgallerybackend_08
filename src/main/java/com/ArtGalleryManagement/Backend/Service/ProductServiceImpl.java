package com.ArtGalleryManagement.Backend.Service;

import com.ArtGalleryManagement.Backend.Entity.Product;
import com.ArtGalleryManagement.Backend.Repository.CheckOutRepository;
import com.ArtGalleryManagement.Backend.Repository.ProductRepository;

public class ProductServiceImpl  implements ProductService{

	
	private ProductRepository productRepository;
	private CheckOutRepository checkOutRespository;
	
	@Override
	public Product checkoutProduct(String userEmail, Long productId) {
          return null;
	}

}
