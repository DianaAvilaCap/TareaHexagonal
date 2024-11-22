package com.codigo.ms_hexagonal.domain.ports.out;

import com.codigo.ms_hexagonal.domain.aggregates.dto.EmpresaDto;

public interface EmpresaServiceOut {
    EmpresaDto createEmpresaOut(String ruc);
}
