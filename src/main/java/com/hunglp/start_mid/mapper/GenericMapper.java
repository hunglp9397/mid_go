package com.hunglp.start_mid.mapper;


import java.util.List;

public interface GenericMapper<D, E> {

    D toDTO(E entity);

    E toEntity(D dto);

    List<D> toDTOList(List<E> listEntity);

    List<E> toEntityList(List<D> listDTO);

}
