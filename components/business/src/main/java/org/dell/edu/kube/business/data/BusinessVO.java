package org.dell.edu.kube.business.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.dell.edu.kube.category.data.Category;

import java.io.Serializable;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessVO implements Serializable {
    private Long id;

    private String name;
    private String address;
    private String owner;
    private Category category;
    private Long categoryId;

    public BusinessVO() {
    }

    public BusinessVO(Business business) {
        this.id = business.getId();
        this.name = business.getName();
        this.address = business.getAddress();
        this.owner = business.getOwner();
        //this.category = category;
        this.categoryId = business.getCategory();
    }


    @Override
    public String toString() {
        return "BusinessVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                ", category=" + category +
                ", categoryId=" + categoryId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessVO that = (BusinessVO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(owner, that.owner) &&
                Objects.equals(category, that.category)&&
                Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, owner, category,categoryId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}