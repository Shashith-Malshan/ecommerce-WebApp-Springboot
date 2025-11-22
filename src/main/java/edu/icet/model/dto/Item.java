package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Item {

    private String itemNo;
    private String name;
    private Double price;
    private Boolean isAvailable;
    private String address;


}
