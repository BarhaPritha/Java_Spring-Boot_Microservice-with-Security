package com.com.BinaryWizards.bookservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponseModel {

    private boolean success;
    private boolean found;
    private List<String> message;
    private ItemModel item;
    private List<ItemModel> items;

}
