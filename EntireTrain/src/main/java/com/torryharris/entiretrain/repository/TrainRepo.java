package com.torryharris.entiretrain.repository;

import com.torryharris.entiretrain.model.TrainModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TrainRepo extends JpaRepository<TrainModel,Integer> {
}
