package com.springboot.parkinglot.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.parkinglot.example.model.Vehicle;
import com.springboot.parkinglot.example.repository.ParkingRepository;
import com.springboot.parkinglot.example.service.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	ParkingRepository parkingRepository;
	/*
	 * @Override public Student updatestudent(Student student) { return
	 * studentRepository.saveAndFlush(student); }
	 */

	public List<Vehicle> getVehicleList() {
		return parkingRepository.findAll();
	}

	@Override
	public String park(Vehicle vehicle) {
		if (vehicle.getSlotNumber() <= 10) {
			parkingRepository.save(vehicle);
			return "Parked";
		}
		return "Slot not available";
	}

	@Override
	public String unParkVehicle(Long id) {
		if (id <= 10) {
			parkingRepository.delete(id);
			return "Parking slot " + id + " is now available";
		}
		throw new RuntimeException("Provide id between 1 to 10");
	}

}
