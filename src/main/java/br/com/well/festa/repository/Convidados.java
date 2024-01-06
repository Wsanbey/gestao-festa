package br.com.well.festa.repository;

import br.com.well.festa.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado,Long> {
}
