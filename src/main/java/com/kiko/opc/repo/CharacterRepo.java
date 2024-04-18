package com.kiko.opc.repo;

import com.kiko.opc.models.OpCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepo extends JpaRepository<OpCharacter,Long> {
}
