package com.kodilla.hibernate.elemlecz.dao;

import com.kodilla.hibernate.elemlecz.Pobyt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface PobytDao extends CrudRepository<Pobyt, Integer> {
}
