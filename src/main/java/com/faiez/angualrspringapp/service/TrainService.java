package com.faiez.angualrspringapp.service;

import com.faiez.angualrspringapp.beans.Train;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: faiez
 * Date: 12/21/12
 * Time: 12:20 AM
 */
public interface TrainService {
    public List<Train> getAllTrains();

    public Train getTrainById(Long id);

    public void addTrain(Train train);

    public void deleteTrainById(Long id);

    public void deleteAll();

    public void updateTrain(Train train);
}
