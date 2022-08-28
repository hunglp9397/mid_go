package com.hunglp.start_mid.mapper;


public interface GenericMapper<D, E> {


    D toDTO(E entity);

    E toEntity(D dto);

}
