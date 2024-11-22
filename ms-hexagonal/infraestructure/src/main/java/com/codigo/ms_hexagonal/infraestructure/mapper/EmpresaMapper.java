package com.codigo.ms_hexagonal.infraestructure.mapper;

import com.codigo.ms_hexagonal.domain.aggregates.dto.EmpresaDto;
import com.codigo.ms_hexagonal.infraestructure.entity.EmpresaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmpresaMapper {
    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public EmpresaDto mapToDto(EmpresaEntity empresaEntity){
        return MODEL_MAPPER.map(empresaEntity, EmpresaDto.class);
    }

    public EmpresaEntity mapToEntity(EmpresaDto empresaDto){
        return MODEL_MAPPER.map(empresaDto,EmpresaEntity.class);
    }
}
