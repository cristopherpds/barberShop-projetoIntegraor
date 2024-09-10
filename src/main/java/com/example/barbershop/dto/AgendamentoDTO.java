package com.example.barbershop.dto;

import java.time.LocalDate;

public record AgendamentoDTO(int id, LocalDate dataHoraAgendamento, ClienteDTO cliente, ServicoDTO service, FuncionarioDTO funcionario) {

}
