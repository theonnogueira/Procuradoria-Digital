package org.attornatus.gerenciandoPessoas.repository;

import java.util.List;

import org.attornatus.gerenciandoPessoas.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	public List<Pessoa> findAllByNomeContainingIgnoreCase(String nome);
}
