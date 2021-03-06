package br.com.tech4me.trabalhocurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import br.com.tech4me.trabalhocurso.domain.Estado;

@Repository
@EnableJpaRepositories
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
