package com.kodilla.hibernate.elemlecz.dao;

import com.kodilla.hibernate.elemlecz.Jos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface JosDao extends CrudRepository<Jos, Integer> {
}
