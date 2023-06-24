package com.com.BinaryWizards.bookservice.model;

import com.com.BinaryWizards.bookservice.dto.BookDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuyResponseModel {

    private Boolean success;
    private String message;
    private BookDto book;

}
