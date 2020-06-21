package com.dzonesoft.exam.viewmodel;

import com.dzonesoft.exam.utility.ModelMapperSingle;
import lombok.Data;
import org.modelmapper.ModelMapper;

/**
 * @author dzonesoft
 */

@Data
public class BaseVM {
    protected static ModelMapper modelMapper = ModelMapperSingle.Instance();


}
