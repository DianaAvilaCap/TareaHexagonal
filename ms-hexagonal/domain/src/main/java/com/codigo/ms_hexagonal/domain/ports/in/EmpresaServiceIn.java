package com.codigo.ms_hexagonal.domain.ports.in;

import com.codigo.ms_hexagonal.domain.aggregates.dto.EmpresaDto;

public interface EmpresaServiceIn {
    EmpresaDto createEmpresaIn(String ruc);
}
