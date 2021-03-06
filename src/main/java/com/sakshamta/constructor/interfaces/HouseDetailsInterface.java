package com.sakshamta.constructor.interfaces;

import com.sakshamta.constructor.entities.HouseDetails;
import com.sakshamta.constructor.model.CostFilter;

import java.util.List;
import java.util.Map;

public interface HouseDetailsInterface {
     public HouseDetails save(HouseDetails houseDetails);

     public Map<String, String> delete(Long id);

     public List<HouseDetails> listAll();

     public HouseDetails   listById(Long id);

     public HouseDetails edit(HouseDetails houseDetails, Long id);

     public  List<HouseDetails> findByLocation(String location);

     public List<HouseDetails> findByIsSold(String isSold);

     public List<HouseDetails> findByEstimateCostBetween(CostFilter costFilter);

     public List<HouseDetails> findByLandAreaAndNoOfFloor (String landArea , String noOfFloor);

     public Long findMaxCost();

}
