package com.api.beercontrol.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.api.beercontrol.dto.BeerDTO;
import com.api.beercontrol.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
