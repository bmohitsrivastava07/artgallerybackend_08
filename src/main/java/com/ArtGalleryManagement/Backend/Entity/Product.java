package com.ArtGalleryManagement.Backend.Entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
    private Long product_id;
	@Column(name="product_title")
    private String title;
	@Column(name="artist")
    private String artist;
    @Column
    private String product_description;
    @Column
    private int product_quantity;
    @Column
    private int product_quantity_available;
    @Column
    private String category;
    @Column
    private String product_image;
}
