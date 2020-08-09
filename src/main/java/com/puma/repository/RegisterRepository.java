package com.puma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.puma.model.Register;

/**
 * 
 * @author Mayur Rahatekar
 * 
 * Data base layer Hotel Management 
 *
 */
@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {

	@Query(value = "SELECT * FROM hotel_register WHERE roomnumber = ?1 and check_in_date < ?2 and check_out_date > ?3", nativeQuery = true)
	List<Register> findUserByStatusAndName(String roomnumber, long check_in_date, long check_out_date);

}
