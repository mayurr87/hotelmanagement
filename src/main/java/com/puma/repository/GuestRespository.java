package com.puma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.puma.model.Guest;

/**
 * 
 * @author Mayur Rahatekar
 * 
 *         Data base layer Hotel Management
 *
 */
@Repository
public interface GuestRespository extends JpaRepository<Guest, Long> {

}
