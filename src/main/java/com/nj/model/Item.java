package com.nj.model;

import lombok.Data;

@Data
public class Item {

    private String itemName;
    private String description;
    private Type type;
    private MWB mwb;
    private Double rate;
    private Double weight;
    private String imagePath;
    private Boolean isFeatured;
}
