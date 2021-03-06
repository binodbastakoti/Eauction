package com.mum.waa.project.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Auction implements Serializable{
//	Long 
	
	@Id
	String id;
	
	@Column
	@Size(min=5, max=200)
	String title;
	
	String description;
	
	@Transient
	List<String> specifications;
	
	Double minExpectedAmount;
	
	//Double maxBidAmount;
	
	@OneToOne(cascade = {CascadeType.ALL})
	Bid maxBid;
	
	@Transient
	Date createdDate;
	
	@Transient
	Date endDate;
	
	Boolean active=true;
	
	@OneToOne(cascade={CascadeType.ALL})
	Category category;

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@JsonIgnore 
	@Transient
	private MultipartFile  productImage;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<String> getSpecifications() {
		return specifications;
	}

	public void setSpecifications(List<String> specifications) {
		this.specifications = specifications;
	}

	@XmlTransient  
	public MultipartFile getProductImage() {
		return productImage;
	}
	
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	public Double getMinExpectedAmount() {
		return minExpectedAmount;
	}

	public void setMinExpectedAmount(Double minExpectedAmount) {
		this.minExpectedAmount = minExpectedAmount;
	}

	public Bid getMaxBid() {
		return maxBid;
	}

	public void setMaxBid(Bid maxBid) {
		this.maxBid = maxBid;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
