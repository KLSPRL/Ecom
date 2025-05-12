package com.klsprl.ecom.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Category {

    private Long categoryId;
    private String categoryName;
    private String description;
}
