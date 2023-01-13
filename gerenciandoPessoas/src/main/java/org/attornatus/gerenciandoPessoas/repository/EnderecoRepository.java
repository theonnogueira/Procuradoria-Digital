package org.attornatus.gerenciandoPessoas.repository;

import java.util.List;

import org.attornatus.gerenciandoPessoas.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
	public List<Endereco> findAllByEnderecoPrincipalContainingIgnoreCase(String enderecoPrincipal);
}
